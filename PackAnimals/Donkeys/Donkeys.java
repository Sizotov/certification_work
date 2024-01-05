package PackAnimals.Donkeys;

import PackAnimals.PackAnimals;

public class Donkeys extends PackAnimals {
    private String[] commands;
    public Donkeys(String name, String dateOfBirth, String[] commands) {
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
