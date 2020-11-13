package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Arrays;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        // Create Deck Object and Shuffle cards
        Deck deck = new Deck();
        deck.shuffleDeck();

        // Create CardPlayer Object, Deal 5 Cards to player
        CardPlayer cardPlayer = new CardPlayer();
        Card cardOne = deck.deal();
        System.out.print(String.valueOf(cardOne));
        Card cardTwo = deck.deal();
        Card cardThree = deck.deal();
        Card cardFour = deck.deal();
        Card cardFive = deck.deal();
        cardPlayer.getCard(cardOne);
        cardPlayer.getCard(cardTwo);
        cardPlayer.getCard(cardThree);
        cardPlayer.getCard(cardFour);
        cardPlayer.getCard(cardFive);


        // Description
        Text topDescription = new Text("Card Game");
        topDescription.setFont(new Font("Verdana", 20));
        topDescription.setFill(Color.BLACK);

        // Player One Controls
        Label PlayerOneLabel = new Label("Your Cards: ");
        Label PlayerOneCardsLabel = new Label();
        HBox playerOneHBox = new HBox(10, PlayerOneLabel, PlayerOneCardsLabel);
        playerOneHBox.setAlignment(Pos.CENTER);
        playerOneHBox.setPadding(new Insets(10));


        // Button & Event Handling
        Button showCardsButton = new Button("Show Cards");
        showCardsButton.setOnAction(e->
        {
            PlayerOneCardsLabel.setText(cardPlayer.showCards().toString());
        });

        // Main container
        VBox mainContainer = new VBox(10, topDescription, playerOneHBox, showCardsButton);
        mainContainer.setAlignment(Pos.CENTER);
        mainContainer.setPadding(new Insets(10));

        // Scene
        Scene scene = new Scene(mainContainer, 500, 500);

        // Stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("CASINO GAME");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
