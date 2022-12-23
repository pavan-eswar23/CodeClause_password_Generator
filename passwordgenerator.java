import java.util.Random;
import java.util.Scanner;

public class passwordgenerator {
    public static void main(String[] args) {
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmonpqrstuvwxyz";
        String digits = "1234567890";
        String symbols = "!@#$%^&+*";
        String combination = upper + lower + digits + symbols;
        System.out.print("Enter Length of password:");
        Scanner sc = new Scanner(System.in);
        int Length = sc.nextInt();
        char[] password = new char[Length];
        Random rand = new Random();
        for (int i = 0; i < Length; i++) {
            password[i] = combination.charAt(rand.nextInt(combination.length()));
        }
        System.out.println("Generated password :" + new String(password));
    }

}
