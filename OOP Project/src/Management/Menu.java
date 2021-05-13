package Management;
import java.util.*;
public class Menu {
	
void menu() {
	 int n;
     char c;
     System.out.print("\n\n\n\n\n\n\t\t\t\t\t|=============================================================================|\n");
     System.out.print("\t\t\t\t\t|=============================================================================|\n");
     System.out.print("\t\t\t\t\t|                       STORE MANAGEMENT SYSTEM                               |\n");
     System.out.print("\t\t\t\t\t|=============================================================================|\n");
     System.out.print("\t\t\t\t\t|=============================================================================|\n");
     Scanner sc = new Scanner(System.in);
     System.out.print("\n\n\n\n\t\t1. Customer Section\n\n\t\t2. Product Section\n\n\t\t3. Monthly Evaluation\n\n\t\t4. Exit\n");
     System.out.print("\n\tEnter a choice : ");
     n=sc.nextInt() ;
     Customer C = new Customer();
     Add_Product a = new Add_Product();
     MainClass m = new MainClass();
    
    
    
     if(n==1)
     { 
    	 C.custo();
        
     }
     else if(n==2)
     {
       a.pro();
     }
     else if(n==3)
     {
         m.maint();
     }
     else if(n==4)
     {
         System.exit(0);
     }
}
}

