
public class SwitchCaseUC4 {
	 int wagePerHr=20;
	    int fullHr=8;
	    int partTime=8;
	    
	    int dailyWage;
	    
	    final int  IS_FULL_TIME=1;
	    final int isPartTime=2;
		int empCheck=(int)(Math.floor(Math.random()*10)%3);
		public void PartTimeWage(){
			switch(empCheck){
			case IS_FULL_TIME :
				dailyWage=wagePerHr*fullHr;
				System.out.println(dailyWage);
				break;
			case isPartTime :
				dailyWage=wagePerHr*partTime;
				System.out.println(dailyWage);
				break;
             default:
				System.out.println("Employee is Absent"+dailyWage);
	
			}
		}
}
