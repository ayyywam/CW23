package org.horizoncolumbus.hs;

class Swap {

    public static void main(String[] args) {
	int x = 9;
	int y = 5;

	int temp = x;
	x = y;
	y = temp;

        System.out.println("x; " + x);
        System.out.println("y: " + y);
    }
}
