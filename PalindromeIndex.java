/** this program can detects whether a string is a palindrome
 *  without reverse the string
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

            int begin;
            int length = original.length();
            int middle = length / 2;


            for (begin = 0; begin <= middle; begin++) {

                if (original.charAt(begin) != original.charAt(length - begin - 1)) {
                    System.out.println("false");
                    break;
                }
                else if (original.charAt(begin) == original.charAt(middle + 1)) {
                    System.out.println("true");
                }
            }

            System.out.print("Do you want to continue[y/n]: ");
            con = input.next().toLowerCase().charAt(0);
            input.nextLine();

        } while (con == 'y');
    }
}