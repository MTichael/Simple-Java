//Michael Tinning, 8/7/2018
/*
    Eight Rooks: Given the positions of eight rooks on a standard chessboard, 
    determine if any rooks may attack other rooks. 
    If no lines of attack intersect other pieces, return true
    If two rooks may attack each other, return the String representing the position of the first one to appear in the list. 
    
    TODO: Update this challenge for Eight Queens instead of EightRooks, adding diagonal sight lines 
*/

import java.util.*; 
import java.io.*;

class Main {  
  public static String EightQueens(String[] strArr) { 
      //strArr contains the strings of the positions. This is not usable. 
    // Get values from strArr representing the positions as actual int pairs
        
    //Store x values and y values separately
    List<Integer> xValues = new LinkedList<Integer>();
    List<Integer> yValues = new LinkedList<Integer>();
    int attackIndex = 9;
    
    for(String pair : strArr) {
        String[] elPair = pair.split("( || , || )");  //Separate the string into numbers, which are stored at 1 and 3 posits in the arr
        
        //compare each addition for pre-existence
        int a = Integer.parseInt(elPair[1]);
        int b = Integer.parseInt(elPair[3]);

        if(xValues.contains(a) || yValues.contains(b)) 
        {
            int X = xValues.indexOf(a);
            int Y = yValues.indexOf(b);
            System.out.println(X + " " + Y);
            //if match, get first in the list that matches the offense
            if(X == -1) 
                attackIndex = Math.min(attackIndex, Y);
            else if (Y == -1) 
                attackIndex = Math.min(attackIndex, X);
            else 
                attackIndex = Math.min(attackIndex, Math.min(X, Y));
            //must continue to the end in case the other position was actually compromised first
        }
        xValues.add(a);
        yValues.add(b);
    }
        //get minimum offender index
        //return the pair at that index
    if(attackIndex == 9)
        return "true";
        
    String attackPair = "(" + xValues.get(attackIndex) + "," + yValues.get(attackIndex) + ")";
    return attackPair;
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(EightQueens(s.nextLine())); 
  }   
  
}
