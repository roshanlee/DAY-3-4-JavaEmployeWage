
public class PartTimeUC3 {
    int wagePerHr=20;
    int fullHr=8;
    int partTime=8;
    
    int dailyWage;
    
    int IS_FULL_TIME=1;
    int isPartTime=2;
	double empCheck=Math.floor(Math.random()*10)%3;
	public void PartTimeWage(){
		
		if(empCheck==IS_FULL_TIME){
			dailyWage=wagePerHr*fullHr;
			System.out.println(dailyWage);
		}
		else if(empCheck==isPartTime){
			dailyWage=wagePerHr*partTime;
			System.out.println(dailyWage);
			
		}
		else{
			System.out.println("Employee is Absent"+dailyWage);
		}
	}
    
    
}
