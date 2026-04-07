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
                    
//do {
//    // MENU
//    System.out.println("\n=== HOTEL RESERVATION SYSTEM ===");
//    System.out.println("1. View Rooms");
//    System.out.println("2. Check In");
//    System.out.println("3. Check Out");
//    System.out.println("4. Exit");
//    System.out.print("Enter choice: ");
//
//    String input = v.nextLine(); 
//    try {
//        choice = Integer.parseInt(input);
//    } catch (NumberFormatException e) {
//        System.out.println("Invalid input! Enter a number 1-4.");
//        continue; 
//    }
//
//    if (choice == 1) {
//       
//        for (int i = 0; i < hotel.length; i++) {
//            System.out.print("Floor " + (i + 1) + ": ");
//            for (int j = 0; j < hotel[i].length; j++) {
//                System.out.print("[" + hotel[i][j] + "]");
//            }
//            System.out.println();
//        }
//
//        System.out.println("Press ENTER to continue");
//        sc.nextLine(); 
//
//    } else if (choice == 2) {
//        // CHECK IN
//        System.out.print("Enter floor (1-7): ");
//        int f = Integer.parseInt(sc.nextLine()) - 1;
//
//        System.out.print("Enter room (1-5): ");
//        int r = Integer.parseInt(sc.nextLine()) - 1;
//
//        if (hotel[f][r] == 0) {
//            hotel[f][r] = 1;
//            System.out.println("Check-in successful!");
//        } else {
//            System.out.println("Room already occupied!");
//        }
//
//        System.out.println("\nPress ENTER to continue...");
//        sc.nextLine(); // pause
//
//    } else if (choice == 3) {
//        // CHECK OUT
//        System.out.print("Enter floor (1-7): ");
//        int f = Integer.parseInt(sc.nextLine()) - 1;
//
//        System.out.print("Enter room (1-5): ");
//        int r = Integer.parseInt(sc.nextLine()) - 1;
//
//        if (hotel[f][r] == 1) {
//            hotel[f][r] = 0;
//            System.out.println("Check-out successful!");
//        } else {
//            System.out.println("Room already empty!");
//        }
//
//        System.out.println("\nPress ENTER to continue...");
//        sc.nextLine(); // pause
//
//    } else if (choice == 4) {
//        System.out.println("Exiting... Thank you!");
//    } else {
//        System.out.println("Invalid choice! Enter 1-4.");
//    }
//
//} while (choice != 4);
//
//sc.close();
//}
//
//
//
//
//	
