
class Employee {

    int empCheck;
    int wagePerHour = 20;
    int fullDay = 8;
    int halfDay = 4;
    int workingDayPerMonth = 20;

    void employeeAttendanceCheck() {

        empCheck = (int) Math.floor(Math.random() * 10) % 3;
        if (empCheck == 0) {
            System.out.println("Employee is Absent");
        } else if (empCheck == 1) {
            System.out.println(" Employee is Present");
        } else {
            System.out.println("Employee is Present but working part time");
        }
    }

    void dailyWage() {
        if (empCheck == 0) {
            System.out.println("Daily Wage of employee is 0");
        } else if (empCheck == 1) {
            System.out.println(" Daily Wage of employee is : " + fullDay * wagePerHour);
        } else {
            System.out.println(" Daily Wage of employee is : " + halfDay * wagePerHour);
        }
    }

    void monthlyWage() {
        if (empCheck == 0) {
            System.out.println("Daily Wage of employee is 0");
        } else if (empCheck == 1) {
            System.out.println(" Daily Wage of employee is : " + fullDay * wagePerHour * workingDayPerMonth);
        } else {
            System.out.println(" Daily Wage of employee is : " + halfDay * wagePerHour * workingDayPerMonth);
        }

    }
}


public class EmployeeWageComputation {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        e1.employeeAttendanceCheck();
        e1.dailyWage();
        e1.monthlyWage();

    }
}
