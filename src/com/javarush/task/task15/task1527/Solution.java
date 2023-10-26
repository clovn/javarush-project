package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] url = reader.readLine().split("\\?");
        ArrayList<String> out = new ArrayList<>();
        for(int i = 1; i < url.length; i++){
            for(String str : url[i].split("&")){
                String[] param = str.split("=");
                System.out.print(param[0] + " ");
                if(param[0].equals("obj")) out.add(param[1]);
            }
        }
        //напишите тут ваш код
        System.out.println();
        for(String i : out){
            try{
                alert(Double.parseDouble(i));
            } catch (Exception e){
                alert(i);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
