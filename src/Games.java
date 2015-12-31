
public class Games {
	// Attributes
			private String teamAgainst;
			private String month;
			private String day;
			private String time;

			// Overloaded constructor
			public Games(String teamAgainst, String month, String day, String time) {
				this.teamAgainst = teamAgainst;
				this.month = month;
				this.day = day;
				this.time = time;
			}

			// To string method for person
			public String toString() {
				return "[Team Against: " + teamAgainst + ", Month: " + month + ", Day: " + day+ ", Time: " + time + "]";
			}
}
