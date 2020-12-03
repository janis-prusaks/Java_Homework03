package javaHomework03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SortArray2D_Test {
	
	
	// masîva ðíiroðanas metode dilstoðai secîbai
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
	
	// masîva vidçjâs vçrtîbas aprçíins
		public static float avrgValueOfArray (int[] array) {
			int sum = 0;
			for (int k=0; k<array.length; k++) {
				sum = sum + array[k];				
			}
			float avrgValueOfArr = (float) sum / array.length;
			return avrgValueOfArr;
		}
	
	
	public static void main(String[] args) {
		
		System.out.println("Ievadi skaitïu masîvu skaitu robeþâs no 10 lîdz 20");
		Scanner userArrSize = new Scanner(System.in);
		int x = userArrSize.nextInt();
				
		while (x<10 || x>20) {
			System.out.println("Kïûda. Ievadi skaitïu masîvu skaitu robeþâs no 10 lîdz 20");
			x = userArrSize.nextInt();
		}
		userArrSize.close();
		
		Random rand = new Random();
		int randomIntArr = rand.nextInt(40) + 10;
		
		int[][] array = new int[x][randomIntArr];
		
		// skaitïu masîvs aizpildîts ar gadîjuma skaitïiem		
		Random randInt = new Random();
		for (int r=0; r<array.length; r++) {
			for (int k=0; k<array[r].length; k++) {
				array[r][k] = randInt.nextInt(899) + 100;
			}
		}
		System.out.println("Skaitïu masîvs aizpildîts ar gadîjuma skaitïiem");
		System.out.println(Arrays.deepToString(array));
		
		// katru masîvu kârto dilstoðâ secîbâ
		for (int r=0; r<array.length; r++) {
			sortArrDown(array[r]);			
		}
		System.out.println("Skaitïu masîvs sakârtots dilstoðâ secîbâ");
		System.out.println(Arrays.deepToString(array));
		
		
		// aprçíina katra masîva vidçjo vçrtîbu
//		for (int r=0; r<array.length; r++) {
//			avrgValueOfArray(array[r]);			
//		}
				
		
		
		// pârkârto masîvus pçc to vidçjâs vçrtîbas augoðâ secîbâ
		for (int c=0; c<array.length; c++) {
			for (int r=0; r<array.length-1; r++) {
				while (avrgValueOfArray(array[r]) > avrgValueOfArray(array[r+1])) {
					int [] store = array[r];
					array[r] = array[r+1];
					array[r+1] = store;
				}
			}			
		}
		System.out.println("Skaitïu masîvi pârkârtoti pçc to vidçjâs vçrtîbas augoðâ secîbâ");
		System.out.println(Arrays.deepToString(array));
				
		
		System.out.println("Skaitïu masîvs ar vislielâko vidçjo vçrtîbu");
		System.out.println(Arrays.toString(array[array.length-1]));
				
	}
}