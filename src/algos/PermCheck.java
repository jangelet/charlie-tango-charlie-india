package algos; /**
 * Created by JANG3LET on 10/30/17.
 */

import java.util.*;

public class PermCheck {

    private static boolean stringLength(String s1, String s2){
        if(s1.length() == s2. length()){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isPermutation(String s1, String s2){
        if(stringLength(s1, s2)){
            char [] charArr1 = s1.toCharArray();
            char [] charArr2 = s2.toCharArray();
            Arrays.sort(charArr1);
            Arrays.sort(charArr2);

            if(Arrays.equals(charArr1, charArr2)){
               return true;
            }
        }

        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(isPermutation(s1, s2));
    }
}
