//package com.mehndi;
import java.util.Scanner;

class Stationary  
{
	int feed_rate;
	char con;
	String name,feedback,y;
	int  n,i,choice,p;
	int price[]=new  int[10];
	int digit[][]= new int[30][30];
	int quantity[]=new int[30];
	Scanner sc=new Scanner(System.in);
		   
	void title()
	{
		int choice;
		System.out.println("\t\t\t\t   Welcome to the Staionary Store   \t\t\t\t");
		System.out.println("  \t\t\t          * * * * Menu of Items * * * *    \t\t\t");
		System.out.println("  \t\t\t       1.Pencils      Rs.100 per/pck of 20  \t\t\t  ");
		System.out.println("  \t\t\t       2.Pens         Rs.300 per/pck of 40  \t\t\t  ");
		System.out.println("  \t\t\t       3.Markers      Rs.350 per/pck of 10  \t\t\t  ");
		System.out.println("  \t\t\t       4.Books        Rs.450 per/pck of 10  \t\t\t  ");
		System.out.println("  \t\t\t       5.Glue         Rs.200 per/pck of 4   \t\t\t  ");
		System.out.println("  \t\t\t       6.Colors       Rs.500 per/pck of 12  \t\t\t  ");
		System.out.println("      \n   ");
		  
		System.out.println("Enter how many products do you want to order? ");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println("Enter the product to be orderd and the quantity of the product ");
			digit[i][i]=sc.nextInt();
			quantity[i]=sc.nextInt();
        }
		System.out.println(" \n");

		System.out.println(" \t\t\t\t   BILL   \t\t\t\t");
		System.out.println(" \n");
        System.out.println(" \t\t\t Product Name  \t\t\t Quantity  \t\t\t Total Price");

		for(i=1;i<=n;i++)
        {
		    switch(digit[i][i])
		    {
		        case 1:
		        {
		            price[i]=100*quantity[i];
		            System.out.println("\t\t\t  Pencils"+"\t\t\t\t"+ quantity[i]+"\t\t\t\t"+price[i]);
		            break;
		        }
		        case 2:
		        {
		            price[i]=300*quantity[i];
		            System.out.println("\t\t\t  Pens"+"\t\t\t\t"+ quantity[i]+"\t\t\t\t"+price[i]);
		            break;
		        }
		        case 3:
		        {
		        	
		            price[i]=350*quantity[i];
		            System.out.println("\t\t\t  Markers"+"\t\t\t\t"+ quantity[i]+"\t\t\t\t"+price[i]);
		            break;
		        }
		        case 4:
		        {
		            price[i]=450*quantity[i];
		            System.out.println("\t\t\t Books "+"\t\t\t\t"+ quantity[i]+"\t\t\t\t"+price[i]);
		            break;
		        }
		        case 5:
		        {
		            price[i]=200*quantity[i];
		            System.out.println("\t\t\t  Glue   "+"\t\t\t\t"+ quantity[i]+"\t\t\t\t"+price[i]);
		            break;
		        }
		        case 6:
		        {
		            price[i]=500*quantity[i];
		            System.out.println("\t\t\t Colors   "+"\t\t\t\t"+ quantity[i]+"\t\t\t\t"+price[i]);
		            break;
		        }
		       
		        default:
		        {
		            System.out.println("\t\t\t Wrong Choice !!! \t\t\t");
		             break;
		        }
		            
		    }
		}
		         
		System.out.println(" \t  CONTINUE? (Y/N)");
		char con=sc.next().charAt(0);

		if(con=='Y' || con=='y')
		{
		   title();
		}
		else
		{
		    System.out.println(" \n");
		    System.out.println(" \t\t\t  THANK YOU FOR VISITING - VISIT AGAIN \t\t\t ");
		}

		   

	}
}


class information1
{
    String fname,lname,address;
    Scanner sc = new Scanner(System.in);
    void get1()
    {
        System.out.println("Enter First Name : ");
        fname=sc.nextLine();
        System.out.println("Enter Last Name : ");
        lname=sc.nextLine();
        System.out.println("Enter Address Name : ");
        address=sc.nextLine();  
    }
    void set1()
    {
        System.out.println("_____CUSTOMER INFORMATION_____");
        System.out.println(" First Name : "+fname);
        System.out.println(" Last Name : "+lname);
        System.out.println(" Address : "+address);
    }   
 }

class information2 extends information1
{
    int age,dob;
    Scanner sc = new Scanner(System.in);
    void get2()
    {
        System.out.println("Enter Age : ");
        age=sc.nextInt();
        System.out.println("Enter Date of Birth : ");
        dob=sc.nextInt();    
    }
    void set2()
    {
        System.out.println(" Age : "+age);
        System.out.println(" Dob : "+dob); 
    }
}

		
//package com.mehndi;

public class StationaryStore extends Staionary
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
	        information2 i2= new information2();
	        
	        i2.get1();
	        i2.get2();
	        i2.set1();
	        i2.set2();
	     
	     Stationary obj1 = new Stationary();
	     obj1.title();
	}
}	

		
