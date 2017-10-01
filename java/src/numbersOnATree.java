/*
Task
Lovisa’s task is to calculate the label of a node, given the height of the tree HH and the description of the path from the root.

Input
The only line of input contains the height of the tree HH, 1≤H≤301≤H≤30 and a string consisting of the letters ‘L’ and ‘R’,
denoting a path in the tree starting in the root. The letter ‘L’ denotes choosing the left child, and the letter ‘R’ choosing
the right child. The description of the path may be empty and is at most HH letters.

Output
Output one line containing the label of the node given by the path.

Sample Input 1	Sample Output 1
3 LR            11
Sample Input 2	Sample Output 2
3 RRL           2
Sample Input 3	Sample Output 3
2               7
 */
import java.lang.Math;
import java.util.Scanner;

public class numbersOnATree {
    public  static void main(String[] args){
        // Initial Testing
        //int res = numbersOnTree(3, "RRL");
        //System.out.println(res);

        int ht = 0;
        String path = "";
        Scanner sc = new Scanner(System.in);
        ht = sc.nextInt();
        if (sc.hasNext()) path = sc.next();


        //System.out.print(ht + " " + path);
        int result = numbersOnTree(ht, path);
        System.out.println(result);

    }

    public static int numbersOnTree(int ht, String path) {
        if (path.length() > ht) {
            return -1;
        }

        if(path.length() == 0){
            return (int) (Math.pow(2, ht + 1) - 1);
        }

        double val = 1;
        for(int i = 0; i < path.length(); i++){
            char c = path.charAt(i);
            if(c == 'L') {
                val = 2 * val;
            }
            if (c == 'R'){
                val = 2 * val + 1;
            }
        }

        val = Math.pow(2, ht + 1) - val;

        return (int) val;
    }

}
