/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import java.util.List;


/**
 *
 * @author insset
 */
    @RemoteServiceRelativePath("pourcentage")
public interface PourcentageService extends RemoteService {
        
    String solde(List<Integer> list) throws IllegalArgumentException;

//    PrintStream soldeInverse(int montF, int pourcentage) throws IllegalArgumentException;
//    
//    PrintStream diviser(int numerateur, int denominateur) throws IllegalArgumentException; 
    
}



