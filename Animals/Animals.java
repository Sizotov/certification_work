package Animals;

public class Animals {
    private String name;
    private String dateOfBirth;

    public Animals(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}