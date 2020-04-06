public class FriendsCounter {
    private boolean[] countedFriends;
    private int quantityOfFriends;
    private int[][] friendshipsInfo;
    private int numberOfPerson;

    // Constructor for FriendsCounter
    public FriendsCounter(int[][] friendshipsInfo, int numberOfPeople, int specificPerson){
        this.friendshipsInfo = friendshipsInfo;
        this.countedFriends = new boolean[numberOfPeople];
        this.numberOfPerson = specificPerson - 1;
        this.quantityOfFriends = 0;
    }

    public static int findPersonFriends(int[][] friendshipsInfo, int numberOfPeople, int specificPerson) {
        FriendsCounter person = new FriendsCounter(friendshipsInfo, numberOfPeople, specificPerson);
        return person.getFriendsQuantity(person.numberOfPerson);
    }

    // Method that finds a number of friends for every person
    private int getFriendsQuantity(int numberOfPerson){
        if (!countedFriends[numberOfPerson]) {
            countedFriends[numberOfPerson] = true;
            for (int i = 0; i < friendshipsInfo.length; i++) {
                if (friendshipsInfo[numberOfPerson][i] == 1 && !countedFriends[i]) {
                    quantityOfFriends++;
                    getFriendsQuantity(i);

                }
            }
        }

        return quantityOfFriends;
    }
}
