package com.coordinates;

import java.util.Scanner;

public class Coords {

	public static void main(String[] args) {
           @SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
           
           System.out.println("Write coordinates x and y: ");
           int x = sc.nextInt();
           int y = sc.nextInt();
           
          if (x>=0 && y>=0) {
               System.out.println("The point is in the first quadrant");
          } else if (x<0 && y>0) {
        	  System.out.println("The point is in the second quadrant");
          } else if (x<0 && y < 0 ) {
        	  System.out.println("The point is in the third quadrant");
          } else if (x> 0 && y<0) {
        	  System.out.println("The point is in the fourth quadrant");
          } else {
        	  System.out.println("Write the number valid");
          }
	}

}
