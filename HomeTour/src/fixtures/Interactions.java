package fixtures;

public class Interactions extends Fixture {
	private boolean isInteraction;
	private boolean canMove;

	public Interactions(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
	}

	//	public Interactions(String name, String shortDescription, String longDescription, boolean interaction, boolean move) {
	//		super(name, shortDescription, longDescription);
	//		isInteraction = interaction;
	//		canMove = move;
	//	}

	//	public Interactions(Interactions interaction) {
	//		super(interaction.name, interaction.shortDescription, interaction.longDescription);
	//		this.isInteraction = interaction.isInteraction();
	//		this.canMove = interaction.canMove();
	//	}

	//	public boolean isInteraction() {
	//		return isInteraction;
	//	}

	//	public boolean canMove() {
	//		return this.canMove;
	//	}

	//	public void setInteraction(boolean interaction, int id) {
	//		this.isInteraction = interaction;
	//	}

	//	public void setTakeable(boolean move) {
	//		this.canMove = move;
	//	}
}
