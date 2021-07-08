
public class DailyWageUC2 {
    int wagePerHr=20;
    int fullHr=8;
    int dailyWage;
    
    int IS_FULL_TIME=1;
	double empCheck=Math.floor(Math.random()*10)%2;
	public void DailyWage(){
		if(empCheck==IS_FULL_TIME){
			dailyWage=wagePerHr*fullHr;
			System.out.println(dailyWage);
		}
		else{
			System.out.println("Employee is Absent"+dailyWage);
		}
	}
    
    
}
