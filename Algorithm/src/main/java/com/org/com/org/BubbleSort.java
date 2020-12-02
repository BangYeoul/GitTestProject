package com.org.com.org;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[]args) {
		int a[]=new int [5];
		int j=0;
		
		int max=a[1];
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			a[i]=(int)(Math.random()*10)+1;
		}
		
		System.out.println("startWith \n: "+a);
		 
		
		while(true) {
			for(int q=0;q<a.length-1;q++) {
				if(max<min) {
					a[q]=max;
					a[q+1]=min;
				}
		}
		
		if(j==a.length-1) 
		{}
		
		
		j++;
		}
		
		
		
	}
}

					/*
  						1. scanner 값을 받는다.
  							1-1. 그외의 값이 입력되어 있는가?
  							1-2. 규칙대로 입력되어 있는가?
  						
  						2.	한셋트로 이루어져 있는가 
  							2-1. 기준에 따라서 괄호를 생성
  							
  							
  
  
  
  
					 */
