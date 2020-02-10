package com.task2;

import java.util.Scanner;

public class Calculator
{
   public static void main(String args[])
   {
   Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int count=0;
	System.out.println("* % + - /");
	char c=sc.next().charAt(0);
	int b=sc.nextInt();
    int res=0;
    switch(c)
    {
    case '+':res=a+b;
    count++;
             break;
             
    case '-':res=a-b;
    count++;
    break;      
    
    case '*':res=a*b;
    count++;
    break;
    
    case '/':res=a/b;
    count++;
    break;
    
    case '%':res=a%b;
    count++;
    break;
    
    default:System.out.println("please select proper operation");
    break;
    	 
    }
	
    if(count!=0)
    {
    System.out.println(res);
    }
   
   }
   
   
}
