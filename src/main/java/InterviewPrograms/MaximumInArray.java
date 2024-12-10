package InterviewPrograms;

import java.util.Scanner;

// Create a program to find out the maximum number in an array
public class MaximumInArray {

    public static void main(String[] args) {


        // reverse a string
        String rev= "";
        String str = "Shivam Gulati";
        char[] ch = str.toCharArray();
        //This toCharArray will return the character sequences

        for( int i = ch.length-1 ; i>0;i--){
          rev = rev+ch[i];

        }

        System.out.println(rev);



        }
    }



