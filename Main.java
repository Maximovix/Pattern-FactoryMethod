package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the type of encryption: ");
        int type = input.nextInt();
        try {
            if (type == 1) {
                Creator creator = new CreatorKey();
                creator.encryptionText();
            } else if (type == 2) {
                Creator creator = new CreatorCaesar();
                creator.encryptionText();
            }
        }catch (Exception e){
            System.err.println("Input the error value!");
        }
    }
}
