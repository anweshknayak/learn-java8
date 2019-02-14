import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class listmap {


    public static void main(String[] args) {
        List myListOfMaps = new ArrayList();
        Map map1 = new HashMap();
        map1.put("Fname", "Ankur");
       // map1.put("Fname", "Andkur");

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("Fname", "Singhal");
        map2.put("Loda", "Singsshal");

        myListOfMaps.add(map1);
        myListOfMaps.add(map2);

        for (int i = 0 ; i < myListOfMaps.size() ; i++) {
            Map myMap = (Map)myListOfMaps.get(i);
            String xar = (String)myMap.get("Loda");
            System.out.println(xar);
//            myMap.forEach((k,v) -> System.out.println(
//                     k + " " + v));

        }
    }

}
