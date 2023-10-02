package Inheritance;

public class Main {
    public static void main(String[] args) {
        Hero batman = new Hero("Batman", "BruceWayne", "I'm rich", "Utility belt, bullet proof bat-suit");
        MutantHero wolverine = new MutantHero("Wolverine", "Logan", "Healing Factor", "retractable Adamantium claws");
        SpeedsterHero flash = new SpeedsterHero("The Flash", "Barry Allen", "Super speed far exceeding that of light", "Electrokinesis");
        TelepathHero professorX = new TelepathHero("Professor X", "Charles Xavier", "Telepathy", "Psychic blast");

        batman.printProfile();
        wolverine.printProfile();
        flash.printProfile();
        professorX.printProfile();
    }
}
