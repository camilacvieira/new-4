/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;
/**
 *Classe que determina como a batalha funciona
 * @author ice
 */
public class Batalha {

    private Pokemon p1 = new Pokemon();
    private Pokemon p2 = new Pokemon();
    private Treinador t1 = new Treinador();
    private Treinador t2 = new Treinador();
     
    /**
     *inicializa os treinadores
     * @param t1 time 1
     * @param t2 time 2
     */
    public Batalha(Treinador t1 , Treinador t2) {
        this.t1 = t1;
        this.t2 = t2;
    }
    
    /**
     *funcao que roda a batalha
     */
    public void comecarBatalha(){
        System.out.println(" ☆☆☆☆☆ Vamos começar! ☆☆☆☆☆ ");
        while(t1.getVidaTotal()>0&&t2.getVidaTotal()>0)
        {
            pokemonAtual();
            round(); 
            //System.out.println("t1 vida "+t1.getVidaTotal());
            //System.out.println("t2 vida "+t2.getVidaTotal());
            //System.out.println("t1 mana "+t1.mana);
            //System.out.println("t2 mana "+t2.mana);
            
        }
            System.out.println("Total de vida: "+ "Jogador 1: "+ t1.getVidaTotal()+"Jogador 2: "+t2.getVidaTotal());  
            if(t1.getVidaTotal()>t2.getVidaTotal())
                   System.out.println(" ☆☆☆☆☆ TREINADOR 1 GANHOU ☆☆☆☆☆ ");
            else if(t2.getVidaTotal()>t1.getVidaTotal())
                   System.out.println(" ☆☆☆☆☆ TREINADOR 2 GANHOU ☆☆☆☆☆ ");
            else 
                   System.out.println(" ☆☆☆☆☆ EMPATOU ☆☆☆☆☆ ");
}
    
    /**
     *verifica qual o pokemon atual ,sua vida e se morreu
     */
    public void pokemonAtual(){
        for(int i = 0 ; i < t1.time.pokemons.size() ; i++){
            if(t1.time.pokemons.get(i).healthPoints > 0){ // Ve se o Pokemon tem vida maior que 0, se não tiver muda para o proximo.
                p1 = t1.time.pokemons.get(i);
                break;
            }
            if(p1.healthPoints==0){
                           System.out.println(" ††† Treinador 1 O Pokemon "+p1.nome+" morreu!, próximo ††† ");
            }
        }
        
        for(int i = 0 ; i < t2.time.pokemons.size() ; i++){
            if(t2.time.pokemons.get(i).healthPoints > 0){ // Ve se o Pokemon tem vida maior que 0, se não tiver muda para o proximo.
                p2 = t2.time.pokemons.get(i);
                break;
            }
            if(p2.healthPoints==0){
            System.out.println(" ††† Treinador 2 O Pokemon "+p2.nome+" morreu!, próximo ††† ");
            }
        }      
    }
    
    /**
     *verifica se tem vantagem contra algum tipo
     */
    public void checaVantagem(){
     
        boolean flag = false;
        for(int i=0; i<p1.vantagens.length ; i++){
            if(p1.vantagens[i] == p2.tipo){
                p1.danoAtual = p1.danoAtual* (1.5f);
                flag = true;
                break;
            }
        }
        
        if(flag == false){
            for(int i=0; i<p2.vantagens.length ; i++){
               if(p2.vantagens[i] == p1.tipo){
                    p1.danoAtual = p1.danoAtual* (1.5f);
                    break;
                }
           }
        }
    }    
    
    /**
     *determina quem vai atacar no round da batalhha
     */
    public void round(){
        //checaVantagem();
        System.out.println("=======================================================================");
        System.out.println("Ataque treinador 1:  ");
        System.out.println("Pokemon - " + p1.nome);
        ataque(1);
        System.out.println("=======================================================================");
        System.out.println("Ataque treinador 2:  ");
        System.out.println("Pokemon - " + p2.nome);
        ataque(2);
        pokemonAtual();
        System.out.println("=======================================================================");
        System.out.println("***********************************************************************");
        System.out.println("Treinadores recuperem 20 de mana!");
        recuperaManaPoints(t1,t2);
        System.out.println("***********************************************************************");
    }
     
    /**
     *determina qual ataque vai ser usado ao clicar o botao
     * @param numTreinador
     */
    public void ataque(int numTreinador){
        // Ter os botoes com as habilidadades
        // Selecionar o que apertar
        // Se aperta o botao de cima choice = 0
        // Se aperta o do meio choice = 1
        // Se aperta o ultimo choice = 2
        
        int choice = -1;
        float dano = 0;
        
        if(numTreinador == 1){
            choice=t1.escolheAtaque(p1);
            System.out.println("Pokemon: " + p1.nome);
            System.out.println("♥ Vida do pokemon: " + p1.healthPoints);
            if(p1.manaPoints[choice] <= t1.mana){
               dano = p1.calculaAtaque(choice);
               p2.healthPoints = p2.healthPoints - dano;
               t2.setVidaTotal(t2.getVidaTotal() - dano);
               t1.mana = t1.mana - p1.manaPoints[choice];
               System.out.println("♠ Dano feito: "+dano);
               System.out.println("♦ ManaPoint(mp) Restante:"+t1.mana);
               System.out.println("♥ Vida pos ataque do pokemon " +p2.nome +": " +p2.healthPoints);
            }
            else{
                 while(p1.manaPoints[choice]>t1.mana){
                     System.out.println("♦ ManaPoint(mp) insuficiente,vc tem "+t1.mana+"ManaPoint(mp) Jogue novamente");
                     choice=t1.escolheAtaque(p1);
                 }
             }
        }    
        
        else{
            choice=t2.escolheAtaque(p2);
            
            System.out.println("♥ Vida do pokemon: " +p2.healthPoints);
             if(p2.manaPoints[choice] <= t2.mana){
               dano = p2.calculaAtaque(choice);
               p1.healthPoints = p1.healthPoints - dano;
               t1.setVidaTotal(t1.getVidaTotal() - dano);
               t2.mana = t2.mana - p2.manaPoints[choice];
               System.out.println("♠ Dano feito: "+dano);
               System.out.println("♦ ManaPoint(mp) Restante:"+t2.mana);
               System.out.println("♥ Vida pos ataque do pokemon " +p1.nome +": " +p1.healthPoints);
            }
             else{
                 while(p2.manaPoints[choice]>t2.mana){
                     System.out.println("ManaPoint(mp) insuficiente,voce tem "+t2.mana+"ManaPoint(mp) Jogue novamente");
                     choice=t2.escolheAtaque(p2);
                 }
                 
             }        
        }
             
    }
    
    /**
     *funcao que aumenta a mana a cada round
     * @param t1
     * @param t2
     */
    public void recuperaManaPoints(Treinador t1, Treinador t2){
        t1.mana=t1.mana+20;
        t2.mana=t2.mana+20;
    }
      
}
    
    
             

