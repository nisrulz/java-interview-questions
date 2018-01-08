package com.nisrulz.github.find_polygon_type_from_sides;

public class Main {

    public static void main(String[] args) {
        System.out.println(" Type of polygon: " + findPolygonTypeFromSides(36, 30, 36, 30));
        System.out.println(" Type of polygon: " + findPolygonTypeFromSides(15, 15, 15, 15));
        System.out.println(" Type of polygon: " + findPolygonTypeFromSides(46, 96, 90, 100));
        System.out.println(" Type of polygon: " + findPolygonTypeFromSides(86, 86, 86, 86));
        System.out.println(" Type of polygon: " + findPolygonTypeFromSides(100, 200, 100, 200));
        System.out.println(" Type of polygon: " + findPolygonTypeFromSides(-100, 200, -100, 200));
    }


    private static String findPolygonTypeFromSides(int side1, int side2, int side3, int side4) {
        System.out.println("\nSides: " + side1 + ", " + side2 + ", " + side3 + ", " + side4);

        if (side1 <= 0 || side2 <= 0 || side3 <= 0 || side4 <= 0) {
            return "Other Shape";
        }

        if (side1 == side2 && side2 == side3 && side3 == side4) {
            return "Square";
        }

        if (side1 == side3 && side2 == side4) {
            return "Rectangle";
        }

        return "Other Shape";
    }
}
