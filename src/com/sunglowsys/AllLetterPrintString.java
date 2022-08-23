package com.sunglowsys;

public class AllLetterPrintString {
    public static  void printLetter(String str){
        for (int i = 0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstName = "govind";
        String lastName = "singh";
        String fullName = firstName +" " + lastName;
        System.out.println(fullName.charAt(2));

        printLetter(fullName);

    }
}