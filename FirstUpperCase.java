//Coding Challenge from Coderbyte.com 
//July 19, 2018
/* Objective:
    Given a string known to contain only letters, capitalize the first letter of every word and return the complete string 
*/

import java.util.*; 
import java.io.*;

class Main {  
  public static String LetterCapitalize(String str) { 
  
       
    //Split the string by whitespace
    String[] tokens = str.split(" ");    
    str = "";
    //Iterate through the array of strings 
    for ( String s : tokens ) {
        char first = Character.toUpperCase(s.charAt(0));
        char[] ch = s.toCharArray();
        ch[0] = first;
        s = new String(ch);
        //hold the completed and reformed string in the original str Object
        str += s + " ";
    }
    //trim the trailing whitespace from the string
    str.trim();
    return str;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCapitalize(s.nextLine())); 
  }   
  
}