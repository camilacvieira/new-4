package classesPokemons;
import pokemon.Pokemon;
import tiposPokemon.TipoEletrico;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Pokemon tipo eletrico 100hp
 * @author Arthur
 */
public class Jolteon extends TipoEletrico {

    /**
     *  
     */
    public Jolteon() {
      nome = "Jolteon";
          this.healthPoints =100;
             nomeTipo="Eletrico";
          tipo = 1;   // 0-Agua ; 1-Eletrico ; 2-Fogo ; 3-Normal ; 4-Pedra ; 5-Planta ; 6-Psiquico
        //habilidades[0] = ""; habilidades[1] = ""; habilidades[2] = "";
        habilidades[0] ="ThunderShock";
        habilidades[1]="Thunderbolt";
        habilidades[2]="VoltSwitch";
        

        
    }
    
  
    
}
