package hashtables.ChallengeTwo;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        Map<Integer, Employee> existingEmployees = new HashMap<Integer, Employee>();

        ListIterator<Employee> employeeList = employees.listIterator();

        while (employeeList.hasNext()) {
            Employee currentEmployee = employeeList.next();
            int employeeId = currentEmployee.getId();
            if (existingEmployees.containsKey(employeeId)) {
                employeeList.remove();
            } else {
                existingEmployees.put(employeeId, currentEmployee);
            }
        }

        employees.forEach(e -> System.out.println(e));
    }
}
