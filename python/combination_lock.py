# coding=utf-8
"""
Now that you’re back to school for another term, you need to remember how to work the combination
lock on your locker. A common design is that of the Master Brand, shown at right. The lock has a dial
with 4040 calibration marks numbered 00 to 3939 with 00 at the top and then increasing in clockwise order.
A combination consists of 33 of these numbers; for example: 1515-2525-88. To open the lock, the following
steps are taken:

turn the dial clockwise 22 full turns
stop at the first number of the combination
turn the dial counter-clockwise 11 full turn
continue turning counter-clockwise until the 22nd number is reached
turn the dial clockwise again until the 33rd number is reached
pull the shank and the lock will open.
Given the initial position of the dial and the combination for the lock, how many degrees is the dial
rotated in total (clockwise plus counter-clockwise) in opening the lock?

Input
Input consists of several test cases, at most 20002000. For each case there is a line of input containing
44 numbers between 00 and 3939. The first number is the position of the dial. The next three numbers are the
combination. Consecutive numbers in the combination will be distinct. A line containing four zeros follows the
last case.

Output
For each case, print a line with a single integer: the number of degrees that the dial must be turned to open the
lock.

Sample Input 1
0 30 0 30
5 35 5 35
0 20 0 20
7 27 7 27
0 10 0 10
9 19 9 19
0 0 0 0

Sample Output 1
1350
1350
1620
1620
1890
1890

"""

import sys

for line in sys.stdin:
    arr = line.split()
    start = int(arr[0])
    one = int(arr[1])
    two = int(arr[2])
    three = int(arr[3])
    # Solve the test case and output the ans

    if start == one == two == three == 0:
        sys.exit()

    deg1 = start - one
    if deg1 < 0: deg1 += 40

    deg2 = two - one
    if deg2 <= 0: deg2 += 40

    deg3 = two - three
    if deg3 <= 0: deg3 += 40

    deg = deg1 + deg2 + deg3
    deg = (deg / 40.0) * 360
    deg += 1080
    print int(deg)

