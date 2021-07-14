
public class CalculateWageUc6 {
	 int wagePerHr=20;
	    int fullHr=8;
	    int partTime=8;
	    int dailyWage;
	    int IS_FULL_TIME=1;
	    int isPartTime=2;
	    int numWorkingDays=20;
	    int totalWorkingDays;
	    int monthWage;
	    int totalWorkingHrs;
	    int maxHr=100;
	    
			
			public void monthWage(){
				
				while(totalWorkingHrs<=maxHr && totalWorkingDays<numWorkingDays){
					totalWorkingDays++;
					double empCheck=Math.floor(Math.random()*10)%3;
				
				if(empCheck==IS_FULL_TIME){
					dailyWage=wagePerHr*fullHr;
					totalWorkingHrs+=fullHr;
					
				}
				else if(empCheck==isPartTime){
					dailyWage=wagePerHr*partTime;
					totalWorkingHrs+=partTime;
					
					
				}
				else{
					dailyWage=0;
				}
				monthWage+=dailyWage;
				
				}
				System.out.println("Monthly wage:"+monthWage);
			}
		    
}
