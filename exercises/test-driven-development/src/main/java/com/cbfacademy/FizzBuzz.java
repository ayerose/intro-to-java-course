package com.cbfacademy;
public class FizzBuzz {

   public String get(int number) {

    if (number % 15 == 0) {
       return "FizzBuzz";
    } else if (number % 5 == 0) {
        return "Buzz";
    } else if (number % 3 == 0) {
        return "Fizz";
    } else return Integer.toString(number);

   }   
   public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        
     
        for (int i = 1; i <= 20; i++) {
            System.out.println(fizzBuzz.get(i));
        }
    }
 
}
