import java.util.Date;

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;
    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(double salary) {
        double tax = 0;
        if (salary >= 1000) {
            tax = (salary * 3) / 100;
        }
        return tax;
    }

    double bonus(double workHours) {
        double bonus = 0;
        if (workHours >= 40) {
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    double raiseSalary(int hireYear, double salary) {
        int thisYear = 2021;
        int workDuration = hireYear - thisYear;
        double raiseSalary = 0;
        if (workDuration < 10) {
            raiseSalary = (salary * 5) / 100;
        } else if (workDuration >= 10 && workDuration < 20) {
            raiseSalary = (salary * 10) / 100;
        } else if (workDuration >= 20) {
            raiseSalary = (salary * 15) / 100;
        }
        return raiseSalary;
    }


    @Override
    public String toString() {

        return "Adı: " + this.name +
                "\n Maaşı: " + this.salary +
                "\n Çalışma saatı: " + this.workHours
                +"\n Başlanğıc ili: "+ this.hireYear
                +"\n Vergi: "+ this.tax(this.salary)
                +"\n Bonus: "+ this.bonus(this.workHours)
                +"\n Maaş artımı: "+ this.raiseSalary(this.hireYear, this.salary)
                +"\n Toplam maaş: "+ (this.salary -this.tax(this.salary) +this.bonus(this.workHours) + this.raiseSalary(this.hireYear, this.salary)  );
    }
}
