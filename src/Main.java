import ComputerData.Computer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Computer HP = new Computer("HP ENVY Laptop 16-h1097nr", 1.5,11.6, true, true);
        Computer Macbook = new Computer("APPLE MacBook Air 13 ",1.5);
        Computer Fujitsu = new Computer("Fujitsu LifeBook U7413", 1.1,14,false, true);

        //collection of objects representing computers
        List<Computer> computerList = new ArrayList<>();
        computerList.add(HP);
        computerList.add(Macbook);
        computerList.add(Fujitsu);

        //print list of objects in the collection
        for(Computer computer : computerList) {
            System.out.println("Model: " + computer.getModel());
            System.out.println("Weight: " + computer.getWeight());
            System.out.println("Monitor diagonal: " + computer.getMonitorDiagonal());
            System.out.println("Is company computer: " + computer.getIsCompanyComputer());
            System.out.println("Is notebook: " + computer.getIsNotebook());
            System.out.println();
        }


    }

}
