package com.org.com.org;

import java.util.HashMap;


public class InsertSort {
	
	public static void main(String[] args) {
		int ArrayNumber[]={4,5,3,2};//84275
		int Max=ArrayNumber.length;
		int Object=1;
		int Compare=0;
		int temp=0;
		int Ob=1;
		while(true) 
		{
			Object=Ob;
			Compare=Ob-1;
			if(ArrayNumber[Object]<ArrayNumber[Compare]) {
				while(true) {
				temp=ArrayNumber[Object];
				ArrayNumber[Object]=ArrayNumber[Compare];
				ArrayNumber[Compare]=temp;
				if(Compare==0) {
					break;
				}
				if(ArrayNumber[Compare]<ArrayNumber[Compare-1]) {
					Object=Compare;
					Compare--;
					
				}
				else if(ArrayNumber[Compare]>ArrayNumber[Compare-1]) {
					break;
					
				}
			}	}						 //값이 작은 경우,false 
			
			for(int i:ArrayNumber) {
				System.out.print(i);
			}System.out.println();
			
			if(Ob>=Max-1) 
			{ 
			  System.out.println("삽입정렬 종료.");
			  break;
			 
			}
			Ob++;
			
			
		}
		
	
	
	

	}	// InsertSort

}
	

