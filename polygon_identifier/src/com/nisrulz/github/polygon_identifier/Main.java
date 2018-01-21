package com.nisrulz.github.polygon_identifier;

import java.util.HashMap;
import java.util.Scanner;

public class Main {


    /*
    >>Problem
    Identify whether four sides (given by four integers) can form a square,
    a rectangle, or neither.

    Input:
    You will receive an list of strings, each containing four space-separated
    integers, which represent the length of the sides of a polygon. The input
    lines will follow the 'A B C D' order as in the following representation:


    |-----A-----|
    |           |
    |           |
    D           B
    |           |
    |           |
    |-----C-----|


    Output:
    A single line which contains 3 space-separated integers; representing
    the number of squares, number of rectangles, and number of other polygons
    with 4 sides.  Note that squares shouldn't be counted as rectangles.
    Invalid polygons should also be counted as 'other polygons'.

    Constraints:
    The four integers representing the sides will be such that: -2000 <=X <= 2000
    (Where X represents the integer)

    Sample Input:

    36 30 36 30
    15 15 15 15
    46 96 90 100
    86 86 86 86
    100 200 100 200
    -100 200 -100 200


    Sample Output:
    2 2 2

     */

    private static int SQUARE = 1;
    private static int RECTANGLE = 2;
    private static int OTHER = 3;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Integer> shapeMap = new HashMap<>();
        shapeMap.put(SQUARE, 0);
        shapeMap.put(RECTANGLE, 0);
        shapeMap.put(OTHER, 0);

        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();
        int side4 = sc.nextInt();

        int shape = checkPolygonType(side1, side2, side3, side4);
        shapeMap.put(shape, shapeMap.get(shape) + 1);


        System.out.printf("%d %d %d", shapeMap.get(SQUARE), shapeMap.get(RECTANGLE), shapeMap.get(OTHER));
    }

    public static int checkPolygonType(int side1, int side2, int side3, int side4) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || side4 <= 0) {
            return OTHER;
        }
        if (side1 == side2 && side2 == side3 && side3 == side4) {
            return SQUARE;
        }
        if (side1 == side3 && side2 == side4) {
            return RECTANGLE;
        }
        return OTHER;
    }
}
