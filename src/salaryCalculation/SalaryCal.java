package salaryCalculation;

import paypro.Project.Employee;

public class SalaryCal  implements Salary{
	@Override
	public void empDetails(Employee e) {
		System.out.println("______________________________________________________________________________________________");
		System.out.println("                           EMPLOYEE DETAILS                              ");
		System.out.println("______________________________________________________________________________________________");
		System.out.println("Id             : " + e.getId());
		System.out.println("Name           : " +e.getName());
		System.out.println("Age            : " +e.getAge());
		System.out.println("Leave          : " +e.getLeave());
		System.out.println("Dept           : " +e.getDept());
		System.out.println("MobNo          : " +e.getMobNO());
		System.out.println("Working_Days   : " +e.getWorking_days());
	}

    @Override
	public void salary(int basic_salary, int HA, int PF, int tax,int MA,int loan) {
    	int total_earning=basic_salary + HA + MA;
    	int deduction=tax+PF+loan;
    	float total_salary=basic_salary + HA-deduction;
    	
    	System.out.println();
    	System.out.println("________________________________________________________________________________________________________");
    	System.out.println("                           SALARY PAYSLIP                                                               ");
    	System.out.println("________________________________________________________________________________________________________");
    	System.out.println(" EARNINGS         Amount                DEDUCTION             Amount                    ");
    	System.out.println("_________________________________________________________________________________________________________");
    	System.out.println(" Basic_salary    :Rs." + basic_salary +           "          \tProvident Fund      :  Rs."+  PF);
    	System.out.println(" Home Allowance  :Rs." + HA +     "        \tTax                 : Rs."+           tax);
    	System.out.println(" Meal Allowance  :Rs."+ MA +     "         \tLoan                : Rs."+           loan);
    	System.out.println(" TOTAL EARNINGS  :Rs."+ total_earning+    "      \tTOTAL DEDUCTION     : Rs."+     deduction);
    	System.out.println("_________________________________________________________________________________________________________");
    	System.out.println("                  NET PAY        : Rs. "+total_salary);
    	System.out.println("_________________________________________________________________________________________________________");
    }
		
		
	}
