package com.phase1.lesson3;

public class MyException extends Exception {
	String str1;
	   MyException(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }

}
