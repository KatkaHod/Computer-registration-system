package ComputerData;

public class Computers {
    private String model;
    private double weight;
    private double monitorDiagonal;
    private boolean isCompanyComputer;
    private boolean isNotebook;

public Computers(String model, double weight, double monitorDiagonal, boolean isCompanyComputer, boolean isNotebook )
{
this.model = model;
this.weight = weight;
this.monitorDiagonal= monitorDiagonal;
this.isCompanyComputer = isCompanyComputer;
this.isNotebook = isNotebook;
}

//Getters and setters - These methods are used to manipulate private attributes of a class.
public void setModel(String model) {
    this.model = model;
}

public String getModel() {
    return this.model;
}

public void setWeight(double weight) {
    this.weight = weight;
}

public double getWeight() {
    return this.weight;
}

public void setMonitorDiagonal(double monitorDiagonal) {
    this.monitorDiagonal = monitorDiagonal;
}

public double getMonitorDiagonal() {
    return this.monitorDiagonal;
}

public void setIsCompanyComputer (boolean isCompanyComputer) {
    this.isCompanyComputer = isCompanyComputer;
}

public boolean getIsCompanyComputer () {
    return this.isCompanyComputer;
}

public void setIsNotebook(boolean isNotebook) {
    this.isNotebook = isNotebook;
}

public boolean getIsNotebook () {
    return this.isNotebook;
}





}
