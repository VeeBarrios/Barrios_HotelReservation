package HotelReservationSystem2;
import java.util.*;
public class barrios_562749 {
	public static void main(String[] args) {
		Scanner v = new Scanner(System.in);
		
		
		   int[][] hotel = new int[7][5]; 
		   int choice = 0;

		do { 
			System.out.println("=== HOTEL RESERVATION SYSTEM ===");
			System.out.println("1. View Rooms");
			System.out.println("2. Check In");
			System.out.println("3. Check Out");
			System.out.println("4. Exit");
			
			System.out.print("Enter choice: ");
		
			if (v.hasNextInt()) {
				choice = v.nextInt();
				v.nextLine(); 
				} else {
				System.out.println("Invalid input! Enter 1-4.");
				v.nextLine(); 
				continue;
				}
			 if (choice == 1) {
		       
		        for (int i = 0; i < hotel.length; i++) {
		            System.out.print("Floor " + (i + 1) + ": ");
		            for (int j = 0; j < hotel[i].length; j++) {
		                System.out.print("[" + hotel[i][j] + "]");
		            }
		            System.out.println();
		        }
		
		        System.out.println("Press ENTER to continue");
		        v.nextLine();
			 }
                else if(choice == 2) {
         
                	System.out.print(" Enter floor from 1-7: ");
                	int floor = v.nextInt() -1;
                
                System.out.print("Enter room (1-5): ");
                int r = v.nextInt() - 1;

                if (hotel[floor][r] == 0) {
                    hotel[floor][r] = 1;
                    System.out.println("Check-in successful !");
                } else {
                    System.out.println("Room already occupied.");
                }
            }
                    else if (choice == 3) {
                        System.out.print("Enter floor (1-7): ");
                        int floor = v.nextInt() - 1;

                        System.out.print("Enter room (1-5): ");
                        int room = v.nextInt() - 1;

                        if (hotel[floor][room] == 1) {
                            hotel[floor][room] = 0;
                            System.out.println("Check-out successful!");
                         
                        } else {
                            	System.out.println("Room already empty.");
                            }                            
                    }
		}while (choice !=4);
                    System.out.println("Thank you for visiting !");
	
	v.close();
}
}
