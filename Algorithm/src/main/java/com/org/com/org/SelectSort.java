package com.org.com.org;

public class SelectSort {
	public static void main(String[]args) {
	
	int ArrayNumber[]= {5,7,1,2,6}; // 57126 [0] 17526 [1] 12576 [2] 12576 [3] 12567
	int min=0;						// 17526     12576     12556     12556
	int Cindex=0;
	int Mindex=0;
	int ColumnNumber=0;
	int Count;
	while(true) {
		
		
		Cindex=Mindex+1;
		min=ArrayNumber[Mindex];
		Count=0;
		for(int i:ArrayNumber)
		System.out.print(i);
		System.out.println();				
									// for {System.print(i)}; System.out.Println
		
		
		while(true) {
			
		if(min>ArrayNumber[Cindex]) 
		{
			min=ArrayNumber[Cindex];
			ColumnNumber=Cindex;
			Count=1;
		}
		Cindex++;
		if(Cindex>=ArrayNumber.length) 
		{
			switch(Count) {
			case 1:ArrayNumber[ColumnNumber]=ArrayNumber[Mindex];
			ArrayNumber[Mindex]=min;
			case 0:
				for(int i:ArrayNumber) 
				{
					System.out.print(i);
				}System.out.println();
				break;
			
			
			}
			break;
		}
		
		
		}
		Mindex++;
		if(Mindex>=ArrayNumber.length-1) 
		{break;}
		
		}										
	}
}
