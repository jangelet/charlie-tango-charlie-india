package algos;

/**
 * Created by JANG3LET on 11/1/17.
 */

import java.util.*;

public class DupeKiller <E extends Comparable<E>>{

    public static LinkedList dupeKiller(LinkedList ll){
        LinkedList ll2 = ll;

        for(int i = 0; i < ll.size(); i++){
            System.out.println("Outside: " + ll.get(i));
            for(int j = 1; j < ll.size(); j++){
                System.out.println("Inside: " + ll.get(j));
                if(ll.get(i)==ll2.get(j) && (i != j)){
                    ll.remove(j);
                }
            }
        }

        return ll;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList<Integer>();

        ll.add(3);
        ll.add(7);
        ll.add(3);
        ll.add(5);
        ll.add(12);
        ll.add(2);
        ll.add(4);
        ll.add(7);

        System.out.println(dupeKiller(ll));

    }

}

