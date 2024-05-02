package com.driver;

public class Main {
    static class Product {

        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create object of Product called p
        Product p = new Product();

        int result1 = p.product(5, 3);
        System.out.println("Product of 5 and 3 is: " + result1);

        int result2 = p.product(2, 3, 4);
        System.out.println("Product of 2, 3, and 4 is: " + result2);

        double result3 = p.product(2.5, 1.5);
        System.out.println("Product of 2.5 and 1.5 is: " + result3);
    }
}