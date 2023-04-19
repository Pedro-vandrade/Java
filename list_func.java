import applist.Employee;

import java.util.*;

public class list_func {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        System.out.println("Quantos funcionários serão registrados?");
        int numFunc = sc.nextInt();

        for (int i = 0; i < numFunc; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);

        }
        System.out.print("Informe a ID do funcionário que terá aumento salarial: ");
        int idSalary = sc.nextInt();
        Integer pos = position(list, idSalary);
        if (pos == null){
            System.out.println("Id não existe.");
        }
        else {
            System.out.print("Informe a porcentagem: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }
        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (Employee emp: list){
            System.out.println(emp);
        }

        sc.close();
    }
    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
    return null;
    }
}


