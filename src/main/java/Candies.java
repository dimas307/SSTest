import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Candies {
    public static void main(String[] args) {
        BufferedReader readDataFromConsole = new BufferedReader(new InputStreamReader(System.in)); // Open an input stream
        try{
            System.out.println("Enter a weight of a candy:");
            int candy = Integer.parseInt(readDataFromConsole.readLine());
            System.out.println("Enter a weight of a tangerine:");
            int tangerine = Integer.parseInt(readDataFromConsole.readLine());
            System.out.println("Enter a weight of an apple:");
            int apple = Integer.parseInt(readDataFromConsole.readLine());
            System.out.println("Enter a weight of a gift:");
            int gift = Integer.parseInt(readDataFromConsole.readLine());
            readDataFromConsole.close(); // Close an input stream

            System.out.print("Number of various gifts is: ");
            System.out.println(CandiesMaker.countNumberOfOptions(new CandiesMaker(gift, candy, tangerine, apple)));
        } catch (Exception e){
            System.out.println("Try again!");
            e.printStackTrace();
        } finally {
            System.out.println();
        }
    }
}
