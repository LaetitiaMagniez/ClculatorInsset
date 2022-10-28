/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import java.io.PrintStream;
import static java.lang.Math.floor;
import java.lang.reflect.Array;
import java.util.List;
import org.insset.client.service.ExempleService;
import org.insset.client.service.PourcentageService;

/**
 *
 * @author user
 */
@SuppressWarnings("serial")
public class PourcentageServiceImpl extends RemoteServiceServlet implements
        PourcentageService {
    @Override
    public String solde(List<Integer> val,List<Integer>remise) throws IllegalArgumentException {
       // System.out.println("je passe" +list.get(0) + "-" +list.get(1));
        
        int reduction=0;
        int montantF=0;
      
//        
//        if (val == floor(val) && remise== floor(remise))
//        {
        montantF=( val{1}* remise{1})/100;
        reduction=val-montantF;
        
        //}   
       
    return new String ("Le prix soldé est" );
   
   
       
        
        
        

         
    }
}
//    @Override
//    public String solde(String val) throws IllegalArgumentException {
//        System.out.println("je passe");
//        return "test";
//    }

//    @Override
//    public String solde(String val) throws IllegalArgumentException {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//}
    

//    public PrintStream soldeInverse(int montF, int pourcentage) throws IllegalArgumentException {
//        int prixBase=0;
//        int pourcent=0;
//        
//        if(montF==floor(montF) && pourcentage==floor(pourcentage))
//        {
//            
//            prixBase= montF / (100 -pourcentage);
//            
//    
//    return System.out.printf("Le prix de base est" + prixBase + "€");}
//    else
//    return System.out.printf("Flottant");
//        
//        }
//
//    @Override
//    public PrintStream diviser(int numerateur, int denominateur) throws IllegalArgumentException {
//        double resultat= 0;
//        
//        if(numerateur==floor(numerateur) && denominateur==floor(denominateur))
//        {
//        resultat = numerateur/denominateur;
//        
//        return System.out.printf("Le resultat de la division est" + resultat);}
//        else
//        return System.out.printf("Flottant");
//        }
//    }


