package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Parser prser = new Parser();

        char[] resultChar = prser.parseString("131231+212312*3");
        for (var i = 0; i < resultChar.length; i++){
            System.out.println(resultChar[i]);
        }

//        Calculator calc = new Calculator();
//        Scanner a = new Scanner(System.in);
//        System.out.print("Введи символ: / ,* ,+ ,- ");
//        String sim = a.next();
//        System.out.print("Введи первое число:");
//        Scanner b = new Scanner(System.in);
//        int one = b.nextInt();
//
//        System.out.print("Введи второе число");
//
//
//        double result = calc.calculate(4, 2,'/');
//        System.out.println(result);
//        b.close();

    }

}






