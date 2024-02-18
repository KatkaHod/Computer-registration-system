package ComputerData;

public class Computer {
    private String model;
    private double weight;
    private double monitorDiagonal;
    private boolean isCompanyComputer;
    private boolean isNotebook;


    //first constructor
public Computer(String model, double weight, double monitorDiagonal, boolean isCompanyComputer, boolean isNotebook )
{
this.model = model;
this.weight = weight;
this.monitorDiagonal= monitorDiagonal;
this.isCompanyComputer = isCompanyComputer;
this.isNotebook = isNotebook;
}


//second constructor with set default values
public Computer(String model, double weight) {
    this(model, weight, 15.7,true,true);

}


//Getters and setters - These methods are used to manipulate private attributes of a class.
public void setModel(String model) {
    this.model = model;
}

public String getModel() {
    return model;
}

public void setWeight(double weight) {
    this.weight = weight;
}

public double getWeight() {
    return weight;
}

public void setMonitorDiagonal(double monitorDiagonal) {
    this.monitorDiagonal = monitorDiagonal;
}

public double getMonitorDiagonal() {
    return monitorDiagonal;
}

public void setIsCompanyComputer (boolean isCompanyComputer) {
    this.isCompanyComputer = isCompanyComputer;
}

public boolean getIsCompanyComputer () {
    return isCompanyComputer;
}

public void setIsNotebook(boolean isNotebook) {
    this.isNotebook = isNotebook;
}

public boolean getIsNotebook () {
    return isNotebook;
}


    @Override
    public String toString() {
        return "Computer: " +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", monitorDiagonal=" + monitorDiagonal +
                ", isCompanyComputer=" + isCompanyComputer +
                ", isNotebook=" + isNotebook;
    }
}
