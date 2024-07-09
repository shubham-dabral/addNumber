package com.addnumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddNumber {

	
	public int addNumber(String number) {
		
		if(number.length()==0) {
			return 0;
		}
		
		String regex = "[!\"#$%&'*+,./:;=?@^_`|~-]+";
		Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(number);
        
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) { 
            matcher.appendReplacement(sb, ","); 
        } 
        matcher.appendTail(sb); 

		number=sb.toString();
		
		if (number.contains("\n")) {
			number=number.replace("\n", ",");
		}
		
		String numArr[]=number.split(",");
		
		int sum=0;
		
		for(int index=0;index<numArr.length;index++) {
			if(!numArr[index].trim().equals(""))
				sum=sum+Integer.parseInt(numArr[index].trim());
		}
		
		return sum;
	}

}
