package entidade;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
}
    public double increaseSalary(double pctg){
        return grossSalary += grossSalary * pctg / 100;

    }


}
