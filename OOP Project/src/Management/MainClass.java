package Management;
import java.util.Scanner;	

public class MainClass {
void maint() {
	InputData object = new InputData();
	
	Scanner s =new Scanner(System.in);
	
	 System.out.println("\t\tCustomer Section");
        
	    System.out.print("\nInput Total Income:");
        object.setTi (s.nextDouble());

        System.out.print("\nInput Total Investment:");
        object.setTinv(s.nextDouble());

        System.out.print("\nEnter Electric Bill:");
        object.setEb(s.nextDouble());

        System.out.print("\nEnter the Total Employee's Salary:");
        object.setEs(s.nextDouble());
        
        System.out.print("\nEnter Enter the Store Rent:");
        object.setSr(s.nextDouble());
        
        double Mcal = object.getTi() -(object.getTinv()+object.getEb()+object.getEs()+object.getSr());

        System.out.print("\nMonthly Revenue: "+Mcal);
        
        if(Mcal<0){
        	 System.out.print("\n\t\t\t***The store has seen the face of Loss***\n");
        	 System.out.printf("\n\t\t\t\tThe Monthly Loss is: "+Mcal*(-1)+" Taka");
        }
        else if (Mcal==0){
        	 System.out.print("\n\\t\t\t***The store has no profit or loss this month***\n");
        }
        else {
        	 System.out.print("\n\t\t\t***The store has seen the face of Profit***\n");
        	 System.out.printf("\n\t\t\t\tThe Monthly Profit is:"+Mcal+" Taka");
        }
        
}
}
