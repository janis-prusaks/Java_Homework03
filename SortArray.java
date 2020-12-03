package javaHomework03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class sortArray {

	public static void main(String[] args) {
		
		System.out.println("Ievadi skaitïu masîva izmçru robeþâs no 20 lîdz 40");
		Scanner userArrSize = new Scanner(System.in);
		int x = userArrSize.nextInt();
		userArrSize.close();
		
		int[] array = new int[x];
		
		for (int i=0; i<array.length; i++) {
			Random r = new Random();
			int randomInt = r.nextInt(90) + 10;
//			int randomInt = r.nextInt(100);
//			if (randomInt < 10) {
//				randomInt = r.nextInt(100);
//			}
			array[i] = randomInt;
		}
		
		System.out.println(Arrays.toString(array));
		
		
		for (int c=0; c<array.length; c++) {
			for (int i=0; i<array.length-1; i++) {
				while (array[i] > array[i+1]) {
					int store = array[i];
					array[i] = array[i+1];
					array[i+1] = store;
				}
			}			
		}
		
		System.out.println("Sakârtots skaitïu masîvs augoðâ secîbâ");	
		System.out.println(Arrays.toString(array));
	
	}

}