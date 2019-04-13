// this program can detects whether a string is a palindrome
import java.util.Scanner;

public class PalindromeIndex {

    public static void main(String[] args)
    {
        String original;
        char con;

        Scanner input = new Scanner(System.in);

        do
        {
            System.out.print("Enter a string to check whether it is a palindrome: ");
            original = input.nextLine().toLowerCase();

            int begin  = 0;
            int end = original.length() - 1;
            int middle = end / 2;
            int i;

            for (i = begin; i <= middle; i++)
            {
                if (original.charAt(begin) == original.charAt(end))
                {
                    begin++;
                    end--;
                }
                else {
                    System.out.println("false");
                    break;
                }
            }

            if (i == middle + 1)
                System.out.println("true");

            System.out.print("Do you want to continue[y/n]: ");
            con = input.next().toLowerCase().charAt(0);
            input.nextLine();

        } while (con == 'y');
    }
}
