package programs;

public class CountLetters {

    public static void main(String[] args) {
        String userName = "Krishn86286na";

        int count =0;
        if (userName!=null && !userName.isEmpty()){
            char[] chars = userName.toCharArray();
            for(char c: chars){
                if(Character.isLetter(c)){
                    ++count;
                    System.out.println(c);
                }
            }
            System.out.println("Count is" + count);

        }else {
            System.out.println("Enter proper input");
        }

    }
}
