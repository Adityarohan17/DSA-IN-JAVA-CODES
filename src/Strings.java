import java.util.Scanner;

import java.util.*;
public class Strings {

    public static void printLetters(String str){
        for(int i =0;i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.println(name);


    //  For Lenghth //
    System.out.println(name.length());



    // concatination //
    String f1 ="Rohan";
    String f2 = "Aditya";
    String fFinal = f1 + " " + f2;
    System.out.println(fFinal);
    printLetters(fFinal);

    // chatAt
    // System.out.println(f1.charAt(2));


}

    }

    // Scanner sc = new Scanner(System.in);
    // String name = sc.next();
    // System.out.println(name);


