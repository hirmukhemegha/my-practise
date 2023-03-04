import java.util.Map;
import java.sql.Date;
import java.util.HashMap;

public class printOnlyKeys {
    public static void main(String[] args) {
        HashMap<String, String> hmp = new HashMap<>();
        hmp.put("A", "ABHYA");
        hmp.put("B", "ABHI");
        hmp.put("C", "MEGHA");
        hmp.put("D", "TANU");
        hmp.put("E", "ANU");
        hmp.put("F", "MONA");
        hmp.put("G", "TANIA");
        hmp.put("H", "TRU");
        hmp.put("I", "RUSHI");
        hmp.put("J", "RAJ");

        for (String key : hmp.keySet()) {
            System.out.println("key is: " + key);

        }

    }

}
