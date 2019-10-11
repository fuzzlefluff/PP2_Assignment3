
public class ProductionWorker extends Employee {
	
	//our data fields, shift is defaulted to a day shift
	int shift=1;
	double hourlyRate;
	int hourWorked;
	
	//a constructor
	public ProductionWorker(int num, String x, int month, int day, int year, int shift, int hourWork, double hourRate) {
		
		//call the superclass constructor
		super(num, x, month, day, year);
		
		//make sure the shift value makes sense, if it does not we ignore it
		if(shift==1||shift==2){this.shift=shift;}
		
		hourWorked = hourWork;
		hourlyRate = hourRate;
		//increase the hourly rate if night shift shift
		if(shift == 2){hourlyRate = hourlyRate*1.25;}
		
	}
	
	//a method that returns the shift value
	public int getShift(){return shift;}
	
	//a method that returns the hourly rate
	public double getHourly(){return hourlyRate;}
	
	//a method that returns the hours worked
	public int getWorked(){return hourWorked;}
	
	//a method that updates the shift value and the hourly rate accordingly, if the value makes no sense it is ignored
	public void setShift(int shift){
		if(shift==1||shift==2){
			if(this.shift == 2 && shift == 1) {hourlyRate = hourlyRate/1.25;}
			if(this.shift == 1 && shift == 2) {hourlyRate = hourlyRate*1.25;}
			this.shift=shift;}}
	
	//a method that updates the hourly rate, does take into account the current shift value
	public void setRate(double hourRate){
		hourlyRate = hourRate;
		if(shift == 2){hourlyRate = hourlyRate*1.25;}}
	
	//a method that updates the hours worked
	public void setWork(int hourWork){hourWorked = hourWork;}
	
	//a method that calculates and returns the employee pay statement
	public String givePay(){
		String pay;
		double total = hourWorked * hourlyRate;
		pay = new String("Name: "+employName+" Number: "+getID()+" || Hire Date: "+getDate()+" || Shift: "+shift+" || Hourly Pay Rate: "+hourlyRate+" || Hours Worked: "+hourWorked+" || Week Pay: "+total);
		return pay;
	}
	
//end of class
}
	


