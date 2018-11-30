package classesPokemons;
import pokemon.Pokemon;
import tiposPokemon.TipoFogo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Pokemon tipo fogo 150hp
 * @author Arthur
 */
public class Charizard extends TipoFogo {

    /**
     *150 de hp
     */
    public Charizard() {
           nome = "Charizard";
    this.healthPoints =150;
             nomeTipo="Fogo";
          tipo = 2;   // 0-Agua ; 1-Eletrico ; 2-Fogo ; 3-Normal ; 4-Pedra ; 5-Planta ; 6-Psiquico
        //habilidades[0] = ""; habilidades[1] = ""; habilidades[2] = "";
        habilidades[0] ="FireBlast";
        habilidades[1]="Overheat";
        habilidades[2]="BlastBurn";

        
    }
    
  
    
}
