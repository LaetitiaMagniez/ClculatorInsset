/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.calculator.pourcentage;

//import org.insset.client.pourcentage.*;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ResetButton;
import com.google.gwt.user.client.ui.SubmitButton;
import com.google.gwt.user.client.ui.TextBox;
import java.util.ArrayList;
import java.util.List;
import org.insset.client.message.Messages;
import org.insset.client.message.dialogbox.DialogBoxInssetPresenter;
import org.insset.client.service.PourcentageService;
import org.insset.client.service.PourcentageServiceAsync;
import org.insset.shared.FieldVerifier;

/**
 *
 * @author user
 */
public class CalculatorPourcentagePresenter extends Composite {

    @UiField
    public ResetButton boutonClear;
    @UiField
    public SubmitButton boutonEnregistrer;
    @UiField
    public TextBox pourcentage;
    @UiField
    public TextBox prix;
    @UiField
    public Label errorLabel2;
    @UiField
    public Label errorLabel3;

    interface MainUiBinder extends UiBinder<HTMLPanel, CalculatorPourcentagePresenter> {
    }

    /**
     * Create UiBinder for the view
     */
    private static MainUiBinder ourUiBinder = GWT.create(MainUiBinder.class);
    
    /**
     * The message displayed to the user when the server cannot be reached or
     * returns an error.
     */
    private static final String SERVER_ERROR = "An error occurred while "
            + "attempting to contact the server. Please check your network "
            + "connection and try again.";

    /**
     * Create a remote service proxy to talk to the server-side Greeting
     * service.
     */
    private final PourcentageServiceAsync service = GWT.create(PourcentageService.class);

    private final Messages messages = GWT.create(Messages.class);

    

    /**
     * Constructeur
     */
    public CalculatorPourcentagePresenter() {
        //bind de la page
        initWidget(ourUiBinder.createAndBindUi(this));
        initHandler();
    }

    /**
     * Methode qui innitialise les handler pour les cliques sur les boutons
     */
    protected void initHandler() {
        boutonClear.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                pourcentage.setText("");
                prix.setText("");
                errorLabel2.setText("");
            }
            
        });
        boutonEnregistrer.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                solde();
            }

        });
    }
//
    private void solde() {
        errorLabel2.setText("");
        final String textToServer = pourcentage.getText();
        if (!FieldVerifier.isValidName(textToServer)) {
            errorLabel2.addStyleName("serverResponseLabelError");
            errorLabel3.addStyleName(textToServer);
            errorLabel2.setText("Aucun texte entré!!");
            errorLabel3.setText("Aucun texte entre!!");
            return;
        }
        int[] val= new int[]{1,2};
        List<Integer> list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(30);
         service.solde(list, new AsyncCallback<String>() {
            public void onFailure(Throwable caught) {
                // Show the RPC error message to the user
                Window.alert(SERVER_ERROR);
            }
      
            @Override
            public void onSuccess(String result) {
                errorLabel2.setText(" ");
                errorLabel3.setText("");
                new DialogBoxInssetPresenter("Le prix soldé est :", textToServer, result);
            }
        });
         
    }
//     private void soldeInverse() {
//        errorLabel2.setText("");
//        final String textToServer = pourcentage.getText();
//        if (!FieldVerifier.isValidName(textToServer)) {
//            errorLabel2.addStyleName("serverResponseLabelError");
//            errorLabel3.addStyleName(textToServer);
//            errorLabel2.setText("Aucun texte entré!!");
//            errorLabel3.setText("Aucun texte entre!!");
//            return;
//        }
//         service.soldeInverse(pourcentage.getText(), new AsyncCallback<String>() {
//            public void onFailure(Throwable caught) {
//                // Show the RPC error message to the user
//                Window.alert(SERVER_ERROR);
//            }
//      
//            @Override
//            public void onSuccess(String result) {
//                errorLabel2.setText(" ");
//                errorLabel3.setText("");
//                new DialogBoxInssetPresenter("Le prix soldé est :", textToServer, result);
//            }
//        });  
//        
//       
//        
//    }
     
}
    

