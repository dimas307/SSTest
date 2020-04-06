import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Secretary {
    public static void main(String[] args){
        BufferedReader readDataFromConsole = new BufferedReader(new InputStreamReader(System.in)); // Open an input stream
        try{
            System.out.println("Enter a copies quantity");
            int copiesQuantity = Integer.parseInt(readDataFromConsole.readLine());
            System.out.println("Enter a speed of 1st ");
            int xeroxOne = Integer.parseInt(readDataFromConsole.readLine());
            System.out.println("Enter a speed of 2nd");
            int xeroxTwo = Integer.parseInt(readDataFromConsole.readLine());
            readDataFromConsole.close(); // Open an input stream

            System.out.print("The minimum time required for the preparation of " + copiesQuantity + " copies: ");
            System.out.println(secretaryTimeOptimizer(copiesQuantity, xeroxOne, xeroxTwo));
        } catch (Exception e){
            System.out.println("Try again!");
            e.printStackTrace();
        } finally {
            System.out.println();
        }
    }

    public static int secretaryTimeOptimizer(int copiesQuantity, int xeroxOne, int xeroxTwo){
        int fastXerox = Math.min(xeroxOne, xeroxTwo);
        int slowXerox = Math.max(xeroxOne, xeroxTwo);
        int totalCopies = 1;
        int resultTime = fastXerox;
        int xerox2Time = 0;

        while (totalCopies < copiesQuantity ){ //Cycle calculate the quantity of made copies
            resultTime += fastXerox;
            xerox2Time += fastXerox;
            totalCopies++;

            if (totalCopies == copiesQuantity) break;

            if (xerox2Time / slowXerox > 0){
                totalCopies++;
                xerox2Time -= slowXerox;
            }
        }
        return resultTime;
    }
}
