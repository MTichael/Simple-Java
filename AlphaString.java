//Michael Tinning
//Challenge taken from Coderbyte 9/26/2018
//Completed in 9 minutes with all test cases passed


import java.util.*; 
import java.io.*;

class Main {  
  public static String AlphabetSoup(String str) { 
  
    char [] alpha = str.toCharArray();
    char temp = 'a';
    for(int i = 0; i < alpha.length - 1; i++) {
        for(int j = i; j < alpha.length; j++) { //Simple selection sort for small test inputs
            if(alpha[j] < alpha[i]) {
                temp = alpha[j];
                alpha[j] = alpha[i];
                alpha[i] = temp;
            }
        }
    }
    
    return new String(alpha);
  } 
  
  public static void main (String[] args) {  
    //Input used by coderbyte for testing with their scripts
      Scanner s = new Scanner(System.in);  
    System.out.print(AlphabetSoup(s.nextLine())); 
  }   
  
}