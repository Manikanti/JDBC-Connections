package models;
import java.util.Scanner;

public class Dashboard {
	Scanner src=new Scanner(System.in);
	public void adminDashboard() {
		int option;
		do {
			System.out.println("\t1.Add Items"+"\n"+"\t2.Add Delivery Agent"+"\n"+
		"\t3.Assign Deleviray Agent"+"\n"+"\t4.Update Status"+"\n"+"\t5.Logout");
			System.out.print("Choose your Option: ");
			option=Integer.parseInt(src.next());
			switch(option) {
			case 1: 
				//Add Items function
				break;
			case 2:
				//Add Delivery Agent function
				break;
			case 3:
				//Assign Delivery agent function
				break;
			case 4:
				//Update Delivery status function
				break;
			case 5:
				//Login page function
				System.exit(0);
			default:
				System.out.println("Invalid option");
				break;
			}
		}while(option>0);
	}
	public void userDashboard() {
		int option;
		do {
			System.out.println("\t1.Place Order"+"\n"+"\t2.View Order Status"
		+"\n"+"\t3.Logout");
			System.out.print("Choose your Option: ");
			option=Integer.parseInt(src.next());
			switch(option) {
			case 1: 
				//Place order function
				break;
			case 2:
				//view order status function
				break;
			case 3:
				//Login page function
				System.exit(0);
			default:
				System.out.println("Invalid option");
				break;
			}
		}while(option>0);
	}		
}

