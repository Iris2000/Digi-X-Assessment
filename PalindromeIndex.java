/*
this program can detects whether a string is a palindrome
without reverse the string
 */

import java.util.Scanner;

public class PalindromeIndex {

    public static void main(String[] args) {

        String original;
        char con;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter a string to check whether it is a palindrome: ");
            original = input.nextLine().toLowerCase();

            boolean result = true;
            int length = original.length();
            int middle = length / 2;

            for (int begin = 0; begin <= middle; begin++) {

                if (original.charAt(begin) != original.charAt(length - begin - 1)) {
                    result = false;
                    break;
                }
            }

            System.out.println(result);
            System.out.print("Do you want to continue[y/n]: ");
            con = input.next().toLowerCase().charAt(0);
            input.nextLine();

        } while (con == 'y');
    }
}
