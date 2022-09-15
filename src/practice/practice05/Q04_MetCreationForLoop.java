package practice.practice05;

import java.util.Scanner;

public class Q04_MetCreationForLoop {
		/* Interview Question
		 Write a Java program to reverse a string. Use for loop and create a method called
		  reverseString */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir String giriniz : ");
            String str = scanner.nextLine();

            System.out.println("Girdiginiz String'in tersi : "+reverseString(str));;
        }
    public static String reverseString(String str) {
            String reversed = "";

        for (int i = str.length()-1; i>=0; i--) {
            reversed += str.substring(i,i+1);
        }
            return reversed;
    }
}
