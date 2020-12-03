package javaHomework03;

import java.util.Scanner;

public class PrimeGenerator {
	
	//grafiskâ metode pirmskaitïu noteikðanai - Eratostena siets.
	public static boolean primeNumCheck(int num) {		
		if (num == 2 || num == 3 || num == 5 || num == 7) {
			return true;
		} else if ( num %2 != 0 && num %3 != 0 && num %5 != 0 && num %7 != 0 ) {
			return true;
		}
		return false;
	}
		

	public static void main(String[] args) {
		
		System.out.println("Cik secîgus pirmskaitïus vçlies? (1-100)");
		Scanner userInp = new Scanner (System.in);
		int howMuch = userInp.nextInt();
		
		if (howMuch < 1 || howMuch > 100) {
			System.out.println("Uzmanîbu: robeþâs no 1-100");
			howMuch = userInp.nextInt();
		}
		
		userInp.close();
		
		int num = 1;
		int i = 1;
		while (i <= howMuch) {
			if(primeNumCheck(num)) {
				System.out.println(num);
				i ++;
			}				
			num ++;
		}
						
	}

}