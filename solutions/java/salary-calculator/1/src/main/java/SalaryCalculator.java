public class SalaryCalculator {
    
    public double salaryMultiplier(int daysSkipped) {
        return (daysSkipped>=5)? 0.85:1.0;
    }

    public int bonusMultiplier(int productsSold) {
        return (productsSold>=20)? 13:10;
    }

    public double bonusForProductsSold(int productsSold) {
        int multiplier=bonusMultiplier(productsSold);
        return multiplier*productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double baseSalary=1000.00;
        double penalty=salaryMultiplier(daysSkipped);
        double bonus=bonusForProductsSold(productsSold);
        double finalSalary1=(baseSalary*penalty)+bonus;
        return (finalSalary1>2000.00)? 2000.00:finalSalary1;
        
    } 
}
