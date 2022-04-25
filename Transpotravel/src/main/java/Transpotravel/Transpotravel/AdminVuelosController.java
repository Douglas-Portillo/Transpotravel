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
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import model.Conbd;
import model.distribuciovols;
import model.distribuciovolsDAOImpl;
import model.equipatge;

public class AdminVuelosController implements Initializable{

	
    @FXML
    private Button ButtonBorrarVols;

    @FXML
    private ComboBox<String> ComboboxElminarVols;

    @FXML
    private ComboBox<String> Comboboxdesti;

    @FXML
    private ComboBox<String> ComboxOrigen;

    @FXML
    private Button butoncrearvol;

    @FXML
    private DatePicker inputdataarribada;

    @FXML
    private DatePicker inputdatasortida;

    @FXML
    private TextField inputpreu;
	
 	
 	private Conbd conexio;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	
    	ObservableList <String> paisosborrar;
    	paisosborrar = FXCollections.observableArrayList();
    	distribuciovolsDAOImpl.ComboBoxVols(conexio, paisosborrar);
    	ComboboxElminarVols.setItems(paisosborrar);
    	
    	ObservableList <String> Comboboxdesti;
    	paisosborrar = FXCollections.observableArrayList();
    	distribuciovolsDAOImpl.ComboBoxVols(conexio, paisosborrar);
    	ComboboxElminarVols.setItems(paisosborrar);
    	
    	ObservableList <String> ComboxOrigen;
    	paisosborrar = FXCollections.observableArrayList();
    	distribuciovolsDAOImpl.ComboBoxVols(conexio, paisosborrar);
    	ComboboxElminarVols.setItems(paisosborrar);
    	
    }
    
    @FXML
    private void pantallaLogin() throws IOException {
        App.setRoot("Login");
    }

}
