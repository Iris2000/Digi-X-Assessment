/** this program sort the arrays in ascending order
 *  using java.util.Arrays library
 */

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args){

        int array[] = {100, 2, 5, 13, 29, 68, 87, 4, 17, 45, 54};

        Arrays.sort(array);

        for (int i = 1; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
