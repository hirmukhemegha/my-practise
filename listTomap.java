import java.lang.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.xml.stream.events.Characters;

public class listTomap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> l = new ArrayList<>();
        l.add('a');
        l.add('b');
        l.add('b');
        l.add('c');
        l.add('d');
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }

        Map<Character, Boolean> m = new HashMap<>();
        for (int i = 0; i < l.size(); i++) {
            if (Collections.frequency(l, l.get(i)) >= 2) {
                m.put(l.get(i), true);

            } else {
                m.put(l.get(i), false);

            }
        }
        System.out.println(m);

    }

}
