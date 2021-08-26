package viewControllers;

import java.util.ArrayList;

public class juegoPokemon {

    //Creación de areas
    private static  ArrayList<Pokemon> desierto = new ArrayList<>();
    private static   ArrayList<Pokemon> bosque = new ArrayList<>();
    private static  ArrayList<Pokemon> selva = new ArrayList<>();
    private static  ArrayList<Pokemon> playa = new ArrayList<>();

    //creación de pokemones
    //50 para abajo




    //sha

    private static Pokemon raticate  = new Pokemon("Raticate ", "Normal", "Chico",20);
    private static Pokemon rattata  = new Pokemon("Rattata ", "Normal", "Chico",20, raticate);

    private static Pokemon fearow  = new Pokemon("Fearow ", "Normal/Volador", "Grande",20);
    private static Pokemon spearow  = new Pokemon("Spearow ", "Normal/Volador", "Grande",20, fearow);

    private static Pokemon arbok  = new Pokemon("Arbok ", "Veneno", "Mediano",20);
    private static Pokemon ekans  = new Pokemon("Ekans ", "Veneno", "Mediano",20, arbok);

    private static Pokemon raichu  = new Pokemon("Raichu ", "Eléctrico", "Mediano",20);
    private static Pokemon pikachu  = new Pokemon("Pikachu ", "Eléctrico", "Mediano",20, raichu);

    private static Pokemon sandslash  = new Pokemon("Sandslash ", "Tierra", "Mediano",20);
    private static Pokemon sandshrew  = new Pokemon("Sandshrew ", "Tierra", "Mediano",20, sandslash);

    private static Pokemon nidoqueen  = new Pokemon("Nidoqueen ", "Veneno/Tierra", "Grande",20);
    private static Pokemon nidorina  = new Pokemon("Nidorina ", "Veneno", "Grande",20, nidoqueen);
    private static  Pokemon nidoranMujer  = new Pokemon("NidoranHombre ", "Veneno", "Grande",20, nidorina);

    private static Pokemon nidoking  = new Pokemon("Nidoking ", "Veneno/Tierra", "Grande",20);
    private static Pokemon nidorino  = new Pokemon("Nidorino ", "Veneno", "Grande",20, nidoking);
    private static  Pokemon nidoranHombre  = new Pokemon("Nidoran ", "Veneno", "Grande",20, nidorino);

    private static Pokemon clefable  = new Pokemon("Clefable ", "Normal", "Chico",20);
    private static Pokemon clefairy  = new Pokemon("Clefairy ", "Normal", "Chico",20, clefable);

    private static Pokemon ninetales  = new Pokemon("Ninetales ", "Fuego", "Chico",20);
    private static Pokemon vulpix  = new Pokemon("Vulpix ", "Fuego", "Chico",20, ninetales);

    private static Pokemon wigglytuff  = new Pokemon("Wigglytuff ", "Normal ", "Chico",20);
    private static Pokemon jigglypuff  = new Pokemon("Jigglypuff ", "Normal ", "Chico",20, wigglytuff);

    private static Pokemon golbat  = new Pokemon("Golbat ", "Veneno/Volador  ", "Chico",20);
    private static Pokemon zubat  = new Pokemon("Zubat ", "Veneno/Volador ", "Mediano",20, golbat);

    private static  Pokemon vileplume  = new Pokemon("Vileplume ", "Planta/Veneno", "Mediano",20);
    private static Pokemon gloom  = new Pokemon("Gloom ", "Planta/Veneno", "Chico",20,vileplume);
    private static Pokemon oddish  = new Pokemon("Oddish ", "Planta/Veneno", "Chico",20, gloom);

    private static Pokemon parasect  = new Pokemon("Parasect ", " Bicho/Planta", "Chico",20);
    private static Pokemon paras  = new Pokemon("Parasect ", " Bicho/Planta ", "Chico",20, parasect);

    private static Pokemon venomoth  = new Pokemon("Venomoth ", "Bicho/Veneno", "Chico",20);
    private static Pokemon venonat  = new Pokemon("Venonat ", "Bicho/Veneno", "Chico",20, venomoth);

    private static Pokemon dugtrio  = new Pokemon("Dugtrio ", "Tierra", "Chico",20);
   //50 para abjo
    private static Pokemon diglett  = new Pokemon("Diglett ", "Tierra", "Chico",20, dugtrio);

    private static Pokemon persian  = new Pokemon("Persian ", "Normal", "Chico",20);
    private static  Pokemon meowth  = new Pokemon("Meowth ", "Normal", "Chico",20, persian);

    private static  Pokemon golduck  = new Pokemon("Golduck ", "Agua ", "Grande",20);
    private static  Pokemon psyduck  = new Pokemon("Psyduck ", "Agua", "Chico",20, golduck);

    private static  Pokemon primeape  = new Pokemon("Primeape ", "Lucha ", "Grande",20);
    private static   Pokemon mankey  = new Pokemon("Mankey ", "Lucha ", "Mediano",20, primeape);

    private static   Pokemon arcanine  = new Pokemon("Arcanine ", "Fuego ", "Grande",20);
    private static  Pokemon growlithe  = new Pokemon("Growlithe ", "Fuego ", "Grande",20, arcanine);

    private static  Pokemon poliwrath  = new Pokemon("Poliwrath ", "Agua/Lucha ", "Grande",20);
    private static   Pokemon poliwhirl  = new Pokemon("Poliwhirl ", "Agua ", "Mediano",20, poliwrath);
    private static   Pokemon poliwag  = new Pokemon("Poliwag ", "Agua ", "Chico",20, poliwhirl);

    private static  Pokemon alakazam  = new Pokemon("Alakazam ", "Psíquico ", "Grande",20);
    private static  Pokemon kadabra  = new Pokemon("Kadabra ", "Psíquico ", "Mediano",20, alakazam);
    private static  Pokemon abra  = new Pokemon("Abra ", "Psíquico ", "Chico",20, kadabra);

    private static  Pokemon machamp  = new Pokemon("Machamp ", "Lucha ", "Grande",20);
    private static  Pokemon machoke  = new Pokemon("Machoke ", "Lucha ", "Mediano",20, machamp);
    private static  Pokemon machop  = new Pokemon("Machop ", "Lucha ", "Chico",20, machoke);

    private static  Pokemon victreebel  = new Pokemon("Victreebel ", "Planta/Veneno ", "Grande",20);
    private static  Pokemon weepinbell  = new Pokemon("Weepinbell ", "Planta/Veneno ", "Chico",20, victreebel);
    private static  Pokemon bellsprout  = new Pokemon("Bellsprout ", "Planta/Veneno ", "Chico",20, weepinbell);

    private static  Pokemon tentacruel  = new Pokemon("Tentacruel ", " Agua/Veneno", "Grande",20);
    private static  Pokemon tentacool  = new Pokemon("Tentacool ", " Agua/Veneno ", "Mediano",20, tentacruel);

    private static  Pokemon golem  = new Pokemon("Golem ", "Roca/Tierra ", "Mediano",20);
    private static  Pokemon graveler  = new Pokemon("Graveler ", "Roca/Tierra ", "Chico",20,golem);
    private static Pokemon geodude  = new Pokemon("Geodude ", "Roca/Tierra ", "Chico",20, graveler);

    private static  Pokemon rapidash  = new Pokemon("Golduck ", "Fuego ", "Chico",20);
    private static  Pokemon ponyta  = new Pokemon("Golduck ", "Fuego ", "Chico",20, rapidash);

    private static  Pokemon slowbro  = new Pokemon("Slowbro ", " Agua/Psíquico ", "Grande",20);
    private static  Pokemon slowpoke  = new Pokemon("Slowpoke ", " Agua/Psíquico ", "Grande",20, slowbro);

    private static  Pokemon magneton  = new Pokemon("Magneton ", "Eléctrico/Acero ", "Mediano",20);
    private static  Pokemon magnemite  = new Pokemon("Magnemite ", "Eléctrico ", "Chico",20, magneton);

    private static  Pokemon dodrio  = new Pokemon("Dodrio ", "Normal/Volador ", "Grande",20);
    private static  Pokemon doduo  = new Pokemon("Doduo ", "Normal/Volador ", "cHICO",20, dodrio);
    private static  Pokemon farfetchd  = new Pokemon("Farfetchd ", "Normal/Volador ", "Mediano",20, doduo);

    private static  Pokemon dewgong  = new Pokemon("Dewgong ", "Agua/Hielo ", "Grande",20);
    private static   Pokemon seel  = new Pokemon("Seel ", "Agua ", "Chico",20, dewgong);

    private static   Pokemon muk  = new Pokemon("Muk ", "Agua ", "Chico",20);
    private static  Pokemon grimer  = new Pokemon("Grimer ", "Agua ", "Chico",20, muk);

    private static Pokemon cloyster  = new Pokemon("Cloyster ", "Agua/Hielo ", "Grande",20);
    private static  Pokemon shellder  = new Pokemon("Shellder ", "Agua ", "Chico",20, cloyster);

    private static Pokemon gengar  = new Pokemon("Gengar ", "Fantasma/Veneno ", "Grande",20);
    private static Pokemon haunter  = new Pokemon("Haunter ", "Fantasma/Veneno ", "Mediano",20, gengar);
    private static Pokemon gastly  = new Pokemon("Gastly ", "Fantasma/Veneno ", "Chico",20, haunter);

    private static Pokemon onix  = new Pokemon("Onix ", "Roca/Tierra ", "Mediano",20);

    private static  Pokemon hypno  = new Pokemon("Hypno ", "Psíquico ", "Grande",20);
    private static Pokemon drowzee  = new Pokemon("Drowzee ", "Psíquico ", "Grande",20, hypno);

    private static Pokemon kingler  = new Pokemon("Kingler ", "Agua ", "Grande",20);
    private static Pokemon krabby  = new Pokemon("Krabby ", "Agua ", "Chico",20, kingler);

    private static Pokemon electrode  = new Pokemon("Electrode ", "Eléctrico ", "Chico",20);
   //51 para abajo
    private static Pokemon voltorb  = new Pokemon("Voltorb ", "Eléctrico ", "Chico",20, electrode);

    private static Pokemon exeggutor  = new Pokemon("Exeggutor ", "Planta/Psíquico ", "Grande",20);
    private static Pokemon exeggcute  = new Pokemon("Exeggcute ", "Planta/Psíquico ", "Chico",20, exeggutor);

    private static  Pokemon marowak  = new Pokemon("Marowak ", "Tierra ", "Grande",20);
    private static Pokemon cubone  = new Pokemon("Cubone ", "Tierra ", "Grande",20, marowak);

    private static Pokemon hitmonlee  = new Pokemon("Hitmonlee ", "Lucha ", "Grande",20);

    private static Pokemon hitmonchan  = new Pokemon("Hitmonchan ", "Lucha ", "Grande",20);

    private static Pokemon weezing  = new Pokemon("Weezing ", "Agua ", "Grande",20);
    private static Pokemon koffing  = new Pokemon("Koffing ", "Agua ", "Grande",20, weezing);
    private static Pokemon lickitung  = new Pokemon("Lickitung ", "Agua ", "Grande",20, koffing);

    private static Pokemon rhydon  = new Pokemon("Rhydon ", "Tierra/Roca ", "Grande",20);
    private static Pokemon rhyhorn  = new Pokemon("Rhyhorn ", "Tierra/Roca ", "Chico",20, rhydon);

    private static Pokemon chansey  = new Pokemon("Chansey ", "Normal ", "Chico",20);

    private static Pokemon tangela  = new Pokemon("Tangela ", "Planta ", "Chico",20);

    private static Pokemon kangaskhan  = new Pokemon("Kangaskhan ", "Normal ", "Grande",20);

    private static Pokemon seadra  = new Pokemon("Seadra ", "Agua ", "Chico",20);
    private static Pokemon horsea  = new Pokemon("Horsea ", "Agua ", "Chico",20, seadra);

    private static  Pokemon seaking  = new Pokemon("Seaking ", "Agua ", "Grande",20);
    private static Pokemon goldeen  = new Pokemon("Goldeen ", "Agua ", "Chico",20, seaking);

    private static Pokemon starmie  = new Pokemon("Starmie ", "Agua ", "Chico",20);
    private static Pokemon staryu  = new Pokemon("Staryu ", "Agua/Psíquico ", "Chico",20, starmie);

    private static Pokemon mrMime  = new Pokemon("Mr. Mime ", "Psíquico  ", "Grande",20);

    private static Pokemon scyther  = new Pokemon("Scyther ", "Bicho/Volador ", "Mediano",20);

    private static Pokemon jynx  = new Pokemon("Jynx ", " Hielo/Psíquico ", "Mediano",20);

    private static Pokemon electabuzz  = new Pokemon("Electabuzz ", "Eléctrico ", "Grande",20);

    private static Pokemon magmar  = new Pokemon("Magmar ", "Fuego ", "Grande",20);

    private static Pokemon pinsir  = new Pokemon("Pinsir ", "Bicho ", "Mediano",20);

    private static Pokemon tauros  = new Pokemon("Tauros ", "Normal ", "Grande",20);

    private static Pokemon gyarados  = new Pokemon("Gyarados ", "Agua/Volador ", "Grande",20);
    private static Pokemon magikarp  = new Pokemon("Magikarp ", "Agua ", "Mediano",20, gyarados);

    private static Pokemon lapras  = new Pokemon("Lapras ", "Agua/Hielo ", "Grande",20);

    private static Pokemon ditto  = new Pokemon("Ditto ", "Normal", "Chcico",20);

    private static  Pokemon eevee   = new Pokemon("Eevee  ", "Normal ", "Chcico",20);

    private static Pokemon vaporeon  = new Pokemon("Vaporeon ", "Agua ", "Mediano",20);

    private static Pokemon jolteon  = new Pokemon("Jolteon ", "Eléctrico ", "Mediano",20);

    private static  Pokemon flareon  = new Pokemon("Flareon ", "Fuego ", "Mediano",20);

    private static Pokemon porygon  = new Pokemon("Porygon ", "Normal ", "Chico",20);

    private static  Pokemon omastar  = new Pokemon("Omastar ", "Roca/Agua ", "Chico",20);
    private static  Pokemon omanyte  = new Pokemon("Omanyte ", "Roca/Agua ", "Chco",20, omastar);

    private static  Pokemon kabutops  = new Pokemon("Kabutops ", "Roca/Agua ", "Grande",20);
    private static  Pokemon kabuto  = new Pokemon("Machamp ", "Roca/Agua ", "Chico",20, kabutops);

    private static Pokemon aerodactyl  = new Pokemon("Aerodactyl ", "Roca/Volador ", "Grande",20);

    private static  Pokemon snorlax  = new Pokemon("Snorlax ", "Normal ", "Grande",20);

    private static Pokemon articuno  = new Pokemon("Articuno ", "Hielo/Volador ", "Grande",20);

    private static  Pokemon zapdos  = new Pokemon("Zapdos ", "Eléctrico/Volador ", "Grande",20);

    private static  Pokemon moltres  = new Pokemon("Moltres ", "Fuego/Volador ", "Grande",20);

    private static  Pokemon dragonite  = new Pokemon("Dragonite ", "Dragón/Volador ", "Grande",20);
    private static  Pokemon dragonair  = new Pokemon("Dragonair ", "Dragón ", "Grande",20,dragonite);
    private static Pokemon dratini  = new Pokemon("Dratini ", "Dragón ", "Grande",20, dragonair);

    private static  Pokemon mewtwo  = new Pokemon("Mewtwo ", "Psíquico ", "Grande",20);

    private static  Pokemon mew  = new Pokemon("Mew ", "Psíquico ", "Chico",20);


  /*  public static void creacionHabilidadesYAgregarPokemon() {

        habilidades espesura = new habilidades("Espesura", 3);
        habilidades clorifila = new habilidades("Clorifila", 4);



        // charmander y sus evoluciones
        habilidades marLlamas = new habilidades("Mar llamas", 4);
        habilidades poderSolar = new habilidades("Poder solar", 5);



        // charmander y sus evoluciones

        habilidades curaLluvia = new habilidades("Cura lluvia", 6);
        habilidades torrente = new habilidades("Torrente", 4);



        // Caterpie y sus evoluciones
        habilidades ojoCompuesto = new habilidades("Cura lluvia", 6);
        habilidades cromolente = new habilidades("Torrente", 4);
        habilidades mudar = new habilidades("Mudar", 4);
        habilidades polvoEscudo = new habilidades("Polvo escudo", 4);
        habilidades fuga = new habilidades("fuga", 4);




        // Weedle y sus evoluciones

        habilidades enjambre = new habilidades("Enjambre", 3);
        habilidades francotirador = new habilidades("Francotirador", 2);


        // Pidgey y sus evoluciones
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
        habilidades agallas = new habilidades("Agallas", 7);
        habilidades entusiasmo = new habilidades("Entusiasmo", 3);

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
        habilidades intimidacion = new habilidades("Agallas", 7);
        habilidades nerviosismo = new habilidades("Entusiasmo", 3);

        arbok.addArrayHabildiades(intimidacion);
        arbok.addArrayHabildiades(mudar);
        arbok.addArrayHabildiades(nerviosismo);

        ekans.addArrayHabildiades(intimidacion);
        ekans.addArrayHabildiades(mudar);
        ekans.addArrayHabildiades(nerviosismo);


        // Pikachu y sus evoluciones
        habilidades electricidadEstatica = new habilidades("Agallas", 4);
        habilidades pararrayos = new habilidades("Entusiasmo", 3);

        raichu.addArrayHabildiades(electricidadEstatica);
        raichu.addArrayHabildiades(pararrayos);

        pikachu.addArrayHabildiades(electricidadEstatica);
        pikachu.addArrayHabildiades(pararrayos);


        // Sandshrew y sus evoluciones
        habilidades veloArena = new habilidades("Agallas", 7);
        habilidades impetuArena = new habilidades("Entusiasmo", 3);

        sandslash.addArrayHabildiades(veloArena);
        sandslash.addArrayHabildiades(impetuArena);

        sandshrew.addArrayHabildiades(veloArena);
        sandshrew.addArrayHabildiades(impetuArena);


        // NidoranMujer y sus evoluciones
        habilidades puntoToxico = new habilidades("Agallas", 4);
        habilidades rivalidad = new habilidades("Entusiasmo", 3);
        habilidades potenciaBruta = new habilidades("Entusiasmo", 3);

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
        habilidades tenacidad = new habilidades("Muro Mágico", 5);
        habilidades cacheo = new habilidades("Gran Encanto", 3);

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
    }

   */

    public static void agregarPokemonesArea()
    {

        /*

        DESIERTO
        POKEMONES QUE PERTENECEN AL AREA.


         */
        /*
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








        playa.add(squirtle);
        playa.add(wartortle);
        playa.add(blastoise);
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
        */

    }


}
