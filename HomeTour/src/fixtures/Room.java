package fixtures;

import java.util.ArrayList;

// instance `Room` (extending `Fixture`)
public class Room extends Fixture {

	private Room[] exits = new Room[4];

	// Room constructor accepts name, shortDescription, longDescription
	public Room(String name, String shortDescription, String longDescription) {
		// inherit the `Fixture.java` descriptive properties
		super(name, shortDescription, longDescription);
	}

	public Room[] getExits() {
		return exits;
	}

	public boolean exitExists(int direction) {
		if(exits[direction] == null) {
			return false;
		}
		return true;
	}

	public Room getExit(int direction) {
		return exits[direction];
	}

	public Room getExit(String direction) {
		if(direction.equals("north")) {
			return exits[0];
		}else if (direction.equals("east")) {
			return exits[1];
		}else if (direction.equals("south")) {
			return exits[2];
		}else if (direction.equals("west")) {
			return exits[3];
		}
		else return null;
	}

	// using four cardinal directions: north, east, south, west
	public void setExits(Room northExit, Room eastExit, Room southExit, Room westExit) {
		// `exits` property: the rooms adjacent to this one
		this.exits[0] = northExit;
		this.exits[1] = eastExit;
		this.exits[2] = southExit;
		this.exits[3] = westExit;
	}
}
