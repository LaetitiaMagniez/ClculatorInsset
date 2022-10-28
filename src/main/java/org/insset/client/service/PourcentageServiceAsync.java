/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;
import java.util.List;


/**
 *
 * @author user
 */
public interface PourcentageServiceAsync {
//	void diviser(int numerateur, int denominateur, com.google.gwt.user.client.rpc.AsyncCallback<java.io.PrintStream> arg3);
//	void solde(int val, int remise, com.google.gwt.user.client.rpc.AsyncCallback<java.io.PrintStream> arg3);
//	void soldeInverse(int montF, int pourcentage, com.google.gwt.user.client.rpc.AsyncCallback<java.io.PrintStream> arg3);
//
//    public void soldeInverse(String text, AsyncCallback<String> asyncCallback);

    public void solde(List<Integer> list, AsyncCallback<String> asyncCallback);
}
