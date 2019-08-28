package com.muniraja.ArrayList;

public class SecondMax {

	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=19;
		a[1]=28;
		a[2]=23;
		a[3]=125;
		a[4]=20;
		int temp=0,stemp=0;
		int max = 0;
		int smax = 0;
		for(int i=0;i<a.length-1;i++) 
		{
			for(int j=1;j<a.length;j++)
			{
				if(a[i]>=a[j]) {
					temp=a[i];
				}
				else {
					stemp=a[j];
				}
				if(temp<=stemp) {
					if(smax<stemp) {
						smax=stemp;
					}
				}
				else {
					
					
					if(max<temp) {
						max=temp;
						}
				}
			}
		}
		System.out.println("max value in array:"+max);
		System.out.println("second maximum value in array:"+smax);

	}

}
