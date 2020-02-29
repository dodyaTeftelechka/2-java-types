package com.example.task02;

public class Task02 {

    public static String solution(String input) {
        long value = Long.parseLong(input);
        if ((Byte.MIN_VALUE <= value) & (value <= Byte.MAX_VALUE))
            return "byte";
        else if ((Short.MIN_VALUE <= value) & (value <= Short.MAX_VALUE))
            return "short";
        else if ((Integer.MIN_VALUE <= value) & (value <= Integer.MAX_VALUE))
            return "int";
        else if ((Long.MIN_VALUE <= value) & (value <= Long.MAX_VALUE))
            return "long";
        return "";
    }


    public static void main(String[] args) {

        String result = solution("12345");
        System.out.println(result);
    }

}