public class Example {


        public static void main(String[] args) {
            String input = "igbbg | 2 | 3 ; 657; hj; JT 567; 789; 556; JT 76; 87; JT 67; 89 |";
            String[] splitInp = input.split("\\;");
            System.out.println("Input length: " + splitInp.length);
            String idbbg;
            for (int i = 0; i <splitInp.length; i++){
                System.out.println("Inside for");
                //System.out.println(splitInp[i].trim());

                if(i ==0 ){
                    idbbg = splitInp[0].trim();
                    System.out.println("IDBBG \n" + idbbg);
                    String[] idbbgId = idbbg.split("\\|");
                    String getId = idbbgId[0];
                    System.out.println("GET ID " + getId);
                    continue;
                }

                if(splitInp[i].contains("JT")){
                    System.out.println("ERROR CODE" + splitInp[i]);
                }


            }


        }


}

