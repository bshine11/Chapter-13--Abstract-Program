import java.util.ArrayList;

public class SoccerStadium {
	// Attributes
	private ArrayList<Person> sizeStadium;
	private ArrayList<Person> attendanceCapacity;
	private ArrayList<Games> gameSchedule; 
//displays the schedule
public String gameSchedule(String teamAgainst, String month, String day, String time) {
	gameSchedule.add(new Games(teamAgainst, month, day, time));
	return "" + gameSchedule;
}
//displays size of stadium
public int sizeStadium(int age, String eyeColor, String gender){
		sizeStadium.add(new Person(age, eyeColor, gender));
		return sizeStadium.size();
		}


public String attendance() {
	// Displays the attributes of the attendants
		String temp = "";
		for (int k = 0; k < attendanceCapacity.size(); k++)
			temp = temp + attendanceCapacity.get(k).toString() + "\n";
		return temp;
}


}