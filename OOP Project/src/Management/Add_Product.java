package Management;
import java.util.ArrayList;
import java.util.Scanner;
public class Add_Product {
void pro() {
			
			          Scanner s = new Scanner(System.in);
			          ArrayList<String> productinfo = new ArrayList<String>();
			          int l=1;
			          int j =2;
			         while(l!=j){
			           
			            
		    System.out.print("\n\n\n\t\t\t\t\t |----------------------------------------------------------|\n");
			      System.out.print("\t\t\t\t\t |                       Product Section                    |\n");
			      System.out.print("\t\t\t\t\t |----------------------------------------------------------|\n");

			            
			          System.out.println("\n\n\t\t\t\t\t\t\t1.Add Product");
			          System.out.println("\t\t\t\t\t\t\t2.Delete Product");
			          System.out.println("\t\t\t\t\t\t\t3.Display Productt");
			          System.out.println("\t\t\t\t\t\t\t4.Exit\n\n\n\n\n");
			          System.out.print("\t\t\t\t\t\t\tEnter Your Choice: ");
			          
			          int a = s.nextInt();
			          
			          if(a==1){
			              System.out.print("How many products do you want to enter: ");
			              
			              int b = s.nextInt();
			              
			              for(int i = 0;i<b ; i++){
			                  System.out.print("Product code: 1200"+(i+1)+" Name: ");
			                  String d = s.next();
			                  String p = new String(d);
			                  productinfo.add(p); //ArrayList_name.add(objectname);
			   
			              }
			              
			          }
			          
			          else if(a==2) {
			            
			            System.out.print("Enter the code of the product you want to delete: ");
			            int r = s.nextInt();
			         
			             productinfo.remove(r-1);  //ArrayList_name.remove(index_number);
			              
			              System.out.println(" \n\t\t\t\t Product number "+r+" is removed \t \t");

			            
			          }
			          else if(a ==3){
			            
			            System.out.println(" \t\t The Stored Poducts Are: ");
			      int index=1;
			        for (String x:productinfo ) {
			              System.out.println("Product Code-1200"+(index++)+": "+x);
			              }

			          }
			          else if(a == 4) {
			              Menu m = new Menu();
			              m.menu();
			          }
			        }
			     }
			 }


