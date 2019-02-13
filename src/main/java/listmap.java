import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class listmap {


    public static void main(String[] args) {
        List myListOfMaps = new ArrayList();
        Map map1 = new HashMap();
        map1.put("Fname", "Ankur");
        map1.put("Fna33me", "Andkur");

        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("Lname", "Singhal");

        myListOfMaps.add(map1);
        myListOfMaps.add(map2);

        for (int i = 0 ; i < myListOfMaps.size() ; i++) {
            Map myMap = (Map)myListOfMaps.get(i);
            myMap.forEach((k,v) -> System.out.println("Key = "
                    + k + ", Value = " + v));

        }
    }

}
