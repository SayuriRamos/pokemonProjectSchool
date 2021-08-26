package viewControllers;

import java.util.ArrayList;
import java.util.Random;

public class Entrenadores {

    /**
     * Instance variable
     */
    private int nivel;
    private String name;
    private String badge;

    private ArrayList<Pokemon> Pokemones = new ArrayList<>();

    /**
     * Contructor
     */
    public Entrenadores(String  name, int nivel, String badge)
    {
        this.name = name;
        this.nivel =nivel;
        this.badge = badge;
    }

    public Entrenadores()
    {

    }

    public void setNivel(int nivel)
    {
        this.nivel = nivel;
    }


    public void setName(String name)
    {
        this.name = name;
    }

    public void addPokemones(Pokemon pokemon)
    {
        Pokemones.add(pokemon);
    }

    public String getName()
    {
        return name;
    }

    public int getNivel()
    {
        return nivel;
    }

    public ArrayList<Pokemon> getPokemones()
    {
        return Pokemones;
    }

    //Método que arroja un pokemon al azar de entre los 4 pokemon del entrenador
    public Pokemon getRandomPokemon()
    {
        Random rand = new Random();
        int upperbound = Pokemones.size();
        int numRandom = rand.nextInt(upperbound);


        return Pokemones.get(numRandom);
    }

    public String getBadge() {
        return badge;
    }
}
