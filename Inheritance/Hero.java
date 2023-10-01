package Inheritance;

public class Hero {
    String name, alterEgo, powers, weapons;

    public Hero (String name, String alterEgo, String powers, String weapons){
        this.name = name;
        this.alterEgo = alterEgo;
        this.powers = powers;
        this.weapons = weapons;
    }

    public String generateProfile (){
        return "Code name: " + name + 
            "\n Alter ego: " + alterEgo + 
            "\n Powers: " + powers + 
            "\n Weapons: " + weapons;
    }
}
