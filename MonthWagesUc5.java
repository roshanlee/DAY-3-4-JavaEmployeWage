
public class MonthWagesUc5 {
	 int wagePerHr=20;
    int fullHr=8;
    int partTime=8;
    int dailyWage;
    int IS_FULL_TIME=1;
    int isPartTime=2;
    int numWorkingDays=20;
    int monthWage;
    
		
		public void monthWage(){
			
			for(int i=1;i<=numWorkingDays;i++)
			{
				double empCheck=Math.floor(Math.random()*10)%3;
			
			if(empCheck==IS_FULL_TIME){
				dailyWage=wagePerHr*fullHr;
				
			}
			else if(empCheck==isPartTime){
				dailyWage=wagePerHr*partTime;
				
				
			}
			else{
				dailyWage=0;
			}
			monthWage+=dailyWage;
			}
			System.out.println("Monthly wage:"+monthWage);
		}
	    
}
