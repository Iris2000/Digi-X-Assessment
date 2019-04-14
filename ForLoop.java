/*
this program use a for loop to prints
all the multiples of 3 and 5 up to 100
*/

public class ForLoop {

    public static void main(String[] args) {

        String result = "";

        for (int num = 1; num <= 100; num++) {

            if (num % 3 == 0 || num % 5 == 0)
                result = result + num + ", ";
        }

        System.out.print(result.replaceAll(", $", ""));
    }
}
