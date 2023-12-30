import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {11, 7, 8, 2, 5};
//        1
//        System.out.println(sumOfArray(arr));

//        2
//        System.out.println(largestElemFromArray(arr));

//        3.1
//        System.out.println(evenOdd(7) ? "even" : "odd");
//        3.2
//        for(int it : arr){
//            System.out.println(evenOdd(it) ? "even" : "odd");
//        }

//        4
//        reverseArray(arr);

//        5
//        System.out.println( factorialOfNumber(3));

//        6
//        char[] chars = new char[] { 'a', 'b', 'c', 'b', 'a' };
//        System.out.println(palindromeCheck(chars) ? "Palindrome" : "not palindrome");

//        7
//        System.out.println(isPrime(10)? "Prime" : "not prime");

//        8
//        fibonacciSeries(10);

//        9
//        System.out.println(linearSearch(arr, 3) ? "Found" : "Not found");

//        10
//        int[] myArr={1, 5, 7, 8, 10};
//        System.out.println(binarySearch(myArr, 10) ? "Found" : "Not found");

//        11
//        findDuplicate(arr);

//        12
//        countVowelConsonet("abcaeu");

//        13
//        mutiplicationTable(50);

//        14
//          int[][] arr1={{1,2},{3,4}};
//          int[][] arr2={{1,2},{3,4}};
//          int[][] result=matricsSum(arr1,arr2);
//          for(int it=0; it<result.length; it++){
//              for(int j=0; j<result[0].length; j++){
//                  System.out.print(result[it][j]+" ");
//              }
//              System.out.print("\n");
//          }

//        15
//        averageOfArray(arr);

//        16
//        System.out.println(isLeapYear(2009) ? "Leap year" : "Not leap year");

//        17
//        pattern(5);

//        18
//        System.out.println(reverseStr("apple"));

//        19
//        System.out.println(isArmstrong(1531) ?  "Armstrong" : "Not armstrong");

//        20
//        findMaxMin(arr);
    }


    //  1. Sum of Array Elements: Write a program to find the sum of all elements in an array.
    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int it : arr) {
            sum += it;
        }
        return sum;
    }

    //  2. Largest Element in Array: Find and print the largest element in an array.
    public static int largestElemFromArray(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        for (int it : arr) {
            maxi = maxi > it ? maxi : it;
        }
        return maxi;
    }

    //  3. Even or Odd Numbers: Check if a given number is even or odd using if-else. (also count in an array)
    public static boolean evenOdd(int value) {
        if ((value & 1) != 1) {
            return true;
        } else {
            return false;
        }
    }

    //  4. Reverse an Array: Reverse the elements of an array.
    public static void reverseArray(int[] arr) {
        for (int it = arr.length - 1; it >= 0; it--) {
            System.out.print(arr[it] + " ");
        }
    }

    //  5. Factorial Calculation: Write a program to calculate the factorial of a given number.********* + recursive solution.
    public static int factorialOfNumber(int value) {
        if (value >= 1)
            return value * factorialOfNumber(value - 1);
        else
            return 1;
    }

    //  6. Palindrome Check: Check if a given string is a palindrome. (use char string)
    public static boolean palindromeCheck(char[] str) {
        int l = 0, r = str.length - 1;
        boolean flag = true;
        while (l < r) {
            if (str[l] != str[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    //  7. Prime Number Check: Determine whether a given number is prime.
    public static boolean isPrime(int value) {
        if (value <= 0) {
            return false;
        }
        boolean flag = true;
        for (int it = 2; it <= Math.sqrt(value); it++) {
            if (value % it == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    //  8. Fibonacci Series: Generate and print the first N elements of the Fibonacci series.******** + recursive solution.
    public static int fibonacci(int value) {
        if (value <= 1) {
            return value;
        }
        return fibonacci(value - 1) + fibonacci(value - 2);
    }

    public static void fibonacciSeries(int value) {
        for (int it = 0; it < value; it++) {
            System.out.print(fibonacci(it) + " ");
        }
    }

    //  9. Linear Search: Implement a linear search algorithm to find an element in an array. (true or false return type)
    public static boolean linearSearch(int[] arr, int target) {
        for (int it : arr) {
            if (it == target) {
                return true;
            }
        }
        return false;
    }

    //   10. Binary Search: Implement binary search for a sorted array.
    public static boolean binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return true;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    //  11. Duplicate Elements: Find and print duplicate elements in an array. (true or false return type)
    public static void findDuplicate(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> data = new LinkedHashSet<Integer>();
        for (int it : arr) {
            if (map.get(it) == null) {
                map.put(it, 1);
            } else {
                map.put(it, map.get(it) + 1);
                data.add(it);
            }
        }
        int size = data.size();
        System.out.println(size != 0 ? data : "No diplicates available");
    }

    //  12.  Count Vowels and Consonants: Count the number of vowels and consonants in a given string. (a, e, i, o, u)
    public static void countVowelConsonet(String str) {
        int consonent = 0, vowel = 0;
        String ref = "aeiouAEIOU";
        for (int it = 0; it < str.length(); it++) {
            if (ref.indexOf(str.charAt(it)) != -1) {
                vowel++;
            } else {
                consonent++;
            }
        }
        System.out.println("No of vowels " + vowel + "\nNo of consonents " + consonent);
    }

    // 13. Multiplication Table: Print the multiplication table for a given number. (2 x 1 = 1, 2 x 2 = 4)
    public static void mutiplicationTable(int value) {
        for (int it = 1; it <= 10; it++) {
            System.out.println(value + " * " + it + " = " + (value * it));
        }
    }

    // 14. Matrix Addition: Add two matrices and print the result. 5x5 5x5 (return 2d array)
    public static int[][] matricsSum(int[][] m1, int[][] m2) {
        int[][] sum = new int[m1.length][m1[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[0].length; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }
        return sum;
    }

    // 15. Calculate Average: Calculate the average of elements in an array.
    public static void averageOfArray(int[] arr) {
        int result = sumOfArray(arr);
        float avg = (float) result / arr.length;
        System.out.println(avg);
    }

    // 16. Leap Year Check: Determine whether a given year is a leap year.
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    // 17. Pattern Printing: Print a pattern (e.g., a pyramid) using loops. (google patterns of loop)
    public static void pattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    // 18. String Reversal: Reverse a given string without using built-in functions. apple, elppa
    public static String reverseStr(String str) {
        String rev = "";
        for (int it = str.length() - 1; it >= 0; it--) {
            rev += str.charAt(it);
        }
        return rev;
    }

    //  19. Armstrong Number: Check if a number is an Armstrong number.
    public static boolean isArmstrong(int value) {
        int num = value, sum = 0, dig = 0;

        while (num > 0) {
            num /= 10;
            dig++;
        }
        num = value;
        while (num > 0) {
            int last = num % 10;
            sum += (Math.pow(last, dig));
            num /= 10;
        }
        return (value == sum ? true : false);
    }

    //  20. Find Minimum and Maximum: Write a program to find the minimum and maximum values in an array.
    public static void findMaxMin(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int it : arr) {
            if (it > max) {
                max = it;
            }
            if (it < min) {
                min = it;
            }
        }
        System.out.println("Maximum value is : " + max + "\nMinimum value is : " + min);
    }
}

