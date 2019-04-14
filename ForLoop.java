/*
this program use a for loop to prints
all the multiples of 3 and 5 up to 100
*/
import java.util.ArrayList;
public class ForLoop {

    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();

        for (int num = 1; num <= 100; num++) {

            if (num % 3 == 0 || num % 5 == 0) {
                array.add(String.valueOf(num));
            }
        }

        System.out.print(String.join(", ", array));

    }
}
