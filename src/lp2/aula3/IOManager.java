package lp2.aula3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


public class IOManager {
    
    public static String readKey(String instruction){
        String result = "";
        System.out.println(instruction);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        try {
            result = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(IOManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        return result;
    }
    public static void writeGamer(Gamer gamer, File file){
 
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(gamer);
            oos.close();
            fos.close();
        } catch (IOException iOException) {
            iOException.printStackTrace();
        }
    } 
    public static Gamer readGamer(File file){
        Gamer gamer = null;
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            gamer = (Gamer) ois.readObject();
            ois.close();
            fis.close();
        } catch (IOException iOException) {
            iOException.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        return gamer;
    }
}
