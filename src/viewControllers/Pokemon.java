package viewControllers;

import java.util.ArrayList;
import java.util.Random;

public class Pokemon
{



    /**
     * Instance variable
     */
    private String tipo;
    private String name;
    private String tamano;
    private int vida;
    private int nivel = 0;
    private ArrayList<habilidades> habilidades = new ArrayList<>();
    private ArrayList<Pokemon> pokemonesIguales = new ArrayList<>();

    private Pokemon evolucion;

    private int puntos = 0;


    /**
     * constructor
     */

    public Pokemon()
    {

    }

    public Pokemon(String name, String tipo, String tamano, int vida, Pokemon evolucion)
    {
        this.name = name;
        this.tipo = tipo;
        this.tamano = tamano;
        this.vida = vida;
        this.evolucion  = evolucion;
    }

    /**
     * constructor 2
     */
    public Pokemon(String name, String tipo, String tamano, int vida)
    {
        this.name = name;
        this.tipo = tipo;
        this.tamano = tamano;
        this.vida = vida;
    }

    public void addArrayHabildiades(habilidades habilidad)
    {
        habilidades.add(habilidad);
    }


    public void addPokemonesIguales(Pokemon poke)
    {
        pokemonesIguales.add(poke);
    }


    public String getName()
    {
        return name;

    }

    public int getVida()
    {
        return vida;

    }

    public String getTamano()
    {
        return tamano;

    }

    public int getNivel()
    {
        return nivel;
    }

    public String getTipo()
    {
        return tipo;
    }

    public ArrayList<habilidades> getHabilidades()
    {
        return habilidades;
    }

    public ArrayList<Pokemon> getPokemonesIguales()
    {
        return pokemonesIguales;
    }

    public Pokemon getEvolucion()
    {
        return evolucion;
    }

    public int getPuntos()
    {
        return puntos;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setVida(int vida)
    {
        this.vida = vida;
    }

    public void setTamano(String tamano)
    {
        this.tamano = tamano;
    }

    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public void setHabilidades(ArrayList habilidades)
    {
        this.habilidades = habilidades;
    }

    public void setPokemonesIguales(ArrayList pokemonesIguales)
    {
        this.pokemonesIguales = pokemonesIguales;
    }


    public void setEvolucion(Pokemon evolucion)
    {
        this.evolucion = evolucion;
    }

    public void setNivel(int nivel)
    {
        this.nivel = nivel;
    }

    public void setSumaPuntos(int puntos)
    {
        this.puntos = this.puntos + puntos;
    }

    public void setPuntos(int puntos)
    {
        this.puntos = puntos;
    }

    public habilidades getRandomHabilidad()
    {
        Random rand = new Random();
        int upperbound = habilidades.size();
        int numRandom = rand.nextInt(upperbound);


        return habilidades.get(numRandom);
    }




}
