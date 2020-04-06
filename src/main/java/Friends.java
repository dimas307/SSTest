public class Friends {
    public static void main(String[] args) {
        System.out.println("MATRIX 1");
        int[][] value = new int[3][3];
        value[0][1] = 1;
        value[1][0] = 1;
        value[1][2] = 1;
        value[2][1] = 1;
        for (int i = 0; i < value.length; i ++){
            for (int y = 0; y < value.length; y++){
                if (y == value.length - 1){
                    System.out.println(value[i][y]);
                } else {
                    System.out.print(value[i][y] + " ");
                }
            }
        }
        System.out.println("Result is: " + FriendsCounter.findPersonFriends(value, 3, 1));
        System.out.println("MATRIX 2");

        value = new int[5][5];
        value[1][2] = 1;
        value[2][1] = 1;
        value[2][4] = 1;
        value[3][4] = 1;
        value[4][2] = 1;
        value[4][3] = 1;

        for (int i = 0; i < value.length; i ++){
            for (int y = 0; y < value.length; y++){
                if (y == value.length - 1){
                    System.out.println(value[i][y]);
                } else {
                    System.out.print(value[i][y] + " ");
                }
            }
        }
        System.out.println("Result is: " + FriendsCounter.findPersonFriends(value, 5, 2));
    }
}
