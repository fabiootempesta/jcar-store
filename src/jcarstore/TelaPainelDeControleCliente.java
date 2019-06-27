/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jcarstore;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Mateus Araújo Cruz
 */
public class TelaPainelDeControleCliente extends Application {

    static Stage stage;
    
    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("aqui");
        Parent root = FXMLLoader.load(getClass().getResource("/jcarstore/views/painel_controle_cliente.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
        setStage(stage);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getStage() {
        return stage;
    }

    public static void setStage(Stage stage) {
        TelaLogin.stage = stage;
    }
    
}
