package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        System.out.println("Hello World!");
        System.out.println("I am coding in Java!");
        System.out.println(2+1);
        int a = 3+2;
        System.out.println(a);
        int b = 3;
        System.out.println(a+b);
        */

        /*
        System.out.println("Type in two values and press enter after each to get the sum");
        Scanner s = new Scanner(System.in);
        //press alt + enter to automatically import the "Scanner library?

        int c ;
        int d ;

        c=s.nextInt(); //first entered value get stored in c
        d=s.nextInt(); //second entered value get stored in d
        System.out.println("Sum = " + (c+d));
        //NOTE the brackets around (c+d) are needed!
        */
        System.out.println("Are you going?  yes/no ");
        Scanner s = new Scanner(System.in);
        String answer = s.nextLine();

        answer.trim();
        answer.toLowerCase();

        if(answer.equals("yes")){

            //NOTE, to compare strings, must use ".equals("string")
            // for all other types us "=="

            System.out.println("Is it the left door? yes/no");
            answer = s.nextLine();

            answer.trim();
            answer.toLowerCase();

            if(answer.equals("yes")){
                System.out.println("Talk to the boss");
            } else {
                System.out.println("Say hi to Tammy");
            }
        } else {
            System.out.println("You stay in the office.");
        }
        }
}
//
//type "sout" then CTRL + SPACE then tab to make:
//"System.out.println();"
////Seeing if WakaTime is working or not
