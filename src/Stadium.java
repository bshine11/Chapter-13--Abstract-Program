/*************************************
 * Brendan Shine 
 * Mr. Kiedes Period 2               *
 * 12-17-15             
 * Abstract Interface Class Program
 *                                   *
 ************************************/

public abstract interface Stadium
	{
	//abstract classes
		public abstract void checkRegulation(boolean stadiumCheck,boolean stadiumProblems);
		public abstract int foodAmount(String type, int locations, int price);
		public abstract void ticketsLeft(int tickets);
	//concrete classes
		public abstract int sizeStadium(int age, String eyeColor, String gender);
		public abstract String gameSchedule(String teamAgainst, String month, String day, String time);
	   	public abstract String attendance(); 

	}


