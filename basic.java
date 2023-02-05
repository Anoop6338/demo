public class basic {
    public static void printLetters(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
  

        //Concatination
        String firstname = "Anoop";
        String lastname = "Kumar";

        String fullname = firstname + " "+ lastname;
        //System.out.println(fullname);

        printLetters(fullname);

    }
}

