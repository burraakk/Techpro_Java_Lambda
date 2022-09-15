package practice.practice13_interviewQuestions;

public class Q02_reverseStr {
    /*
        // Stringi ters cevirmek icin bir Java Programi yazin
        //1.Yol: StringBuilder () kullanarak
        //2.Yol: String Classini kullanarak
        //3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */

    public static void main(String[] args) {
        //1.Yol: StringBuilder () kullanarak
        String input = "Ali is well";

        StringBuilder str = new StringBuilder();

        str.append(input);
        System.out.println("str = " + str);

        String tersInput = str.reverse().toString();
        System.out.println("tersInput = " + tersInput);

        //2.Yol: String Classini kullanarak
        System.out.println("\n2. yol");
        for (int i = input.length()-1; i >= 0 ; i--) {
            System.out.print(input.charAt(i));
        }


    }

}
