
public class Assignment3Test {
	
	public static void main(String[]args)
	{
		//setup our array and fill it with 2 Weekly Workers and 6 Production Workers
		Employee[] employList = new Employee[8];
		employList[0] = new WeeklyWorker(7895, "Bigo BossMan", 2, 15, 2005, 60, 1500, 25);
		employList[1] = new WeeklyWorker(543, "Zack Manford",4,10,2003,49,2200,25);
		employList[2] = new ProductionWorker(222,"Kyle McCheese",8,21,2004,1,52,12);
		employList[3] = new ProductionWorker(676,"Gunther Slavador",12,12,2014,1,48,12);
		employList[4] = new ProductionWorker(959,"Megan Reedsman",1,18,2007,1,40,12);
		employList[5] = new ProductionWorker(325,"Kevin Manford",6,22,2008,2,51,12);
		employList[6] = new ProductionWorker(567,"Jake Dokman",3,7,2010,2,46,12);
		employList[7] = new ProductionWorker(828,"Devin Bradley",11,9,2004,2,30,12);
		
		//sort the array alphabetically by first name by using the compareTo() to compare the name strings alphabetically
		for(int count=0; count<employList.length; count++)
		{
			for(int count1= 0; count1<employList.length-1; count1++){
			Employee temp;
			if(employList[count].getName().compareTo(employList[count1].getName())<1)
			{temp = employList[count];
			employList[count] = employList[count1];
			employList[count1] =temp;}
		}
		}
		
		
		//iterate through the array, check what instance is being pointed too and print the appropriate pay statement
		for(int count = 0; count<employList.length; count++)
		{
			if(employList[count] instanceof WeeklyWorker) 
			{System.out.println(((WeeklyWorker) employList[count]).givePay());}
			
			if(employList[count] instanceof ProductionWorker)
			{System.out.println(((ProductionWorker) employList[count]).givePay());}
			
		}
		
	
	}
}
