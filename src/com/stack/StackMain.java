package com.stack;

import java.util.Scanner;

public class StackMain {

    public static void main(String[] args) {
        int choice=0;
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        System.out.println("*********Stack operations using array********");
        System.out.println("------------------------------------------------");
        while(choice != 3)
        {
            System.out.println("Chose one from the below options...");
            System.out.println("\n1.Push\n2.Show\n3.Exit");
            System.out.println(" Enter your choice ");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    s.push(sc);
                    break;
                }
                case 2:
                {
                    s.display();
                    break;
                }
                case 3:
                {
                    System.out.println("Exiting....");
                    System.exit(0);
                    break;
                }
                default:
                {
                    System.out.println("Please Enter valid choice ");
                }
            };
        }
    }
}
