/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2.aula3;

import java.io.File;

/**
 *
 * @author 31381243
 */
public class Lp2Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = IOManager.readKey("Qual seu nome?");
        Gamer gamer = new Gamer(name, 0, 0, 0);

        File file = new File("score.txt");
        Gamer gamer2 = IOManager.readGamer(file);
        
        if(gamer.getName().equalsIgnoreCase(gamer2.getName())){

            System.out.println("Gamer: "+ gamer2.getName());
            System.out.println("Max: "+ gamer2.getMaxScore());
            System.out.println("Last: "+ gamer2.getLastScore());
                        Game g = new Game(gamer2);
        }else{
            System.out.println("Este é um jogo exclusivo e vc não tem acesso");
        }
  //      System.out.println("O gamer escrito foi: "+gamer);
        
//        Gamer gamer2 = IOManager.readGamer(file);
 //       System.out.println("O gamer lido foi: "+gamer2);  
    }
    
}
