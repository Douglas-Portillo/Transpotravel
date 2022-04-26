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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
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
    private TableColumn<distribuciovols, String> ColumnIdVol;

    @FXML
    private TableColumn<distribuciovols, LocalDateTime> Columndataarribada;

    @FXML
    private TableColumn<distribuciovols, LocalDateTime> Columndatasortida;

    @FXML
    private TableColumn<distribuciovols, String> Columndesti;

    @FXML
    private TableColumn<distribuciovols, String> Columnorigen;

    @FXML
    private TableColumn<distribuciovols, Integer> Columnpreu;

    @FXML
    private Button OnClickBorrarVol;

    @FXML
    private Button buttonCrearVol;

    @FXML
    private ComboBox<String> combobosorigen;

    @FXML
    private ComboBox<String> comboboxdesti;

    @FXML
    private ComboBox<String> comboboxpuntrecollida;

    @FXML
    private DatePicker inputdatarribada;

    @FXML
    private DatePicker inputdatasortida;

    @FXML
    private TextField inputpreu;
    
    @FXML
    private TextField inputidborrar;

    @FXML
    private TableView<distribuciovols> volsComprats;
	
 	
    @FXML
    void OnClickBorrarVol(ActionEvent event) {
    	
    	distribuciovolsDAOImpl.eliminarVol(conexio, inputidborrar.getText());
    }
    
    
 	private Conbd conexio;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	
    	
    	
    	ObservableList <String> paisos_origen;
    	paisos_origen = FXCollections.observableArrayList();
    	distribuciovolsDAOImpl.ComboBoxVols(conexio, paisos_origen);
    	comboboxdesti.setItems(paisos_origen);
    	
    	ObservableList <String> paisos_destins;
    	paisos_destins = FXCollections.observableArrayList();
    	distribuciovolsDAOImpl.ComboBoxVols(conexio, paisos_destins);
    	comboboxdesti.setItems(paisos_destins);
    	
    	ObservableList <String> punts_recollida;
    	punts_recollida = FXCollections.observableArrayList();
    	distribuciovolsDAOImpl.ComboBoxPuntsRecollida(conexio, punts_recollida);
    	comboboxpuntrecollida.setItems(punts_recollida);
    	
    	ObservableList <distribuciovols>llistaVols;
	    llistaVols=FXCollections.observableArrayList();
	    	
	   
		distribuciovolsDAOImpl.cercarVols(conexio, llistaVols);    
		volsComprats.setItems(llistaVols);
		ColumnIdVol.setCellValueFactory(new PropertyValueFactory<distribuciovols,String>("iddistribuciovols"));
		Columndataarribada.setCellValueFactory(new PropertyValueFactory<distribuciovols,LocalDateTime>("horaArribada"));
		Columndatasortida.setCellValueFactory(new PropertyValueFactory<distribuciovols,LocalDateTime>("horaSortida"));
		Columndesti.setCellValueFactory(new PropertyValueFactory<distribuciovols,String>("iddistribuciovols"));
		Columnorigen.setCellValueFactory(new PropertyValueFactory<distribuciovols,String>("horaSortida"));
		Columnpreu.setCellValueFactory(new PropertyValueFactory<distribuciovols,Integer>("preu"));
    }
    
    
}
