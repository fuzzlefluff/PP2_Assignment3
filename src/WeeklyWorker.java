
public class WeeklyWorker extends Employee {
	
	//data fields to store data
	double weekSalary;
	int hourWorked;
	double overtime;
	
	//a constructor
	public WeeklyWorker(int num, String x, int month, int day, int year, int worked, double salary,double over) {
		super(num, x, month, day, year);
		hourWorked = worked;
		weekSalary = salary;
		overtime = over;
	}
	
	//a method that returns the hours worked
	public int getWork(){return hourWorked;}
	
	//a method that returns the salary
	public double getSalary(){return weekSalary;}
	
	//a method that returns the overtime pay
	public double getOver(){return overtime;}
	
	//a method that updates the hours worked
	public void setWork(int work){hourWorked = work;}
	
	//a method that updates the salary
	public void setSalary(double salary){weekSalary=salary;}
	
	//a method that updates the overtime pay
	public void setOver(double over){overtime = over;}
	
	//a method that calculates and returns the employee pay statement
	public String givePay(){
		String pay;
		int hours = hourWorked-40;
		double total = weekSalary;
		for(int count =0; count<hours; hours-=8)
		{
			total += overtime;
		}
		pay = new String("Name: "+employName+" Number: "+getID()+" || Hire Date: "+getDate()+" Salary: "+weekSalary+" || OvertimePay: "+overtime+" || Hours Worked: "+hourWorked+" || Week Pay: "+total);
		return pay;
	}

//end of class
}
