package com.bridgelabz.regex;
import java.util.regex.*;
public class RegEx {
public static void main(String args[]) {


	System.out.println(Pattern.matches("^[A-z][a-z]{3,}$", "Vijay"));
	System.out.println(Pattern.matches("^[A-Z][a-z]{3,}\\s[A-Z][a-z]{3,}+$", "Vijay Krishna"));
	System.out.println(Pattern.matches("^[a-z]{3}[.][xyz]*[@][a-z]{2}[.][co]{2}[.][in]*$", "abc.xyz@bl.co.in"));
	System.out.println(Pattern.matches("^[1-9]{2}\\s[1-9][0-9]{9}$", "91 9915473501"));
	System.out.println(Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@!#]*)[a-zA-Z0-9@!#*]{8,}", "Rohit@12"));
	
}
}