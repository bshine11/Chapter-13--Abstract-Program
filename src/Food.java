
public class Food {
	// Attributes
		private String type;
		private int location;
		private int price;

		// Overloaded constructor
		public Food(String type, int location, int price) {
			this.type = type;
			this.location = location;
			this.price = price;
		}

		// To string method for person
		public String toString() {
			return "[Type of Food: " + type + ", Number of locations: " + location + ", Price: " + price + "]";
		}
}
