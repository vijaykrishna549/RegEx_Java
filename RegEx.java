package com.bridgelabz.regex;
import java.util.regex.*;
public class RegEx {
public static void main(String args[]) {


	System.out.println(Pattern.matches("^[A-z][a-z]{3,}$", "Vijay"));
	System.out.println(Pattern.matches("^[A-Z][a-z]{3,}\\s[A-Z][a-z]{3,}+$", "Vijay Krishna"));
	System.out.println(Pattern.matches("^[a-z]{3}[.][xyz]*[@][a-z]{2}[.][co]{2}[.][in]*$", "abc.xyz@bl.co.in"));
	
}
}