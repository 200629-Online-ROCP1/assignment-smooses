package com.test;


public class reverseString{
 public static void main(String[] args) {

  String input = "AliveisAwesome";
  //create Method and pass input string as parameter
  String reversed = revString(input);
  System.out.println("The reversed string is: " + reversed);
  
 }
 
 //Method take string parameter and check string is empty or not
 public static String revString(String input)
 {
  if (input.isEmpty()){
   return input;
  }
  //Calling Function Recursively
  System.out.println(input);
  return revString(input.substring(1)) + input.charAt(0);
 }
 
}
