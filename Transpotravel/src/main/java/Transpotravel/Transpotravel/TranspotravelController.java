package Transpotravel.Transpotravel;

import java.io.InputStream;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import java.net.URL;    
import java.time.LocalDateTime;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.ImageView;

import javafx.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.Conbd;
import model.EquipatgeDAO;
import model.EquipatgeDAOImpl;
import model.distribuciovols;
import model.distribuciovolsDAO;
import model.distribuciovolsDAOImpl;
import model.equipatge;

public class TranspotravelController implements Initializable{

	// Variables
    @FXML
    private Button BuscarEquipatge;

    @FXML
    private Button BuscarVol;

    @FXML
    private TableColumn<equipatge, String> DestiEquipatge;

    @FXML
    private TableColumn<distribuciovols, String> DestiSeguimentVol;

    @FXML
    private Button EnviarDadesContacte;

    @FXML
    private TableColumn<equipatge, String> EstatEquipatge;

    @FXML
    private TableColumn<distribuciovols, String> EstatSeguimentVol;

    @FXML
    private TableColumn<distribuciovols, LocalDateTime> HoraArribadaViatge;

    @FXML
    private TableColumn<distribuciovols, LocalDateTime> HoraSortidaViatge;

    @FXML
    private TableView<distribuciovols> OfertesimatgeiDescripcio;

    @FXML
    private TableColumn<distribuciovols, String> OrigenSeguimentVol;

    @FXML
    private TableColumn<?, ?> PesEquipatgeCompra;
    
    @FXML
    private TableColumn<distribuciovols, Integer> PreuViatge;

    @FXML
    private TableColumn<distribuciovols, Integer> PuntRecollidaViatge;

    @FXML
    private TableView<equipatge> SeguimentEquipatge;

    @FXML
    private TableView<distribuciovols> SeguimentVol;

    @FXML
    private TextArea TextAreaContacte;

    @FXML
    private ComboBox<String> ViatgeComboBoxOrigen;

    @FXML
    private ComboBox<String> ViatgeComboBoxDesti;

    @FXML
    private TableView<distribuciovols> ViatgesTaulaVols;

    @FXML
    private Button afegirLlistaEquipatgesCompra;

    @FXML
    private Button cancelarCompra1;

    @FXML
    private Button cancelarCompra2;

    @FXML
    private Button cancelarCompra3;

    @FXML
    private Button cancelarVol;

    @FXML
    private TableView<?> confirmacioCompraViatge;

    @FXML
    private TableColumn<?, ?> confirmacioDesti;

    @FXML
    private TableColumn<?, ?> confirmacioHoraArribada;

    @FXML
    private TableColumn<?, ?> confirmacioHoraSortida;

    @FXML
    private TableColumn<?, ?> confirmacioNumeroEquipatges;

    @FXML
    private TableColumn<?, ?> confirmacioNumeroPlaces;

    @FXML
    private TableColumn<?, ?> confirmacioOrigen;

    @FXML
    private TableColumn<?, ?> confirmacioPreu;

    @FXML
    private TableColumn<?, ?> destiVolsComprats;

    @FXML
    private TableView<?> equipatgeCompra;

    @FXML
    private TableView<?> equipatges;

    @FXML
    private Button finalitzarCompra;

    @FXML
    private TableColumn<?, ?> horaArribadaVolsComprats;

    @FXML
    private TableColumn<?, ?> horaSortidaVolsComprats;

    @FXML
    private TableColumn<?, ?> idEquipatgeEquipatges;
    
    @FXML
    private TextField idSeguimentVol;
    
    @FXML
    private TableColumn<?, ?> idSeguimentVolsComprats;
    
    @FXML
    private TableColumn<?,?> imatgeOfertes;
    
    @FXML
    private Button modificarVol;
    
    @FXML
    private TableColumn<?, ?> numeroEquipatgesVolsComprats;

    @FXML
    private TextField numeroPlaces1;

    @FXML
    private TextField numeroPlaces2;

    @FXML
    private TextField numeroPlaces3;

    @FXML
    private TableColumn<?, ?> numeroPlacesVolsComprats;

    @FXML
    private TableColumn<equipatge, String> origenEquipatge;
    
    @FXML
    private TableColumn<?, ?> origenVolsComprats;
    
    @FXML
    private TableColumn<?, ?> pesEquipatges;

    @FXML
    private TableColumn<?, ?> preuVolsComprats;

    @FXML
    private TableColumn<?, ?> puntRecollidaEquipatgeCompra;

    @FXML
    private TableColumn<?, ?> puntRecollidaEquipatges;

    @FXML
    private TableColumn<equipatge, String> puntRecollidaSeguimentVol;

    @FXML
    private Button seguentCompra1;

    @FXML
    private Button seguentCompra2;

    @FXML
    private Tab tabComprarViatge1;

    @FXML
    private Tab tabComprarViatge2;

    @FXML
    private Tab tabComprarViatge3;

    @FXML
    private Tab tabContacte;

    @FXML
    private Tab tabEquipatges;

    @FXML
    private Tab tabOfertes;

    @FXML
    private Tab tabPerfil;

    @FXML
    private Tab tabSeguiment;

    @FXML
    private Tab tabViatges;

    @FXML
    private TextField textPesEquipatgeCompra;

    @FXML
    private TextField textPuntRecollidaCompra;
    
    @FXML
    private TextField textfieldidEquipatge;

    @FXML
    private Button tornarPerfil;

    @FXML
    private TableView<?> volsComprats;
    
    @FXML
    private TableColumn<distribuciovols, Integer> volsViatge;
    
    
    
    // Llistas Observables
    private ObservableList<equipatge> llistaEquipatge;
    
    private ObservableList<distribuciovols> llistaVolsClients;
    
    

    // Funcions
    @FXML
    void onClickAfegirEquipatgeLlistaCompra(ActionEvent event) {

    }

    @FXML
    void onClickCancelarCompra(ActionEvent event) {

    }

    @FXML
    void onClickCancelarVol(ActionEvent event) {

    }

    @FXML
    void onClickFinalitzarCompra(ActionEvent event) {

    }

    @FXML
    void onClickModificarVol(ActionEvent event) {

    }

    @FXML
    void onClickSeguentCompra1(ActionEvent event) {

    }

    @FXML
    void onClickSeguentCompra2(ActionEvent event) {

    }

    @FXML
    void onClickTornarPerfil(ActionEvent event) {

    }
    
    @FXML
    void onClickBuscarEquipatge(ActionEvent event) {
    	
    	if(!textfieldidEquipatge.getText().isEmpty()) {
    		
        	EquipatgeDAO equipatge = new EquipatgeDAOImpl();
        	equipatge equipatgeClient = equipatge.cercarEquipatge(conexio, Integer.parseInt(textfieldidEquipatge.getText()));
        	
        	if (equipatgeClient != null) {
            	SeguimentEquipatge.setDisable(false);
            	llistaEquipatge.clear();
        		llistaEquipatge.add(equipatgeClient);
        	}
        	else {
    			Alert missatge=new Alert(AlertType.ERROR);
    			missatge.setTitle("ID INNEXISTENT!");
    			missatge.setContentText("L'ID introduït no existeix o no es troba.");
    			missatge.setHeaderText("Resultat:");
    			missatge.show();
        	}

    	}
    	
    }
    
    
    
    @FXML
    void onClickBuscarVol(ActionEvent event) {
    	
    	if(!idSeguimentVol.getText().isEmpty()) {
    		
        	distribuciovolsDAO vols = new distribuciovolsDAOImpl();
        	distribuciovols volsClient = vols.cercarVolClient(conexio, Integer.parseInt(idSeguimentVol.getText()));
        	
        	
        	if (volsClient != null) {
        		SeguimentVol.setDisable(false);
        		llistaVolsClients.clear();
        		llistaVolsClients.add(volsClient);
        		
        	}
        	else {
    			Alert missatge=new Alert(AlertType.ERROR);
    			missatge.setTitle("ID INNEXISTENT!");
    			missatge.setContentText("L'ID introduït no existeix o no es troba.");
    			missatge.setHeaderText("Resultat:");
    			missatge.show();
        	}

    	}
    	
    }
    
    //private ObservableList <seguiment>seguimentVols;
   
    private Conbd conexio;
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    	
    	//Vista Viatges
    	  
    	conexio = new Conbd();
   
    	ObservableList <String> paisesdesti;
    	paisesdesti = FXCollections.observableArrayList();
    	distribuciovolsDAOImpl.ComboBoxDesti(conexio, paisesdesti);
    	ViatgeComboBoxDesti.setItems(paisesdesti);
    	
    	ObservableList <String>paisesorigen;
    	paisesorigen=FXCollections.observableArrayList();
    	distribuciovolsDAOImpl.ComboBoxOrigen(conexio, paisesorigen);
    	ViatgeComboBoxOrigen.setItems(paisesorigen);
    	    	
	    ObservableList <distribuciovols>llistaVols;
	    llistaVols=FXCollections.observableArrayList();
	    	
	   
		distribuciovolsDAOImpl.cercarVols(conexio, llistaVols);    
		ViatgesTaulaVols.setItems(llistaVols);
		volsViatge.setCellValueFactory(new PropertyValueFactory<distribuciovols,Integer>("iddistribuciovols"));
		PreuViatge.setCellValueFactory(new PropertyValueFactory<distribuciovols,Integer>("preu"));
		PuntRecollidaViatge.setCellValueFactory(new PropertyValueFactory<distribuciovols,Integer>("recollida"));
		HoraSortidaViatge.setCellValueFactory(new PropertyValueFactory<distribuciovols,LocalDateTime>("horaSortida"));
		HoraArribadaViatge.setCellValueFactory(new PropertyValueFactory<distribuciovols,LocalDateTime>("horaArribada"));
		
    	//---------------------------------------------------------------------------------------------------------------------
    	
		ObservableList<distribuciovols>imatges=FXCollections.observableArrayList();
		
    	try {
			InputStream input= new FileInputStream(".\\Imatges\\viatgeDef.jpg");
	    	Image myimage =new Image(input);	
	    	ImageView em1 =new ImageView(myimage);
	    	distribuciovols ImatgeNova=new distribuciovols(0, null, null, 0, null, null, 0, 0, null,em1,null);
	    	
	    	imatges.add(ImatgeNova);
    	
    	
	    	InputStream input2= new FileInputStream(".\\Imatges\\viatgeDef.jpg");
	    	Image myimage2 =new Image(input2);	
	    	ImageView em2 =new ImageView(myimage2);
	    	distribuciovols ImatgeNova2=new distribuciovols(0, null, null, 0, null, null, 0, 0, null,em2,null);
	    	
	    	imatges.add(ImatgeNova2);
    	
    	} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

   
    	imatgeOfertes.setCellValueFactory(new PropertyValueFactory<>("ImatgeVirtual"));

    	OfertesimatgeiDescripcio.setItems(imatges);
		
		
    	//---------------------------------------------------------------------------------------------------------------------
		//Seguiment Equipatge
    	
    	llistaEquipatge = FXCollections.observableArrayList();

    	conexio = new Conbd();

    	SeguimentEquipatge.setItems(llistaEquipatge);
    	
    	puntRecollidaSeguimentVol.setCellValueFactory(new PropertyValueFactory<equipatge, String>("puntRecollida"));
    	origenEquipatge.setCellValueFactory(new PropertyValueFactory<equipatge, String>("origen"));
    	DestiEquipatge.setCellValueFactory(new PropertyValueFactory<equipatge, String>("desti"));
    	EstatEquipatge.setCellValueFactory(new PropertyValueFactory<equipatge, String>("estat"));
    	
    	//Seguiment vol
    	
    	llistaVolsClients = FXCollections.observableArrayList();

    	conexio = new Conbd();

    	SeguimentVol.setItems(llistaVolsClients);
    	
    	OrigenSeguimentVol.setCellValueFactory(new PropertyValueFactory<distribuciovols, String>("idorigen"));
    	DestiSeguimentVol.setCellValueFactory(new PropertyValueFactory<distribuciovols, String>("iddesti"));
    	EstatSeguimentVol.setCellValueFactory(new PropertyValueFactory<distribuciovols, String>("estat"));
    	
    	
		
		 
		
    	
    }

}
