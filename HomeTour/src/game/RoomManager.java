package game;

import fixtures.Room;

// managing the `Player` and the instances of `Room`
// responsible for 'loading' all instanciated `new Room` objects into memory
public class RoomManager {

	static Room[] rooms = new Room[5];
	static Room startingRoom;

	public static Room getStartingRoom() {
		return startingRoom;
	}

	// instantiate all `Room` objects, link `Room` objects together as exits, and designate a `startingRoom` `Room` object
	public static void init () {

		// The Home Tour `Room` layout
		Room foyer = new Room(
			"The Foyer" + "\n", 
			"The Foyer is the main entry stop into the apartment",
			"This is the entry to the apartment. The custom tiled floor keeps wet and muddy shoes safe when indoors.\nA large closet to the right holds everything needed for the outside. An old coat hanger is to the left."
		);

		rooms[0] = foyer;

		Room livingRoom = new Room(
			"The Living Room" + "\n",
			"The contemporary Living Room",
			"The Living Room has fittings for and extra large flat-screen TV, can easily fit two large sofas and has amazing views of the park across the street.\nIs that Central Park! Umm, probably not."
		);

		rooms[1] = livingRoom;

		Room kitchen = new Room(
			"The Kitchen" + "\n",
			"The Gourmet Kitchen",
			"The gourmet kitchen has all-new stainless appliances and an updated back-splash.\nA small but functional island sits in the middle and has seating for four"
		);

		rooms[2] = kitchen;

		Room bathroom = new Room(
			"The Bathroom" + "\n",
			"A Fully modernized, well-appointed Bathroom",
			"The bathroom was fully renovated two years ago.\nIt has double sinks, a custom vanity and plenty of lighting. The separate walk-in shower is a must as is the double size bath. Very luxurious."
		);

		rooms[3] = bathroom;

		Room masterBedroom = new Room(
			"The Master Bedroom" + "\n",
			"The Master Bedroom",
			"This is the master bedroom with three walk in closets and plenty of space to fit a king and extra storage."
		);

		rooms[4] = masterBedroom;

    startingRoom = foyer;

		// set up the exits from each room to the others
		// using four cardinal directions: north, east, south, west
		rooms[0].setExits(masterBedroom, livingRoom, null, kitchen);
		rooms[1].setExits(bathroom, null, null, foyer);
		rooms[2].setExits(masterBedroom, livingRoom, null, null);
		rooms[3].setExits(null, null, livingRoom, masterBedroom);
		rooms[4].setExits(null, bathroom, kitchen, null);
	}
}
