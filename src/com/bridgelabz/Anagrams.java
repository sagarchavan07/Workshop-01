package com.bridgelabz;

import javax.swing.*;

public class Anagrams {
    public static void main(String[] args) {
        boolean anagram=true;

        String str1="abcdz";
        String str2="bczad";

        if (str2.length() == str2.length())
        {
            for (int i = 0; i < str1.length(); i++) {
                int checkcount=0;
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        checkcount++;
                    }
                }
                if (checkcount == 0) {
                    anagram=false;
                }
            }
        }else {
            anagram=false;
        }

        System.out.println("Anagram : "+anagram);

    }

}