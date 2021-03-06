# Code Explanations
## Table of contents
* [For Loop](#for-loop)
* [Palindrome Index](#palindrome-index)
* [Sorting](#sorting)

<a name="for-loop"></a>
## For Loop

*This program use a for loop to prints all the multiples of 3 and 5 up to 100*

An `ArrayList` library is imported. It will be used to store the multiples of 3 and 5.
```java
import java.util.ArrayList;
```

At the end, we are going to print a list of numbers and join them with commas by using `String.join()`, but, `String.join()` only works with String on Java 8 and above. Therefore, we need to convert the data types of the numbers from `int` to `String`, and store them into the `ArrayList`.

An `ArrayList` object is created to store the array of numbers.
```java
ArrayList<String> array = new ArrayList<>;
```

A `for` loop is created to loop from number 1 to 100. The `if` statement is checking if there is any multiples of 3 and 5. If yes, the number will be added into the `ArrayList`. The numbers are converted into String by using `String.valueOf(int)`.
```java
for (int num = 1; num <= 100; num++) {
  if (num % 3 == 0 || num % 5 == 0) {
    array.add(String.valueOf(num));
  }
}
```

The numbers are printed by using `String.join()`.
```Java
System.out.print(String.join(", ", array));
```

<a name="palindrome-index"></a>
## Palindrome Index 
*This program can detects whether a string is a palindrome without reverse the string.*

A Scanner library is imported to get input from the user.
```java
import java.util.Scanner;
```
Users are required to enter a string for palindrome checking and choose whether to repeat this program. So, `do-while` loop is created to repeat the program.

The variable `original` is going to store the string from user input, and `con` is going to store character 'y' or 'n'. If `con == 'y'`, the program will repeat again.

A Scanner object is created to prompt user input.
```java
Scanner input = new Scanner(System.in);
```

Since the program is not case sensitive, the string is converted into lowercase by using `toLowerCase()`.

```java
original = input.nextLine().toLowerCase();
```

A variable called `result` is created and initialized to `true`. Meaning that every string is assumed as a palindrome.
```java
boolean result = true;
```

Variable `length` is used to store the length of the string.
```java
int length = original.length();
```

A `for` loop is created to repeat the process of comparing the characters of the string. Pairs of characters from each end of the string are compared. If any pairs of them is different, the value of `result` will be `false`, and escape the loop to stop looping.
```java
for (int begin = 0; begin <= length / 2; begin++) {

  if (original.charAt(begin) != original.charAt(length - begin - 1)) {
    result = false;
    break;
  }
}
```

After that, the value of `result` will be displayed and user is prompted to decide whether to repeat the program.

<a name="sorting"></a>
## Sorting 

*This program sort an arrays in ascending order using `java.util.Arrays` library*

Arrays library is imported.
```java
import java.util.Arrays;
```

An `array` variable is created and initialized.
```java
int[] array = {100, 2, 5, 13,29, 68, 87, 4, 17, 45, 54};
```

A built in function is called to sort the array.
```java
Arrays.sort(array);
```

A `for` loop is created to print the sorted array.
```java
for (int i = 0; i < array.length; i++)
  System.out.print(array[i] + " ");
```
