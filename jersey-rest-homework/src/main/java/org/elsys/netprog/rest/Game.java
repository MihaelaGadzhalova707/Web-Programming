package org.elsys.netprog.rest;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

class Game {
	
	public static int bulls;
	public static int cows;
	public static boolean predictedCount;
	public static int predictionsCount;
	public static String target;
	
	public static void main(String guess) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int count = 0;
		predictedCount = false;
		predictionsCount = 0;
		
		do{
			bulls = 0;
			cows = 0;
			int predict = Integer.parseInt(guess);
			try{
				if (isDuplicated(predict) || predict < 1000) continue;
			}catch(InputMismatchException ex) {
				continue;
			}
			
			predictionsCount++;
			String guessString = predict + "";
			int i = 0;
			
			while(i < 4) {
				if(guessString.charAt(i) == target.charAt(i)){
					bulls++;
				}else if(target.contains(guessString.charAt(i)+"")){
					cows++;
				}
				
				if(bulls == 4) {
					predictedCount = true;
				} else { 
					System.out.println(cows + "Cows and " + bulls + "Bulls");
				}
			}
		}while(!predictedCount);
		
		System.out.println(predictionsCount);
	}
	
	public static boolean isDuplicated(int numbers) {
		boolean[] str = new boolean[10];
		while(numbers > 0){
			int temp = numbers % 10;
			if(str[temp]) return true;
			str[temp] = true;
			numbers = numbers / 10;
		}
		return false;
		
	}
	
}
