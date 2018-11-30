/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *classe treinador calcula vida e escolheAtaque 
 * @author Arthur
 */
public class Treinador {
    private float vidaTotal;
    Pokemon p1;
    Pokemon p2;
    Pokemon p3;
    Pokemon p4;
    Pokemon p5;
    Pokemon p6;
    Pokemon p7;
    Pokemon p8;
    Pokemon p9;
    Pokemon p10;
    Pokemon p11;
    Pokemon p12; 
    Time t1;
    Time t2;
    Time t3;
    Time t4;

    /**
     *declara time de pokemons
     */
    public Time time = new Time();

    /**
     *energia para usar habilidade
     */
    public int mana = 100;
	
    /**
     *inicializa a funcao treinador
     * @param t
     */
    public Treinador(Time t) {
        this.time = t;
        vidaTotal = t.pokemons.get(0).healthPoints + t.pokemons.get(1).healthPoints + t.pokemons.get(2).healthPoints;
    }

    Treinador() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    /**
     *A vida total de todos pokemons somados
     */
    public void calculaVida(){
        vidaTotal = time.pokemons.get(0).healthPoints + time.pokemons.get(1).healthPoints + time.pokemons.get(2).healthPoints;
    }

    /**
     *retorna a vida total
     * @return
     */
    public float getVidaTotal() {
        return vidaTotal;
    }

    /**
     *determina a vida total
     * @param vidaTotal
     */
    public void setVidaTotal(float vidaTotal) {
        this.vidaTotal = vidaTotal;
    }
      	
    /**
     *funcao que determina qual ataque é usado e seu dano
     * @return
     */
    public int escolheAtaque(Pokemon p){      
        int choice=-1;
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        int ler;
        System.out.println("Qual ataque vc quer utilizar? \n1- ♠ " + p.habilidades[0] + " - com custo 75mp, \n2- ♠ " + p.habilidades[1] + " - com custo 50mp \n3- ♠ " + p.habilidades[2] + " - com custo 25mp \n4- ♣ Passar a vez");
        ler = reader.nextInt();
        choice=choice+ler;
        if(choice==0||choice==1||choice==2||choice==3){
        return choice;
        }
        else{
            while(choice!=1&&choice!=2&&choice!=3&&choice!=4){
            System.out.println("► Insira um ataque válido ◄");
            choice=-1;
            ler = reader.nextInt();
            choice=choice+ler;
            } 
        }
        return choice;
    }
    
    
}
