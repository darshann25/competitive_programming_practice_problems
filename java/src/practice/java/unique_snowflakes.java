package practice.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class unique_snowflakes {
    public static void main(String[] args) {
        //int[] arr = {1, 5, 1, 2, 3, 2, 1};

        ArrayList<Integer> list;
        int test_cases = 0;

        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            test_cases = sc.nextInt();
        }

        while (test_cases > 0) {
            list = new ArrayList<>();
            int num_input = sc.nextInt();

            while (num_input > 0) {
                list.add(sc.nextInt());
                num_input--;
            }

            int result = unique_snowflake_numbers(list.toArray());
            //int result = unique_snowflake_numbers(arr);
            System.out.println(result);

            test_cases--;
        }
    }

    public static int unique_snowflake_numbers(Object[] input) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        int currMax = 0;

        for(int i = 0; i < input.length; i++) {
            int num = (int) input[i];
            if(set.contains(num)) {
                set = new HashSet<>();
                set.add(num);
                currMax = 1;
            } else {
                set.add(num);
                currMax++;
            }

            if (currMax > max) max = currMax;
        }

        return max;
    }
}