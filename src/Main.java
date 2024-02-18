import ComputerData.Computer;
import ComputerData.Employee;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        //Computers instance
        Computer HP = new Computer("HP ENVY Laptop 16-h1097nr", 1.5,11.6, true, true);
        Computer Macbook = new Computer("APPLE MacBook Air 13 ",1.5);
        Computer Fujitsu = new Computer("Fujitsu LifeBook U7413", 1.1,14,false, true);

        //Employees instance
        Employee firstEmployee = new Employee("Jana", "Dvorakova",LocalDate.of(1990, 10, 1));
        Employee secondEmployee = new Employee("David", "Nikl", LocalDate.of(1980,5,3));
        Employee thirdEmployee = new Employee("Anna", "Novakova", LocalDate.of(1995, 6,3));

        //collection of objects representing computers
        List<Computer> computerList = new ArrayList<>();
        computerList.add(HP);
        computerList.add(Macbook);
        computerList.add(Fujitsu);

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(firstEmployee);
        employeeList.add(secondEmployee);
        employeeList.add(thirdEmployee);


        //assigned computers
        firstEmployee.addComputer(HP);
        secondEmployee.addComputer(Macbook);
        thirdEmployee.addComputer(Fujitsu);


        //print list of objects in the collection - computers
        for(Computer computer : computerList) {
            System.out.println("Company computer: ");
            System.out.println("====================");
            System.out.println("Model: " + computer.getModel());
            System.out.println("Weight: " + computer.getWeight());
            System.out.println("Monitor diagonal: " + computer.getMonitorDiagonal());
            System.out.println("Is company computer: " + computer.getIsCompanyComputer());
            System.out.println("Is notebook: " + computer.getIsNotebook());
            System.out.println();
        }

        //print list of objects in the collection - employees
        for(Employee employee : employeeList) {
            System.out.println("Employee: ");
            System.out.println("====================");
            System.out.println("Name: " + employee.getName() + ", "
            + " " + "Surname: " + employee.getSurname() + ", "
            + " " + "Date of Birth: " + employee.getDateOfBirth() + ", " + "Assigned computer: " + employee.getComputers() + ".");
            System.out.println();
        }


    }


}
