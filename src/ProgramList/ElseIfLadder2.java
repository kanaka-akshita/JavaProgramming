package ProgramList;

import java.util.Scanner;

public class ElseIfLadder2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter character: ");

        char input = scanner.next().charAt(0);

        if(input >= 'A' && input <= 'Z') {
            System.out.println("Uppercase");
        } else if(input >= 'a' && input <= 'z') {
            System.out.println("Lowercase");
        } else if(input >= '0' && input <= '9') {
            System.out.println("Number");
        } else {
            System.out.println("Special Character");
        }
        scanner.close();
    }
}