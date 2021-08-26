package viewControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Random;


public class Motor
{

    private String userName;        //Variable donde se guarda el nombre de usuario
    private String gender;          //Variable donde se guarda el género de usuario
    private String starterPokemon;  //Variable donde se guarda el pokemon que selecciona al principio el usuario
    private Pokemon randomPokemon;  //Variable donde se almacena un Pokemon random, usado en los métodos para obtener un pokemon random de una area.
    private String oponentPokemon;  //Variable usada en el motor donde se guarda el nombre del pokemon con el que se va a pelear en la clase FightPantalla
    private int medals = 0;         //Variable donde se almacenan las medallas ganadas
    private int pokeballs = 6;      //Variable donde se almacenan las pokebolas compradas
    private int monedero = 20;      //Variable donde se almacenan las monedas que se obtienen
    private int experience = 0;      //Variable donde se almacena la experiencia del jugador
    private int nivel = 0;           //Variable donde se almacena el nivel del jugador

    private int ultraBallsOwn = 0;  //Variable donde se almacenan las UltraBalls del jugador
    private int masterBallsOwn = 0; //Variable donde se almacenan las MasterBalls del jugador
    private int greatBallsOwn = 0;  //Variable donde se almacenan las greatBalls del jugador

    private int simplePotionOwn = 3;   //Variable donde se almacenan las SimplePotion del jugador
    private int maxPotionOwn = 0;      //Variable donde se almacenan las MaxPotion del jugador
    private int superPotionOwn = 0;   //Variable donde se almacenan las SuperPotion del jugador

    private int var2 = 0;    //Variable utilizada en la clase PantallaPrincipal para contar que solo una vez se muestre el anuncio de cuando vence a todos los Entrenadores

    private Entrenadores entrenador = new Entrenadores();   //Variable que se utiliza para almacenar un entrenador


    private String areaChose = "";   //Variable donde se almacena el area que escogió para ir a pelear
    private String entrenadorChose = "";   //Variable donde se almacena el Entrenador que escogió para ir a pelear
    private String gymsOareas = "";      //Variable donde se almacena el gym que escogió para ir a pelear
    private Pokemon searchPokemon;   //Variable donde se almacena el Pokemon que escogió para ver su informacion
    private String pokedexOpp;         //Variable utilizada para saber si se accedio a la pantalla SelectPokemonToFight desde el pokedex o desde la pantalla principal


    private ArrayList<Pokemon> allPokemon = new ArrayList<Pokemon>();          //ArrayList donde se almacenan todos los Pokemones "Salvajes"
    private ArrayList<Pokemon> beltPokemon = new ArrayList<Pokemon>();        //ArrayList donde se almacenan todos los Pokemones  que se tienen en el belt
    private ArrayList<Pokemon> bankPokemon = new ArrayList<Pokemon>();         //ArrayList donde se almacenan todos los Pokemones que se tienen en el bank

    private ArrayList<Entrenadores> entrenadores = new ArrayList<Entrenadores>();      //ArrayList donde se guardan todos los entrenadores


    private ArrayList<Integer> medallasSiYaSeTienen = new ArrayList<>();    //ArrayList Donde se tienen 6 posiciones, se no ha ganado la medalla es 0 y si sí es 1, esto se utiliza en la pantallaPrincipal

    private static  ArrayList<Pokemon> desierto = new ArrayList<>();          //ArrayList donde se almacenan todos los Pokemones "Salvajes" del desierto
    private static   ArrayList<Pokemon> bosque = new ArrayList<>();         //ArrayList donde se almacenan todos los Pokemones "Salvajes" del bosque
    private static  ArrayList<Pokemon> selva = new ArrayList<>();         //ArrayList donde se almacenan todos los Pokemones "Salvajes" de la selva
    private static  ArrayList<Pokemon> playa = new ArrayList<>();          //ArrayList donde se almacenan todos los Pokemones "Salvajes" de la playa


    //Se crean los entrenadores
    private Entrenadores whitney= new Entrenadores("Whitney",25,"Plain");
    private Entrenadores brock = new Entrenadores("Brock",25,"Boulder");
    private Entrenadores pryce = new Entrenadores("Pryce",25,"Glacier");
    private Entrenadores erika = new Entrenadores("Erika",25,"Rainbow");
    private Entrenadores koga = new Entrenadores("Koga",25,"Soul");
    private Entrenadores surge = new Entrenadores("Surge",25,"Thunder");
    private Entrenadores blaine = new Entrenadores("Blaine",25,"Volcano");


    /**
     * Contructor
     */
    public Motor()
    {

    }

    //Método para obtener el starter pokemon, el gender y el user name de la pantalla inicial
    public void setStartingData(String userName, String gender, String starterPokemon) {

        System.out.println("El tamaño de all pokemons es "+allPokemon.size());
        this.gender = gender;
        this.userName = userName;
        this.starterPokemon = starterPokemon;

        medallasSiYaSeTienen.add(0);
        medallasSiYaSeTienen.add(0);
        medallasSiYaSeTienen.add(0);
        medallasSiYaSeTienen.add(0);
        medallasSiYaSeTienen.add(0);
        medallasSiYaSeTienen.add(0);
        medallasSiYaSeTienen.add(0);

        entrenadores.add(whitney);
        entrenadores.add(brock);
        entrenadores.add(pryce);
        entrenadores.add(erika);
        entrenadores.add(koga);
        entrenadores.add(surge);
        entrenadores.add(blaine);

        Pokemon copyPokemon = new Pokemon();

        copyPokemon.setName(getPokemonByName(starterPokemon).getName());

        copyPokemon.setTamano(getPokemonByName(starterPokemon).getTamano());
        copyPokemon.setTipo(getPokemonByName(starterPokemon).getTipo());
        copyPokemon.setEvolucion(getPokemonByName(starterPokemon).getEvolucion());

        copyPokemon.setVida(getPokemonByName(starterPokemon).getVida()+10);
        copyPokemon.setNivel(getPokemonByName(starterPokemon).getNivel()+1);
        copyPokemon.setPuntos(getPokemonByName(starterPokemon).getPuntos()+20);


        for(int i = 0; i< getPokemonByName(starterPokemon).getHabilidades().size(); i++)
        {
            habilidades copyHabilidades = new habilidades();
            copyHabilidades.setNombre(getPokemonByName(starterPokemon).getHabilidades().get(i).getNombre());
            copyHabilidades.setDaño(getPokemonByName(starterPokemon).getHabilidades().get(i).getDaño());

            copyPokemon.addArrayHabildiades(copyHabilidades);
        }

        beltPokemon.add(copyPokemon);
        bankPokemon.add(copyPokemon);

    }


    //Método para crear todos los pokemones y asignarles habilidades, igualmente se asignas a las áreas
    public void createAllPokemone() {


        Pokemon venusaur = new Pokemon("Venusaur", "Planta/Veneno", "Pequeño", 20);
        Pokemon ivysaur = new Pokemon("Ivysaur", "Planta/Veneno", "Pequeño", 20, venusaur);
        Pokemon bulbasaur = new Pokemon("Bulbasaur", "Planta/Veneno", "Pequeño", 10, ivysaur);

        allPokemon.add(bulbasaur);
        allPokemon.add(ivysaur);
        allPokemon.add(venusaur);


        // charmander y sus evoluciones
        Pokemon charizard = new Pokemon("Charizard", "Fuego", "mediano", 20);
        Pokemon charmeleon = new Pokemon("Charmeleon", "Fuego", "mediano", 15, charizard);
        Pokemon charmander = new Pokemon("Charmander", "Fuego", "mediano", 10, charmeleon);
        allPokemon.add(charizard);
        allPokemon.add(charmeleon);
        allPokemon.add(charmander);


        //Squirtle y sus evoluciones
        Pokemon blastoise = new Pokemon("Blastoise", "Agua", "Chico", 20);
        Pokemon wartortle = new Pokemon("Wartortle", "Agua", "Chico", 15, blastoise);
        Pokemon squirtle = new Pokemon("Squirtle", "Agua", "Chico", 10, wartortle);
        allPokemon.add(blastoise);
        allPokemon.add(wartortle);
        allPokemon.add(squirtle);


        // Caterpie y sus evoluciones
        Pokemon butterfree = new Pokemon("Butterfree", "Bicho", "Chico", 20);
        Pokemon metapod = new Pokemon("Metapod", "Bicho", "Chico", 15, butterfree);
        Pokemon caterpie = new Pokemon("Caterpie", "Bicho/Volador", "Chico", 10, metapod);
        allPokemon.add(butterfree);
        allPokemon.add(metapod);
        allPokemon.add(caterpie);


        // Weedle y sus evoluciones
        Pokemon beedrill = new Pokemon("Beedrill", "Bicho/Veneno", "Chico", 20);
        Pokemon kakuna = new Pokemon("Kakuna", "Bicho/Veneno", "Chico", 15, beedrill);
        Pokemon weedle = new Pokemon("Weedle", "Bicho/Veneno", "Chico", 10, kakuna);
        allPokemon.add(beedrill);
        allPokemon.add(kakuna);
        allPokemon.add(weedle);


        //pidgey Y sus evoluciones
        Pokemon pidgeot = new Pokemon("Pidgeot", "Normal/Volador", "Grande", 20);
        Pokemon pidgeotto = new Pokemon("Pidgeotto", "Normal/Volador", "Grande", 15, pidgeot);
        Pokemon pidgey = new Pokemon("Pidgey", "Normal/Volador", "Grande", 10, pidgeotto);
        allPokemon.add(pidgeotto);
        allPokemon.add(pidgeot);
        allPokemon.add(pidgey);

        Pokemon raticate = new Pokemon("Raticate", "Normal", "Chico", 20);
        Pokemon rattata = new Pokemon("Rattata", "Normal", "Chico", 10, raticate);
        allPokemon.add(raticate);
        allPokemon.add(rattata);

        Pokemon fearow = new Pokemon("Fearow", "Normal/Volador", "Grande", 20);
        Pokemon spearow = new Pokemon("Spearow", "Normal/Volador", "Grande", 10, fearow);
        allPokemon.add(fearow);
        allPokemon.add(spearow);

        Pokemon arbok = new Pokemon("Arbok", "Veneno", "Mediano", 20);
        Pokemon ekans = new Pokemon("Ekans", "Veneno", "Mediano", 10, arbok);
        allPokemon.add(arbok);
        allPokemon.add(ekans);


        Pokemon raichu = new Pokemon("Raichu", "Eléctrico", "Mediano", 20);
        Pokemon pikachu = new Pokemon("Pikachu", "Eléctrico", "Mediano", 10, raichu);
        allPokemon.add(raichu);
        allPokemon.add(pikachu);

        Pokemon sandslash = new Pokemon("Sandslash", "Tierra", "Mediano", 20);
        Pokemon sandshrew = new Pokemon("Sandshrew", "Tierra", "Mediano", 10, sandslash);
        allPokemon.add(sandslash);
        allPokemon.add(sandshrew);

        Pokemon nidoqueen = new Pokemon("Nidoqueen", "Veneno/Tierra", "Grande", 20);
        Pokemon nidorina = new Pokemon("Nidorina", "Veneno", "Grande", 15, nidoqueen);
        Pokemon nidoranMujer = new Pokemon("NidoranMujer", "Veneno", "Grande", 10, nidorina);
        allPokemon.add(nidoqueen);
        allPokemon.add(nidorina);
        allPokemon.add(nidoranMujer);

        Pokemon nidoking = new Pokemon("Nidoking", "Veneno/Tierra", "Grande", 20);
        Pokemon nidorino = new Pokemon("Nidorino", "Veneno", "Grande", 15, nidoking);
        Pokemon nidoranHombre = new Pokemon("NidoranHombre", "Veneno", "Grande", 10, nidorino);
        allPokemon.add(nidoking);
        allPokemon.add(nidorino);
        allPokemon.add(nidoranHombre);

        Pokemon clefable = new Pokemon("Clefable", "Normal", "Chico", 20);
        Pokemon clefairy = new Pokemon("Clefairy", "Normal", "Chico", 10, clefable);
        allPokemon.add(clefable);
        allPokemon.add(clefairy);

        Pokemon ninetales = new Pokemon("Ninetales", "Fuego", "Chico", 20);
        Pokemon vulpix = new Pokemon("Vulpix", "Fuego", "Chico", 10, ninetales);
        allPokemon.add(ninetales);
        allPokemon.add(vulpix);

        Pokemon wigglytuff = new Pokemon("Wigglytuff", "Normal ", "Chico", 20);
        Pokemon jigglypuff = new Pokemon("Jigglypuff", "Normal ", "Chico", 10, wigglytuff);
        allPokemon.add(wigglytuff);
        allPokemon.add(jigglypuff);

        Pokemon golbat = new Pokemon("Golbat", "Veneno/Volador  ", "Chico", 20);
        Pokemon zubat = new Pokemon("Zubat", "Veneno/Volador ", "Mediano", 10, golbat);
        allPokemon.add(golbat);
        allPokemon.add(zubat);

        Pokemon parasect = new Pokemon("Parasect", " Bicho/Planta", "Chico", 20);
        Pokemon paras = new Pokemon("Paras", " Bicho/Planta ", "Chico", 10, parasect);
        allPokemon.add(parasect);
        allPokemon.add(paras);


        Pokemon vileplume = new Pokemon("Vileplume", "Planta/Veneno", "Mediano", 20);
        Pokemon gloom = new Pokemon("Gloom", "Planta/Veneno", "Chico", 15, vileplume);
        Pokemon oddish = new Pokemon("Oddish", "Planta/Veneno", "Chico", 10, gloom);
        allPokemon.add(vileplume);
        allPokemon.add(gloom);
        allPokemon.add(oddish);

        Pokemon venomoth = new Pokemon("Venomoth", "Bicho/Veneno", "Chico", 20);
        Pokemon venonat = new Pokemon("Venonat", "Bicho/Veneno", "Chico", 10, venomoth);
        allPokemon.add(venomoth);
        allPokemon.add(venonat);

        Pokemon dugtrio = new Pokemon("Dugtrio", "Tierra", "Chico", 20);
        Pokemon diglett = new Pokemon("Diglett", "Tierra", "Chico", 10, dugtrio);
        allPokemon.add(dugtrio);
        allPokemon.add(diglett);

        Pokemon persian = new Pokemon("Persian", "Normal", "Chico", 20);
        Pokemon meowth = new Pokemon("Meowth", "Normal", "Chico", 10, persian);
        allPokemon.add(persian);
        allPokemon.add(meowth);

        Pokemon golduck = new Pokemon("Golduck", "Agua ", "Grande", 20);
        Pokemon psyduck = new Pokemon("Psyduck", "Agua", "Chico", 10, golduck);
        allPokemon.add(golduck);
        allPokemon.add(psyduck);

        Pokemon primeape = new Pokemon("Primeape", "Lucha ", "Grande", 20);
        Pokemon mankey = new Pokemon("Mankey", "Lucha ", "Mediano", 10, primeape);
        allPokemon.add(mankey);
        allPokemon.add(primeape);

        Pokemon arcanine = new Pokemon("Arcanine", "Fuego ", "Grande", 20);
        Pokemon growlithe = new Pokemon("Growlithe", "Fuego ", "Grande", 10, arcanine);
        allPokemon.add(growlithe);
        allPokemon.add(arcanine);

        Pokemon poliwrath = new Pokemon("Poliwrath", "Agua/Lucha ", "Grande", 20);
        Pokemon poliwhirl = new Pokemon("Poliwhirl", "Agua ", "Mediano", 15, poliwrath);
        Pokemon poliwag = new Pokemon("Poliwag", "Agua ", "Chico", 10, poliwhirl);
        allPokemon.add(poliwrath);
        allPokemon.add(poliwhirl);
        allPokemon.add(poliwag);

        Pokemon alakazam = new Pokemon("Alakazam", "Psíquico ", "Grande", 20);
        Pokemon kadabra = new Pokemon("Kadabra", "Psíquico ", "Mediano", 15, alakazam);
        Pokemon abra = new Pokemon("Abra", "Psíquico ", "Chico", 10, kadabra);
        allPokemon.add(alakazam);
        allPokemon.add(kadabra);
        allPokemon.add(abra);

        Pokemon machamp = new Pokemon("Machamp", "Lucha ", "Grande", 20);
        Pokemon machoke = new Pokemon("Machoke", "Lucha ", "Mediano", 15, machamp);
        Pokemon machop = new Pokemon("Machop", "Lucha ", "Chico", 10, machoke);
        allPokemon.add(machamp);
        allPokemon.add(machoke);
        allPokemon.add(machop);

        Pokemon victreebel = new Pokemon("Victreebel", "Planta/Veneno ", "Grande", 20);
        Pokemon weepinbell = new Pokemon("Weepinbell", "Planta/Veneno ", "Chico", 15, victreebel);
        Pokemon bellsprout = new Pokemon("Bellsprout", "Planta/Veneno ", "Chico", 10, weepinbell);
        allPokemon.add(victreebel);
        allPokemon.add(weepinbell);
        allPokemon.add(bellsprout);

        Pokemon tentacruel = new Pokemon("Tentacruel", " Agua/Veneno", "Grande", 20);
        Pokemon tentacool = new Pokemon("Tentacool", " Agua/Veneno ", "Mediano", 10, tentacruel);
        allPokemon.add(tentacruel);
        allPokemon.add(tentacool);

        Pokemon golem = new Pokemon("Golem", "Roca/Tierra ", "Mediano", 20);
        Pokemon graveler = new Pokemon("Graveler", "Roca/Tierra ", "Chico", 15, golem);
        Pokemon geodude = new Pokemon("Geodude", "Roca/Tierra ", "Chico", 10, graveler);
        allPokemon.add(golem);
        allPokemon.add(graveler);
        allPokemon.add(geodude);


        Pokemon rapidash = new Pokemon("Rapidash", "Fuego ", "Chico", 20);
        Pokemon ponyta = new Pokemon("Ponyta", "Fuego ", "Chico", 10, rapidash);
        allPokemon.add(rapidash);
        allPokemon.add(ponyta);

        Pokemon slowbro = new Pokemon("Slowbro", " Agua/Psíquico ", "Grande", 20);
        Pokemon slowpoke = new Pokemon("Slowpoke", " Agua/Psíquico ", "Grande", 10, slowbro);
        allPokemon.add(slowbro);
        allPokemon.add(slowpoke);

        Pokemon magneton = new Pokemon("Magneton", "Eléctrico/Acero ", "Mediano", 20);
        Pokemon magnemite = new Pokemon("Magnemite", "Eléctrico ", "Chico", 10, magneton);
        allPokemon.add(magneton);
        allPokemon.add(magnemite);

        Pokemon dodrio = new Pokemon("Dodrio", "Normal/Volador ", "Grande", 20);
        Pokemon doduo = new Pokemon("Doduo", "Normal/Volador ", "cHICO", 15, dodrio);
        Pokemon farfetchd = new Pokemon("Farfetchd", "Normal/Volador ", "Mediano", 10, doduo);
        allPokemon.add(dodrio);
        allPokemon.add(doduo);
        allPokemon.add(farfetchd);

        Pokemon dewgong = new Pokemon("Dewgong", "Agua/Hielo ", "Grande", 20);
        Pokemon seel = new Pokemon("Seel", "Agua ", "Chico", 10, dewgong);
        allPokemon.add(dewgong);
        allPokemon.add(seel);

        Pokemon muk = new Pokemon("Muk", "Agua ", "Chico", 20);
        Pokemon grimer = new Pokemon("Grimer", "Agua ", "Chico", 10, muk);
        allPokemon.add(muk);
        allPokemon.add(grimer);

        Pokemon cloyster = new Pokemon("Cloyster", "Agua/Hielo ", "Grande", 20);
        Pokemon shellder = new Pokemon("Shellder", "Agua ", "Chico", 10, cloyster);
        allPokemon.add(shellder);
        allPokemon.add(cloyster);

        Pokemon gengar = new Pokemon("Gengar", "Fantasma/Veneno ", "Grande", 20);
        Pokemon haunter = new Pokemon("Haunter", "Fantasma/Veneno ", "Mediano", 15, gengar);
        Pokemon gastly = new Pokemon("Gastly", "Fantasma/Veneno ", "Chico", 10, haunter);
        allPokemon.add(gastly);
        allPokemon.add(haunter);
        allPokemon.add(gengar);

        Pokemon onix = new Pokemon("Onix", "Roca/Tierra ", "Mediano", 15);
        allPokemon.add(onix);

        Pokemon hypno = new Pokemon("Hypno", "Psíquico ", "Grande", 20);
        Pokemon drowzee = new Pokemon("Drowzee", "Psíquico ", "Grande", 10, hypno);
        allPokemon.add(drowzee);
        allPokemon.add(hypno);

        Pokemon kingler = new Pokemon("Kingler", "Agua ", "Grande", 20);
        Pokemon krabby = new Pokemon("Krabby", "Agua ", "Chico", 10, kingler);
        allPokemon.add(krabby);
        allPokemon.add(kingler);

        Pokemon electrode = new Pokemon("Electrode", "Eléctrico ", "Chico", 20);
        Pokemon voltorb = new Pokemon("Voltorb", "Eléctrico ", "Chico", 10, electrode);
        allPokemon.add(voltorb);
        allPokemon.add(electrode);

        Pokemon exeggutor = new Pokemon("Exeggutor", "Planta/Psíquico ", "Grande", 20);
        Pokemon exeggcute = new Pokemon("Exeggcute", "Planta/Psíquico ", "Chico", 10, exeggutor);
        allPokemon.add(exeggcute);
        allPokemon.add(exeggutor);

        Pokemon marowak = new Pokemon("Marowak", "Tierra ", "Grande", 20);
        Pokemon cubone = new Pokemon("Cubone", "Tierra ", "Grande", 10, marowak);
        allPokemon.add(cubone);
        allPokemon.add(marowak);

        Pokemon hitmonlee = new Pokemon("Hitmonlee", "Lucha ", "Grande", 15);
        allPokemon.add(hitmonlee);

        Pokemon hitmonchan = new Pokemon("Hitmonchan", "Lucha ", "Grande", 15);
        allPokemon.add(hitmonchan);

        Pokemon weezing = new Pokemon("Weezing", "Agua ", "Grande", 20);
        Pokemon koffing = new Pokemon("Koffing", "Agua ", "Grande", 15, weezing);
        Pokemon lickitung = new Pokemon("Lickitung", "Agua ", "Grande", 10, koffing);
        allPokemon.add(weezing);
        allPokemon.add(koffing);
        allPokemon.add(lickitung);

        Pokemon rhydon = new Pokemon("Rhydon", "Tierra/Roca ", "Grande", 20);
        Pokemon rhyhorn = new Pokemon("Rhyhorn", "Tierra/Roca ", "Chico", 15, rhydon);
        allPokemon.add(rhydon);
        allPokemon.add(rhyhorn);

        Pokemon chansey = new Pokemon("Chansey", "Normal ", "Chico", 15);
        allPokemon.add(chansey);

        Pokemon tangela = new Pokemon("Tangela", "Planta ", "Chico", 15);
        allPokemon.add(tangela);

        Pokemon kangaskhan = new Pokemon("Kangaskhan", "Normal ", "Grande", 15);
        allPokemon.add(kangaskhan);

        Pokemon seadra = new Pokemon("Seadra", "Agua ", "Chico", 20);
        Pokemon horsea = new Pokemon("Horsea", "Agua ", "Chico", 10, seadra);
        allPokemon.add(horsea);
        allPokemon.add(seadra);

        Pokemon seaking = new Pokemon("Seaking", "Agua ", "Grande", 20);
        Pokemon goldeen = new Pokemon("Goldeen", "Agua ", "Chico", 10, seaking);
        allPokemon.add(seaking);
        allPokemon.add(goldeen);

        Pokemon starmie = new Pokemon("Starmie", "Agua ", "Chico", 20);
        Pokemon staryu = new Pokemon("Staryu", "Agua/Psíquico ", "Chico", 10, starmie);
        allPokemon.add(starmie);
        allPokemon.add(staryu);

        Pokemon mrMime = new Pokemon("MrMime", "Psíquico  ", "Grande", 15);
        allPokemon.add(mrMime);

        Pokemon scyther = new Pokemon("Scyther", "Bicho/Volador ", "Mediano", 15);
        allPokemon.add(scyther);

        Pokemon jynx = new Pokemon("Jynx", " Hielo/Psíquico ", "Mediano", 15);
        allPokemon.add(jynx);

        Pokemon electabuzz = new Pokemon("Electabuzz", "Eléctrico ", "Grande", 15);
        allPokemon.add(electabuzz);

        Pokemon magmar = new Pokemon("Magmar", "Fuego ", "Grande", 15);
        allPokemon.add(magmar);

        Pokemon pinsir = new Pokemon("Pinsir", "Bicho ", "Mediano", 15);
        allPokemon.add(pinsir);

        Pokemon tauros = new Pokemon("Tauros", "Normal ", "Grande", 15);
        allPokemon.add(tauros);

        Pokemon gyarados = new Pokemon("Gyarados", "Agua/Volador ", "Grande", 20);
        Pokemon magikarp = new Pokemon("Magikarp", "Agua ", "Mediano", 10, gyarados);
        allPokemon.add(magikarp);
        allPokemon.add(gyarados);

        Pokemon lapras = new Pokemon("Lapras", "Agua/Hielo ", "Grande", 15);
        allPokemon.add(lapras);

        Pokemon ditto = new Pokemon("Ditto", "Normal", "Chcico", 15);
        allPokemon.add(ditto);

        Pokemon eevee   = new Pokemon("Eevee", "Normal ", "Chcico",15);
        allPokemon.add(eevee);

        Pokemon vaporeon  = new Pokemon("Vaporeon", "Agua ", "Mediano",15);
        allPokemon.add(vaporeon);

        Pokemon jolteon  = new Pokemon("Jolteon", "Eléctrico ", "Mediano",15);
        allPokemon.add(jolteon);

        Pokemon flareon  = new Pokemon("Flareon", "Fuego ", "Mediano",15);
        allPokemon.add(flareon);

        Pokemon porygon  = new Pokemon("Porygon", "Normal ", "Chico",15);
        allPokemon.add(porygon);

        Pokemon omastar  = new Pokemon("Omastar", "Roca/Agua ", "Chico",20);
        Pokemon omanyte  = new Pokemon("Omanyte", "Roca/Agua ", "Chco",10, omastar);
        allPokemon.add(omanyte);
        allPokemon.add(omastar);

        Pokemon kabutops  = new Pokemon("Kabutops", "Roca/Agua ", "Grande",20);
        Pokemon kabuto  = new Pokemon("Kabuto", "Roca/Agua ", "Chico",10, kabutops);
        allPokemon.add(kabuto);
        allPokemon.add(kabutops);

        Pokemon aerodactyl  = new Pokemon("Aerodactyl", "Roca/Volador ", "Grande",15);
        allPokemon.add(aerodactyl);

        Pokemon snorlax  = new Pokemon("Snorlax", "Normal ", "Grande",15);
        allPokemon.add(snorlax);

        Pokemon articuno  = new Pokemon("Articuno", "Hielo/Volador ", "Grande",15);
        allPokemon.add(articuno);

        Pokemon zapdos  = new Pokemon("Zapdos", "Eléctrico/Volador ", "Grande",15);
        allPokemon.add(zapdos);

        Pokemon moltres  = new Pokemon("Moltres", "Fuego/Volador ", "Grande",15);
        allPokemon.add(moltres);

        Pokemon dragonite  = new Pokemon("Dragonite", "Dragón/Volador ", "Grande",20);
        Pokemon dragonair  = new Pokemon("Dragonair", "Dragón ", "Grande",15,dragonite);
        Pokemon dratini  = new Pokemon("Dratini", "Dragón ", "Grande",10, dragonair);
        allPokemon.add(dratini);
        allPokemon.add(dragonair);
        allPokemon.add(dragonite);

        Pokemon mewtwo  = new Pokemon("Mewtwo", "Psíquico ", "Grande",20);
        allPokemon.add(mewtwo);

        Pokemon mew  = new Pokemon("Mew", "Psíquico ", "Chico",20);
        allPokemon.add(mew);




        //Asignacion de habilidades

        //Bulbasaur y sus evoluciones
        habilidades espesura = new habilidades("Espesura", 3);
        habilidades clorifila = new habilidades("Clorifila", 4);

        venusaur.addArrayHabildiades(espesura);
        venusaur.addArrayHabildiades(clorifila);

        ivysaur.addArrayHabildiades(espesura);
        ivysaur.addArrayHabildiades(clorifila);

        bulbasaur.addArrayHabildiades(espesura);
        bulbasaur.addArrayHabildiades(clorifila);


        //charmander y sus evoluciones

        habilidades marLlamas = new habilidades("Mar llamas", 4);
        habilidades poderSolar = new habilidades("Poder solar", 5);

        charizard.addArrayHabildiades(marLlamas);
        charizard.addArrayHabildiades(poderSolar);

        charmeleon.addArrayHabildiades(marLlamas);
        charmeleon.addArrayHabildiades(poderSolar);

        charmander.addArrayHabildiades(marLlamas);
        charmander.addArrayHabildiades(poderSolar);


        //squirtle y sus evoluciones

        habilidades curaLluvia = new habilidades("Cura lluvia", 6);
        habilidades torrente = new habilidades("Torrente", 4);

        blastoise.addArrayHabildiades(curaLluvia);
        blastoise.addArrayHabildiades(torrente);

        wartortle.addArrayHabildiades(curaLluvia);
        wartortle.addArrayHabildiades(torrente);

        squirtle.addArrayHabildiades(curaLluvia);
        squirtle.addArrayHabildiades(torrente);


        //caterpie y sus evoluciones

        habilidades ojoCompuesto = new habilidades("Cura lluvia", 6);
        habilidades cromolente = new habilidades("Torrente", 4);
        habilidades mudar = new habilidades("Mudar", 4);
        habilidades polvoEscudo = new habilidades("Polvo escudo", 4);
        habilidades fuga = new habilidades("fuga", 4);

        butterfree.addArrayHabildiades(ojoCompuesto);
        butterfree.addArrayHabildiades(cromolente);

        metapod.addArrayHabildiades(mudar);

        caterpie.addArrayHabildiades(polvoEscudo);
        caterpie.addArrayHabildiades(fuga);


        //pidgey y sus evoluciones

        habilidades enjambre = new habilidades("Enjambre", 3);
        habilidades francotirador = new habilidades("Francotirador", 2);

        beedrill.addArrayHabildiades(enjambre);
        beedrill.addArrayHabildiades(francotirador);

        kakuna.addArrayHabildiades(mudar);

        weedle.addArrayHabildiades(polvoEscudo);
        weedle.addArrayHabildiades(fuga);

        habilidades vistaLince = new habilidades("Vista Lince", 2);
        habilidades tumbos = new habilidades("Tumbos", 3);
        habilidades sacapecho = new habilidades("Sacapecho", 4);

        pidgeot.addArrayHabildiades(vistaLince);
        pidgeot.addArrayHabildiades(tumbos);
        pidgeot.addArrayHabildiades(sacapecho);

        pidgeotto.addArrayHabildiades(vistaLince);
        pidgeotto.addArrayHabildiades(tumbos);
        pidgeotto.addArrayHabildiades(sacapecho);

        pidgey.addArrayHabildiades(vistaLince);
        pidgey.addArrayHabildiades(tumbos);
        pidgey.addArrayHabildiades(sacapecho);


        // Rattata y sus evoluciones
        habilidades agallas = new habilidades("Agallas", 3);
        habilidades entusiasmo = new habilidades("Entusiasmo", 4);

        raticate.addArrayHabildiades(agallas);
        raticate.addArrayHabildiades(fuga);
        raticate.addArrayHabildiades(entusiasmo);

        rattata.addArrayHabildiades(agallas);
        rattata.addArrayHabildiades(fuga);
        rattata.addArrayHabildiades(entusiasmo);


        // Spearow y sus evoluciones
        fearow.addArrayHabildiades(vistaLince);
        fearow.addArrayHabildiades(francotirador);

        spearow.addArrayHabildiades(vistaLince);
        spearow.addArrayHabildiades(francotirador);


        // Ekans y sus evoluciones
        habilidades intimidacion = new habilidades("Intimidacion", 5);
        habilidades nerviosismo = new habilidades("Nerviosismo", 3);

        arbok.addArrayHabildiades(intimidacion);
        arbok.addArrayHabildiades(mudar);
        arbok.addArrayHabildiades(nerviosismo);

        ekans.addArrayHabildiades(intimidacion);
        ekans.addArrayHabildiades(mudar);
        ekans.addArrayHabildiades(nerviosismo);


        // Pikachu y sus evoluciones
        habilidades electricidadEstatica = new habilidades("Electricidad Estática", 4);
        habilidades pararrayos = new habilidades("Pararrayos", 3);

        raichu.addArrayHabildiades(electricidadEstatica);
        raichu.addArrayHabildiades(pararrayos);

        pikachu.addArrayHabildiades(electricidadEstatica);
        pikachu.addArrayHabildiades(pararrayos);


        // Sandshrew y sus evoluciones
        habilidades veloArena = new habilidades("Velo Arena", 7);
        habilidades impetuArena = new habilidades("ímpetu Arena", 3);

        sandslash.addArrayHabildiades(veloArena);
        sandslash.addArrayHabildiades(impetuArena);

        sandshrew.addArrayHabildiades(veloArena);
        sandshrew.addArrayHabildiades(impetuArena);


        // NidoranMujer y sus evoluciones
        habilidades puntoToxico = new habilidades("Punto Tóxico", 4);
        habilidades rivalidad = new habilidades("Rivalidad", 3);
        habilidades potenciaBruta = new habilidades("Potencia Bruta", 3);

        nidoqueen.addArrayHabildiades(puntoToxico);
        nidoqueen.addArrayHabildiades(rivalidad);
        nidoqueen.addArrayHabildiades(potenciaBruta);

        nidorina.addArrayHabildiades(puntoToxico);
        nidorina.addArrayHabildiades(rivalidad);
        nidorina.addArrayHabildiades(entusiasmo);

        nidoranMujer.addArrayHabildiades(puntoToxico);
        nidoranMujer.addArrayHabildiades(rivalidad);
        nidoranMujer.addArrayHabildiades(entusiasmo);


        // NidoranHombre y sus evoluciones
        nidoking.addArrayHabildiades(puntoToxico);
        nidoking.addArrayHabildiades(rivalidad);
        nidoking.addArrayHabildiades(potenciaBruta);

        nidorino.addArrayHabildiades(puntoToxico);
        nidorino.addArrayHabildiades(rivalidad);
        nidorino.addArrayHabildiades(entusiasmo);

        nidoranHombre.addArrayHabildiades(puntoToxico);
        nidoranHombre.addArrayHabildiades(rivalidad);
        nidoranHombre.addArrayHabildiades(entusiasmo);


        // Clefairy y sus evoluciones
        habilidades ignorante = new habilidades("Ignorante", 6);
        habilidades muroMagico = new habilidades("Muro Mágico", 5);
        habilidades granEncanto = new habilidades("Gran Encanto", 3);

        clefable.addArrayHabildiades(ignorante);
        clefable.addArrayHabildiades(muroMagico);
        clefable.addArrayHabildiades(granEncanto);

        clefairy.addArrayHabildiades(ignorante);
        clefairy.addArrayHabildiades(rivalidad);
        clefairy.addArrayHabildiades(granEncanto);


        // Vulpix y sus evoluciones
        habilidades absorbeFuego = new habilidades("AbsorbeFuego", 5);
        habilidades sequia = new habilidades("Sequia", 3);

        ninetales.addArrayHabildiades(absorbeFuego);
        ninetales.addArrayHabildiades(sequia);

        vulpix.addArrayHabildiades(absorbeFuego);
        vulpix.addArrayHabildiades(sequia);


        // Sandshrew y sus evoluciones
        habilidades tenacidad = new habilidades("Tenacidad", 5);
        habilidades cacheo = new habilidades("Cacheo", 3);

        wigglytuff.addArrayHabildiades(granEncanto);
        wigglytuff.addArrayHabildiades(tenacidad);
        wigglytuff.addArrayHabildiades(cacheo);

        jigglypuff.addArrayHabildiades(granEncanto);
        jigglypuff.addArrayHabildiades(tenacidad);
        jigglypuff.addArrayHabildiades(cacheo);


        //Zubat yssus evoluciones
        habilidades focoInterno = new habilidades("Foco Interno", 5);
        habilidades allanamiento = new habilidades("Allanamiento", 3);

        golbat.addArrayHabildiades(focoInterno);
        golbat.addArrayHabildiades(allanamiento);

        zubat.addArrayHabildiades(focoInterno);
        zubat.addArrayHabildiades(allanamiento);


        //Oddish y sus evoluciones
        habilidades efectoEspora = new habilidades("Efecto Espora", 5);
        habilidades hedor = new habilidades("Hedor", 3);

        vileplume.addArrayHabildiades(clorifila);
        vileplume.addArrayHabildiades(efectoEspora);

        gloom.addArrayHabildiades(clorifila);
        gloom.addArrayHabildiades(hedor);

        oddish.addArrayHabildiades(clorifila);
        oddish.addArrayHabildiades(fuga);


        //Paras y sus evoluciones
        habilidades pielSeca = new habilidades("Piel Seca", 5);
        habilidades humedad = new habilidades("Humedad", 3);

        parasect.addArrayHabildiades(efectoEspora);
        parasect.addArrayHabildiades(pielSeca);
        parasect.addArrayHabildiades(humedad);

        paras.addArrayHabildiades(efectoEspora);
        paras.addArrayHabildiades(pielSeca);
        paras.addArrayHabildiades(humedad);


        //Venonat y sus evoluciones
        habilidades pielMilagro = new habilidades("Piel Milagro", 3);

        venomoth.addArrayHabildiades(polvoEscudo);
        venomoth.addArrayHabildiades(cromolente);
        venomoth.addArrayHabildiades(pielMilagro);

        venonat.addArrayHabildiades(ojoCompuesto);
        venonat.addArrayHabildiades(cromolente);
        venonat.addArrayHabildiades(fuga);


        //Diglett y sus evoluciones
        habilidades trampaArena = new habilidades("Trampa Arena", 3);
        habilidades poderArena = new habilidades("Poder Arena", 4);

        dugtrio.addArrayHabildiades(trampaArena);
        dugtrio.addArrayHabildiades(veloArena);
        dugtrio.addArrayHabildiades(poderArena);

        diglett.addArrayHabildiades(trampaArena);
        diglett.addArrayHabildiades(veloArena);
        diglett.addArrayHabildiades(poderArena);


        //Meowth y sus evoluciones
        habilidades recogida = new habilidades("Recogida", 4);
        habilidades experto = new habilidades("Experto", 6);
        habilidades flexibilidad = new habilidades("Flexibilidad", 5);

        persian.addArrayHabildiades(flexibilidad);
        persian.addArrayHabildiades(experto);
        persian.addArrayHabildiades(nerviosismo);

        meowth.addArrayHabildiades(recogida);
        meowth.addArrayHabildiades(experto);
        meowth.addArrayHabildiades(nerviosismo);

        //Psyduck y sus evoluciones
        habilidades aclimatacion = new habilidades("Aclimatacion", 4);
        habilidades nadoRapido = new habilidades("NadoRapido", 6);

        golduck.addArrayHabildiades(aclimatacion);
        golduck.addArrayHabildiades(humedad);
        golduck.addArrayHabildiades(nadoRapido);

        psyduck.addArrayHabildiades(aclimatacion);
        psyduck.addArrayHabildiades(humedad);
        psyduck.addArrayHabildiades(nadoRapido);


        //Mankey y sus evoluciones
        habilidades espirituVital = new habilidades("EspirituVital", 4);
        habilidades irascible = new habilidades("Irascible", 6);
        habilidades competitivo = new habilidades("Competitivo", 4);

        primeape.addArrayHabildiades(espirituVital);
        primeape.addArrayHabildiades(irascible);
        primeape.addArrayHabildiades(competitivo);

        mankey.addArrayHabildiades(espirituVital);
        mankey.addArrayHabildiades(irascible);
        mankey.addArrayHabildiades(competitivo);

        //Growlithe y sus evoluciones
        habilidades justiciero = new habilidades("Justiciero", 3);

        arcanine.addArrayHabildiades(absorbeFuego);
        arcanine.addArrayHabildiades(intimidacion);
        arcanine.addArrayHabildiades(justiciero);

        growlithe.addArrayHabildiades(absorbeFuego);
        growlithe.addArrayHabildiades(intimidacion);
        growlithe.addArrayHabildiades(justiciero);


        //Poliwag y sus evoluciones
        habilidades absorbeAgua = new habilidades("Absorbe Agua", 3);

        poliwrath.addArrayHabildiades(absorbeAgua);
        poliwrath.addArrayHabildiades(humedad);
        poliwrath.addArrayHabildiades(nadoRapido);

        poliwhirl.addArrayHabildiades(absorbeAgua);
        poliwhirl.addArrayHabildiades(humedad);
        poliwhirl.addArrayHabildiades(nadoRapido);

        poliwag.addArrayHabildiades(absorbeAgua);
        poliwag.addArrayHabildiades(humedad);
        poliwag.addArrayHabildiades(nadoRapido);


        //Abra y sus evoluciones
        habilidades sincronia = new habilidades("Sincronía", 5);

        alakazam.addArrayHabildiades(sincronia);
        alakazam.addArrayHabildiades(focoInterno);
        alakazam.addArrayHabildiades(muroMagico);

        kadabra.addArrayHabildiades(sincronia);
        kadabra.addArrayHabildiades(focoInterno);
        kadabra.addArrayHabildiades(muroMagico);

        abra.addArrayHabildiades(sincronia);
        abra.addArrayHabildiades(focoInterno);
        abra.addArrayHabildiades(muroMagico);


        //Machop y sus evoluciones
        habilidades indefenso = new habilidades("Indefenso", 5);
        habilidades impasible = new habilidades("Impasible", 4);

        machamp.addArrayHabildiades(agallas);
        machamp.addArrayHabildiades(indefenso);
        machamp.addArrayHabildiades(impasible);

        machoke.addArrayHabildiades(agallas);
        machoke.addArrayHabildiades(indefenso);
        machoke.addArrayHabildiades(impasible);

        machop.addArrayHabildiades(agallas);
        machop.addArrayHabildiades(indefenso);
        machop.addArrayHabildiades(impasible);


        //Bellsprout y sus evoluciones
        habilidades gula = new habilidades("Gula", 6);
        habilidades clorofila = new habilidades("Clorofila", 5);

        victreebel.addArrayHabildiades(gula);
        victreebel.addArrayHabildiades(clorofila);

        weepinbell.addArrayHabildiades(gula);
        weepinbell.addArrayHabildiades(clorofila);

        bellsprout.addArrayHabildiades(gula);
        bellsprout.addArrayHabildiades(clorofila);


        //Tentacool y sus evoluciones
        habilidades cuerpoPuro = new habilidades("Cuerpo Puro", 5);
        habilidades lodoLiquido = new habilidades("Lodo Líquido", 6);

        tentacruel.addArrayHabildiades(cuerpoPuro);
        tentacruel.addArrayHabildiades(lodoLiquido);
        tentacruel.addArrayHabildiades(curaLluvia);

        tentacool.addArrayHabildiades(cuerpoPuro);
        tentacool.addArrayHabildiades(lodoLiquido);
        tentacool.addArrayHabildiades(curaLluvia);


        //Geodude
        habilidades cabezaRoca = new habilidades("Cabeza Roca", 5);
        habilidades robustez = new habilidades("Robustez", 4);

        golem.addArrayHabildiades(veloArena);
        golem.addArrayHabildiades(robustez);
        golem.addArrayHabildiades(cabezaRoca);

        graveler.addArrayHabildiades(veloArena);
        graveler.addArrayHabildiades(robustez);
        graveler.addArrayHabildiades(cabezaRoca);

        geodude.addArrayHabildiades(veloArena);
        geodude.addArrayHabildiades(robustez);
        geodude.addArrayHabildiades(cabezaRoca);


        //Ponyta y sus evoluciones
        habilidades cuerpoLlama = new habilidades("Cuerpo Llama", 5);

        rapidash.addArrayHabildiades(fuga);
        rapidash.addArrayHabildiades(absorbeFuego);
        rapidash.addArrayHabildiades(cuerpoLlama);

        ponyta.addArrayHabildiades(fuga);
        ponyta.addArrayHabildiades(absorbeFuego);
        ponyta.addArrayHabildiades(cuerpoLlama);


        //Slowpoke y sus evoluciones
        habilidades despiste = new habilidades("Despiste", 3);
        habilidades ritmoPropio = new habilidades("Ritmo Propio", 6);
        habilidades regeneracion = new habilidades("Regeneracion", 5);

        slowbro.addArrayHabildiades(despiste);
        slowbro.addArrayHabildiades(ritmoPropio);
        slowbro.addArrayHabildiades(regeneracion);

        slowpoke.addArrayHabildiades(despiste);
        slowpoke.addArrayHabildiades(ritmoPropio);
        slowpoke.addArrayHabildiades(regeneracion);


        //Magnemite y sus evoluciones
        habilidades iman = new habilidades("Imán", 3);
        habilidades calculoFinal = new habilidades("Cálculo Final", 6);

        magneton.addArrayHabildiades(iman);
        magneton.addArrayHabildiades(robustez);
        magneton.addArrayHabildiades(calculoFinal);

        magnemite.addArrayHabildiades(iman);
        magnemite.addArrayHabildiades(robustez);
        magnemite.addArrayHabildiades(calculoFinal);


        //Farfetch’d y sus evoluciones
        habilidades madrugar = new habilidades("Madrugar", 3);

        dodrio.addArrayHabildiades(fuga);
        dodrio.addArrayHabildiades(madrugar);
        dodrio.addArrayHabildiades(tumbos);

        doduo.addArrayHabildiades(fuga);
        doduo.addArrayHabildiades(madrugar);
        doduo.addArrayHabildiades(tumbos);

        farfetchd.addArrayHabildiades(vistaLince);
        farfetchd.addArrayHabildiades(focoInterno);
        farfetchd.addArrayHabildiades(competitivo);


        // Seel y sus evoluciones
        habilidades sebo = new habilidades("Sebo", 5);
        habilidades hidratacion = new habilidades("Hidratacion", 4);
        habilidades gelido = new habilidades("Gélido", 4);

        dewgong.addArrayHabildiades(sebo);
        dewgong.addArrayHabildiades(hidratacion);
        dewgong.addArrayHabildiades(gelido);

        seel.addArrayHabildiades(sebo);
        seel.addArrayHabildiades(hidratacion);
        seel.addArrayHabildiades(gelido);


        //Grimer y sus evoluciones
        habilidades toqueToxico = new habilidades("Toque TVxico", 4);
        habilidades viscosidad = new habilidades("Viscosidad", 5);

        muk.addArrayHabildiades(hedor);
        muk.addArrayHabildiades(viscosidad);
        muk.addArrayHabildiades(toqueToxico);

        grimer.addArrayHabildiades(hedor);
        grimer.addArrayHabildiades(viscosidad);
        grimer.addArrayHabildiades(toqueToxico);


        // Shellder y sus evoluciones
        habilidades caparazon = new habilidades("Caparazon", 4);
        habilidades encadenado = new habilidades("Encadenado", 5);
        habilidades funda = new habilidades("Funda", 3);

        cloyster.addArrayHabildiades(caparazon);
        cloyster.addArrayHabildiades(encadenado);
        cloyster.addArrayHabildiades(funda);

        shellder.addArrayHabildiades(caparazon);
        shellder.addArrayHabildiades(encadenado);
        shellder.addArrayHabildiades(funda);


        //Gastly y sus evoluciones
        habilidades levitacion = new habilidades("Levitación", 6);
        habilidades cuerpoMaldito = new habilidades("Cuerpo Maldito", 4);

        gengar.addArrayHabildiades(cuerpoMaldito);

        gastly.addArrayHabildiades(levitacion);

        haunter.addArrayHabildiades(levitacion);


        //Onix
        habilidades armaduraFragil = new habilidades("Armadura Frágil", 4);

        onix.addArrayHabildiades(cabezaRoca);
        onix.addArrayHabildiades(robustez);
        onix.addArrayHabildiades(armaduraFragil);


        // Drowzee y su evolución
        habilidades insomnio = new habilidades("Insomnio", 4);
        habilidades alerta = new habilidades("Alerta", 5);

        hypno.addArrayHabildiades(insomnio);
        hypno.addArrayHabildiades(alerta);
        hypno.addArrayHabildiades(focoInterno);

        drowzee.addArrayHabildiades(insomnio);
        drowzee.addArrayHabildiades(alerta);
        drowzee.addArrayHabildiades(focoInterno);



        //Krabby y sus evoluciones
        habilidades corteFuerte = new habilidades("Corte Fuerte", 5);

        kingler.addArrayHabildiades(caparazon);
        kingler.addArrayHabildiades(corteFuerte);
        kingler.addArrayHabildiades(potenciaBruta);

        krabby.addArrayHabildiades(caparazon);
        krabby.addArrayHabildiades(corteFuerte);
        krabby.addArrayHabildiades(potenciaBruta);


        //Voltorb y sus evoluciones
        habilidades insonorizar = new habilidades("Insonorizar", 4);
        habilidades resquicio = new habilidades("Resquicio", 6);

        electrode.addArrayHabildiades(electricidadEstatica);
        electrode.addArrayHabildiades(insonorizar);
        electrode.addArrayHabildiades(resquicio);

        voltorb.addArrayHabildiades(electricidadEstatica);
        voltorb.addArrayHabildiades(insonorizar);
        voltorb.addArrayHabildiades(resquicio);


        //Exeggcute y sus evoluciones
        habilidades cosecha = new habilidades("Cosecha", 6);

        exeggutor.addArrayHabildiades(clorofila);
        exeggutor.addArrayHabildiades(cosecha);

        exeggcute.addArrayHabildiades(clorofila);
        exeggcute.addArrayHabildiades(cosecha);

        //Cubone y sus evoluciones
        habilidades armaduraBatalla = new habilidades("Armadura Batalla", 6);

        marowak.addArrayHabildiades(cabezaRoca);
        marowak.addArrayHabildiades(pararrayos);
        marowak.addArrayHabildiades(armaduraBatalla);

        cubone.addArrayHabildiades(cabezaRoca);
        cubone.addArrayHabildiades(pararrayos);
        cubone.addArrayHabildiades(armaduraBatalla);


        //Hitmonlee
        habilidades audaz = new habilidades("Audaz", 4);
        habilidades liviano = new habilidades("Liviano", 5);

        hitmonlee.addArrayHabildiades(flexibilidad);
        hitmonlee.addArrayHabildiades(audaz);
        hitmonlee.addArrayHabildiades(liviano);

        //Hitmonchan
        habilidades punoFerreo = new habilidades("Puño Férreo", 5);

        hitmonchan.addArrayHabildiades(vistaLince);
        hitmonchan.addArrayHabildiades(punoFerreo);
        hitmonchan.addArrayHabildiades(focoInterno);

        //Lickitung
        habilidades gasReactivo = new habilidades("Gas Reactivo", 5);

        lickitung.addArrayHabildiades(despiste);
        lickitung.addArrayHabildiades(ritmoPropio);
        lickitung.addArrayHabildiades(aclimatacion);

        koffing.addArrayHabildiades(levitacion);
        koffing.addArrayHabildiades(gasReactivo);
        koffing.addArrayHabildiades(hedor);

        weezing.addArrayHabildiades(levitacion);
        weezing.addArrayHabildiades(gasReactivo);
        weezing.addArrayHabildiades(hedor);

        //Rhyhorn y su evolución
        rhydon.addArrayHabildiades(pararrayos);
        rhydon.addArrayHabildiades(cabezaRoca);
        rhydon.addArrayHabildiades(audaz);

        rhyhorn.addArrayHabildiades(pararrayos);
        rhyhorn.addArrayHabildiades(cabezaRoca);
        rhyhorn.addArrayHabildiades(audaz);

        //Chansey
        habilidades curaNatural = new habilidades("Cura Natural", 5);
        habilidades dicha = new habilidades("Dicha", 2);
        habilidades almaCura = new habilidades("Alma Cura", 3);

        chansey.addArrayHabildiades(curaNatural);
        chansey.addArrayHabildiades(dicha);
        chansey.addArrayHabildiades(almaCura);


        //Tangela
        habilidades defensaHoja = new habilidades("Defensa Hoja", 5);

        tangela.addArrayHabildiades(clorofila);
        tangela.addArrayHabildiades(defensaHoja);
        tangela.addArrayHabildiades(regeneracion);

        //Kangaskhan
        habilidades intrepido = new habilidades("Intrépido", 5);

        kangaskhan.addArrayHabildiades(madrugar);
        kangaskhan.addArrayHabildiades(intrepido);
        kangaskhan.addArrayHabildiades(focoInterno);

        //Horsea
        horsea.addArrayHabildiades(nadoRapido);
        horsea.addArrayHabildiades(francotirador);
        horsea.addArrayHabildiades(humedad);

        seadra.addArrayHabildiades(puntoToxico);
        seadra.addArrayHabildiades(francotirador);
        seadra.addArrayHabildiades(humedad);

        //Goldeen
        habilidades veloAgua = new habilidades("Velo Agua", 5);

        seaking.addArrayHabildiades(nadoRapido);
        seaking.addArrayHabildiades(veloAgua);
        seaking.addArrayHabildiades(pararrayos);

        goldeen.addArrayHabildiades(nadoRapido);
        goldeen.addArrayHabildiades(veloAgua);
        goldeen.addArrayHabildiades(pararrayos);

        //Staryu y su evolución
        habilidades iluminacion = new habilidades("Iluminacion", 5);

        starmie.addArrayHabildiades(curaNatural);
        starmie.addArrayHabildiades(iluminacion);
        starmie.addArrayHabildiades(calculoFinal);

        staryu.addArrayHabildiades(curaNatural);
        staryu.addArrayHabildiades(iluminacion);
        staryu.addArrayHabildiades(calculoFinal);

        //MrMime
        habilidades filtro = new habilidades("Filtro", 3);

        mrMime.addArrayHabildiades(insonorizar);
        mrMime.addArrayHabildiades(filtro);
        mrMime.addArrayHabildiades(experto);

        //Scyther
        scyther.addArrayHabildiades(enjambre);
        scyther.addArrayHabildiades(experto);
        scyther.addArrayHabildiades(impasible);

        //Jynx
        jynx.addArrayHabildiades(despiste);
        jynx.addArrayHabildiades(alerta);
        jynx.addArrayHabildiades(pielSeca);

        //Electabuzz
        electabuzz.addArrayHabildiades(electricidadEstatica);
        electabuzz.addArrayHabildiades(espirituVital);

        //Magmar
        magmar.addArrayHabildiades(cuerpoLlama);
        magmar.addArrayHabildiades(espirituVital);

        //Pinsir
        habilidades rompemoldes = new habilidades("Rompemoldes", 3);
        habilidades autoestima = new habilidades("Autoestima", 4);

        pinsir.addArrayHabildiades(corteFuerte);
        pinsir.addArrayHabildiades(rompemoldes);
        pinsir.addArrayHabildiades(autoestima);

        //Tauros
        tauros.addArrayHabildiades(intimidacion);
        tauros.addArrayHabildiades(irascible);
        tauros.addArrayHabildiades(potenciaBruta);

        //Magikarp y sus evoluciones
        habilidades cobardia = new habilidades("Cobardía", 4);

        magikarp.addArrayHabildiades(nadoRapido);
        magikarp.addArrayHabildiades(cobardia);

        gyarados.addArrayHabildiades(nadoRapido);
        gyarados.addArrayHabildiades(cobardia);

        //Lapras
        lapras.addArrayHabildiades(absorbeAgua);
        lapras.addArrayHabildiades(caparazon);
        lapras.addArrayHabildiades(hidratacion);

        //Ditto
        habilidades impostor = new habilidades("Impostor", 4);

        ditto.addArrayHabildiades(flexibilidad);
        ditto.addArrayHabildiades(impostor);

        //Eevee
        habilidades adaptable = new habilidades("Adaptable", 4);
        habilidades anticipacion = new habilidades("Anticipación", 4);

        eevee.addArrayHabildiades(fuga);
        eevee.addArrayHabildiades(adaptable);
        eevee.addArrayHabildiades(anticipacion);

        //Evoluciones de Eevee

        //Cuando estas en la playa
        vaporeon.addArrayHabildiades(absorbeAgua);
        vaporeon.addArrayHabildiades(hidratacion);

        //Cuando estas la selva
        habilidades absorbeElectricidad = new habilidades("Absorbe Electricidad", 4);
        habilidades piesRapidos = new habilidades("Pies Rápidos", 6);

        jolteon.addArrayHabildiades(absorbeElectricidad);
        jolteon.addArrayHabildiades(piesRapidos);

        //Cuando estas en el bosque
        flareon.addArrayHabildiades(absorbeFuego);
        flareon.addArrayHabildiades(agallas);

        //Porygon
        habilidades rastro = new habilidades("Rastro", 4);
        habilidades descarga = new habilidades("Descarga", 3);

        porygon.addArrayHabildiades(calculoFinal);
        porygon.addArrayHabildiades(rastro);
        porygon.addArrayHabildiades(descarga);

        //Omanyte
        omanyte.addArrayHabildiades(nadoRapido);
        omanyte.addArrayHabildiades(caparazon);
        omanyte.addArrayHabildiades(armaduraFragil);

        omastar.addArrayHabildiades(nadoRapido);
        omastar.addArrayHabildiades(caparazon);
        omastar.addArrayHabildiades(armaduraFragil);

        //Kabuto
        kabuto.addArrayHabildiades(armaduraBatalla);
        kabuto.addArrayHabildiades(nadoRapido);
        kabuto.addArrayHabildiades(armaduraFragil);

        kabutops.addArrayHabildiades(armaduraBatalla);
        kabutops.addArrayHabildiades(nadoRapido);
        kabutops.addArrayHabildiades(armaduraFragil);

        //Aerodactyl

        habilidades presion = new habilidades("Presión", 3);

        aerodactyl.addArrayHabildiades(cabezaRoca);
        aerodactyl.addArrayHabildiades(presion);
        aerodactyl.addArrayHabildiades(nerviosismo);

        //Snorlax
        habilidades inmunidad = new habilidades("Inmunidad", 3);

        snorlax.addArrayHabildiades(sebo);
        snorlax.addArrayHabildiades(inmunidad);
        snorlax.addArrayHabildiades(gula);

        //Articuno
        habilidades mantoNiveo = new habilidades("Manto Níveo", 3);

        articuno.addArrayHabildiades(presion);
        articuno.addArrayHabildiades(mantoNiveo);

        //Zapdos
        zapdos.addArrayHabildiades(presion);
        zapdos.addArrayHabildiades(electricidadEstatica);

        //Moltres
        moltres.addArrayHabildiades(presion);
        moltres.addArrayHabildiades(cuerpoLlama);

        //Dratini
        habilidades escamaEspecial = new habilidades("Escama Especial", 3);
        habilidades compensacion = new habilidades("Compensación", 3);

        dratini.addArrayHabildiades(mudar);
        dratini.addArrayHabildiades(escamaEspecial);

        dragonair.addArrayHabildiades(mudar);
        dragonair.addArrayHabildiades(escamaEspecial);

        dragonite.addArrayHabildiades(focoInterno);
        dragonite.addArrayHabildiades(compensacion);

        //Mewtwo
        mewtwo.addArrayHabildiades(presion);
        mewtwo.addArrayHabildiades(nerviosismo);

        //Mew
        mew.addArrayHabildiades(sincronia);


         /*

        DESIERTO
        POKEMONES QUE PERTENECEN AL AREA.


         */
        desierto.add(pidgey);
        desierto.add(pidgeotto);
        desierto.add(pidgeot);

        desierto.add(rattata);
        desierto.add(raticate);

        desierto.add(spearow);
        desierto.add(fearow);

        desierto.add(clefairy);
        desierto.add(clefable);

        desierto.add(vulpix);
        desierto.add(ninetales);

        desierto.add(jigglypuff);
        desierto.add(wigglytuff);

        desierto.add(diglett);
        desierto.add(dugtrio);

        desierto.add(meowth);
        desierto.add(persian);

        desierto.add(weepinbell);
        desierto.add(bellsprout);
        desierto.add(victreebel);

        desierto.add(ponyta);
        desierto.add(rapidash);

        desierto.add(farfetchd);
        desierto.add(doduo);
        desierto.add(dodrio);

        desierto.add(gastly);
        desierto.add(gengar);
        desierto.add(haunter);

        desierto.add(onix);

        desierto.add(hitmonlee);
        desierto.add(hitmonchan);

        desierto.add(lickitung);

        desierto.add(koffing);
        desierto.add(weezing);

        desierto.add(chansey);
        desierto.add(kangaskhan);

        desierto.add(tauros);

        desierto.add(ditto);

        desierto.add(eevee);

        desierto.add(porygon);

        desierto.add(snorlax);



        /*

        BOSQUE
        POKEMONES QUE PERTENECEN AL AREA.


         */
        bosque.add(bulbasaur);
        bosque.add(ivysaur);
        bosque.add(venusaur);

        bosque.add(charmander);
        bosque.add(charmeleon);
        bosque.add(charizard);

        bosque.add(weedle);
        bosque.add(kakuna);
        bosque.add(beedrill);

        bosque.add(pidgey);
        bosque.add(pidgeotto);
        bosque.add(pidgeot);

        bosque.add(rattata);
        bosque.add(raticate);
        bosque.add(spearow);
        bosque.add(fearow);

        bosque.add(pikachu);
        bosque.add(raichu);

        bosque.add(sandshrew);
        bosque.add(sandslash);

        bosque.add(nidoqueen);
        bosque.add(nidoking);

        bosque.add(clefairy);
        bosque.add(clefable);

        bosque.add(vulpix);
        bosque.add(ninetales);

        bosque.add(jigglypuff);
        bosque.add(wigglytuff);

        bosque.add(oddish);
        bosque.add(gloom);
        bosque.add(vileplume);

        bosque.add(diglett);
        bosque.add(dugtrio);

        bosque.add(meowth);
        bosque.add(persian);

        bosque.add(mankey);
        bosque.add(primeape);

        bosque.add(growlithe);
        bosque.add(arcanine);

        bosque.add(abra);
        bosque.add(kadabra);
        bosque.add(alakazam);

        bosque.add(geodude);
        bosque.add(graveler);
        bosque.add(golem);

        bosque.add(ponyta);
        bosque.add(rapidash);

        bosque.add(farfetchd);
        bosque.add(doduo);
        bosque.add(dodrio);

        bosque.add(gastly);
        bosque.add(gengar);
        bosque.add(haunter);

        bosque.add(onix);

        bosque.add(voltorb);
        bosque.add(electrode);

        bosque.add(exeggcute);
        bosque.add(exeggutor);

        bosque.add(cubone);
        bosque.add(marowak);

        bosque.add(hitmonlee);
        bosque.add(hitmonchan);

        bosque.add(lickitung);

        bosque.add(koffing);
        bosque.add(weezing);

        bosque.add(rhydon);
        bosque.add(rhyhorn);

        bosque.add(chansey);
        bosque.add(kangaskhan);

        bosque.add(mrMime);

        bosque.add(electabuzz);
        bosque.add(magmar);

        bosque.add(tauros);

        bosque.add(ditto);

        bosque.add(eevee);

        bosque.add(jolteon);

        bosque.add(flareon);

        bosque.add(porygon);

        bosque.add(omanyte);
        bosque.add(omastar);
        bosque.add(kabuto);
        bosque.add(kabutops);


        bosque.add(aerodactyl);

        bosque.add(snorlax);

        bosque.add(zapdos);

        bosque.add(moltres);

        bosque.add(dragonite);
        bosque.add(dragonair);
        bosque.add(dratini);

        bosque.add(mew);
        bosque.add(mewtwo);





        /*

        SELVA
        POKEMONES QUE PERTENECEN AL AREA.


         */
        selva.add(bulbasaur);
        selva.add(ivysaur);
        selva.add(venusaur);
       selva.add(caterpie);
        selva.add(metapod);
        selva.add(butterfree);
        selva.add(weedle);
        selva.add(kakuna);
        selva.add(beedrill);

        selva.add(pidgey);
        selva.add(pidgeotto);
        selva.add(pidgeot);


        selva.add(rattata);
        selva.add(raticate);

        selva.add(spearow);
        selva.add(fearow);

        selva.add(ekans);
        selva.add(arbok);

        selva.add(nidoranMujer);
        selva.add(nidorina);
        selva.add(nidoqueen);

        selva.add(nidoranHombre);
        selva.add(nidorino);
        selva.add(nidoking);

        selva.add(clefairy);
        selva.add(clefable);

        selva.add(jigglypuff);
        selva.add(wigglytuff);

        selva.add(zubat);
        selva.add(golbat);

        selva.add(oddish);
        selva.add(gloom);
        selva.add(vileplume);

        selva.add(paras);
        selva.add(parasect);

        selva.add(venonat);
        selva.add(venomoth);

        selva.add(meowth);
        selva.add(persian);

        selva.add(mankey);
        selva.add(primeape);

        selva.add(machop);
        selva.add(machoke);
        selva.add(machamp);

        selva.add(magnemite);
        selva.add(magneton);

        selva.add(farfetchd);
        selva.add(doduo);
        selva.add(dodrio);

        selva.add(grimer);
        selva.add(muk);

        selva.add(gastly);
        selva.add(gengar);
        selva.add(haunter);

        selva.add(drowzee);
        selva.add(hypno);

        selva.add(voltorb);
        selva.add(electrode);

        selva.add(exeggcute);
        selva.add(exeggutor);

        selva.add(lickitung);

        selva.add(koffing);
        selva.add(weezing);

        selva.add(chansey);

        selva.add(kangaskhan);

        selva.add(tangela);

        selva.add(scyther);
        selva.add(pinsir);

        selva.add(tauros);

        selva.add(ditto);

        selva.add(eevee);

        selva.add(jolteon);

        selva.add(porygon);

        selva.add(omanyte);
        selva.add(omastar);

        selva.add(kabuto);
        selva.add(kabutops);

        selva.add(snorlax);

        selva.add(zapdos);


       /*

        PLAYA
        POKEMONES QUE PERTENECEN AL AREA.


         */
        playa.add(squirtle);
        playa.add(wartortle);
        playa.add(blastoise);

        playa.add(pidgey);
        playa.add(pidgeotto);
        playa.add(pidgeot);


        playa.add(rattata);
        playa.add(raticate);

       playa.add(spearow);
        playa.add(fearow);

        playa.add(clefairy);
        playa.add(clefable);

        playa.add(jigglypuff);
        playa.add(wigglytuff);

        playa.add(meowth);
        playa.add(persian);

        playa.add(psyduck);
        playa.add(golduck);

        playa.add(poliwag);
        playa.add(poliwhirl);
        playa.add(poliwrath);

        playa.add(tentacool);
        playa.add(tentacruel);

        playa.add(slowpoke);
        playa.add(slowbro);

        playa.add(farfetchd);
        playa.add(doduo);
        playa.add(dodrio);

        playa.add(seel);
        playa.add(dewgong);

        playa.add(shellder);
        playa.add(cloyster);

        playa.add(krabby);
        playa.add(kingler);

        playa.add(lickitung);

        playa.add(chansey);
        playa.add(kangaskhan);

        playa.add(horsea);
        playa.add(seadra);

        playa.add(goldeen);
        playa.add(seaking);
        playa.add(starmie);

        playa.add(jynx);

        playa.add(tauros);

        playa.add(magikarp);
        playa.add(gyarados);
        playa.add(lapras);

        playa.add(ditto);

        playa.add(eevee);

        playa.add(vaporeon);

        playa.add(porygon);

        playa.add(omanyte);
        playa.add(omastar);
        playa.add(kabuto);
        playa.add(kabutops);

        playa.add(snorlax);

        playa.add(articuno);

    }

    //Método para crear a los 7 entrenadores y agregarles los pokemones
    public void createEntrenadores() {


        //Pokemones de Whitney - normal
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


        //Pokemones de Brock - desert
        Pokemon victreebel = new Pokemon("Victreebel", "Planta/Veneno ", "Grande", 25);
        habilidades gula = new habilidades("Gula", 11);
        habilidades clorofila = new habilidades("Clorofila", 10);

        victreebel.addArrayHabildiades(gula);
        victreebel.addArrayHabildiades(clorofila);


        Pokemon golem = new Pokemon("Golem", "Roca/Tierra ", "Mediano", 25);
        habilidades veloArena = new habilidades("Velo Arena", 12);
        habilidades cabezaRoca = new habilidades("Cabeza Roca", 10);
        habilidades robustez = new habilidades("Robustez", 9);
        golem.addArrayHabildiades(veloArena);
        golem.addArrayHabildiades(robustez);
        golem.addArrayHabildiades(cabezaRoca);


        Pokemon dodrio = new Pokemon("Dodrio", "Normal/Volador ", "Grande", 25);
        habilidades madrugar = new habilidades("Madrugar", 8);
        habilidades fuga2 = new habilidades("fuga", 9);
        habilidades tumbos2 = new habilidades("Tumbos", 8);
        dodrio.addArrayHabildiades(fuga2);
        dodrio.addArrayHabildiades(madrugar);
        dodrio.addArrayHabildiades(tumbos2);


        Pokemon gengar = new Pokemon("Gengar", "Fantasma/Veneno ", "Grande", 25);
        habilidades cuerpoMaldito = new habilidades("Cuerpo Maldito", 9);
        gengar.addArrayHabildiades(cuerpoMaldito);

        brock.addPokemones(victreebel);
        brock.addPokemones(golem);
        brock.addPokemones(dodrio);
        brock.addPokemones(gengar);


        //Pokemones de Pryce - water

        Pokemon blastoise = new Pokemon("Blastoise", "Agua", "Chico", 25);
        habilidades curaLluvia = new habilidades("Cura lluvia", 6);
        habilidades torrente = new habilidades("Torrente", 4);

        blastoise.addArrayHabildiades(curaLluvia);
        blastoise.addArrayHabildiades(torrente);


        Pokemon starmie = new Pokemon("Starmie", "Agua ", "Chico", 35);
        habilidades iluminacion = new habilidades("Iluminacion", 20);
        habilidades curaNatural = new habilidades("Cura Natural", 20);
        habilidades calculoFinal = new habilidades("Cálculo Final", 21);
        starmie.addArrayHabildiades(curaNatural);
        starmie.addArrayHabildiades(iluminacion);
        starmie.addArrayHabildiades(calculoFinal);


        Pokemon lapras = new Pokemon("Lapras", "Agua/Hielo ", "Grande", 35);
        habilidades absorbeAgua = new habilidades("Absorbe Agua", 26);
        habilidades caparazon = new habilidades("Caparazon", 25);
        habilidades hidratacion = new habilidades("Hidratacion", 25);
        lapras.addArrayHabildiades(absorbeAgua);
        lapras.addArrayHabildiades(caparazon);
        lapras.addArrayHabildiades(hidratacion);


        Pokemon poliwrath = new Pokemon("Poliwrath", "Agua/Lucha ", "Grande", 25);
        habilidades absorbeAgua1 = new habilidades("Absorbe Agua", 8);
        habilidades humedad = new habilidades("Humedad", 8);
        habilidades nadoRapido = new habilidades("NadoRapido", 11);
        poliwrath.addArrayHabildiades(absorbeAgua1);
        poliwrath.addArrayHabildiades(humedad);
        poliwrath.addArrayHabildiades(nadoRapido);

        pryce.addPokemones(blastoise);
        pryce.addPokemones(starmie);
        pryce.addPokemones(lapras);
        pryce.addPokemones(poliwrath);


        //Pokemones de Erika - forest

        Pokemon dragonite = new Pokemon("Dragonite", "Dragón/Volador ", "Grande", 25);
        habilidades focoInterno = new habilidades("Foco Interno", 10);
        habilidades compensacion = new habilidades("Compensación", 8);
        dragonite.addArrayHabildiades(focoInterno);
        dragonite.addArrayHabildiades(compensacion);

        Pokemon gengar1 = new Pokemon("Gengar", "Fantasma/Veneno ", "Grande", 25);
        habilidades cuerpoMaldito1 = new habilidades("Cuerpo Maldito", 9);
        gengar1.addArrayHabildiades(cuerpoMaldito1);


        Pokemon golem2 = new Pokemon("Golem", "Roca/Tierra ", "Mediano", 25);
        habilidades veloArena2 = new habilidades("Velo Arena", 12);
        habilidades cabezaRoca2 = new habilidades("Cabeza Roca", 10);
        habilidades robustez2 = new habilidades("Robustez", 9);
        golem2.addArrayHabildiades(veloArena2);
        golem2.addArrayHabildiades(robustez2);
        golem2.addArrayHabildiades(cabezaRoca2);


        Pokemon alakazam = new Pokemon("Alakazam", "Psíquico ", "Grande", 25);
        habilidades sincronia = new habilidades("Sincronía", 10);
        habilidades focoInterno2 = new habilidades("Foco Interno", 10);
        habilidades muroMagico = new habilidades("Muro Mágico", 10);

        alakazam.addArrayHabildiades(sincronia);
        alakazam.addArrayHabildiades(focoInterno2);
        alakazam.addArrayHabildiades(muroMagico);

        erika.addPokemones(dragonite);
        erika.addPokemones(gengar1);
        erika.addPokemones(golem2);
        erika.addPokemones(alakazam);


        //Pokemones de Koga - Jungle

        Pokemon nidoking = new Pokemon("Nidoking", "Veneno/Tierra", "Grande", 25);
        habilidades puntoToxico = new habilidades("Punto Tóxico", 9);
        habilidades rivalidad = new habilidades("Rivalidad", 8);
        habilidades potenciaBruta = new habilidades("Potencia Bruta", 8);
        nidoking.addArrayHabildiades(puntoToxico);
        nidoking.addArrayHabildiades(rivalidad);
        nidoking.addArrayHabildiades(potenciaBruta);

        Pokemon venusaur = new Pokemon("Venusaur", "Planta/Veneno", "Pequeño", 25);
        habilidades espesura = new habilidades("Espesura", 8);
        habilidades clorifila = new habilidades("Clorifila", 8);
        venusaur.addArrayHabildiades(espesura);
        venusaur.addArrayHabildiades(clorifila);


        Pokemon butterfree = new Pokemon("Butterfree", "Bicho", "Chico", 25);
        habilidades ojoCompuesto = new habilidades("Cura lluvia", 11);
        habilidades cromolente = new habilidades("Torrente", 9);
        butterfree.addArrayHabildiades(ojoCompuesto);
        butterfree.addArrayHabildiades(cromolente);


        Pokemon beedrill = new Pokemon("Beedrill", "Bicho/Veneno", "Chico", 25);
        habilidades enjambre = new habilidades("Enjambre", 8);
        habilidades francotirador2 = new habilidades("Francotirador", 7);
        beedrill.addArrayHabildiades(enjambre);
        beedrill.addArrayHabildiades(francotirador2);

        koga.addPokemones(nidoking);
        koga.addPokemones(venusaur);
        koga.addPokemones(butterfree);
        koga.addPokemones(beedrill);

        //Pokemones de Surge - Jungle

        Pokemon gengar3 = new Pokemon("Gengar", "Fantasma/Veneno ", "Grande", 25);
        habilidades cuerpoMaldito3 = new habilidades("Cuerpo Maldito", 9);
        gengar3.addArrayHabildiades(cuerpoMaldito3);


        Pokemon machamp = new Pokemon("Machamp", "Lucha ", "Grande", 25);
        habilidades indefenso = new habilidades("Indefenso", 10);
        habilidades impasible = new habilidades("Impasible", 9);
        habilidades agallas3 = new habilidades("Agallas", 8);
        machamp.addArrayHabildiades(agallas3);
        machamp.addArrayHabildiades(indefenso);
        machamp.addArrayHabildiades(impasible);


        Pokemon vileplume = new Pokemon("Vileplume", "Planta/Veneno", "Mediano", 25);
        habilidades efectoEspora = new habilidades("Efecto Espora", 10);
        habilidades clorifila3 = new habilidades("Clorifila", 9);
        vileplume.addArrayHabildiades(clorifila3);
        vileplume.addArrayHabildiades(efectoEspora);


        Pokemon nidoqueen = new Pokemon("Nidoqueen", "Veneno/Tierra", "Grande", 25);
        habilidades puntoToxico3 = new habilidades("Punto Tóxico", 9);
        habilidades rivalidad3 = new habilidades("Rivalidad", 10);
        habilidades potenciaBruta3 = new habilidades("Potencia Bruta", 8);

        nidoqueen.addArrayHabildiades(puntoToxico3);
        nidoqueen.addArrayHabildiades(rivalidad3);
        nidoqueen.addArrayHabildiades(potenciaBruta3);

        surge.addPokemones(gengar3);
        surge.addPokemones(machamp);
        surge.addPokemones(vileplume);
        surge.addPokemones(nidoqueen);

        //Pokemones de Blaine - Desert

        Pokemon rapidash = new Pokemon("Rapidash", "Fuego ", "Chico", 35);

        habilidades cuerpoLlama = new habilidades("Cuerpo Llama", 20);
        habilidades absorbeFuego = new habilidades("AbsorbeFuego", 20);
        habilidades fuga3 = new habilidades("fuga", 19);
        rapidash.addArrayHabildiades(fuga3);
        rapidash.addArrayHabildiades(absorbeFuego);
        rapidash.addArrayHabildiades(cuerpoLlama);


        Pokemon dugtrio = new Pokemon("Dugtrio", "Tierra", "Chico", 35);
        habilidades trampaArena = new habilidades("Trampa Arena", 18);
        habilidades poderArena = new habilidades("Poder Arena", 19);
        habilidades veloArena3 = new habilidades("Velo Arena", 22);
        dugtrio.addArrayHabildiades(trampaArena);
        dugtrio.addArrayHabildiades(veloArena3);
        dugtrio.addArrayHabildiades(poderArena);


        Pokemon wigglytuff = new Pokemon("Wigglytuff", "Normal ", "Chico", 35);
        habilidades tenacidad = new habilidades("Tenacidad", 18);
        habilidades cacheo = new habilidades("Cacheo", 18);
        habilidades granEncanto = new habilidades("Gran Encanto", 18);

        wigglytuff.addArrayHabildiades(granEncanto);
        wigglytuff.addArrayHabildiades(tenacidad);
        wigglytuff.addArrayHabildiades(cacheo);

        Pokemon clefable = new Pokemon("Clefable", "Normal", "Chico", 35);
        habilidades ignorante = new habilidades("Ignorante", 20);
        habilidades muroMagico3 = new habilidades("Muro Mágico", 20);
        habilidades granEncanto3 = new habilidades("Gran Encanto", 18);

        clefable.addArrayHabildiades(ignorante);
        clefable.addArrayHabildiades(muroMagico3);
        clefable.addArrayHabildiades(granEncanto3);


        blaine.addPokemones(gengar3);
        blaine.addPokemones(machamp);
        blaine.addPokemones(vileplume);
        blaine.addPokemones(nidoqueen);



    }

   // Método para recibir  dos Strings de la pantalla principal
    public void receiveAreaOgym(String gymsOareas, String pokedexOpp)
    {
        this.gymsOareas = gymsOareas;
        this.pokedexOpp = pokedexOpp;

    }

    // Método para recibir  un Strings de la pantalla principal y usada igual en el pokedex
    public void receivepokedexOpp(String pokedexOpp)
    {
        this.pokedexOpp = pokedexOpp;

    }

    //Método para recibir las monedas ganadas desde la pantalla principal
    //Se utiliza cuando ya se vencieron todos los gyms
    public void receiveCoins(int coins, int var2)
    {
        this.monedero = coins;
        this.var2 = var2;

    }

    //Se utiliza en el Pokedex para determinar cual Pokemon se quiere usar
    public void receiveSearchPoke(Pokemon searchPokemon)
    {
        this.searchPokemon = searchPokemon;

    }

    //Método para recibir una String con el nombre de usuario cuando se cambia en la pantalla principal
    public void receiveNameUser(String userName)
    {
        this.userName = userName;

    }

    //Método para obtener el objeto pokemon son solo el nombre del array AllPokemons
    public Pokemon getPokemonByName(String pokemonName)
    {

        Pokemon toReturnPokemon = new Pokemon();
        for(int i = 0; i < allPokemon.size(); i++)
        {
            if(allPokemon.get(i).getName().equals(pokemonName))
            {
                toReturnPokemon = allPokemon.get(i);
                break;
            }
        }

        return toReturnPokemon;

    }

    //método que recibe el nombre (String) de un pokemon para regresar un objeto pokemon del Belt Con el mismo nombre
    public Pokemon getPokemonFromBelt(String pokemonName)
    {
        int e = 0;

        for(int i = 0; i < beltPokemon.size(); i++)
        {
            if(beltPokemon.get(i).getName().equals(pokemonName))
            {
                return  beltPokemon.get(i);
            }
            e++;
        }

        return beltPokemon.get(e);
    }

    //método que recibe el nombre (String) de un pokemon para regresar un objeto pokemon del Bank con el mismo nombre
    public Pokemon getPokemonFromBank(String pokemonName)
    {
        int e = 0;

        for(int i = 0; i < bankPokemon.size(); i++)
        {
            if(bankPokemon.get(i).getName().equals(pokemonName))
            {
                return  bankPokemon.get(i);
            }
            e++;
        }

        return bankPokemon.get(e);


    }

    //Método para buscar un pokmeon con el nombre de este y el nombre del entrenador, regresa el objeto pokemon
    public Pokemon getPokemonFromEntrenador(Entrenadores entrenador, String pokemonName)
    {
        int e = 0;

        for(int i = 0; i < entrenador.getPokemones().size(); i++)
        {
            if(entrenador.getPokemones().get(i).getName().equals(pokemonName))
            {
                return  entrenador.getPokemones().get(i);
            }
            e++;
        }

        return entrenador.getPokemones().get(e);

    }


    /*

    Métodos para obtener un pokemon random de cada area

     */

    //Obtener un pokemon random del arraylist beach
    public Pokemon getRandomPokemonBeach()
    {
        areaChose = "beach";
        Random rand = new Random();
        int upperbound = playa.size();
        int numRandomPokemon = rand.nextInt(upperbound);
        randomPokemon  = playa.get(numRandomPokemon);

        return randomPokemon;

    }

    //Obtener un pokemon random del arraylist Forest
    public Pokemon getRandomPokemonForest()
    {
        areaChose = "forest";
        Random rand = new Random();
        int upperbound = bosque.size();
        int numRandomPokemon = rand.nextInt(upperbound);
        randomPokemon  = bosque.get(numRandomPokemon);

        return randomPokemon;

    }

    //Obtener un pokemon random del arraylist jungle
    public Pokemon getRandomPokemonJungle()
    {
        areaChose = "jungle";
        Random rand = new Random();
        int upperbound = selva.size();
        int numRandomPokemon = rand.nextInt(upperbound);
        randomPokemon  = selva.get(numRandomPokemon);

        return randomPokemon;

    }

    //Obtener un pokemon random del arraylist desert
    public Pokemon getRandomPokemonDesert()
    {
        areaChose = "desert";
        Random rand = new Random();
        int upperbound = desierto.size();
        int numRandomPokemon = rand.nextInt(upperbound);
        randomPokemon  = desierto.get(numRandomPokemon);

        return randomPokemon;

    }

    //Métetodo usado en SelectPokemonToFightPantalla, donde se recibe el nombre del starting pokemon con el Arraylist BeltPokemon por si se reacomodan.
    public void getNamePokemonToUseForFight(String myPokemon, ArrayList<Pokemon> belt)
    {
        starterPokemon = myPokemon;

        beltPokemon = belt;
    }

    //Actualizar información después de la pelea
    public void getDataFromFight(int pokeballs, int experience, int nivel, int monedero,  int ultraBallsOwn, int masterBallsOwn, int greatBallsOwn, ArrayList<Pokemon> beltPokemon, ArrayList<Pokemon>  bankPokemon , int simplePotionOwn, int superPotionOwn, int maxPotionOwn, String starterPokemon)
    {
        this.pokeballs = pokeballs;
        this.experience = experience;
        this.nivel = nivel;
        this.monedero = monedero;
        this.ultraBallsOwn  = ultraBallsOwn;
        this.masterBallsOwn = masterBallsOwn;
        this.greatBallsOwn = greatBallsOwn;

        this.simplePotionOwn = simplePotionOwn;
        this.superPotionOwn = superPotionOwn;
        this.maxPotionOwn = maxPotionOwn;

        this.beltPokemon = beltPokemon;
        this.bankPokemon = bankPokemon;
        this.starterPokemon = starterPokemon;

        System.out.println(this.experience);
        System.out.println(this.nivel);
    }


    //Actualizar información después de una pelea en el Gym
    public void getDataFromGym(ArrayList<Pokemon> beltPokemon, ArrayList<Pokemon> bankPokemon, int monedas,  int experience, int nivel, String entrenadorChose, int simplePotionOwn, int superPotionOwn, int maxPotionOwn, String starterPokemon)
    {
        this.beltPokemon = beltPokemon;
        this.bankPokemon = bankPokemon;
        this.monedero  = monedas;
        this.experience = experience;
        this.nivel = nivel;
        this.simplePotionOwn = simplePotionOwn;
        this.superPotionOwn = superPotionOwn;
        this.maxPotionOwn = maxPotionOwn;
        this.starterPokemon = starterPokemon;

        System.out.println("El entrenador que volvio = "+entrenadorChose);

        if(entrenadorChose == "Whitney")
        {
            medallasSiYaSeTienen.set(0, 1);
        }
        else if(entrenadorChose == "Brock")
        {
            System.out.println("Entró a "+entrenadorChose);
            System.out.println(medallasSiYaSeTienen.get(1));

            medallasSiYaSeTienen.set(1, 1);

            System.out.println(medallasSiYaSeTienen.get(1));

        }
        else if(entrenadorChose == "Pryce")
        {
            medallasSiYaSeTienen.set(2, 1);
        }
        else if(entrenadorChose == "Erika")
        {
            medallasSiYaSeTienen.set(3, 1);
        }
        else if(entrenadorChose == "Koga")
        {
            medallasSiYaSeTienen.set(4, 1);
        }
        else if(entrenadorChose == "Surge")
        {
            medallasSiYaSeTienen.set(5, 1);
        }
        else if(entrenadorChose == "Blaine")
        {
            medallasSiYaSeTienen.set(6, 1);
        }


    }

    //Método para que cuando se compre algo se regresen las variables de las pokebolas, pociones y monedas
    public void getDataFromShop(int pokeballs,  int monedero, int ultraBallsOwn, int masterBallsOwn, int greatBallsOwn, int simplePotionOwn, int superPotionOwn, int maxPotionOwn)
    {
        this.pokeballs = pokeballs;
        this.monedero = monedero;
        this.ultraBallsOwn  = ultraBallsOwn;
        this.masterBallsOwn = masterBallsOwn;
        this.greatBallsOwn = greatBallsOwn;
        this.simplePotionOwn = simplePotionOwn;
        this.superPotionOwn = superPotionOwn;
        this.maxPotionOwn = maxPotionOwn;
    }


    //Se obtiene el nombre del pokemon oponente para la pelea, este se pasa a la clase FightPokemonPantalla
    public void setdataaFotFight(String oponentPokemon)
    {
        this.oponentPokemon = oponentPokemon;
    }

    //Método que se utiliza en el Pokedex para obtener el BeltPokemon si intercambio con alguno del banco
    public void getBeltFromPokedex(ArrayList<Pokemon> beltPokemon)
    {
        this.beltPokemon = beltPokemon;
    }

    //Método usado en la clase SelectPokemonToFight, donde se pide el ArrayList BeltPokemon
    public ArrayList getArrayListBeltPokemons ()
    {
        return beltPokemon;
    }


    /*Método para buscar pokemon el pokemon que ganó el usuario cuando gana una pelea
    Este busca primero el pokemon y después lo agrega al banco y al belt pokemon si hay menos de 6 pokemones.*/
    public void addPokemonFromFight(String pokemonName)
    {
        Pokemon copyPokemon = new Pokemon();

        for (int i = 0; i < allPokemon.size(); i++)
        {
            if (allPokemon.get(i).getName().equals(pokemonName))
            {
                copyPokemon.setName(allPokemon.get(i).getName());
                copyPokemon.setVida(allPokemon.get(i).getVida());
                copyPokemon.setTamano(allPokemon.get(i).getTamano());
                copyPokemon.setTipo(allPokemon.get(i).getTipo());
                copyPokemon.setNivel(allPokemon.get(i).getNivel());
                copyPokemon.setPuntos(allPokemon.get(i).getPuntos());

                try
                {
                    copyPokemon.setEvolucion(allPokemon.get(i).getEvolucion());

                }
                catch (Exception e)
                {
                    System.out.println("Ya no tiene evoluciones este Pokemon");
                }

                for(int o = 0; o< allPokemon.get(i).getHabilidades().size(); o++) {
                    habilidades copyHabilidades = new habilidades();
                    copyHabilidades.setNombre(allPokemon.get(i).getHabilidades().get(o).getNombre());
                    copyHabilidades.setDaño(allPokemon.get(i).getHabilidades().get(o).getDaño());

                    copyPokemon.addArrayHabildiades(copyHabilidades);

                }

                break;
            }
        }

        bankPokemon.add(copyPokemon);

        System.out.println("Los pokemones del banco son:");

        for (int i = 0; i < bankPokemon.size(); i++)
        {
            System.out.println(bankPokemon.get(i).getName());
        }
        System.out.println("");

        if (beltPokemon.size() < 6)
        {
            beltPokemon.add(copyPokemon);

        }

        System.out.println("Los pokemones del belt son:");
        for (int i = 0; i < beltPokemon.size(); i++)
        {
            System.out.println(beltPokemon.get(i).getName());
        }

    }

    //Método que se usa en la clase SelectGymEntrenadorPantalla, donde solo se envía al motor el nombre del Entrenador con el que va a pelear
    public void getInfoFromSelectionOfGym( String entrenadorChose)
    {
        this.entrenadorChose = entrenadorChose;
    }

    //Método para mostrar pantalla Inicial, donde se escoge el primer pokemon
    public void showPantallaInicial(ActionEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("PantallaInicial.fxml")));
            Parent root = loader.load();
            PantallaInicial controller = loader.<PantallaInicial>getController();
            controller.receiveMotorInstance(this);

            Scene PantallaInicialScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(PantallaInicialScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


    //Métodos para mostrar pantalla principal con ActionEvent y MouseEvent
    public void showPantallaPrincipal(ActionEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("PantallaPrincipal.fxml")));
            Parent root = loader.load();
            PantallaPrincipal controller = loader.<PantallaPrincipal>getController();
            controller.receiveMotorInstance(this);
            controller.receiveInitialData(starterPokemon, gender, userName, experience, pokeballs, monedero, medals, masterBallsOwn, greatBallsOwn, ultraBallsOwn, nivel, medallasSiYaSeTienen,simplePotionOwn,superPotionOwn,maxPotionOwn, pokedexOpp,bankPokemon, var2);
            Scene PantallaPrincipalScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(PantallaPrincipalScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void showPantallaPrincipal(MouseEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("PantallaPrincipal.fxml")));
            Parent root = loader.load();
            PantallaPrincipal controller = loader.<PantallaPrincipal>getController();
            controller.receiveMotorInstance(this);
            controller.receiveInitialData(starterPokemon, gender, userName, experience, pokeballs, monedero, medals, masterBallsOwn, greatBallsOwn, ultraBallsOwn, nivel, medallasSiYaSeTienen,simplePotionOwn,superPotionOwn,maxPotionOwn, pokedexOpp, bankPokemon,var2);
            Scene PantallaPrincipalScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(PantallaPrincipalScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


    //Método para mostrar el StorePantalla
    public void showStorePantalla(ActionEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("StorePantalla.fxml")));
            Parent root = loader.load();
            StorePantalla controller = loader.<StorePantalla>getController();
            controller.receiveMotorInstance(this);
            controller.receiveInitialData(monedero, pokeballs, masterBallsOwn, ultraBallsOwn, greatBallsOwn, simplePotionOwn,superPotionOwn,maxPotionOwn);
            Scene StorePantallaScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(StorePantallaScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


    //Métodos para mostrar El Area 1 (PLAYA) con ActionEvent y MouseEvent
    public void showArea1Pantalla(MouseEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("Area1Pantalla.fxml")));
            Parent root = loader.load();
            Area1Pantalla controller = loader.<Area1Pantalla>getController();
            controller.receiveMotorInstance(this, beltPokemon,bankPokemon);
            controller.receiveInitialData(gender, userName);

            Scene Area1PantallaScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(Area1PantallaScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void showArea1Pantalla1(ActionEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("Area1Pantalla.fxml")));
            Parent root = loader.load();
            Area1Pantalla controller = loader.<Area1Pantalla>getController();
            controller.receiveMotorInstance(this, beltPokemon,bankPokemon);
            controller.receiveInitialData(gender, userName);


            Scene Area1PantallaScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(Area1PantallaScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


    //Métodos para mostrar El Area 2 (Jungle) con ActionEvent y MouseEvent
    public void showArea2Pantalla(ActionEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("Area2Pantalla.fxml")));
            Parent root = loader.load();
            Area2Pantalla controller = loader.<Area2Pantalla>getController();
            controller.receiveMotorInstance(this, beltPokemon,bankPokemon);
            controller.receiveInitialData(gender, userName);


            Scene Area2PantallaScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(Area2PantallaScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void showArea2Pantalla1(MouseEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("Area2Pantalla.fxml")));
            Parent root = loader.load();
            Area2Pantalla controller = loader.<Area2Pantalla>getController();
            controller.receiveMotorInstance(this, beltPokemon,bankPokemon);
            controller.receiveInitialData(gender, userName);



            Scene Area2PantallaScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(Area2PantallaScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


    //Métodos para mostrar El Area 3 (Desert) con ActionEvent y MouseEvent
    public void showArea3Pantalla(ActionEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("Area3Pantalla.fxml")));
            Parent root = loader.load();
            Area3Pantalla controller = loader.<Area3Pantalla>getController();
            controller.receiveMotorInstance(this, beltPokemon,bankPokemon);
            controller.receiveInitialData(gender, userName);


            Scene Area3PantallaScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(Area3PantallaScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void showArea3Pantalla1(MouseEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("Area3Pantalla.fxml")));
            Parent root = loader.load();
            Area3Pantalla controller = loader.<Area3Pantalla>getController();
            controller.receiveMotorInstance(this, beltPokemon,bankPokemon);
            controller.receiveInitialData(gender, userName);


            Scene Area3PantallaScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(Area3PantallaScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


    //Métodos para mostrar El Area 4 (Forest) con ActionEvent y MouseEvent
    public void showArea4Pantalla(ActionEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("Area4Pantalla.fxml")));
            Parent root = loader.load();
            Area4Pantalla controller = loader.<Area4Pantalla>getController();
            controller.receiveMotorInstance(this, beltPokemon,bankPokemon);
            controller.receiveInitialData(gender, userName);


            Scene Area4PantallaScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(Area4PantallaScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void showArea4Pantalla1(MouseEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("Area4Pantalla.fxml")));
            Parent root = loader.load();
            Area4Pantalla controller = loader.<Area4Pantalla>getController();
            controller.receiveMotorInstance(this, beltPokemon,bankPokemon);
            controller.receiveInitialData(gender, userName);

            Scene Area4PantallaScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(Area4PantallaScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


    //Métodos  Para mostrar todas las areas pantalla con ActionEvent y MouseEvent
    public void showTodasAreasPantalla(ActionEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("TodasAreasPantalla.fxml")));
            Parent root = loader.load();
            TodasAreasPantalla controller = loader.<TodasAreasPantalla>getController();
            controller.receiveMotorInstance(this, playa, selva,desierto,bosque,bankPokemon);

            Scene TodasAreasPantallaScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(TodasAreasPantallaScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void showTodasAreasPantalla1(MouseEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("TodasAreasPantalla.fxml")));
            Parent root = loader.load();
            TodasAreasPantalla controller = loader.<TodasAreasPantalla>getController();
            controller.receiveMotorInstance(this, playa, selva,desierto,bosque,bankPokemon);

            Scene TodasAreasPantallaScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(TodasAreasPantallaScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


    //Método para mostrar la pantalla de pelea entre pokemones
    public void showfightPokemonPantalla(ActionEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("FightPantalla.fxml")));
            Parent root = loader.load();
            FightPantalla controller = loader.<FightPantalla>getController();
            controller.receiveMotorInstance(this);
            controller.receiveInitialDataForFights(starterPokemon, oponentPokemon,pokeballs,experience,nivel,monedero,areaChose, masterBallsOwn, greatBallsOwn, ultraBallsOwn, beltPokemon, bankPokemon, gender, userName,simplePotionOwn,superPotionOwn,maxPotionOwn);

            Scene fightPokemonPantallaScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(fightPokemonPantallaScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }


    //Método para mostrar la pantalla donde se arreglan o intercambian los pokemones para la pelea o gym
    public void showSelectPokemonToFightPantalla(ActionEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("SelectPokemonToFightPantalla.fxml")));
            Parent root = loader.load();
            SelectPokemonToFightPantalla controller = loader.<SelectPokemonToFightPantalla>getController();
            controller.receiveMotorInstance(this, gymsOareas,pokedexOpp);

            Scene SelectPokemonToFightPantallaScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(SelectPokemonToFightPantallaScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    //Método que muestra la pantalla SelectGymEntrenadorPantalla, donde se va a escoger con cual Entrenador quieres pelear
    public void showSelectGymEntrenadorPantalla(ActionEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("SelectGymEntrenadorPantalla.fxml")));
            Parent root = loader.load();
            SelectGymEntrenadorPantalla controller = loader.<SelectGymEntrenadorPantalla>getController();
            controller.receiveMotorInstance(this, medallasSiYaSeTienen);
            Scene SelectGymEntrenadorPantallaScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(SelectGymEntrenadorPantallaScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    //Métodos para mostrar el Pokedex con ActionEvent y MouseEvent
    public void showPokedex(ActionEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("Pokedex.fxml")));
            Parent root = loader.load();
            Pokedex controller = loader.<Pokedex>getController();
            controller.receiveMotorInstance(this, beltPokemon, bankPokemon, allPokemon, pokedexOpp);
            Scene PokedexScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(PokedexScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public void showPokedex2(MouseEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("Pokedex.fxml")));
            Parent root = loader.load();
            Pokedex controller = loader.<Pokedex>getController();
            controller.receiveMotorInstance(this, beltPokemon, bankPokemon, allPokemon, pokedexOpp);
            Scene PokedexScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(PokedexScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    //Método para mostrar la pantalla SearchPokePntalla, donde se escoge se muestra la informacion del pokemon
    public void showSearchPokePantalla(ActionEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("SearchPokePantalla.fxml")));
            Parent root = loader.load();
            SearchPokePantalla controller = loader.<SearchPokePantalla>getController();
            controller.receiveMotorInstance(this, bankPokemon,searchPokemon);
            Scene SearchPokePantallaScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(SearchPokePantallaScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    //Método para mostrar la pantalla GymsPantalla, donde se pelea con los pokemones del entrenador
    public void showGymsPantalla(ActionEvent event)
    {
        try
        {
            FXMLLoader loader = new FXMLLoader((getClass().getResource("GymsPantalla.fxml")));
            Parent root = loader.load();
            GymsPantalla controller = loader.<GymsPantalla>getController();

            if(entrenadorChose == "Whitney")
            {
                entrenador = whitney;
            }
            else if(entrenadorChose == "Brock")
            {
                entrenador = brock;

            }
            else if(entrenadorChose == "Pryce")
            {
                entrenador = pryce;
            }
            else if(entrenadorChose == "Erika")
            {
                entrenador = erika;
            }
            else if(entrenadorChose == "Koga")
            {
                entrenador = koga;
            }
            else if(entrenadorChose == "Surge")
            {
                entrenador = surge;
            }
            else if(entrenadorChose == "Blaine")
            {
                entrenador = blaine;
            }

            controller.receiveMotorInstance(this, beltPokemon, bankPokemon,entrenador, gender, userName,monedero,starterPokemon,experience,nivel, entrenadorChose,simplePotionOwn,superPotionOwn,maxPotionOwn);
            Scene GymsPantallaScene = new Scene(root,800, 560);


            Stage currentStage = (Stage)((Node) event.getSource()).getScene().getWindow();

            currentStage.hide();
            currentStage.setScene(GymsPantallaScene);
            currentStage.show();
        }

        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
