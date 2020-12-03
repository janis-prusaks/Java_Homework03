package javaHomework03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortArray2D_Test {
	
	
	// mas�va ��iro�anas metode dilsto�ai sec�bai
	public static void sortArrDown (int[] array) {
		for (int c=0; c<array.length; c++) {
			for (int i=0; i<array.length-1; i++) {
				while (array[i] < array[i+1]) {
					int store = array[i+1];
					array[i+1] = array[i];
					array[i] = store;
				}
			}			
		}
	}		
	
	// mas�va vid�j�s v�rt�bas apr��ins
		public static float avrgValueOfArray (int[] array) {
			int sum = 0;
			for (int k=0; k<array.length; k++) {
				sum = sum + array[k];				
			}
			float avrgValueOfArr = (float) sum / array.length;
			return avrgValueOfArr;
		}
	
	
	public static void main(String[] args) {
		
		System.out.println("Ievadi skait�u mas�vu skaitu robe��s no 10 l�dz 20");
		Scanner userArrSize = new Scanner(System.in);
		int x = userArrSize.nextInt();
				
		while (x<10 || x>20) {
			System.out.println("K��da. Ievadi skait�u mas�vu skaitu robe��s no 10 l�dz 20");
			x = userArrSize.nextInt();
		}
		userArrSize.close();
		
		Random rand = new Random();
		int randomIntArr = rand.nextInt(40) + 10;
		
		int[][] array = new int[x][randomIntArr];
		
		// skait�u mas�vs aizpild�ts ar gad�juma skait�iem		
		Random randInt = new Random();
		for (int r=0; r<array.length; r++) {
			for (int k=0; k<array[r].length; k++) {
				array[r][k] = randInt.nextInt(899) + 100;
			}
		}
		System.out.println("Skait�u mas�vs aizpild�ts ar gad�juma skait�iem");
		System.out.println(Arrays.deepToString(array));
		
		// katru mas�vu k�rto dilsto�� sec�b�
		for (int r=0; r<array.length; r++) {
			sortArrDown(array[r]);			
		}
		System.out.println("Skait�u mas�vs sak�rtots dilsto�� sec�b�");
		System.out.println(Arrays.deepToString(array));
		
		
		// apr��ina katra mas�va vid�jo v�rt�bu
//		for (int r=0; r<array.length; r++) {
//			avrgValueOfArray(array[r]);			
//		}
				
		
		
		// p�rk�rto mas�vus p�c to vid�j�s v�rt�bas augo�� sec�b�
		for (int c=0; c<array.length; c++) {
			for (int r=0; r<array.length-1; r++) {
				while (avrgValueOfArray(array[r]) > avrgValueOfArray(array[r+1])) {
					int [] store = array[r];
					array[r] = array[r+1];
					array[r+1] = store;
				}
			}			
		}
		System.out.println("Skait�u mas�vi p�rk�rtoti p�c to vid�j�s v�rt�bas augo�� sec�b�");
		System.out.println(Arrays.deepToString(array));
				
		
		System.out.println("Skait�u mas�vs ar visliel�ko vid�jo v�rt�bu");
		System.out.println(Arrays.toString(array[array.length-1]));
				
	}
}