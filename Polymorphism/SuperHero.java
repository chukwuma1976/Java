package Polymorphism;

public class SuperHero extends Hero{

    public SuperHero(String name, String alterEgo, String powers, String weapons) {
        super(name, alterEgo, powers, weapons);
    }

    //Overridden method
    @Override 
    public String generateProfile(String catchPhrase){
        String profile = "Code name: " + name + 
            "\n Alter ego: " + alterEgo + 
            "\n Powers: " + powers + 
            "\n Weapons: " + weapons +
            "\n Catch Phrase: " + catchPhrase;
        System.out.println(profile);
        return profile;
    }
    
}
