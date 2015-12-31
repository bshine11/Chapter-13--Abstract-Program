import java.util.ArrayList;

public abstract class CommonStadium implements Stadium {
	//attributes
	private ArrayList<Food> foodAmount;

	//checks to see if the stadium is regulated
	public void checkRegulation(boolean stadiumCheck, boolean stadiumProblems) {
		boolean check = stadiumCheck;
		boolean problems = stadiumProblems;
		if(check = true){ 
		System.out.println("The Stadium is regulated.");
		}
		if (problems == true) {
		System.out.println("Fix the errors in the Stadium.");
		}
	}
//adds foods that the stadium sells
	public int foodAmount(String type, int location, int price){
		foodAmount.add(new Food(type,location,price));
		return foodAmount.size();
		}
	
//see how many tickets are available
	public void ticketsLeft(int tickets) {
		boolean ticketsBought = false;
		if (ticketsBought== true){
			tickets --;
		}
	}

	

	public abstract String attendance();

	public abstract String gameSchedule(String teamAgainst, String month, String day, String time);

	public abstract int sizeStadium(int age, String eyeColor, String gender);
	}