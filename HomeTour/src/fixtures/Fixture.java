package fixtures;

// abstract class base for anything that can be looked at or interacted with (`Room` & `Interaction`)
// basic interaction turn on light, pick up book, pet dog

public abstract class Fixture {

	protected String name;
	protected String shortDescription;
	protected String longDescription;

	public Fixture(String name, String shortDescription, String longDescription) {
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	public String getName() {
		return name;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}
}
