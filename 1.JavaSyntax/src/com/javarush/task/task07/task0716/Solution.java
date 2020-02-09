package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();

        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2

        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> list_out = new ArrayList<String>();
        int count = list.size();
        for (int i = 0; i < count; i++) {
            String s = list.get(i);

            if (s.indexOf("р") >= 0 && s.indexOf("л") >= 0) {
                list_out.add(s);
            } else if (s.indexOf("р") >= 0 && s.indexOf("л") == -1) {
                list.set(i, "");
            } else if (s.indexOf("л") >= 0 && s.indexOf("р") == -1) {
                list_out.add(s);
                list_out.add(s);
            } else {
                list_out.add(s);
            }
        }
        return list_out;
    }
}