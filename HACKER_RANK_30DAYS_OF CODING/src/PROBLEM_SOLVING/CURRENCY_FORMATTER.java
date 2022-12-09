package PROBLEM_SOLVING;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CURRENCY_FORMATTER
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();

		// Write your code here.

		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		Locale locale = new Locale("en", "in");
		NumberFormat india = NumberFormat.getCurrencyInstance(locale);
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

		System.out.println("US: " + us.format(payment));
		System.out.println("India: " + india.format(payment));
		System.out.println("China: " + china.format(payment));
		System.out.println("France: " + france.format(payment));
	}
}
