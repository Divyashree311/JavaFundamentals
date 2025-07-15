package allprograms.basiclevel;

public class ReverseSentenceWithoutPuncutation {
    public static void main(String[] args) {

        String[] input = "My, name is Divya.".split(" ");

        StringBuilder reverseString = new StringBuilder();


        for(String word: input) {
            StringBuilder letters  = new StringBuilder();
            StringBuilder punctuation  = new StringBuilder();

                for (char let : word.toCharArray()) {

                        if(Character.isLetterOrDigit(let)){
                            letters.append(let);
                        }else{
                            punctuation.append(let);
                        }


                }

            letters.reverse();

          //  System.out.println(letters);

            reverseString.append(letters).append(punctuation).append(" ");

        }

        System.out.println(reverseString);



    }
}
