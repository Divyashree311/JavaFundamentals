package enumexample;

enum Days{
    SUNDAY(1,"Fun day"),
    MONDAY(2,"Monday again : ("),
    TUESDAY(3,"Mini monday"),
    WEDNESADY(4,"Waiting for weekend"),
    THURSDAY(5,"I made it"),
    FRIDAY(6,"plan for weekend"),
    SATURDAY(7,"Yepeee! rst day");

    private int dayValue;
    private String dayQuotes;

    Days(int dayValue, String day){
        this.dayValue= dayValue;
        dayQuotes = day;
    }

    public int getDayValue() {
        return dayValue;
    }

    public String getDayQuotes() {
        return dayQuotes;
    }
}
public class WeekOfTheDays {
    public static void main(String[] args) {
        for (Days days: Days.values()){
            System.out.println(days.name() + " " + days.getDayValue() +" -" + days.getDayQuotes());
        }
    }
}
