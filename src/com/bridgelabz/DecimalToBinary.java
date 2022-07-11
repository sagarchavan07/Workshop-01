package com.bridgelabz;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimalNo=5;
        int []binaryNumber=new int[10];

        int i=0;
        while (decimalNo>0) {
            int rem=decimalNo%2;    //5%2 =1
            binaryNumber[i]=rem;
            decimalNo=decimalNo/2;  //2
            i++;
        }

        for (int j = i-1; j >=0 ; j--) {
            System.out.print(binaryNumber[j]+" ");
        }


    }
}
