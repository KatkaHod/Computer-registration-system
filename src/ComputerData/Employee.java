package ComputerData;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    String name;
    String surname;
    LocalDate dateOfBirth;
    List<Computer> computers = new ArrayList<>();

    public Employee (String name, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setDateOfBirth (LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void addComputer(Computer computer) {
        computers.add(computer);

    }

    public void removeComputer(Computer computer) {
        computers.remove(computer);

    }

    //return a copy of the list
    public List<Computer> getComputers() {
        return new ArrayList<>(computers);
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", computers=" + computers +
                '}';
    }
}

