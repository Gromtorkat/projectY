package com.company;

import java.sql.SQLOutput;

public class Parser {
    public char[] parseString(String str) {
        String temp = "";
        char[] opt = {'*', '/', '+', '-'};
        char[] r1 = {};
        char[] r = str.toCharArray();
        for (var i = 0; i < r.length; i++) {
//            System.out.println(i + "--" + r[i]);
            temp = ""+ temp + r[i];
            System.out.println(temp);
            // яри к балбес вообще балбес
        }
        //  char[] JavaCharArray = {'1', '+', '2', '*', '3'};
        return r;
    }
}
