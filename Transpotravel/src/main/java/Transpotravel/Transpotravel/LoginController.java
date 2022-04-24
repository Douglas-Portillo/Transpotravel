package Transpotravel.Transpotravel;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import model.Conbd;

public class LoginController implements Initializable{
	
	@FXML
    private Label LoginIncorrecte;
	
    @FXML
    private Button btnLogin;

    @FXML
    private Button btnRegistre;

    @FXML
    private PasswordField contrasenyaLogin;

    @FXML
    private TextField correuLogin;
    
    private Conbd conexio;
    
    @FXML
    void loginBntOnAction(ActionEvent event) {
    	
    	//LoginIncorrecte.setText("Login incorrecte, torna a intentar-ho.");
    	
    	if(correuLogin.getText().isBlank() == false && contrasenyaLogin.getText().isBlank() == false) {
    		
    		validarLogin();
    		
    	}else {
    		
    		LoginIncorrecte.setText("       Posa l'usuari i la contrasenya");
        	
    	}
    	
    	
    	
    } 
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	
   
    	
    }
    
    @FXML
    private void pantallaRegistre() throws IOException {
        App.setRoot("registre");
    }
    	
    
    void validarLogin() {
    	
    	Conbd conn = new Conbd();
    	Connection connectDB = conn.getConexio();

    	String correu = correuLogin.getText();
    	String contrasenya = contrasenyaLogin.getText();
    	
    	String sql = "SELECT * FROM transpotravel.persona where correu = '"+correu+"' and contrasenya = '"+contrasenya+"';";
    	
    	
    	try {
    		
    		Statement st = connectDB.createStatement();
    		ResultSet queryResult = st.executeQuery(sql);
    		
    		
    			
    		if(queryResult.next()) {
    				
    			App.setRoot("Transpotravel");
    				
    		}else {
    				
    			LoginIncorrecte.setText("Login incorrecte, torna a intentar-ho.");
    				
    		}
    			
    		
    		
    		
    		
    	}catch (Exception e) {
    		
    		e.printStackTrace();
    		e.getCause();
    		
    	}
    	
  
    	
    }
    
   
    

}
