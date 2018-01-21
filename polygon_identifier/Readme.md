## Problem
Identify whether four sides (given by four integers) can form a square,
a rectangle, or neither.

Input:
You will receive an list of strings, each containing four space-separated
integers, which represent the length of the sides of a polygon. The input
lines will follow the 'A B C D' order as in the following representation:

```
|-----A-----|
|           |
|           |
D           B
|           |
|           |
|-----C-----|
```

Output:
A single line which contains 3 space-separated integers; representing
the number of squares, number of rectangles, and number of other polygons
with 4 sides.  Note that squares shouldn't be counted as rectangles.
Invalid polygons should also be counted as 'other polygons'.

Constraints:
The four integers representing the sides will be such that: -2000 <=X <= 2000
(Where X represents the integer)

Sample Input:
```
36 30 36 30
15 15 15 15
46 96 90 100
86 86 86 86
100 200 100 200
-100 200 -100 200
```

Sample Output:
```2 2 2```