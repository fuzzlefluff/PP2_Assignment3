
public abstract class Employee {
	
	//data fields for the class and set default values to error messages
	String employName = "nameerror";
	String employNum ="numerror";
	String employLetter = "nameLettererror";
	String employDay ="invalid day";
	String employMonth ="invalid month";
	String employYear ="invalid year";
	
	//a constructor
	public Employee(int num, String x, int month, int day, int year)
	{
		//take the employee number data, convert it to a string and then cut it down to only the first 3 digits
		employNum = new String()+num;
		employNum = employNum.substring(0,3);
		
		//take the name input, capitalize it, and then iterate through the name until the first A-M letter we find
		employName = x.toUpperCase();
		for(int count=0; count<employName.length(); count++){ 
			char temp = employName.charAt(count);
			if(temp=='A'||temp=='B'||temp=='C'||temp=='D'||temp=='E'||temp=='F'||temp=='G'||temp=='H'||temp=='I'||temp=='J'||temp=='K'|temp=='L'||temp=='M') 
				{employLetter = new String()+temp; break;}}
		
		//test our date values to make sure they are real dates and not in the future, if so then the values are stored
		if(month>2 && month%2==0){if(day<31 && day>0){employDay = new String()+day;}}
		else if(month>2){if(day<32 && day>0){employDay = new String()+day;}}
		else if(month == 1){if(day<32&&day>0){employDay = new String()+day;}}
		else if(month == 2){if(day<30 && day>0){employDay= new String()+day;}}
		if(month<13 && month > 0) {employMonth = new String()+month;}
		if(year<2016 && year>0){employYear = new String()+year;}
	}
	
	//a method that returns the name
	public String getName(){return employName;}
	
	//a method that returns the employID string in it's proper format
	public String getID(){return employNum+"-"+employLetter;}
	
	//a method that returns the date of employment in it's proper format
	public String getDate(){return new String(employMonth+"/"+employDay+"/"+employYear);}
	
	//a method that updates the employee number
	public void setNumber(int num){
		employNum = new String()+num;
	employNum = employNum.substring(0,3);}
	
	//a method that updates the employee name and it's ID letter
	public void setName(String name){
		employName = name.toUpperCase();
		for(int count=0; count<employName.length(); count++){ 
				char temp = employName.charAt(count);
				if(temp=='A'||temp=='B'||temp=='C'||temp=='D'||temp=='E'||temp=='F'||temp=='G'||temp=='H'||temp=='I'||temp=='J'||temp=='K'|temp=='L'||temp=='M') 
					{employLetter = new String()+temp; break;}}}
	
	//a method that updates the hire date
	public void setDate(int month, int day, int year){
		if(month>2 && month%2==0){if(day<31 && day>0){employDay = new String()+day;}}
		else if(month>2){if(day<32 && day>0){employDay = new String()+day;}}
		else if(month == 1){if(day<32&&day>0){employDay = new String()+day;}}
		else if(month == 2){if(day<30 && day>0){employDay= new String()+day;}}
		if(month<13 && month > 0) {employMonth = new String()+month;}
		if(year<2016 && year>0){employYear = new String()+year;}}
	
//end of class
}