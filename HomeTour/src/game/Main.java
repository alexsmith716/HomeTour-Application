package game;

import java.util.Scanner;
import fixtures.Room;

public class Main {

	// RoomManager roomManager = new RoomManager();
	static Player player = new Player();
	static Scanner scanner = new Scanner(System.in);
	static String[] roomExits = new String[4];

	public static void main(String[] args) {

		RoomManager.init();

		player.setCurrentRoom(RoomManager.getStartingRoom());

		while(true) {
			for (int i = 0; i < roomExits.length; i++) {
				roomExits[i] = "";
			}
			printRoom(player);
			System.out.println("\nWhere would you like to go?");
			String dir1 = roomExits[0] == "North" ? "'north', " : "";
			String dir2 = roomExits[1] == "East" ? "'east', " : "";
			String dir3 = roomExits[2] == "South" ? "'south', " : "";
			String dir4 = roomExits[3] == "West" ? "'west' " : "";
			System.out.print("Enter either " + dir1 + dir2 + dir3 + dir4 + "to advance or 'exit' to logout: ");
			String [] userInput = collectPlayerInput();
			parse(userInput, player); 
		}
	}

	private static void printRoom(Player player) {

		System.out.println();
		System.out.println("************************ Current Room *************************");
		System.out.println(player.getCurrentRoom().getName());
		System.out.println(player.getCurrentRoom().getLongDescription());
		System.out.println("\nExits:\n");

		if(player.getCurrentRoom().getExit("north") != null) {
			roomExits[0] = "North";
			System.out.println("North: " + player.getCurrentRoom().getExit("north").getShortDescription());
		}
		if(player.getCurrentRoom().getExit("east") != null) {
			roomExits[1] = "East";
			System.out.println("East: " + player.getCurrentRoom().getExit("east").getShortDescription());
		}
		if(player.getCurrentRoom().getExit("south") != null) {
			roomExits[2] = "South";
			System.out.println("South: " + player.getCurrentRoom().getExit("south").getShortDescription());
		}
		if(player.getCurrentRoom().getExit("west") != null) {
			roomExits[3] = "West";
			System.out.println("West: " + player.getCurrentRoom().getExit("west").getShortDescription());
		}
	}

	private static String[] collectPlayerInput() {
		String input = scanner.nextLine();
		String [] inputArray = input.split(" ");
		return inputArray;
	}

	private static void parse(String[] command, Player player) {
		switch(command[0]) {
			case "north":
				player.setCurrentRoom(player.getCurrentRoom().getExit("north"));
				break;
			case "east":
				player.setCurrentRoom(player.getCurrentRoom().getExit("east"));
				break;
			case "south":
				player.setCurrentRoom(player.getCurrentRoom().getExit("south"));
				break;
			case "west":
				player.setCurrentRoom(player.getCurrentRoom().getExit("west"));
				break;
			case "exit":
				System.out.println("Logged Out of HomeTour. Have a Great Day!");
				scanner.close();
				System.exit(0);
				break;
			default:
				System.out.println();
				System.out.println("***************************************************************");
				System.out.println("******* That was not a valid command. Please try again. *******");
				System.out.println("***************************************************************");
		}
	}
}
