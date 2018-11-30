package pokemon;
import classesPokemons.Pikachu;
import classesPokemons.Blastoise;
import classesPokemons.Bulbassauro;
import classesPokemons.Charizard;
import classesPokemons.Charmander;
import classesPokemons.Flareon;
import classesPokemons.Gyrados;
import classesPokemons.Jolteon;
import classesPokemons.Onix;
import classesPokemons.Squirtle;
import classesPokemons.Venossauro;
import classesPokemons.Vaporeon;

import java.util.Scanner;
        
        
                

        
class trabalhoPokemon {
	public static void main(String[] args) {
            
            
            //IniciaJogo jogo = new IniciaJogo();
            
            
            Pokemon p1 = new Pikachu();
            Pokemon p2 = new Blastoise();
            Pokemon p3 = new Bulbassauro();
            Pokemon p4 = new Charizard();
            Pokemon p5 = new Charmander();
            Pokemon p6 = new Flareon();
            Pokemon p7 = new Gyrados();
            Pokemon p8 = new Jolteon();
            Pokemon p9 = new Onix();
            Pokemon p10 = new Venossauro();
            Pokemon p11 = new Vaporeon();
            Pokemon p12 = new Squirtle();
            Time t1 = new Time(p5,p11,p10);
            Time t2 = new Time(p12,p6,p7);
            Time t3 = new Time(p3,p8,p2);
            Time t4 = new Time(p1,p4,p9);
            Time escolhido1 = new Time();
            Time escolhido2 = new Time();
            
            System.out.println("☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺\nBEM VINDOS TREINADORES,\nESTE JOGO É UM JOGO POR TURNOS\nCADA TREINADOR TERÁ UM TIME DE 3 POKEMONS,\nASSIM QUE TODOS OS POKÉMONS DE UM TREINADOR MORREREM O JOGO ACABA\n\n►►► INSTRUÇÕES ◄◄◄\n• CADA TREINADOR ESCOLHE UM TIME \n• OS TREINADORES DEVEM ESCOLHER ENTRE 3 OPÇÕES DE ATAQUE,\n• MAS FIQUEM ATENTOS, CADA TREINADOR POSSUI PONTOS DE MANA\n• PONTOS OS QUAIS SÃO CONSUMIDOS AO UTILIZAR UM ATAQUE\n• A CADA TURNO SÃO RECUPERADOS 20 PONTOS DE MANA DE CADA TREINADOR");
            System.out.println(" ☺☺☺☺☺☺☺☺☺☺ VAMOS COMEÇAR? ☺☺☺☺☺☺☺☺☺☺ \n\n\n");

            System.out.println("Qual time você quer treinador 1"); 
            System.out.println("1 - Time 1 (Charmander, Vaporeon, Venossauro)");
            System.out.println("2- Time 2(Squirtle, Flareon, Gyrados)");
            System.out.println("3- Time 3(Bulbassauro,Jolteon,Blastoize)");
            System.out.println("4- Time 4 (Charizard, Onyx, Pikachu)");
            
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            Time timeA=t3;
            int i = reader.nextInt();
            System.out.println("=======================================================================");
            if(i==1){
                timeA= t1; 
                System.out.println("Charmander, Vaporeon, Venossauro"); 
                System.out.println("=======================================================================");
            }
            if(i==2){
                timeA= t2; 
                System.out.println("Squirtle, Flareon, Gyrados"); 
                System.out.println("=======================================================================");
            }
            if(i==3){
                timeA= t3; 
                System.out.println("Bulbassauro,Jolteon,Blastoize"); 
                System.out.println("=======================================================================");
            }
            if(i==4){
                timeA= t4; 
                System.out.println("Charizard, Onyx, Pikachu"); 
                System.out.println("=======================================================================");
            }
            
            System.out.println("Qual time você quer treinador 2 ?"); 
            System.out.println("1 - Time 1 (Charmander, Vaporeon, Venossauro)");
            System.out.println("2- Time 2(Squirtle, Flareon, Gyrados)");
            System.out.println("3- Time 3(Bulbassauro,Jolteon,Blastoize)");
            System.out.println("4- Time 4 (Charizard, Onyx, Pikachu)");
            Scanner readerB = new Scanner(System.in);  // Reading from System.in
            Time timeB=t2;
            int j = reader.nextInt();
            System.out.println("=======================================================================");
            if(j==1){
                timeB= t1; 
                System.out.println("Charmander, Vaporeon, Venossauro"); 
                System.out.println("=======================================================================");
            }
            if(j==2){
                timeB= t2; 
                System.out.println("Squirtle, Flareon, Gyrados"); 
                System.out.println("=======================================================================");
            }
            if(j==3){
                timeB= t3; 
                System.out.println("Bulbassauro, Jolteon, Blastoize"); 
                System.out.println("=======================================================================");
            }
            if(j==4){
                timeB= t4; 
                System.out.println("Charizard, Onyx, Pikachu");
                System.out.println("=======================================================================");
            }
            
             Treinador A = new Treinador(timeA);
             Treinador B = new Treinador(timeB);
             Batalha Bat = new Batalha(A,B);
             Bat.comecarBatalha();
             
	}
}
