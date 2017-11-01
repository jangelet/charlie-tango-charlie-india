package algos; /**
 * Created by JANG3LET on 10/29/17.
 */

import java.util.*;

public class UniqueStringCheck {

    public static boolean checksString(String s1){
        HashMap<Character, Integer> charCounter =
                new HashMap<Character, Integer>();
        boolean unique = false;

        for (char ch : s1.toCharArray())
            charCounter.put(ch, charCounter.containsKey(ch) ?
                    (charCounter.get(ch) + 1) : 1);

        for(int val : charCounter.values()) {
            if(val > 1){
                unique = false;
                break;
            }else{
                unique = true;
            }
        }


        System.out.println(charCounter.entrySet());
        return unique;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String s1 = s.nextLine();

        System.out.println(checksString(s1));
    }


}
