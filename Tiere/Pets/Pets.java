package Tiere.Pets;
import Tiere.Animals.Animals;

public class Pets extends Animals {
    private String[] commands;

    public Pets(String name, String dateOfBirth, String[] commands) {
        super(name, dateOfBirth);
        this.commands = commands;
    }

    public void displayInfo() {
        super.displayInfo();

        System.out.println("Commands: ");
        for (String command : commands) {
            System.out.println("- " + command);
        }
    }
}