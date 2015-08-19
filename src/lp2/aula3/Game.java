
package lp2.aula3;

import java.io.File;
import java.util.Random;


public class Game {
    private Gamer gamer;
    private int number;
    
    public Game(Gamer gamer) {
        this.gamer=gamer;
        boolean cont = true;
        do{
            String resp = IOManager.readKey("Quer Jogar? (S/N)");
            if(resp.equalsIgnoreCase("S")){
            gameLogic();
            }else{
                cont=false;
            }
        }while(cont);
        String resp2 = IOManager.readKey("Quer salvar o seu jogo?(S/N)");
        if(resp2.equalsIgnoreCase("s")){
            gamer.setLastScore(gamer.getCurrentScore());
            if(gamer.getCurrentScore() > gamer.getMaxScore()){
                gamer.setMaxScore(gamer.getCurrentScore());
            }
                    File file = new File("score.txt");
                    IOManager.writeGamer(gamer, file);
                    System.out.println("Seu jogo foi salvo");
        }else{
            System.out.println("Fechando  o jogo");
        }
            
        
    }
    
    public int rng(int min, int max){
        int rn = -1; 
        Random rng = new Random();
        rn = rng.nextInt((max - min) + 1) + min;
        return rn; 
    }
    
    public void gameLogic(){
        int randomInt = rng(0, 10);
        System.out.println("Numero gerado: "+ randomInt);
        int gamerInt = Integer.parseInt(IOManager.readKey("Adivinhe o numero(0-10)"));
        
        if(randomInt == gamerInt){
            System.out.println("Você acertou");
            gamer.incrementScore();
        }else{
            System.out.println("Você perdeu");
        }
                System.out.println("Você tem: "+gamer.getCurrentScore()+" pontos!");
    }

    
    
    
}
