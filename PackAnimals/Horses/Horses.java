package PackAnimals.Horses;

import PackAnimals.PackAnimals;

public class Horses extends PackAnimals {
    private String[] commands;
    public Horses(String name, String dateOfBirth, String[] commands) {
        super(name, dateOfBirth, commands);
    }
    public void displayInfo() {
        super.displayInfo();

        System.out.println("Commands: ");
        for (String command : commands) {
            System.out.println("- " + command);
        }
    }

}
