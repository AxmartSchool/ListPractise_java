/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listpractise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author jager.balazs
 */
public class ListPractise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        
        
         System.setProperty("file.encoding", "UTF8");
         ArrayList<String> parositasok = new ArrayList();
         ArrayList<String> nyertesCsapatok = new ArrayList();
         ArrayList<String> felhasznaloTippek = new ArrayList();
         int eltalalt = 0;
         BufferedReader br = new BufferedReader(new FileReader("toto.txt"));
         BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
         System. out.println("A fájl tartalma: ");
         String sor;
         boolean sw = true;
         while((sor = br.readLine()) != null){ 
                 if (sw) {
                 parositasok.add(sor);
                 sw = false;
             }else{
                     nyertesCsapatok.add(sor);
                     sw = true;
                 }
         }        
         br.close(); 
         int szamlalo = 0;
         for(String paros:parositasok){
             System.out.println(paros+" Kerem a tippet (1/2/X):");
             felhasznaloTippek.add(rd.readLine());
             
         }
         
         for (int i = 0; i < nyertesCsapatok.size(); i++) {
                if (felhasznaloTippek.get(i).equals(nyertesCsapatok.get(i))) {
                 eltalalt++;
             }
             szamlalo++;
        }
         
         System.out.println("Az eltalalt meccsek szama: "+ eltalalt);
         
    }
    
}
