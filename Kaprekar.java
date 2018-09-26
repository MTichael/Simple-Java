//Challenge taken from CoderByte, completed in 42 minutes 9/25/2018
//Points gained: 0 
//   Reason: Forgot to delete error-checking messages, which muddied the output
//   On Resubmit: Full credit, passed all cases. No changes other than removal of the error messages.

//Michael Tinning


import java.util.*; 
import java.io.*;

class Main { 
    public static int sortArray(int fourDigits) {
        if(fourDigits > 9999) {
            return 9999;
        }
        
        int[] digs = {0, 0, 0, 0};
        digs[0] = fourDigits % 10;
        fourDigits = fourDigits / 10;
        
        digs[1] = fourDigits % 10;
        fourDigits = fourDigits / 10;
        
        digs[2] = fourDigits % 10;
        fourDigits = fourDigits / 10;
        
        digs[3] = fourDigits % 10;
        
        int sortUp = 0000;
        int temp = 0;

        for(int i = 0; i < digs.length - 1; i++) {
            for(int j = i + 1; j < digs.length; j++) {
                if(digs[i] > digs[j]) {
                    temp = digs[j]; 
                    digs[j] = digs[i]; 
                    digs[i] = temp;
                }
            }
        }
        
        for(int n = 0; n < digs.length; ++n) {
            sortUp = sortUp * 10 + digs[n];
        }
        
        return sortUp;
    }
    
    public static int flip(int bigNum) {
        int f = 0;
        boolean flag = false;
        if(bigNum < 1000) {
            flag = true;
        }
        while (bigNum % 10 != 0) {
            f = f * 10 + bigNum % 10;
            bigNum = bigNum / 10;
        }
        if(flag)
            f = f * 10;
        return f;
    }
    
  public static int KaprekarsConstant(int num) { 
    int counter = 0;
    if(num < 0) {
        num = num * -1;
        counter = num % 100;
        num = num / 100;
    }
    
    if(num == 6174 || num < 1000) {
        return counter;
    }
    
    int lower = sortArray(num);
    int upper = flip(lower);

    int kaprekar = upper - lower;
    counter++; 
    
    kaprekar = (kaprekar * 100 + counter) * -1;
    
    return KaprekarsConstant(kaprekar); 
  }
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(KaprekarsConstant(s.nextLine())); 
  }   
  
}