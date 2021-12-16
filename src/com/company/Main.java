package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the word you want to encrypt/decrypt:");
        String word = input.next().toUpperCase();
        System.out.println("Input your key "+"\n"+"Has to be same length as the word"+"\n"+"For decryption enter same key used to encrypt:");
        String key = input.next().toUpperCase();

        int[] cipherText = getInts(word);
        int[] cipherKey = getInts(key);
        int[] encrypted = new int[cipherText.length];
        for (int i = 0; i < cipherText.length; i++) {
            encrypted[i] = (cipherText[i]^cipherKey[i]);
        }
        String finalAnswer = String.valueOf(getChars(encrypted));
        System.out.println("Here is your encryption/decryption:");
        System.out.println(finalAnswer);

    }

    private static int[] getInts(String word) {
        int[] cipher = new int[word.toCharArray().length];
        int j = 0;
        for(char x: word.toCharArray()){
            cipher[j] = x - 64;
            j++;
        }
        return cipher;
    }

    private static char[] getChars(int[] arr){
        char[] x = new char[arr.length];
        int j = 0;
        for(int y: arr){
            x[j] = (char) (y + 64);
            j++;
        }
        return x;
    }
}
