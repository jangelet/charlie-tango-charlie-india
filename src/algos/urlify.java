/**
 * Created by JANG3LET on 10/30/17.
 */

import java.util.*;

public class urlify {

    public static String urlifier(String s, int realLen){

        int spaces = 0;
        char[] cs = s.toCharArray();

        for(int i = 0; i < cs.length-1; i++){
            if(cs[i]==' ')
                spaces++;
        }

        int index = realLen + spaces * 2;
        if(realLen < cs.length)
            cs[realLen] = '\0';

        for(int i = realLen - 1; i >= 0; i--){
            if(cs[i] == ' '){
                cs[index - 1] = '0';
                cs[index - 2] = '2';
                cs[index - 3] = '%';
                index = index - 3;
            }else{
                cs[index-1] = cs[i];
                index--;
            }
        }

        return s;
    }

    public static void main(String[] args) {
        String s = "Mr John Smith    ";

//        for(char c : s.toCharArray()){
//            System.out.println(c);
//        }
        System.out.println(urlifier(s, 13));
    }
}
