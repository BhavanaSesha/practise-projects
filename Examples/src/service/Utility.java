package service;

import java.util.Scanner;

import exception.MyException;

public class Utility {
	public int intValidation(Scanner sc)
	{
		String str = "";
		int number = 0;
		boolean isNumber = false;
		while(!isNumber)
		{
			//try
			//{
				str = sc.nextLine();
				number = Integer.parseInt(str);
				isNumber = true;
				break;
			//}
			//catch(NumberFormatException e)
			//{
				//System.out.println("Enter Valid input : ");
			//}
		}
		return number;
	}
	public String stringValidation(Scanner sc)
	{
		String str = "";
		str = str.trim();
		String input="";
		boolean isString = false;
		while(!isString)
		{
			//try
			//{
				str = sc.nextLine();
				if(!(str.isEmpty()))
				{
					input = str.toString();
					isString = true;
					break;
				}
				else
					System.out.println("Enter input");
				
			//}
			//catch(Exception e)
			//{
				//System.out.println("Enter Valid input: ");
			//}
		}
		return input;
	}
	public String sentenceValidation(Scanner sc)
	{
		String str = "";
		String input = "";
		boolean isSentence=false;
		while(!isSentence)
		{
			try
			{
				str = sc.nextLine();
				if(!(str.isEmpty()))
				{
					input = str.toString();
					isSentence = true;
					break;
				}
				else
					System.out.println("Enter the input");
				
			}
			catch(Exception e)
			{
				System.out.println("Enter Valid input :");
			}

		}
		return input;
	}
	public String timeValidation(Scanner sc)
	{
		String str = "";
		String regex="^([01]?[0-9]|2[0-3]):[0-5][0-9]$";
		boolean isValid = false;
		while(!isValid)
		{
			try
			{
				str = sc.nextLine();
				if(str.matches(regex)&&!(str.isEmpty()))
				{
					isValid = true;
					break;
				}
			}catch(Exception e)
			{
				System.out.println("Enter valid input : ");
			}
		}
		return str;
		
	}
	public long longValidation(Scanner sc)
	{
		String str = "";
		long number =0;
		boolean isNumber = false;
		while(!isNumber)
		{
			try
			{
				str = sc.nextLine();
				number = Long.parseLong(str);
				isNumber = true;
				break;
			}
			catch(NumberFormatException e)
			{
				System.out.println("Enter Valid input : ");
			}
		}
		return number;
	}
	public char menuOptionValidation(Scanner sc)
	{
		boolean isChar = false;
		char option='0';
		while(!isChar)
		{
			try
			{
				option=sc.next().charAt(0);
				if(option!='\0')
				{
					if((option>='a'&&option<='z')||(option>='A'&&option<='Z'))
					{
						isChar = true;
						break;
					}
				}
				else
					System.out.println("Enter value");

			}
			catch(Exception e)
			{
				System.out.println("Enter the valid option ");
			}
		}
		return option;
	}
	public byte menuOptionByteValidation(Scanner sc)
	{
		boolean isByte = false;
		byte option = 0;
		while(!isByte)
		{
			try
			{
				option = sc.nextByte();
				if(option>0&&option<9)
				{
					isByte = true;
					break;
				}
			}
			catch(Exception e)
			{
				System.out.println("Enter valid option:");
			}
		}
		return option;
	}
	public float floatValidation(Scanner sc)
	{
		boolean isFloat = false;
		String str = "";
		float input = 0;
		while(!isFloat)
		{
			//try
			//{
				str = sc.nextLine();
				input = Float.parseFloat(str);
				isFloat = true;
				break;
			//}
			//catch(NumberFormatException e)
			//{
				//System.out.println("Enter valid value");
			//}
		}
		return input;
	}
}
