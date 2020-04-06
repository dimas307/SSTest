public class CandiesMaker {
    // Weight of all gifts type
    int candies;
    int tangerines;
    int apples;
    int giftWeights;

    //Constructor for CandiesMaker
    public CandiesMaker(int presentWeights, int candies, int tangerines, int apples){
        this.giftWeights = presentWeights;
        this.candies = candies;
        this.tangerines = tangerines;
        this.apples = apples;
    }

    public static int countNumberOfOptions(CandiesMaker candies){ //Method that calculate all possible options of gifts
        int numberOfGifts = 0;
        for (int x = 0; x <= candies.giftWeights / candies.candies; x++){
            for (int y = 0; y <= candies.giftWeights / candies.tangerines; y++){
                for (int z = 0; z <= candies.giftWeights / candies.apples; z++){
                    if (x*candies.candies + y*candies.tangerines + z*candies.apples > candies.giftWeights) break;
                    if (x*candies.candies + y*candies.tangerines + z*candies.apples == candies.giftWeights) {
                        numberOfGifts++;
                        break;
                    }
                }
            }
        }
        return numberOfGifts;
    }
}
