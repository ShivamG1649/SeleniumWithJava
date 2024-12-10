package InterviewPrograms;

// In this program we have to find out the duplicate elements in an array

// input array is { 1,1, 2, 2, 3, 3, 4}

import java.util.HashSet;

import java.util.Set;

public class FindDuplicateInArray {

    public static void main(String[] args) {

        int arr[]={1,1, 2, 2, 3, 3, 4};

        Set set = new HashSet();
        Set duplicate = new HashSet();

        for( int s : arr){

            if(set.add(s)){

            }
            else {
                duplicate.add(s);
            }
        }

        System.out.println("Duplicates : "+duplicate);

    }
}
