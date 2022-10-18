package polymorphyism.overloading;

public class PlayerRatingMethodOverLoading {
    private int playerPosition;
    private String playerName;
    private float criticOneRating;
    private float criticTwoRating;
    private float criticThreeRating;
    private float averageRating;
    private char category;

    public PlayerRatingMethodOverLoading(int playerPosition, String playerName) {
        this.playerPosition = playerPosition;
        this.playerName = playerName;
    }

    void calculateAverageRating(float criticOneRating, float criticTwoRating){
            this.criticOneRating = criticOneRating;
            this.criticTwoRating = criticTwoRating;
            averageRating = (criticOneRating + criticTwoRating)/2;
    }
    void calculateAverageRating(float criticOneRating, float criticTwoRating, float criticThreeRating){
        this.criticOneRating = criticOneRating;
        this.criticTwoRating = criticTwoRating;
        this.criticThreeRating = criticThreeRating;
        averageRating = (criticOneRating+criticTwoRating+criticThreeRating)/3;
    }

    void calculateCategory(){

        if(averageRating>8){
            category = 'A';
        } else if (averageRating > 5 && averageRating<=8) {
            category = 'B';
        } else if (averageRating>0 && averageRating <=5) {
            category = 'C';
        } else {
            System.out.println("Average rating isn't valid");
        }

    }

    void display(){
        calculateCategory();
        System.out.println("Player " + playerName  + " has a position " + playerPosition + " with average rating as " + averageRating + " with category " + category);
    }

    public static void main(String[] args) {
        PlayerRatingMethodOverLoading playerRating = new PlayerRatingMethodOverLoading(1,"Bechman");
        playerRating.calculateAverageRating(9f,9.9f);

        PlayerRatingMethodOverLoading playerRating1 = new PlayerRatingMethodOverLoading(1,"Oscar");
        playerRating1.calculateAverageRating(1,1,1);

        playerRating.display();
        System.out.println("-------------------------------");
        playerRating1.display();
    }
}
