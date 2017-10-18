/**
Problem A
Akcija

There is a promotional offer in a bookstore ?Take 3, pay for the 2 more expensive ones?. So, each customer who picks 3 books gets the cheapest one for free. Of course, the customer can take even more books and, depending on the way the books are arranged into groups of three, get the cheapest one in each group for free.

For example, let the prices of the books taken by the customer be: 10,3,2,4,6,4,910,3,2,4,6,4,9. If he arranges them into groups: (10,3,2)(10,3,2), (4,6,4)(4,6,4) and (9)(9), he will get the book priced 22 from the first group for free and the book priced 44 from the second group. We can see that he won?t get anything for free from the third group because it contains only one book.

The lady working in the bookstore is well-intentioned and she always wants to lower the price for each customer as much as possible. For given book prices, help the lady arrange the books into groups in the best way possible, so that the total price the customer has to pay is minimal.

Please note: The lady doesn?t have to arrange the books into groups so that each group contains exactly 3 books, but the number of books in a group needs to be between 1 and 3, inclusively.

Input
The first line of input contains the integer NN (1?N?100 0001?N?100 000), the number of books the customer bought. Each of the following NN lines contains a single integer CiCi (1?Ci?100 0001?Ci?100 000), the price of each book.

Output
The first and only line of output must contain the required minimal price.

Sample Input 1	Sample Output 1
4
3
2
3
2               8

Sample Input 2	Sample Output 2
6
6
4
5
5
5
5               21

*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class akcija {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int input_size = input.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        while(input_size > 0) {
            arr.add(input.nextInt());
            input_size--;
        }

        int result = akcija_cost(arr);
        System.out.println(result);
    }


    public static int akcija_cost(ArrayList<Integer> array) {
        Collections.sort(array);
        Collections.reverse(array);

        int cost = 0;
        for(int i = 0; i < array.size(); i++) {
            //System.out.println(array.get(i));
            if((i + 1) % 3 != 0) cost += array.get(i);
            //System.out.println("cost : " + cost);
        }
        return cost;
    }

}
