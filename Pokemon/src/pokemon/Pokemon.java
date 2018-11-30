package pokemon;

import java.util.ArrayList;

/**
 *Classe pokemon contem todos atributos vida,mana,tipo
 * @author joao
 */
public class Pokemon {
	
    /**
     *Nome do pokemon
     */
    public String nome;

    /**
     *string do tipo do pokemon 
     */
    public String nomeTipo;

    /**
     * tipo do pokemon : Agua,Eletrico...etc
     */
    public int tipo; 

    /**
     *  vetor das habilidades de ataque do pokemon 
     */
    public String[] habilidades = new String[3];

    /**
     *Multiplicador das habiliades de acordo com seu dano
     */
    public float[] multiHabilidades = {2,1.5f,1,0};

    /**
     *custa de uso de cada habilidade
     */
    public int[] manaPoints = {75,50,25,0};

    /**
     *vida do pokemon
     */
    public float healthPoints;

    /**
     *dano apos verificar vantagens e desvantagens
     */
    public float danoAtual = 10;

    /**
     *dano do pokemon
     */
    public float dano;

  
       
        // 0-Agua ; 1-Eletrico ; 2-Fogo ; 3-Normal ; 4-Pedra ; 5-Planta ; 6-Psiquico

    /**
     *vetor de vantanges contra outros tipos
     */
        public int[] vantagens; 

   
        
    /**
     *
     * @param index
     * @return
     */
    public float calculaAtaque(int index){
            dano = danoAtual;
            dano = dano * multiHabilidades[index];
            return dano;
        }
        



}
