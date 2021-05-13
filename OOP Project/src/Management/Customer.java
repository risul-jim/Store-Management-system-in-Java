package Management;
import java.util.*;	

public class Customer {


void custo() {
  int k,z,sum=0, i, j, a,b, n,count=0, sum1=0;
  String C;
  int[] counter = new int[2000];
  int[] r = new int[1000];;// r[1000] is for product price
  Scanner s = new Scanner(System.in);
  boolean pressed = false; 
  String entered = ""; 
  do {
  for(int c=1; c>0; c++)
 {
  System.out.println("\n\n\n\n\t\t\t\t1. Customer Management\n\n\t\t\t\t2. Exit");
  System.out.print("\n\n\n   Enter A Choice |1/2| : ");
  b = s.nextInt();
  if(b==1)
      {
        
    	  System.out.println("\n\n\n\t\t\t\t\t |----------------------------------------------------------|\n");
    	  System.out.println("\t\t\t\t\t |                      CUSTOMER MANAGEMENT                 |\n");
      System.out.println("\t\t\t\t\t |----------------------------------------------------------|");
      System.out.println("\n         ");
 System.out.print("\n\n\n\tToken number of customer is : ");
 a= s.nextInt();// a means token number*/
for(i=0; i<=200; i++)
 {
      counter[i]= 0;// count the number of given code
 }
 System.out.print("\n\n\tHow many products have bought : ");
 j = s.nextInt();//number of product customer wants to buy
for(i=0;i<j; i++)
 {

      System.out.print("\n\n\n\tCode no of product is : ");
      c= s.nextInt();
	counter[c]++;
    System.out.print("\n\tPrice of the products "+ (i+1)+ " is: ");

    r[i]= s.nextInt();
}
for(i=1; i<=200;i++)
{
  if(counter[i]>0)

      System.out.println("\n\t\t\tNumber of buying product code "+i+" is: "+counter[i]);//i means the code number, counter[i] means number of product according to the code

}

for(i=0, sum1=0; i<j;i++)
 {
        sum1+=r[i];//r[i] means price of product
 }

int x;
System.out.print("\n\n\t\t\t\t\t\t Do you want to give discount?\n\t\t\t\t\t\t-------------------------------\n\n\t1. If Yes\n\n\t2. If No\n\n\t**Press : ");

x = s.nextInt();
if(x==1)
{
if(sum1>=0 && sum1<=49999)
{
     sum=sum1-((sum1*3)/100);
     System.out.println("\n\n\n\t\t\t\t   [Discount price is BDT : "+sum+" TK]\n");

}
else if(sum1>=50000 && sum1<=100000)
{
   sum=sum1-((sum1*5)/100);
   System.out.println("\n\n\n\t\t\t\t   [Discount price is BDT : "+sum+" TK]\n");

}
else if(sum1>100000)
{
    sum=sum1-((sum1*7)/100);
      System.out.println("\n\n\n\t\t\t\t   [Discount price is BDT : "+sum+" TK]\n");
}

}
else if(x==2)
{
        if(sum1>0 && sum1<=4999)
{
   sum = sum1;
   System.out.println("\n\n\n\t\t\t\t   [Price is : "+sum+ " TK]\n");
}
else if(sum1>=5000 && sum1<=49999)// token number
{
     sum=sum1;
     System.out.println("\n\n\n\t\t\t\t   [Price is : "+sum+ " TK]\n");
}
else
{
    sum=sum1;
    System.out.println("\n\n\n\t\t\t\t   [Price is : "+sum+ " TK]\n");
}



}
else {
 System.out.println("\n\n\n\tPress right key.......");

}
  
  System.out.println("\t\t\t Is you're customer need currency convertion??\n");
  System.out.println("\t\t\t\t 1. Yes\n\t\t\t\t 2. No\n");
  System.out.print("\t\t\t\tEnter your Choice: ");
  int pk;
  pk=s.nextInt();
  if(pk==1){

	    double amount, USD, choice, euro, riyal, ringit, rupee;
	 
	 
	    Scanner sc = new Scanner(System.in);
	 
	    System.out.println("\t\t\t\tCurrency Converter of the Store\n\n");
	 
	    System.out.println("In which currency You want to Convert your amount ?\n");
	    
	    System.out.println("1:Rupee \t2:Dollar \t3:Ringit \t4:Euro  \t5:Riyal");
	    choice = sc.nextInt();
	    amount = sum;
	    System.out.print("The amount is : "+ amount);
	    
	    System.out.println();
	 
	    // For Rupee Conversion
	    if (choice == 1) {
	      
	      System.out.println("\n\t\t\tThe current conversion rate, 1 Rupee = 1.17 BDT\n");
	 
	      rupee = amount *0.86 ;
	      System.out.print("Your " + amount + " Taka is equal to : " + rupee + " Indian Rupees");
	   
	    } 
	    
	    // For Dollar Conversion
	    else if (choice== 2) {
	      
	      System.out.println("\n\t\t\tThe current conversion rate, 1 USD = 84.78 BDT\n");
	      
	 
	      USD = amount * 0.012;
	      System.out.print("Your " + amount + " Taka is equal to  : " + USD + " US Dollar");
	 
	      
	    } 
	    
	    // For Ringit Conversion
	    else if (choice == 3) {
	      
	      System.out.println("\n\t\t\tThe current conversion rate, 1 Ringit = 20.52 BDT\n");
	      
	      ringit = amount * 0.049;
	      System.out.print("Your " + amount + " Taka is equal to : " + ringit + " Malaysian Ringit");
	      
	    }
	    
	    // For Euro Conversion
	    else if (choice == 4) {
	      
	      System.out.println("\n\t\t\tThe current conversion rate, 1 Euro = 99.96 BDT\n");
	      
	      euro = amount * 0.010;
	      System.out.print("Your " + amount + " Taka is equal to : " + euro + " Euro");
	 
	      
	    } 
	    
	    // For Riyal Conversion
	    else if (choice == 5) {
	      
	      System.out.println("\n\t\t\tThe current conversion rate, 1 Riyal = 22.60 BDT\n");
	 
	      riyal = amount * 0.044;
	      System.out.print("Your " + amount + " Taka is equal to : " + riyal + " Saudi Riyal");
	 
	      
	    }  else {
	      System.out.println("Your Input is Invalid");
	    }
	    
  }
      }
  else if(b==2) {
	  System.out.println("\n\n\tPress any other key to go to menu.........\n\n");
	   entered=s.next(); 
	   if((entered.equals("C"))||entered.equals("c")) 
	    pressed=true; 
	   Menu m = new Menu();
	    m.menu();

  }
 } 
   } while(pressed) ;
  { 
	  System.out.println("\n\n\tPress any other key to go to menu.........\n\n");
   entered=s.next(); 
   if((entered.equals("C"))||entered.equals("c")) 
    pressed=true; 
   Menu m = new Menu();
    m.menu();
  }
}
}
 

