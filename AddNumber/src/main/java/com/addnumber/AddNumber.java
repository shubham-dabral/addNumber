package com.addnumber;
public class AddNumber {
	
	public static int addNumber(String number) {
		if(number.length()==0) {
			return 0;
		}
		String numArr[]=number.split(",");
		int sum=0;
		
		for(int index=0;index<numArr.length;index++) {
			sum=sum+Integer.parseInt(numArr[index]);
		}
		return sum;
	}

}
