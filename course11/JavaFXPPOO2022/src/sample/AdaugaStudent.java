package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Locale;

public class AdaugaStudent extends Application {

    TextField tfNume;
    TextField tfVarsta;
    ComboBox comboSex;
    ChoiceBox choiceBox;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        Scene scenaAdauga = new Scene(root,600,550);
        initializare(scenaAdauga);

        primaryStage.setScene(scenaAdauga);
        primaryStage.show();
    }

    private void initializare(Scene scenaAdauga) {
        comboSex = (ComboBox) scenaAdauga.lookup("#cbSex");
        ObservableList<String> options =
                FXCollections.observableArrayList("Masculin", "Feminin");
        comboSex.setItems(options);

        tfNume = (TextField)scenaAdauga.lookup("#tfNume");
        tfVarsta = (TextField)scenaAdauga.lookup("#tfVarsta");

        choiceBox = new ChoiceBox();
        choiceBox.getItems().add("Licenta");
        choiceBox.getItems().add("Masterat");
        choiceBox.getItems().add("Doctorat");

        choiceBox.setOnAction(new EventHandler<ActionEvent>() {
                                  @Override
                                  public void handle(ActionEvent event) {
                                      int selectedIndex = choiceBox.getSelectionModel().getSelectedIndex();
                                      Object selectedItem = choiceBox.getSelectionModel().getSelectedItem();

                                      System.out.println("Selectie: [" + selectedIndex + "] " + selectedItem);
                                      System.out.println("  Valoare: " + choiceBox.getValue());
                                  }
                              });
        GridPane gridPane = (GridPane)scenaAdauga.lookup("#container");
        gridPane.add(choiceBox, 0, 9);

        Button button = (Button) scenaAdauga.lookup("#btnAdauga");
        button.setOnMousePressed(adaugaStudent(scenaAdauga));
        /*button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try
                {
                    String nume = tfNume.getText();
                    int varsta = Integer.parseInt(tfVarsta.getText());
                    String sex = comboSex.getValue().toString();
                    String programStudii = choiceBox.getValue().toString();

                    Student student = new Student(nume, varsta, sex, programStudii);
                    System.out.println(student.toString());
                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }
            }
        });*/
    }

    private EventHandler<MouseEvent> adaugaStudent(Scene scene) {
        return new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                if(tfNume.getText().isEmpty()){
                    tfNume.requestFocus();
                    tfNume.setPromptText("Completati numele!");
                }
                else
                if(tfVarsta.getText() == null || !tfVarsta.getText().matches("[0-9]+")){
                    tfVarsta.requestFocus();
                    tfVarsta.setPromptText("Varsta incorecta!");
                }
                else {
                    try {
                        String nume = tfNume.getText();
                        int varsta = Integer.parseInt(tfVarsta.getText());
                        String sex = comboSex.getValue().toString();
                        String programStudii = choiceBox.getValue().toString();

                        Student student = new Student(nume, varsta, sex, programStudii);
                        System.out.println(student.toString());

                        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                        alert.setContentText(student.toString());
                        alert.show();

                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        };
    }
}
