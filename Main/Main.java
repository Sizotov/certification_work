package Main;
import PackAnimals.Camels.Camels;
import PackAnimals.Donkeys.Donkeys;
import PackAnimals.Horses.Horses;
import Pets.Cats.Cats;
import Pets.Dogs.Dogs;
import Pets.Hamsters.Hamsters;

public class Main {
    public static void main(String[] args) {

        String[] catCommands = {"Meow", "Play", "Sleep"};
        Cats cat = new Cats("Whiskers", "05-05-2015", catCommands);
        cat.displayInfo();

        System.out.println();

        String[] dogCommands = {"Sit", "Stay", "Fetch"};
        Dogs dog = new Dogs("Buddy", "01-01-2010", dogCommands);
        dog.displayInfo();

        System.out.println();

        String[] hamsterCommands = {"Eat", "Play", "Sleep"};
        Hamsters hamster = new Hamsters("Frodo", "14-05-2013", hamsterCommands);
        hamster.displayInfo();

        System.out.println();

        String[] horseCommands = {"Walk", "Run", "Jump"};
        Horses horse = new Horses("SpiritOfFire", "10-10-2012", horseCommands);
        horse.displayInfo();

        System.out.println();

        String[] camelCommands = {"Walk", "Run", "Jump"};
        Camels camel = new Camels("Koluchka", "01-12-2022", camelCommands);
        camel.displayInfo();

        System.out.println();

        String[] donkeyCommands = {"Walk", "Run", "Jump"};
        Donkeys donkey = new Donkeys("Koluchka", "01-12-2022", donkeyCommands);
        donkey.displayInfo();

        System.out.println();

    }
}