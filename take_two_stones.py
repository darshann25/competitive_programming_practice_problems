"""
Alice and Bob are playing a new game of stones. There are NN stones placed on the ground, forming a sequence. The stones are labeled from 11 to NN.

Alice and Bob in turns take exactly two consecutive stones on the ground until there are no consecutive stones on the ground. That is, each player can take stone ii and stone i+1i+1, where 1≤i≤N−11≤i≤N−1. If the number of stone left is odd, Alice wins. Otherwise, Bob wins.

Assume both Alice and Bob play optimally and Alice plays first, do you know who the winner is?

Input
The input contains an integer NN (1≤N≤10000000)(1≤N≤10000000), the number of stones.

Output
Output the winner, “Alice” or “Bob” (without the quotes), on a line.

Sample Input 1	Sample Output 1
1
Alice
Sample Input 2	Sample Output 2
2
Bob
Sample Input 3	Sample Output 3
5
Alice
"""

# Solution :
num_stones = int(input())
if num_stones % 2 == 1 :
    print "Alice"
else:
    print "Bob"
