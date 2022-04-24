package Transpotravel.Transpotravel;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Conbd;
import model.distribuciovols;
import model.distribuciovolsDAOImpl;
import model.equipatge;

public class registreController implements Initializable{

    @FXML
    private TextField Cognom1Usuari;

    @FXML
    private TextField Cognom2Usuari;

    @FXML
    private Button Enrere;

    @FXML
    private Button EnviarDadesRegistre;

    @FXML
    private PasswordField contrasenyaUsuari;

    @FXML
    private TextField nomUsuari;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	
    	
    	
    }
    
    @FXML
    private void pantallaLogin() throws IOException {
        App.setRoot("Login");
    }

}
