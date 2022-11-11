package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.Scene;
import javafx.scene.control.*;
//import javafx.scene.control.DatePicker;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        //Label for name
        Text nameLabel = new Text("Nume si prenume");
        //Text field for name
        TextField nameText = new TextField();

        //Label for gender
        Text genderLabel = new Text("Sex");
        //Toggle group of radio buttons
        ToggleGroup groupGen = new ToggleGroup();
        RadioButton btnMasculin = new RadioButton("Masculin");
        btnMasculin.setToggleGroup(groupGen);
        RadioButton btnFeminin = new RadioButton("Feminin");
        btnFeminin.setToggleGroup(groupGen);

        //Label for reservation
        Text taxaPlatita = new Text("Taxa platita");

        //Toggle button for reservation
        ToggleButton yes = new ToggleButton("DA");
        ToggleButton no = new ToggleButton("NU");
        ToggleGroup groupTaxPaid = new ToggleGroup();
        yes.setToggleGroup(groupTaxPaid);
        no.setToggleGroup(groupTaxPaid);

        //Label for technologies known
        Text sectionsAllocated = new Text("Sectiuni alocate");

        //check box for education
        CheckBox checkBoxAI = new CheckBox("Artificial Intelligence");
        checkBoxAI.setIndeterminate(false);

        //check box for education
        CheckBox checkBoxMobile = new CheckBox("Mobile Technologies");
        checkBoxMobile.setIndeterminate(false);

        //Label for education
        Text educationLabel = new Text("Studii absolvite");

        //list View for educational qualification
        ObservableList<String> names = FXCollections.observableArrayList(
                 "Licenta", "Masterat", "Doctorat");
        ListView<String> educationListView = new ListView<String>(names);

        //Label for location
        Text locationLabel = new Text("Locatie eveniment");

        //Choice box for location
        ChoiceBox locationchoiceBox = new ChoiceBox();
        locationchoiceBox.getItems().addAll
                ( "Bucuresti", "Cluj", "Timisoara");

        //Label for register
        Button buttonRegister = new Button("Register");
        buttonRegister.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try
                {
                    String name = nameText.getText();
                    String sex = null;
                    if(btnMasculin.isSelected())
                        sex = btnMasculin.getText();
                    else
                        if(btnFeminin.isSelected())
                            sex = btnFeminin.getText();
                    boolean taxPaid;
                    if(yes.isSelected())
                        taxPaid = true;
                    else
                        taxPaid = false;
                    String[] sectionsAllocated = new String[2];
                    if(checkBoxAI.isSelected())
                        sectionsAllocated[0] = checkBoxAI.getText();
                    if(checkBoxMobile.isSelected())
                        sectionsAllocated[1] = checkBoxMobile.getText();
                    String studies = educationListView.getSelectionModel().getSelectedItem().toString();
                    String location = locationchoiceBox.getSelectionModel().getSelectedItem().toString();

                    Registration registration = new Registration(name, sex, taxPaid, sectionsAllocated,
                            studies, location);
                    System.out.println(registration);
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Informare");
                    alert.setContentText(registration+"");
                    alert.show();
                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }
            }
        });

        //Creating a Grid Pane
        GridPane gridPane = new GridPane();

        //Setting size for the pane
        gridPane.setMinSize(500, 500);

        //Setting the Grid alignment
        gridPane.setAlignment(Pos.CENTER);

        //Arranging all the nodes in the grid
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameText, 1, 0);

        gridPane.add(genderLabel, 0, 2);
        gridPane.add(btnMasculin, 1, 2);
        gridPane.add(btnFeminin, 2, 2);
        gridPane.add(taxaPlatita, 0, 3);
        gridPane.add(yes, 1, 3);
        gridPane.add(no, 2, 3);

        gridPane.add(sectionsAllocated, 0, 4);
        gridPane.add(checkBoxAI, 1, 4);
        gridPane.add(checkBoxMobile, 2, 4);

        gridPane.add(educationLabel, 0, 5);
        gridPane.add(educationListView, 1, 5);

        gridPane.add(locationLabel, 0, 6);
        gridPane.add(locationchoiceBox, 1, 6);

        gridPane.add(buttonRegister, 2, 8);

        //Creating a scene object
        Scene scene = new Scene(gridPane);

        //Setting title to the Stage
        stage.setTitle("Registration Form");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }

    public static void main(String args[]){
        launch(args);
    }
}