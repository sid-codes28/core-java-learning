package basics;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();
        System.out.print("Enter you age : ");
        int age = sc.nextInt();

        System.out.printf("Hello %s!%nYou are %d years old.",name,age);


    }
}
