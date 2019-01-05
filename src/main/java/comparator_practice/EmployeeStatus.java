package comparator_practice;

import java.util.Comparator;
import java.util.PriorityQueue;

public class EmployeeStatus {

    private static final Comparator<Employee> BY_IMPORTANCE = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getRank().compareTo(o2.getRank());
        }
    };

    public static void main(String[] args) {
        PriorityQueue<Employee> employees = new PriorityQueue<Employee>(BY_IMPORTANCE);

        Employee class1Emp = new Employee(Hierachy.HIGH,"Class 1");
        Employee class2Emp = new Employee(Hierachy.MEDIUM,"Class 2");
        Employee class3Emp = new Employee(Hierachy.LOW,"Class 3");

        employees.add(class3Emp);
        employees.add(class1Emp);
        employees.add(class2Emp);

        while(!employees.isEmpty()){
            System.out.println(employees.poll().getPos());
        }
    }
}
