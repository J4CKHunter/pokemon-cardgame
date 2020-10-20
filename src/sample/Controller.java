package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    @FXML
    private Button pcvsoyuncu;
    @FXML
    private Button pcvspc;

    @FXML
    public void oyuncucalistir(ActionEvent actionEvent) throws IOException {

        FXMLLoader oyuncuekran= new FXMLLoader();
        oyuncuekran.setLocation(getClass().getResource("oyuncuvsbilgisayar.fxml"));
        Scene scene = new Scene(oyuncuekran.load(), 780, 600);
        Stage stage = new Stage();
        stage.setTitle("Oyuncu vs Bilgisayar");
        stage.setScene(scene);
        stage.show();

    }
    @FXML
    public void bilgisayarcalistir(ActionEvent actionEvent) throws IOException {
        FXMLLoader bilgisayarekran= new FXMLLoader();
        bilgisayarekran.setLocation(getClass().getResource("bilgisayarvsbilgisayar.fxml"));
        Scene scene = new Scene(bilgisayarekran.load(), 780, 600);
        Stage stage = new Stage();
        stage.setTitle("Bilgisayar vs Bilgisayar");
        stage.setScene(scene);
        stage.show();
    }
}
