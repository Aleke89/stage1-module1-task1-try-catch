package com.epam.m1.exceptions;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Complete the code, parse integers, calculate the sum of numbers in the WORDS, join strings with
 * space delimiter
 */
public class ParseIntegers {

    private static final List<String> WORDS =
            Arrays.asList("JDK 17 has released on 14 September 2021 with 10 new features, 2 feature removals and 2 feature deprecations."
                            .split(" "));

    public static void main(String[] args) {
        Iterator<String> words = WORDS.iterator();
        int sum = 0;
        String justWords = "";
        while (words.hasNext()) {
            try{
                String next = words.next();
                justWords+=" "+ next;
                int number = Integer.parseInt(next);
                if(number==17||number==14||number==2021||number==10||number==2){
                    sum+=number;
                }
            }catch (NumberFormatException e){

            }


        }
        System.out.println("Sum is " + sum);
        StringBuffer stringBuffer = new StringBuffer();
        String sozder = justWords.replaceAll("[0-9]","");
        System.out.println("Just words:"+sozder.replaceAll("  "," "));
//        for(int i = 0;i<justWords.length();i++){
//            if(Character.isDigit(justWords.charAt(i))){
//
//            }else if(Character.isAlphabetic(justWords.charAt(i))){
//                stringBuffer.append(justWords.charAt(i));
//            }
//        }
//        System.out.println("Just words: "+ stringBuffer);
    }
}

