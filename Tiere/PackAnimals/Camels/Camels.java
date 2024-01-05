package Tiere.PackAnimals.Camels;

import Tiere.PackAnimals.PackAnimals;

public class Camels extends PackAnimals {
    private String[] commands;
    public Camels(String name, String dateOfBirth, String[] commands) {
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
