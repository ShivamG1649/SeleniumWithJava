package basiscPrograming;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    // Map ,(key , value )

    /*

      employeeID , It's name in a map

      (001 ,"Rohit")  // Key , value pair in map is known as entry

      (002, "Mohit")

      (003, "Shivam")

      (004, "Rohit")

      for( int i =0;i<10;i++{
      sout(i)
      }

     */

    public static void main(String[] args) {

        Map<Integer,String> m = new HashMap<Integer,String>();
        m.put(001,"Rohit"); // first entry in map
        m.put(002,"Mohit");  // second entry
        m.put(003,"Shivam");  // third entry
        m.put(003,"Rohit");
        System.out.println("before remove "+m);
        // remove method to remove the records form map
//
//        m.remove(001);
        System.out.println("After remove "+m);

 // access the value of key

        System.out.println("Value of key 002 " +m.get(002));


        // key in a set   , keySet() is a method of map , that is used to convert a set from keys of a map

        System.out.println("set from keys of a map "+m.keySet());
       // if we want to get all values from a map then we can use .values() method

        System.out.println("Value from map "+m.values());

        // to create entry set

        System.out.println("Create entry set from a map "+m.entrySet());

        System.out.println("........................................");

        for(int k:m.keySet())
        {
            System.out.println("key is "+k +":value is "+m.get(k));
        }


    }




}
