Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise,let us work with the primitives used to hold integer values (byte, short, int, and long):
    + A byte is an 8-bit signed integer.
    + A short is a 16-bit signed integer.
    + An int is a 32-bit signed integer.
    + A long is a 64-bit signed integer.

Given an input integer, determine which primitive data types are capable of properly storing that input.

#### Output Format

For each input variable and appropriate primitive , determine if the given primitives are capable of storing it. If yes, then print:

```
n can be fitted in:
* dataType
```

If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: ).
```
byte < short < int < long
```

If the number cannot be stored in one of the four aforementioned primitives, print the line:

```
n can't be fitted anywhere.
```

### Sample Input

```
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
```

Sample Output

```
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
```
