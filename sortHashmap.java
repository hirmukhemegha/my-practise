import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//sort map in ascending order
public class sortHashmap {
    public static void main(String[] args) {
        Map<Integer,String> m= new HashMap<>();

        m.put(9, "A");
        m.put(8, "I");
        m.put(6, "C");
        m.put(4, "J");
        m.put(7, "E");
        m.put(5, "B");
        m.put(2, "H");
        m.put(3, "G");
        m.put(1, "F");
        m.put(10, "D");


        List<Map.Entry<Integer, String>> list = new ArrayList<>(m.entrySet());


        Collections.sort(list,new Comparator<Map.Entry<Integer, String>>(){
            public String compare(Map.Entry<Integer, String> e1, Map.Entry<Integer, String> e2){
                return e1.getValue();

            }

        });

//put sorted list into hashmap
        for (Map.Entry<Integer, String> e : list) {
            System.out.println(e.getKey() + " " + e.getValue());

        }
    }






    }


        

        
    
    

