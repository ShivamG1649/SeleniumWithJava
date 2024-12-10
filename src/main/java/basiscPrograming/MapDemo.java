package basiscPrograming;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    // Creation of map

    public static void main(String[] args) {
        Map<String , String> map = new HashMap();
        map.put("1","Shviam");
        map.put("2","Rohit");
        map.put("3","Mohit");

        // Iteration of map

        for( Map.Entry<String , String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }

}
