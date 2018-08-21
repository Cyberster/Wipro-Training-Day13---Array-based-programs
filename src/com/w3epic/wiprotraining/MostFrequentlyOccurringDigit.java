package com.w3epic.wiprotraining;
// https://tests.mettl.com/authenticateKey/cbe4c4da

import java.io.*;
import  java.util.*;

// Read only region start
class MostFrequentlyOccurringDigit {

	public int mostFrequentlyOccurringDigit(int[] input1,int input2){
		// Read only region end
		StringBuilder input = new StringBuilder();
		for (int ip : input1) input.append(ip);

		int[] freq = new int[10];

		/*for (int i = 0; i < input1.length; i++) {
			int number = input1[i];
			if (number < 0) number *= -1;

			// {0, -1, 12300, 11, 002} 5
			if (number == 0) freq[0]++;

			while (number != 0) {
				freq[number % 10]++;
				System.out.print((number % 10) + ", ");
				number /= 10;
			}
		}*/
		for (int j = 0; j < input.length(); j++) {
			freq[Integer.parseInt(String.valueOf(input.charAt(j)))]++;
		}

        	int maxFreqIndex = 0;
		int maxFreq = 0;
		
		for (int i = 9; i >= 0; i--) {
			if (freq[i] > maxFreq) {
				maxFreqIndex = i;
				maxFreq = freq[i];
			}
		}
		
		//System.out.println(Arrays.toString(freq) + " max i: " + maxFreqIndex);			
		return maxFreqIndex;
	}
}
