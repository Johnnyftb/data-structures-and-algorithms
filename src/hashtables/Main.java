package hashtables;

public class Main {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 76);

        SimpleHashtable map = new SimpleHashtable();
        map.put("Jones", janeJones);
        map.put("Doe", johnDoe);
        map.put("Wilson", mikeWilson);
        map.put("Smith", marySmith);
        map.put("End", billEnd);

        map.printHashtable();

        System.out.println("Retrieve key Wilson: " + map.get("Wilson"));
        System.out.println("Retrieve key Smith: " + map.get("Smith"));

        map.remove("Wilson");
        map.remove("Jones");

        map.printHashtable();
    }
}
