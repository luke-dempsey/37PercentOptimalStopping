package ldemp2020;

import java.util.Random;

public class ThirtySevenRule {
	
	public ThirtySevenRule() {
		
		
	}
	
	public int[] makeNums() {
		
		int[] data = new int[100];
		Random rd = new Random(); // creating Random object
		
		for(int x = 0; x < data.length; x++) {
			
			data[x] = rd.nextInt(1000);
		
		}	
		
		return data;
		
	}
	
	public int findHighest(int[] data) {
		
		int highest = Integer.MIN_VALUE;
		for(int x = 0; x < data.length; x++) {
			if(data[x] > highest) {
				highest = data[x];
			}
		}
		
		
		return highest;
	}
	
	public String printNums(int[] data) {
		
		
		String test = "";
		
		for(int x = 0; x < data.length; x++) {
			test += " " + data[x];
		}
		
		return test;
	}
	
	public int guess(int[] data) {
		
		int topNum = Integer.MIN_VALUE;
		
		for(int x = 0; x < 37; x++) {
			
			if(data[x] > topNum) {
				topNum = data[x];
//				System.out.println("New top num is: " + topNum);
			}
			
		}
		
		boolean done = false;
		int x = 37;
		
		while(!done && x < 100) {
			
			if(data[x] > topNum) {
				topNum = data[x];
//				System.out.println("The FINAL decision is: " + topNum);
				done = true;
			}
			
			x++;
		}
		
		return topNum;
		
	}

}
