import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
class Flight
{
	private String flightNumber;
	private String source;
	private String destination;
	private int seatsAvailable;
	private double ticketPrice;
	public Flight(String flightNumber, String source, String destination, int seatsAvailable, double ticketPrice) {
		super();
		this.flightNumber = flightNumber;
		this.source = source;
		this.destination = destination;
		this.seatsAvailable = seatsAvailable;
		this.ticketPrice = ticketPrice;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getSeatsAvailable() {
		return seatsAvailable;
	}
	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}
	public double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	void bookTicket()
	{
		if(seatsAvailable > 0)
		{
			seatsAvailable--;
			System.err.println(">>>>>>>>>>>>>>>>>>>>Ticket Booked Successfully>>>>>>>>>>>>>>>>>>>>>>>");
		}
		else
		{
			System.err.println("!!!!!!!!!!!!!!!No seats Available for this flight!!!!!!!!!!!!!!!!!!");
		}
	}
	void cancelBooking()
	{
		seatsAvailable++;
		System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Booking Cancelled Successfully>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
}
class AirLinesApp
{
	@SuppressWarnings("unused")
	private static Map <String,Flight>flights = new HashMap<>();
	private static List <Flight>bookedFlights = new ArrayList<>();
	private static Map<String,String>users1 = new HashMap<>();
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String Jeevan[]) throws InterruptedException
	{
		Scanner scanner1 = new Scanner(System.in);
		Map<String,String>users = new HashMap<>();
		while(true)
		{
			System.err.println("\t\tWelcome to AirLinesApp");
			System.out.println("1.Signup");
			System.out.println("2.Login");
			System.out.println("3.Forgot pasword");
			System.out.println("4.bookTicket");
			System.out.println("5.seatsBooking");
			System.out.println("6.displayBookedTickets");
			System.out.println("7.Do payment");
			System.out.println("8.cancelBooking");
			System.out.println("9.Logout");
			System.out.println("\nSelect your choice : ");
			int choice = scanner1.nextInt();
			scanner1.nextLine();
			switch(choice)
			{
			case 1 :
				System.err.println("\tWelcome to signup program");
				boolean Continue = false;
				while(!Continue)
				{
					Scanner scanner11 = new Scanner(System.in);
					System.err.println("\n Continue?(yes/no):");
					String Continue1 = scanner11.next().toLowerCase();
					if(Continue1.equals("yes"))
					{
						System.err.println("!!!!!!!!!Great!!!!!!!!!");
						Continue = true;
					}
					else if(Continue1.equals("no"))
					{
						System.err.println("<<<<<<<<<<<<<You did not have the rights access the other option>>>>>>>>>>>>>>");
						System.exit(0);
					}
					else
					{
						System.out.println("Enter a Valid option>>>>>>>>>>>>>>>>>>>>>>>>>>");
					}
				}
				Thread.sleep(2000);
				System.out.println("Enter the Username");
				String signupusername = scanner1.next();
				System.out.println("Enter the password");
				String signuppassword = scanner1.next();
				users1.put(signupusername, signuppassword);
				System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< Signup Successfully >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				break;
			case 2 :
				System.out.println("Enter the Username");
				String loginusername = scanner1.next();
				System.out.println("Enter the Password");
				String loginpassword = scanner1.next();
				if(users1.containsKey(loginusername) && users1.get(loginusername).equals(loginpassword))
				{
					System.err.println("<<<<<<<<<<<<<<<<<<<<<< Login Successfully >>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				}
				else
				{
					System.err.println("?????????????? Invalid Username or Password ????????????????????");
				}
				break;
			case 3 :
				System.out.println("Enter the username");
				String forgotusername = scanner1.next();
		        if(users1.containsKey(forgotusername))
		        {
		        	System.err.println("Enter New Password");
		        	String newpassword = scanner1.next();
		        	users1.put(forgotusername, newpassword);
		        	System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<<< Reset Credentials Successfully >>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		        }
		        else
		        {
		        	System.err.println(">>>>>>>>>>>>>>>>>>>>>>>> Username Not Found >>>>>>>>>>>>>>>>>>>>>>>>>");
		        }
		        break;
			case 4 :
				bookTicket(scanner1);
				break;
			
			case 5 :
				seatsBooking(scanner1);
				break;
			case 6 :
				displayBookedTickets();
				break;
			case 7:
				Dopayment();
				break;
			case 8 :
				cancelBooking(scanner1);
				break;
			case 9 :
				System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<< Airlines Application is closing.Thank you >>>>>>>>>>>>>>>>>>>>>>>>>");
				Thread.sleep(2000);
				scanner1.close();
				System.exit(0);
				break;
			}
		}
	}
	private static void bookTicket(Scanner scanner) throws InterruptedException
	{
		System.out.println("Enter your flightNumber");
		String flightNumber = scanner.next();
		if(flightNumber == flightNumber)
		{
			System.err.println(">>>>>>>>>>>>>>>>>>>>>> Ticket is allocated Please provide the further details below <<<<<<<<<<<<<<<<<<<<<<<<<<<<");
			Thread.sleep(4000);
		}
		else
		{
			System.err.println(">>>>>>>>>>>>>>>>>>>>> Invalid >>>>>>>>>>>>>>>>>>>>>>>");
		}
	}
	@SuppressWarnings("resource")
	private static void displayBookedTickets() throws InterruptedException
	{
	       Scanner scanner = new Scanner(System.in);
           System.out.println("Welcome to the Airline Reservation System!");
		   System.out.print("Please enter the source: ");
		   String source = scanner.nextLine();
           System.out.print("Please enter the destination: ");
		   String destination = scanner.nextLine();
		   System.out.println("Source: " + source);
		   System.out.println("Destination: " + destination);
		   System.err.println("!!!You have selected the following flight: " + source + " to " + destination + "| Price:$4200.0");
		   Thread.sleep(5000);
		   System.err.println("<<<<<<<<<<<<<<<<<<<< Your Flight is Booked >>>>>>>>>>>>>>>>>>>>>>>>>");
		   for (Flight flight : bookedFlights)
		   {
			System.out.println(flight.getFlightNumber() + " | " + flight.getSource() + " to " + flight.getDestination() + "| Price:$" + flight.getTicketPrice());
		   }
	}
	private static void seatsBooking(Scanner scanner)
	{
		        @SuppressWarnings("resource")
				Scanner scanner1 = new Scanner(System.in);
		        int numRows = 100;
		        int numSeatsPerRow = 100 ; 
		        char[][] seats = new char[numRows][numSeatsPerRow]; 
		        for (int i = 0; i < numRows; i++) {
		            for (int j = 0; j < numSeatsPerRow; j++) {
		                seats[i][j] = 'O';
		            }
		        }
                while (true) 
                {
		            System.out.println("-------------Available Seats--------------- : ");
		            for (int i = 0; i < numRows; i++) {
		                for (int j = 0; j < numSeatsPerRow; j++)
		                {
		                    System.out.print(seats[i][j] + " ");
		                }
		                System.out.println();
		            }
		            System.out.print("Enter row number (1-" + numRows + "): ");
		            int row = scanner1.nextInt();
		            System.out.print("Enter seat number (1-" + numSeatsPerRow + "): ");
		            int seat = scanner1.nextInt();
		            if (row >= 1 && row <= numRows && seat >= 1 && seat <= numSeatsPerRow && seats[row - 1][seat - 1] == 'O') {
		                seats[row - 1][seat - 1] = 'X';
		                System.err.println("Seat booked successfully!");
		            } else {
		                System.err.println("Invalid selection or seat already booked.");
		            }
		            System.out.print("Do you want to book another seat? (yes/no): ");
		            String choice = scanner1.next();
		            if (choice.equalsIgnoreCase("no")) {
		                break;
		            }
		        }
	}
	@SuppressWarnings({ "resource", "unused" })
	private static void Dopayment() throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the Task : \n1.Gooogle pay \n2.Phonepe \n3.Paytm");
		int task = sc.nextInt();
		System.out.println("Send Money to this upi id : G1Airlines@ybl");
		System.out.print("Enter \n1 To generate otp   \n2 Exit");
		System.err.println("\n Continue?(yes/no):");
		String choose = sc.next();
		if(choose.equalsIgnoreCase("yes")) {
			System.err.println("!!!!!!! Great !!!!!!");
		}
		switch(sc.nextInt()) {
		case 1 :{
			int otp = (int) (Math.random()*10000);
			System.err.println("your otp is :"+otp);
			System.out.print("Enter your otp:");
			int userenter  = sc.nextInt();
			Thread.sleep(3000);
			if(otp == userenter) {
				System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Payment is successfull >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				Thread.sleep(2000);
				System.err.println("redirecting to Booking site..........");
				Thread.sleep(2000);
				System.err.println("....");
				Thread.sleep(2000);
				System.err.println("...");
				Thread.sleep(2000);
				System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Ticket is Booked <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
				Thread.sleep(2000);
				System.err.println("\t\t\t\t HappY JourneY");
		}
			else {
				System.out.print("your session is terminated");
				break;
			}
		}
		}
	}
	private static void cancelBooking(Scanner scanner) throws InterruptedException
	{
		System.out.println("Enter the flightNumber");
		String flightNumber = scanner.next();
		if(flightNumber == flightNumber)
		{
		   System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Booking is cancelled Successfully >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		   Thread.sleep(2000);
		   System.err.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< Your Money will be refunded within 24 hrs >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		   Thread.sleep(4000);
		   System.err.println("\t\t\t \n For Queries \n Contact email : \"G1Airlines@gmail.com\"");
		   Thread.sleep(4000);
		   scanner.nextLine();
		   return;
		}
		else
		{
			System.err.println("??????????????? Booking was not found ??????????????????????");
		}
	}
}
