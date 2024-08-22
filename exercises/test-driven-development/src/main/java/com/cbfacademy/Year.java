package com.cbfacademy;
public class Year {

    public boolean isLeap(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return false;
        } else {
            return false;
        }
    }
       public static void main(String[] args) {
        Year year = new Year();


        int testYear1 = 2020;
        int testYear2 = 1900;
        int testYear3 = 2000;
        int testYear4 = 2023;

        System.out.println(testYear1 + " is a leap year: " + year.isLeap(testYear1));  
        System.out.println(testYear2 + " is a leap year: " + year.isLeap(testYear2));  
        System.out.println(testYear3 + " is a leap year: " + year.isLeap(testYear3));  
        System.out.println(testYear4 + " is a leap year: " + year.isLeap(testYear4));  
    }
}