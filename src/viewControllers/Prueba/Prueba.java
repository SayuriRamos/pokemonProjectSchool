package viewControllers.Prueba;

import viewControllers.Entrenadores;
import viewControllers.Pokemon;
import viewControllers.habilidades;

import java.util.ArrayList;

public class Prueba {

    private static String oponentName = "";
    private static String name = "";
    private static Entrenadores whitney;


    public static void main(String[] args) {

        whitney= new Entrenadores("Whitney",25,"Plain");

        ArrayList <String> pokemonUsedByOpponent = new ArrayList<>();

        Pokemon pidgeot = new Pokemon("Pidgeot", "Normal/Volador", "Grande", 25);

        habilidades vistaLince = new habilidades("Vista Lince", 7);
        habilidades tumbos = new habilidades("Tumbos", 8);
        habilidades sacapecho = new habilidades("Sacapecho", 9);
        pidgeot.addArrayHabildiades(vistaLince);
        pidgeot.addArrayHabildiades(tumbos);
        pidgeot.addArrayHabildiades(sacapecho);


        Pokemon raticate = new Pokemon("Raticate", "Normal", "Chico", 35);

        habilidades agallas = new habilidades("Agallas", 18);
        habilidades fuga = new habilidades("fuga", 19);
        habilidades entusiasmo = new habilidades("Entusiasmo", 19);
        raticate.addArrayHabildiades(agallas);
        raticate.addArrayHabildiades(fuga);
        raticate.addArrayHabildiades(entusiasmo);


        Pokemon fearow = new Pokemon("Fearow", "Normal/Volador", "Grande", 35);

        habilidades vistaLince2 = new habilidades("Vista Lince", 17);
        habilidades francotirador = new habilidades("Francotirador", 17);
        fearow.addArrayHabildiades(vistaLince2);
        fearow.addArrayHabildiades(francotirador);


        Pokemon persian = new Pokemon("Persian", "Normal", "Chico", 35);

        habilidades nerviosismo = new habilidades("Entusiasmo", 18);
        habilidades experto = new habilidades("Experto", 21);
        habilidades flexibilidad = new habilidades("Flexibilidad", 20);
        persian.addArrayHabildiades(flexibilidad);
        persian.addArrayHabildiades(experto);
        persian.addArrayHabildiades(nerviosismo);

        whitney.addPokemones(pidgeot);
        whitney.addPokemones(raticate);
        whitney.addPokemones(fearow);
        whitney.addPokemones(persian);


        name = whitney.getRandomPokemon().getName();
        pokemonUsedByOpponent.add(name);
        System.out.println(name);

        name = whitney.getRandomPokemon().getName();
       // System.out.println("El que se va a comparar"+name);

        for(int a = 0; a< 3; a++) {
            for (int i = 0; i <= pokemonUsedByOpponent.size(); i++) {

                if (i == pokemonUsedByOpponent.size()) {
                    oponentName = name;
                    pokemonUsedByOpponent.add(name);
                    System.out.println(pokemonUsedByOpponent.get(i));

                   // System.out.println("El quese genero despues"+name);
                    break;
                }
                else if (name == pokemonUsedByOpponent.get(i)) {

                   // System.out.println("El que no "+name);
                    name = whitney.getRandomPokemon().getName();
                    //System.out.println("El que se generó nuevo "+name);
                    i = -1;

                }
            }
        }
    }
}
