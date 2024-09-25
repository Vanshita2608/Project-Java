//java mini project

import java.util.*;
import MyPackage.*;

class DomesticPassengers
{
	// This Will Take Input For Passengers Travelling in domestic flight
    int s,d,sts,date,pno,age;
    String name ,gender ,email_id;
    //Scanner sc = new Scanner(System.in); 

    void set_info_domestic_pass()
        {
           Scanner sc = new Scanner(System.in);
            System.out.println("Enter name of the passenger:");
            name = sc.next();
            System.out.println("Enter your gender(M/F)");
          	gender = sc.next();
            System.out.println("Enter Phone number:");
            pno = sc.nextInt();
            System.out.println("Enter Email id:");
            email_id = sc.next();
            System.out.println("Enter Age:");
            age = sc.nextInt();

        }
        void get_info()
        {
            System.out.println("Name:" + name);
            System.out.println("Gender:" + gender);
            System.out.println("Phone number:" + pno);
            System.out.println("Email id:" + email_id);
            System.out.println("Age:" + age);
        }
}

class Domestic extends DomesticPassengers
{
    int s,d,sts,date,pno,age;
    String name ,gender ,email_id;

    int seats()
    {
       return sts;
    }
    void flight_d()
    {
       System.out.println("___________________________________________________________________________");
       System.out.println("Flight\t\t\tDeparture\tArrival\t\tPrice\n");
       System.out.println("Go Air(1)\t\t08:00\t\t10:00\t\t1500");
       System.out.println("Spice Jet(2)\t\t14:00\t\t16:00\t\t1850");
       System.out.println("Air India(3)\t\t19:45\t\t21:45\t\t2025");
       System.out.println("Jet Airways(4)\t\t22:35\t\t01:10\t\t3508");
       System.out.println("Indigo(5)\t\t23:33\t\t02:17\t\t2789");
       System.out.println("Vistara(6)\t\t20:44\t\t22:12\t\t3450");
       System.out.println("Air Asia(7)\t\t21:09\t\t23:44\t\t2988");
       System.out.println("_____________________________________________________________________________ \n\n\n");
    }
    void set_domestic()
    {
 	  Scanner sc = new Scanner(System.in);     
       System.out.println("Enter the date you want to travel (DDMMYYYY)");
       date = sc.nextInt();
       System.out.println("\nPick your destination of departure");
       System.out.println("Mumbai(1) Chennai(2) Kolkata(3) Delhi(4) Madhya Pradesh(5) Goa(6) Gujarat(7)");
       s = sc.nextInt();
       System.out.println("\nPick your destination of arrival");
       System.out.println("Mumbai(1) Chennai(2) Kolkata(3) Delhi(4) Madhya Pradesh(5) Goa(6) Gujarat(7)");
       d = sc.nextInt();

            if((s==1 && d==2)||(s==2 && d==1))
            {
                flight_d();
            }
            else if((s==1 && d==3)||(s==3 && d==1))
            {
                flight_d();
            }
            else if((s==1 && d==4)||(s==4 && d==1))
            {
                flight_d();
            }
            else if((s==1 && d==5)||(s==5 && d==1))
            {
                flight_d();
            }
            else if((s==1 && d==6)||(s==6 && d==1))
            {
                flight_d();
            }
            else if((s==1 && d==7)||(s==7 && d==1))

            {
                flight_d();
            }
            else if((s==2 && d==3)||(s==3 && d==2))
            {
                flight_d();
            }
            else if((s==2 && d==4)||(s==4 && d==2))
            {
                flight_d();
            }
            else if((s==2 && d==5)||(s==5 && d==2))
            {
                flight_d();
            }
             else if((s==2 && d==6)||(s==6 && d==2))
            {
                flight_d();
            }
             else if((s==2 && d==7)||(s==7 && d==2))
            {
                flight_d();
            }
            else if((s==3 && d==4)||(s==4 && d==3))
            {
                flight_d();
            }
            else if((s==3 && d==5)||(s==5 && d==3))
            {
                flight_d();
            }
            else if((s==3 && d==6)||(s==6 && d==3))
            {
                flight_d();
            }
            else if((s==3 && d==7)||(s==7 && d==3))
            {
                flight_d();
            }
            else if((s==4 && d==5)||(s==5 && d==4))
            {
                flight_d();
            }
            else if((s==4 && d==6)||(s==6 && d==4))
            {
                flight_d();
            }
            else if((s==4 && d==7)||(s==7 && d==4))
            {
                flight_d();
            }
            else if((s==5 && d==6)||(s==6 && d==5))
            {
                flight_d();
            }
            else if((s==5 && d==7)||(s==7 && d==5))
            {
                flight_d();
            }
            else if((s==6 && d==7)||(s==7 && d==6))
            {
                flight_d();
            }
            else
            {
                System.out.println("Your destination and source are the same");
            }
     }
}

////////////////////////////////////////////////  INTERNATIONAL ////////////////////////////////////////////////////

class InternationalPassengers
{
	int a,de,dte, food ,classt ,tic, comboV, comboNV, drinks,age;
    double pn;
    String fname,email_id,g,pan,na;

     void set_infoi()
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("\nEnter your full name:");
       fname = sc.next();
       System.out.println("Enter your gender(M/F):");
       g = sc.next();
       System.out.println("Phone number:");
       pn = sc.nextDouble();
       System.out.println("Enter your email id:");
       email_id = sc.next();
       System.out.println("Enter your passport number:");
       pan = sc.next();
       System.out.println("Enter your nationality:");
       na = sc.next();
       System.out.println("Enter age:");
       try
        {
            age = sc.nextInt();

            if(age>=75)
            {
                throw new Age(age);
            }
        }
        catch(Age e)
        {
            System.out.println(e);
        }

       System.out.println("\nEnter your food choice(1. Veg   2. Non-veg   3. Drinks): ");
       food = sc.nextInt();

       if(food == 1)
       {
          System.out.println("\nMenu for veg food: \n");
          System.out.println("1. Combo 1\n2. Combo 2\n3. Combo 3\nEnter Choice: ");
          comboV = sc.nextInt();
       }
       else if(food == 2)
       {
          System.out.println("\nMenu for non-veg food: \n");
          System.out.println("1. Combo 1\n2. Combo 2\n3. Combo 3\nEnter Choice: ");
          comboNV = sc.nextInt();
       }
       else if(food == 3)
       {
          System.out.println("\nMenu For Drinks: \n");
          System.out.println("1. Wine \n2. Coffee\n3. Tea\n4. Juice\nEnter Choice: ");
          drinks = sc.nextInt();
       }
    }

       void get_infoi()
       {
          System.out.println("\nName: " + fname);
          System.out.println("Gender:" + g);
          System.out.println("Phone number:" + pn);
          System.out.println("email id:" + email_id);
          System.out.println("Passport number:" + pan);
          System.out.println("Nationality:" + na);

        if(food == 1)
        {
          if(comboV == 1)
          {
             System.out.println("Food Choice: Grilled Sandwiches + Fruit Juice + Potato Chips\n");
          }
          else if(comboV == 2)
          {
             System.out.println("Food Choice: Veg Spring Rolls + Orange Juice + Dry Fruits\n");
          }
          else if(comboV == 3)
          {
             System.out.println("Food Choice: Instant Noodles + Red Wine\n");
          }
        }
        else if(food == 2)
        {
           if(comboNV == 1)
           {
              System.out.println("Food Choice: Chicken Sandwitch + Red Wine\n");
           }
           else if(comboNV == 2)
           {
              System.out.println("Food Choice: Egg Paneer Rolls + Orange Juice\n");
           }
           else if(comboNV == 3)
           {
              System.out.println("Food Choice: Chicken Noodles + Mixed Fruit Juice");
           }
         }
         else if(food == 3)
         {
            if(drinks == 1)
            {
               System.out.println("Food Choice: Wine\n");
            }
            if(drinks == 2)
            {
              System.out.println("Food Choice: Coffee\n");
            }
            else if(drinks == 3)
            {
               System.out.println("Food Choice: Tea\n");
            }
            else if(drinks == 4)
            {
               System.out.println("Food Choice: Juice\n");
            }
        }
	  // Food Choice Ends
        if(classt == 1)
            {
                if(tic == 1)
                {
                    System.out.println("Economic class + Window seat");
                }
                else
                {
                    System.out.println("Economic class");
                }
            }
            else if(classt == 2)
            {
                if(tic == 1)
                {
                    System.out.println("Business class + Window seat");
                }
                else
                {
                    System.out.println("Business class");
                }
            }
        }
}

class International extends InternationalPassengers
{
    int a,de,dte,pn ,classt ,tic ;
    String fname,email_id,g,pan,na,food;

    void flight_i()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("___________________________________________________________________________");
        System.out.println("Flight\t\t\t\tDeparture\tArrival\t\tPrice\n");
        System.out.println("Qatar Airways(1)\t\t07:30\t\t21:30\t\t35000");
        System.out.println("Etihad Airways(2)\t\t08:15\t\t22:15\t\t45750");
        System.out.println("Fly Emirates(3)\t\t\t09:45\t\t23:45\t\t89250");
        System.out.println("Lufthansa(4)\t\t\t22:35\t\t01:10\t\t54120");
        System.out.println("Cathay Pacific(5)\t\t23:33\t\t02:17\t\t62789");
        System.out.println("Ryan Air(6)\t\t\t12:08\t\t03:10\t\t78909");
        System.out.println("Delta Air(7)\t\t\t06:19\t\t08:15\t\t89990");
        System.out.println("___________________________________________________________________________\n\n\n");
    }
    void set_intl()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the date you want to travel(DDMMYYYY)");
            dte = sc.nextInt();

            System.out.println("\nPick your destination of departure");
            System.out.println("India(1) New York(2) London(3) New Zealand(4) Norway(5) Australia(6) Singapore(7)");
            de = sc.nextInt();

            System.out.println("\nPick your destination of arrival");
            System.out.println("India(1) New York(2) London(3) New Zealand(4) Norway(5) Australia(6) Singapore(7)");
            a = sc.nextInt();

            if((de==1 && a==2)||(de==2 && a==1))
            {
                flight_i();
            }
            else if((de==1 && a==3)||(de==3 && a==1))
            {
                flight_i();
            }
            else if((de==1 && a==4)||(de==4 && a==1))
            {
                flight_i();
            }
            else if((de==1 && a==5)||(de==5 && a==1))
            {
                flight_i();
            }
            else if((de==1 && a==6)||(de==6 && a==1))
            {
                flight_i();
            }
            else if((de==1 && a==7)||(de==7 && a==1))
            {
                flight_i();
            }
            else if((de==2 && a==3)||(de==3 && a==2))
            {
                flight_i();
            }
            else if((de==2 && a==4)||(de==4 && a==2))
            {
                flight_i();
            }
            else if((de==2 && a==5)||(de==5 && a==2))
            {
                flight_i();
            }
            else if((de==2 && a==6)||(de==6 && a==2))
            {
                flight_i();
            }
            else if((de==2 && a==7)||(de==7 && a==2))
            {
                flight_i();
            }
            else if((de==3 && a==4)||(de==4 && a==3))
            {
                flight_i();
            }
            else if((de==3 && a==5)||(de==5 && a==3))
            {
                flight_i();
            }
            else if((de==3 && a==6)||(de==6 && a==3))
            {
                flight_i();
            }
            else if((de==3 && a==7)||(de==7 && a==3))
            {
                flight_i();
            }
            else if((de==4 && a==5)||(de==5 && a==4))
            {
                flight_i();
            }
            else if((de==4 && a==6)||(de==6 && a==4))
            {
                flight_i();
            }
            else if((de==4 && a==7)||(de==7 && a==4))
            {
                flight_i();
            }
            else if((de==5 && a==6)||(de==6 && a==5))
            {
                flight_i();
            }
            else if((de==5 && a==7)||(de==7 && a==5))
            {
                flight_i();
            }
            else if((de==6 && a==7)||(de==7 && a==6))
            {
                flight_i();
            }
            else
            {
                System.out.println("Your destination of departure and arrival is the same");
            }
        }
}

class FlightReservation
{
    public static void main(String abc[])
    {
        Scanner sc = new Scanner(System.in);
        int n,f,in,tic;
        double cost,costb, classt,w;
        int numPassengers;
        int numPassengersI;

        Domestic d1; 
        International i1;    
        InternationalPassengers iP[] = new InternationalPassengers[1000]; 
        DomesticPassengers dP[] = new DomesticPassengers[1000];   

        System.out.println("              Welcome to 'TOUCHING ADORABLE SKIES' Airline Booking                                   ");
        System.out.println("******************************************************************************");
        System.out.println("          Come, travel with us...to experience the LEISURE as high as SKY ");
        System.out.println("                        With the deals of GRASS-ROOT level                 ");
        System.out.println("********************************************************************************\n\n\n");

        System.out.println("Enter 1 for Domestic Flights and 2 for International Flights");
        f = sc.nextInt(); // Flight Choice

        System.out.println("Enter Total Number of passengers: ");
        numPassengers = sc.nextInt(); // Number of passengers

        if(f==1)
        {
            d1.set_domestic(); // This Function Will Take information of location from user about domestic flight

            System.out.println("Enter your choice");
            n = sc.nextInt(); // Choice for domestic flight details
            System.out.println("_______________________________________________________________________________");

            switch(n)
            {
                case 1:
                {
                    System.out.println("Flight  : Go Air");
                    System.out.println("Departure  : 08.00");
                    System.out.println("Arrival  : 10.00");
                    System.out.println("Price :1500");
                    cost=1500+(0.05*1500);
                    System.out.println("Fare = \n\n" + cost);
                    break;
                }
                case 2:
                {
                    System.out.println("Flight  : Spice Jet");
                    System.out.println("Departure  : 14.00");;
                    System.out.println("Arrival  : 16.00");;
                    System.out.println("Price  :1850");
                    cost=1850+(0.05*1850);
                    System.out.println("Fare = \n\n" + cost);
                    break;
                }
                case 3:
                {
                    System.out.println("Flight  : Air India");
                    System.out.println("Departure  : 19.45");
                    System.out.println("Arrival  : 21.45");
                    cost=2025+(0.05*2025);
                    System.out.println("Fare = \n\n" + cost);
                    break;
                }
                    case 4:
                {
                    System.out.println("Flight  : Jet Airways");
                    System.out.println("Departure  : 22.35");
                    System.out.println("Arrival  : 01.10");
                    cost=3508+(0.05*3508);
                    System.out.println("Fare = \n\n" + cost);
                    break;

                }
                case 5:
                {
                    System.out.println("Flight  : Indigo");
                    System.out.println("Departure  : 23.33");
                    System.out.println("Arrival  : 02.17");
                    cost=2789+(0.05*2789);
                    System.out.println("Fare = \n\n" + cost);
                }
                case 6:
                {
                    System.out.println("Flight  : Vistara");
                    System.out.println("Departure  : 20.44");
                    System.out.println("Arrival  : 22.12");
                    cost=3450+(0.05*3450);
                    System.out.println("Fare = \n\n" + cost);
                }
                case 7:
                {
                    System.out.println("Flight  :Air Asia");
                    System.out.println("Departure  : 21.09");
                    System.out.println("Arrival  : 23.44");
                    cost=2988+(0.05*2988);
                    System.out.println("Fare = \n\n" + cost);
                }
                default:
                {
                    System.out.println("Either your destination is same or the option selected is inappropriate");
                    System.out.println("                   END OF YOUR BOOKING PROCESS                                    ");
                    System.out.println("**********************************************************");
                    System.out.println("          Hope our hospitality refreshes you in totality      ");
                    break;
                }
            }
            //class ends here

            // For Domestic Passengers

            for(int a=0; a<numPassengers; a++) // Input
            {
               dP[a] = new DomesticPassengers();
               dP[a].set_info_domestic_pass(); // Total Number Of passengers
            }
            for(int a = 0; a < numPassengers; a++) // Output
            {
                System.out.println("\n\n\n**********Details of the passenger are**********");
                dP[a].get_info();
                System.out.println("______________________________________________________________________");
                System.out.println("                   END OF YOUR BOOKING PROCESS                                    ");
                System.out.println("**********************************************************");
                System.out.println("          Hope our hospitality refreshes you in totality      ");
                System.out.println("**************************************************************");
                System.out.println("Your tickets will be sent on your registered email address......");
                System.out.println("________________________________________________________________");
                System.out.println(".........THANK YOU FOR CHOOSING US AS YOUR TRVEL PARTNER............");
            }
        }
        else
        {
            i1.set_intl(); // This Function Will Take information of location from user about international flight
            System.out.println("Enter your choice");
            in = sc.nextInt();        // Choice for international flight details
            System.out.println("_____________________________________________________________________________");

            switch(in)
            {
                case 1:
                {
                    System.out.println("Flight: Qatar Airways");
                    System.out.println("Departure :07:30");
                    System.out.println("Arrival:21:30");
                    System.out.println("Price:35000");

                    System.out.println("\nWould you prefer traveling in economy class(1) or business class(2)?:");
                    classt = sc.nextDouble();
                    System.out.println("\n\nDo you want a window ticket?");
                    System.out.println("Press 1 for yes and 2 for no:");
                    tic = sc.nextInt();

                    if(classt == 1) // Economy Class
                    {
                        if(tic == 1)
                        {
                            w=35000+(0.05*35000) + 1500;
                            cost=cost+w;
                            System.out.println("Fare for economy class + Window Seat:\n" + w);
                        }
                        else
                        {
                            w=35000+(0.05*35000);
                            System.out.println("Fare for economy class:\n" + w);
                        }
                    }
                    else // Busniess Class
                    {
                        if(tic == 1)
                        {
                            costb=35000+(0.05*35000);
                            System.out.println("Fare for business class:\n" + costb);
                        }
                        else
                        {
                            costb=35000+(0.05*35000) + 3500;
                            System.out.println("Fare for business class + Window seat:\n" + costb);
                        }
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("Flight: Etihad Airways");
                    System.out.println("Departure :08:15");
                    System.out.println("Arrival:22:15");
                    System.out.println("Price:45750");


                    System.out.println("\nWould you prefer traveling in economy class(1) or business class(2)?:");
                    classt = sc.nextDouble();
                    System.out.println("\nDo you want a window ticket?");
                    System.out.println("Press 1 for yes and 2 for no:");
                    tic = sc.nextInt();

                    if(classt == 1)
                    {
                        if(tic == 1)
                        {
                            w=45750+(0.05*45750) + 1500;
                            cost=cost+w;
                            System.out.println("Fare for economy class + Window Seat:\n" + w);
                        }
                        else
                        {
                            w=35000+(0.05*35000);
                            System.out.println("Fare for economy class:\n" + w);
                        }
                    }
                    else
                    {
                        if(tic == 1)
                        {
                            costb=45750+(0.05*45750) + 3500;
                            System.out.println("Fare for business class + Window Seat:\n" + costb);
                        }
                        else
                        {
                            costb=35000+(0.05*35000);
                            System.out.println("Fare for business class:\n" + costb);
                        }
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("Flight: Fly Emirates");
                    System.out.println("Departure :09:45");
                    System.out.println("Arrival:23:45");
                    System.out.println("Price:89250");

                    System.out.println("\nWould you prefer traveling in economy class(1) or business class(2)?:");
                    classt = sc.nextDouble();
                    System.out.println("\nDo you want a window ticket?");
                    System.out.println("Press 1 for yes and 2 for no:");
                    tic = sc.nextInt();

                    if(classt == 1)
                    {
                        if(tic == 1)
                        {
                            w=89250+(0.05*89250) + 1500;
                            cost=cost+w;
                            System.out.println("Fare for economy class + Window Seat:\n" + w);
                        }
                        else
                        {
                            w=35000+(0.05*35000);
                            System.out.println("Fare for economy class:\n" + w);
                        }
                    }
                    else
                    {

                        if(tic == 1)
                        {
                            costb=89250+(0.05*89250) + 3500;
                            System.out.println("Fare for business class + Window Seat:\n" + costb);
                        }
                        else
                        {
                            costb=89250+(0.05*89250);
                            System.out.println("Fare for business class:\n" + costb);
                        }
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("Flight: Lufthansa");
                    System.out.println("Departure : 22.35");
                    System.out.println("Arrival: 01.10");
                    System.out.println("Price : 54120");

                    System.out.println("\nWould you prefer traveling in economy class(1) or business class(2)?:");
                    classt = sc.nextDouble();;
                    System.out.println("\nDo you want a window ticket?");
                    System.out.println("Press 1 for yes and 2 for no:");
                    tic = sc.nextInt();;

                    if(classt == 1)
                    {
                        if(tic == 1)
                        {
                            w=54120+(0.05*54120) + 1500;
                            cost=cost+w;
                            System.out.println("Fare for economy class + Window Seat:\n" + w);
                        }
                        else
                        {
                            w=54120+(0.05*54120);
                            System.out.println("Fare for economy class:\n" + w);
                        }
                    }
                    else
                    {

                        if(tic == 1)
                        {
                            costb=54120+(0.05*54120)+ 3500;
                            System.out.println("Fare for business class + Window Seat:\n" + costb);
                        }
                        else
                        {
                            costb=54120+(0.05*54120);
                            System.out.println("Fare for business class:\n" + costb);
                        }
                    }
                    break;
                }
                case 5:
                {
                    System.out.println("Flight: Cathay Pacific");
                    System.out.println("Departure : 23.33");
                    System.out.println("Arrival: 02.17");

                    System.out.println("\nWould you prefer traveling in economy class(1) or business class(2)?:");
                    classt = sc.nextDouble();
                    System.out.println("\nDo you want a window ticket?");
                    System.out.println("Press 1 for yes and 2 for no:");
                    tic = sc.nextInt();

                    if(classt == 1)
                    {
                        if(tic == 1)
                        {
                            w=62789+(0.05*62789) + 1500;
                            cost=cost+w;
                            System.out.println("Fare for economy class + Window Seat:\n" + w);
                        }
                        else
                        {
                            w=62789+(0.05*62789);
                            System.out.println("Fare for economy class:\n" + w);
                        }
                    }
                    else
                    {

                        if(tic == 1)
                        {
                            costb=62789+(0.05*62789)+ 3500;
                            System.out.println("Fare for business class + Window Seat:\n" + costb);
                        }
                        else
                        {
                            costb=62789+(0.05*62789);
                            System.out.println("Fare for business class:\n" + costb);
                        }
                    }
                    break;
                }
                case 6:
                {
                    System.out.println("Flight: Ryan Air");
                    System.out.println("Departure : 12.08");
                    System.out.println("Arrival: 03.10");
                    System.out.println("Price : 78909");

                    System.out.println("\nWould you prefer traveling in economy class(1) or business class(2)?:");
                    classt = sc.nextDouble();
                    System.out.println("\nDo you want a window ticket?");
                    System.out.println("Press 1 for yes and 2 for no:");
                    tic = sc.nextInt();

                    if(classt == 1)
                    {
                        if(tic == 1)
                        {
                            w=78909+(0.05*78909) + 1500;
                            cost=cost+w;
                            System.out.println("Fare for economy class + Window Seat:\n" + w);
                        }
                        else
                        {
                            w=78909+(0.05*78909);
                            System.out.println("Fare for economy class:\n" + w);
                        }
                    }
                    else
                    {

                        if(tic == 1)
                        {
                            costb=78909+(0.05*78909)+ 3500;
                            System.out.println("Fare for business class + Window Seat:\n" + costb);
                        }
                        else
                        {
                            costb=78909+(0.05*78909);
                            System.out.println("Fare for business class:\n" + costb);
                        }
                    }
                    break;
                }
                case 7:
                {
                    System.out.println("Flight: Delta Air");
                    System.out.println("Departure : 06.19");
                    System.out.println("Arrival: 08.15");
                    System.out.println("Price : 89990");

                    System.out.println("\nWould you prefer traveling in economy class(1) or business class(2)?:");
                    classt = sc.nextDouble();
                    System.out.println("\nDo you want a window ticket?");
                    System.out.println("Press 1 for yes and 2 for no:");
                    tic = sc.nextInt();

                    if(classt == 1)
                    {
                        if(tic == 1)
                        {
                            w=89990+(0.05*89990) + 1500;
                            cost=cost+w;
                            System.out.println("Fare for economy class + Window Seat:\n" + w);
                        }
                        else
                        {
                            w=89990+(0.05*89990);
                            System.out.println("Fare for economy class:\n" + w);
                        }
                    }
                    else
                    {

                        if(tic == 1)
                        {
                            costb=89990+(0.05*89990)+ 3500;
                            System.out.println("Fare for business class + Window Seat:\n" + costb);
                        }
                        else
                        {
                            costb=89990+(0.05*89990);
                            System.out.println("Fare for business class:\n" + costb);
                        }
                    }
                    break;
                }
                default:
                {
                    System.out.println("Either your destination is same or you have selected an inappropriate option");
                    System.out.println("                 END OF YOUR BOOKING PROCESS                                    ");
                    System.out.println("********************************************************");
                    break;
                }
            }
            // Case Ends Here

            // For International Passengers

            for(int a = 0; a<numPassengers; a++)
            {
                iP[a].set_infoi();
            }
            for(int a = 0; a<numPassengers; a++)
            {
                System.out.println("\n**********Information of the passenger**********");
                iP[a].get_infoi();
            }
                System.out.println("_________________________________________________________________________________________");
                System.out.println("\n                   END OF YOUR BOOKING PROCESS                                    ");
                System.out.println("*******************************************************************");
                System.out.println("                Hope our hospitality refreshes you in totality      ");
                System.out.println("********************************************************************");
                System.out.println(".........Your tickets will be sent on your registered email address......");
                System.out.println("_________________________________________________________________________________________");
                System.out.println("................THANK YOU FOR CHOOSING US AS YOUR TRVEL PARTNER............");

        }
    }
}