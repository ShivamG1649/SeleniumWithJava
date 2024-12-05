package basiscPrograming;

/*
  size() .. to find out the size of our collection

   List is also an interface
   1) We can add duplicate elements in a list

 */

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {

   // Creation of list



    public static void main(String[] args) {
       List<String> list = new ArrayList<String>();
       list.add("Shivam");
        list.add("Rohit");
        list.add("Mohit");
        list.add("10");
        list.add("20");

        System.out.println(list);

          for(String b : list)

          {

              System.out.println(b);

          }





    }

}
