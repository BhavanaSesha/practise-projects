package service;

import java.util.Scanner;

public class Validate {
	public int intValidation(Scanner sc)
	{
		boolean itr=true;
		while(itr)
		{
			String str = sc.next();
			boolean flag = false;
			int count=0,number=0;
			for(int i = 0;i<str.length();i++)
			{
				if(str.charAt(i)>='0'&&str.charAt(i)<='9')
				{
					count++;
				}
			}
			if(count==str.length())
			{
				flag=true;
			}
			else
				flag=false;
			if(flag)
			{
				for(int i = 0;i<str.length();i++)
				{
					int num=str.charAt(i)-48;
					number=number*10+num;
				}
				itr=false;
				return number;
			}
			else
			{
				System.out.println("Enter correct input");
				itr=true;
			}
		}
		
		return 0;
	}
	public String stringValidate(Scanner sc)
	{
		boolean itr = true;
		while(itr)
		{
			String str = sc.next();
			boolean flag=false;
			int count=0;
			for(int i =0;i<str.length();i++)
			{
				if((str.charAt(i)>='a'&&str.charAt(i)<='z')||(str.charAt(i)>='A'&&str.charAt(i)<='Z'))
				{
					count++;
				}
			}
			if(count==str.length())
			{
				flag = true;
				itr=false;
				return str;
				
			}
			else
			{
				System.out.println("Enter valid input");
				flag = false;
				itr=true;
			}
		}

		return "";
		
	}
	public String sentenceValidation(Scanner sc)
	{
		boolean itr = true;
		while(itr)
		{
			String sen=sc.nextLine();
			int count=0;
			for(int i=0;i<sen.length();i++)
			{
				if((sen.charAt(i)>='0'&&sen.charAt(i)<='9')||(sen.charAt(i)>='a'&&sen.charAt(i)<='z')||(sen.charAt(i)>='A'&&sen.charAt(i)<='Z')||(sen.charAt(i)==' ')||sen.charAt(i)=='.'||sen.charAt(i)=='*'||sen.charAt(i)=='@'||sen.charAt(i)=='/'||sen.charAt(i)=='+'||sen.charAt(i)=='-'||sen.charAt(i)==','||sen.charAt(i)==':'||sen.charAt(i)=='('||sen.charAt(i)==')')
				{
					count++;
				}
				
			}
			if(count==sen.length())
			{
				itr=false;
				return sen;
			}
			else
			{
				System.out.println("Enter Valid input");
				itr=true;
			}
		}

		return "";
		
	}
	public long longValidation(Scanner sc)
	{
		boolean itr=true;
		while(itr)
		{
			String str = sc.next();
			boolean flag = false;
			int count=0;
			long number=0;
			for(int i = 0;i<str.length();i++)
			{
				if(str.charAt(i)>='0'&&str.charAt(i)<='9')
				{
					count++;
				}
			}
			if(count==str.length())
			{
				flag=true;
			}
			else
				flag=false;
			if(flag)
			{
				for(int i = 0;i<str.length();i++)
				{
					int num=str.charAt(i)-48;
					number=number*10+num;
				}
				itr=false;
				return number;
			}
			else
			{
				System.out.println("Enter correct input");
				itr=true;
			}
		}

		return 0;
	}
	public char characterValidate(Scanner sc )
	{
		boolean itr = true;
		while(itr)
		{
			char ch = sc.next().charAt(0);
			int count=0;
			boolean flag = false;
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9'))
			{
				count++;
				

			}
			if(count==1)
			{
				itr=false;
				return ch;
			}
			else
			{
				itr=true;
				System.out.println("Enter valid input");
			}
			
			
		}

		
		return 0;
		
	}
	

}
