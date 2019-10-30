/*
Program written for CS 2
Assign 10
Program written by Micah Penney
Last Modified on 4/29/2018
Windows 10
Visual Studio Code
This is a Bible program made from javafx. This program has a main menu that has a hard and easy verse menu. 
Each menu has five fill in the blank verses to practice. 
*/

//importing libraries
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.text.*;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.media.*;
import java.io.File;


//MemoryVerse class
public class MemoryVerse extends Application {
    
    //Overiden main method
    public static void main(String[] args) {
        launch(args);
    }

    //Scene variables
    Scene scene_EV, scene_J3, scene_R8, scene_P3, scene_M12, scene_E4;
    Scene scene_HV, scene_I40, scene_R83, scene_2P3, scene_L3, scene_2C12;

    //Start method
    @Override
    public void start(Stage primaryStage) {

        
        //Main menu and Title
        primaryStage.setTitle("MemoryVerse");

        //Setting up scene title
        Text txt_1 = new Text("The Memory Verse Game");
        txt_1.setTranslateY(-100);
        txt_1.setFont(Font.font(null, FontWeight.BOLD, 40));
        txt_1.setFill(Color.BROWN);
        txt_1.setStroke(Color.BLACK);
        //End of scene title

        //Setting up hard verse button
        Button btn_2 = new Button();
        btn_2.setTranslateY(100);
        btn_2.setMaxSize(150, 50);
        btn_2.setText("Rabbi\n (Hard)");
        btn_2.setOnAction(e -> primaryStage.setScene(scene_HV));
        //End of hard verse button

        //Setting up background
        Image img_1 = new Image("main.jpg");
        ImageView imgv_1 = new ImageView(img_1);
        imgv_1.setFitHeight(500);
        imgv_1.setFitWidth(500);
        //End of background setup
        
        //Setting up easy verse button
        Button btn_1 = new Button();
        btn_1.setMaxSize(150, 50);
        btn_1.setText("Gabbai\n (Easy)");
        btn_1.setOnAction(e-> primaryStage.setScene(scene_EV));
        //End of easy verse button

        //Setting up stackpane
        StackPane root = new StackPane();
        //Adding everything to the stackpane
        root.getChildren().add(imgv_1);
        root.getChildren().add(txt_1);
        root.getChildren().add(btn_1);
        root.getChildren().add(btn_2);
        //Everything added and end of stackpane

        //Setting up the scene
        Scene scene = new Scene(root, 500, 500);
        //End of scene setup

        //End of Main menu


        //Beginning Easy Verse menu

        //Setting up verse menu background image
        Image img_2 = new Image("verse_menu.jpg");
        ImageView imgv_2 = new ImageView(img_2);
        imgv_2.setFitHeight(500);
        imgv_2.setFitWidth(1000);
        //End of verse menu setup

        //Five verse button setup
        //John 3:16 button
        Button btn_J3 = new Button("John 3:16");
        btn_J3.setTranslateX(-250);
        btn_J3.setMaxSize(150, 30);
        btn_J3.setOnAction(e -> primaryStage.setScene(scene_J3));

        //Romans 8:28 button
        Button btn_R8 = new Button("Roman 8:28");
        btn_R8.setMaxSize(150, 30);
        btn_R8.setOnAction(e -> primaryStage.setScene(scene_R8));

        //Proverbs 3:5-6 button
        Button btn_P3 = new Button("Proverbs 3:5-6");
        btn_P3.setTranslateX(250);
        btn_P3.setMaxSize(150, 30);
        btn_P3.setOnAction(e -> primaryStage.setScene(scene_P3));

        //Mark 12:30 button
        Button btn_M12 = new Button("Mark 12:30");
        btn_M12.setTranslateX(-125);
        btn_M12.setTranslateY(100);
        btn_M12.setMaxSize(150, 30);
        btn_M12.setOnAction(e -> primaryStage.setScene(scene_M12));

        //Ephesians 4:32 button
        Button btn_E4 = new Button("Ephesians 4:32");
        btn_E4.setTranslateX(125);
        btn_E4.setTranslateY(100);
        btn_E4.setMaxSize(150, 30);
        btn_E4.setOnAction(e -> primaryStage.setScene(scene_E4));
        //End of verse buttons

        //Setting up back button
        Button bt_1 = new Button("<-- Back");
        bt_1.setTranslateX(-450);
        bt_1.setTranslateY(-200);
        bt_1.setOnAction(e -> primaryStage.setScene(scene));
        //End of back button

        //Setting up verse scene title
        Text txt_2 = new Text("Beginner Verses");
        txt_2.setTranslateY(-150);
        txt_2.setFont(Font.font(null, FontWeight.BOLD, 40));
        txt_2.setFill(Color.BROWN);
        txt_2.setStroke(Color.BLACK);
        //End of verse scene title

        //Setting up stackpane for easy verse
        StackPane root_EV = new StackPane();
        //Adding everything to the easy verse stackpane
        root_EV.getChildren().add(imgv_2);
        root_EV.getChildren().add(bt_1);
        root_EV.getChildren().add(btn_J3);
        root_EV.getChildren().add(btn_R8);
        root_EV.getChildren().add(btn_P3);
        root_EV.getChildren().add(btn_M12);
        root_EV.getChildren().add(btn_E4);
        root_EV.getChildren().add(txt_2);
        //Everything added and end of stackpane

        //Setting up the easy menu scene
        scene_EV = new Scene(root_EV, 1000, 500);
        //End of easy scene setup

        //End of easy menu

        //Hard verse menu

        //Setup of verse background
        Image img_8 = new Image("verse_menu.jpg");
        ImageView imgv_8 = new ImageView(img_8);
        imgv_8.setFitHeight(500);
        imgv_8.setFitWidth(1000);
        //End of verse background

        //Five verse button setup
        //Isaiah 40:28 button
        Button btn_I40 = new Button("Isaiah 40:28");
        btn_I40.setTranslateX(-250);
        btn_I40.setMaxSize(150, 30);
        btn_I40.setOnAction(e -> primaryStage.setScene(scene_I40));

        //Romans 8:38-39 button
        Button btn_R83 = new Button("Romans 8:38-39");
        btn_R83.setMaxSize(150, 30);
        btn_R83.setOnAction(e -> primaryStage.setScene(scene_R83));

        //2 Peter 3:9 button
        Button btn_2P3 = new Button("2 Peter 3:9");
        btn_2P3.setTranslateX(250);
        btn_2P3.setMaxSize(150, 30);
        btn_2P3.setOnAction(e -> primaryStage.setScene(scene_2P3));

        //Lamentations 3:22-23 button
        Button btn_L3 = new Button("Lamentations 3:22-23");
        btn_L3.setTranslateX(-125);
        btn_L3.setTranslateY(100);
        btn_L3.setMaxSize(175, 30);
        btn_L3.setOnAction(e -> primaryStage.setScene(scene_L3));

        //2 Corithains 12:9 button
        Button btn_2C12 = new Button("2 Corinthians 12:9");
        btn_2C12.setTranslateX(125);
        btn_2C12.setTranslateY(100);
        btn_2C12.setMaxSize(150, 30);
        btn_2C12.setOnAction(e -> primaryStage.setScene(scene_2C12));

        //Setting up back button
        Button bt_7 = new Button("<-- Back");
        bt_7.setTranslateX(-450);
        bt_7.setTranslateY(-200);
        bt_7.setOnAction(e -> primaryStage.setScene(scene));
        //End of back button

        //Setting up hard verse title
        Text txt_13 = new Text("Hard Verses");
        txt_13.setTranslateY(-150);
        txt_13.setFont(Font.font(null, FontWeight.BOLD, 40));
        txt_13.setFill(Color.BROWN);
        txt_13.setStroke(Color.BLACK);
        //End of hard verse title

        //Setting up stackpane
        StackPane root_HV = new StackPane();
        //Adding everything to the stackpane
        root_HV.getChildren().add(imgv_8);
        root_HV.getChildren().add(bt_7);
        root_HV.getChildren().add(btn_I40);
        root_HV.getChildren().add(btn_R83);
        root_HV.getChildren().add(btn_2P3);
        root_HV.getChildren().add(btn_L3);
        root_HV.getChildren().add(btn_2C12);
        root_HV.getChildren().add(txt_13);
        //Everything added and end of stackpane

        //Setting up of hard verse scene
        scene_HV = new Scene(root_HV, 1000, 500);
        //End of hard scene setup

        //End of Hard Verse menu

        //John 3:16

        //Verse background
        Image img_3 = new Image("verse.jpg");
        ImageView imgv_3 = new ImageView(img_3);
        imgv_3.setFitHeight(500);
        imgv_3.setFitWidth(1000);
        //End of verse background

        //Setting up verse
        Text txt_3 = new Text();
        txt_3.setText("    For God so ______ the world, that he ______ his only begotten Son,\n"
        + " that whosoever ________ in him should not _______, but have everlasting _____.\n"
        + "                                                            John 3:16 KJV\n"
        + "\n");
        txt_3.setTranslateY(-50);
        txt_3.setFont(Font.font(25));
        //End of verse

        //Setting up instructions
        Text txt_4 = new Text();
        txt_4.setText("Please enter the missing words");
        txt_4.setTranslateX(-350);
        txt_4.setTranslateY(75);
        //End of instructions

        //Setting up first word textfield
        TextField word_1 = new TextField ();
        word_1.setPromptText("First Word");

        GridPane grid_1 = new GridPane();
        grid_1.setVgap(4);
        grid_1.setHgap(10);
        grid_1.setPadding(new Insets(5, 5, 5, 5));
        grid_1.add(word_1, 1, 0);
        grid_1.setTranslateX(50);
        grid_1.setTranslateY(350);
        //End of first word

        //Setting up second word textfield
        TextField word_2 = new TextField ();
        word_2.setPromptText("Second Word");

        GridPane grid_2 = new GridPane();
        grid_2.setVgap(4);
        grid_2.setHgap(10);
        grid_2.setPadding(new Insets(5, 5, 5, 5));
        grid_2.add(word_2, 1, 0);
        grid_2.setTranslateX(350);
        grid_2.setTranslateY(350);
        //End of second word

        //Setting up third word textfield
        TextField word_3 = new TextField ();
        word_3.setPromptText("Third Word");

        GridPane grid_3 = new GridPane();
        grid_3.setVgap(4);
        grid_3.setHgap(10);
        grid_2.setPadding(new Insets(5, 5, 5, 5));
        grid_3.add(word_3, 1, 0);
        grid_3.setTranslateX(600);
        grid_3.setTranslateY(350);
        //End of third word

        //Setting up fourth word textfield
        TextField word_4 = new TextField ();
        word_4.setPromptText("Fourth Word");

        GridPane grid_4 = new GridPane();
        grid_4.setVgap(4);
        grid_4.setHgap(10);
        grid_4.setPadding(new Insets(5, 5, 5, 5));
        grid_4.add(word_4, 1, 0);
        grid_4.setTranslateX(200);
        grid_4.setTranslateY(400);
        //End of fourth word

        //Setting up fifth word textfield
        TextField word_5 = new TextField ();
        word_5.setPromptText("Fifth Word");

        GridPane grid_5 = new GridPane();
        grid_5.setVgap(4);
        grid_5.setHgap(10);
        grid_5.setPadding(new Insets(5, 5, 5, 5));
        grid_5.add(word_5, 1, 0);
        grid_5.setTranslateX(500);
        grid_5.setTranslateY(400);
        //End of fifth word
  
        //John 3:16 verse check
        //Setting up check button
        Button btn_chk_1 = new Button();
        btn_chk_1.setTranslateX(400);
        btn_chk_1.setTranslateY(200);
        btn_chk_1.setText("Check");
        btn_chk_1.setOnAction(new EventHandler<ActionEvent>() {
        //End of check button
          public void handle (ActionEvent event) {
            //Variable setup
            String w_1, w_2, w_3, w_4, w_5;
            //Filling the variables
            w_1 = word_1.getText();
            w_2 = word_2.getText();
            w_3 = word_3.getText();
            w_4 = word_4.getText();
            w_5 = word_5.getText();

          //If statments to check the entered words
          if (w_1.equals("loved")) {
              word_1.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
           }
           else{
              word_1.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
           }
     
          if (w_2.equals("gave")) {
              word_2.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_2.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_3.equals("believeth")) {
              word_3.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_3.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_4.equals("perish")) {
              word_4.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
             word_4.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_5.equals("life")) {
            word_5.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
             word_5.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }       
        }
        });
        //End of checking process

        //Setting up reset button
        Button btn_rst_1 = new Button();
        btn_rst_1.setTranslateX(450);
        btn_rst_1.setTranslateY(-200);
        btn_rst_1.setText("Reset");
        btn_rst_1.setOnAction(new EventHandler<ActionEvent>() {
        //End of reset button
          public void handle (ActionEvent event) {
            //Clearing all the textfields
            word_1.clear();
            word_1.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_2.clear();
            word_2.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_3.clear();
            word_3.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_4.clear();
            word_4.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_5.clear();
            word_5.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
          }
        });
        //End of reset process

        //Setting up back button
        Button bt_2 = new Button("<-- Back");
        bt_2.setTranslateX(-450);
        bt_2.setTranslateY(-200);
        bt_2.setOnAction(e -> primaryStage.setScene(scene_EV));
        //End of back button

        //Setting up John 3:16 stackpane
        StackPane root_J3 = new StackPane();
        //Adding everything to the stackpane
        root_J3.getChildren().add(imgv_3);
        root_J3.getChildren().add(txt_3);
        root_J3.getChildren().add(txt_4);
        root_J3.getChildren().add(grid_1);
        root_J3.getChildren().add(grid_2);
        root_J3.getChildren().add(grid_3);
        root_J3.getChildren().add(grid_4);
        root_J3.getChildren().add(grid_5);
        root_J3.getChildren().add(btn_chk_1);
        root_J3.getChildren().add(btn_rst_1);
        root_J3.getChildren().add(bt_2);
        //Everything added and end of the stackpane

        //Setting up scene
        scene_J3 = new Scene(root_J3, 1000, 500);
        //End of scene

        //End of John 3:16

        //Romans 8:28

        //Setting up the verse view image
        Image img_4 = new Image("verse.jpg");
        ImageView imgv_4 = new ImageView(img_4);
        imgv_4.setFitHeight(500);
        imgv_4.setFitWidth(1000);

        //Setting up Romans 8:28
        Text txt_5 = new Text();
        txt_5.setText("And we know that ___ things work together for ______ to them that love ______,\n"
        + " to them who are the ______ according to his _________.\n"
        + "                                                           Romans 8:28 KJV\n");
        txt_5.setTranslateY(-50);
        txt_5.setFont(Font.font(25));


        //Setting up instructions
        Text txt_6 = new Text();
        txt_6.setText("Please enter the missing words");
        txt_6.setTranslateX(-350);
        txt_6.setTranslateY(75);

        //Setting up the text box and the initial text in the boxes
        TextField word_6 = new TextField ();
        word_6.setPromptText("First Word");

        //Adjusting position of the text box
        GridPane grid_6 = new GridPane();
        grid_6.setVgap(4);
        grid_6.setHgap(10);
        grid_6.setPadding(new Insets(5, 5, 5, 5));
        grid_6.add(word_6, 1, 0);
        grid_6.setTranslateX(50);
        grid_6.setTranslateY(350);

        //Setting up the text box and the initial text in the boxes
        TextField word_7 = new TextField ();
        word_7.setPromptText("Second Word");

        //Adjusting position of the text box
        GridPane grid_7 = new GridPane();
        grid_7.setVgap(4);
        grid_7.setHgap(10);
        grid_7.setPadding(new Insets(5, 5, 5, 5));
        grid_7.add(word_7, 1, 0);
        grid_7.setTranslateX(350);
        grid_7.setTranslateY(350);

        //Setting up the text box and the initial text in the boxes
        TextField word_8 = new TextField ();
        word_8.setPromptText("Third Word");

        //Adjusting position of the text box
        GridPane grid_8 = new GridPane();
        grid_8.setVgap(4);
        grid_8.setHgap(10);
        grid_8.setPadding(new Insets(5, 5, 5, 5));
        grid_8.add(word_8, 1, 0);
        grid_8.setTranslateX(600);
        grid_8.setTranslateY(350);

        //Setting up the text box and the initial text in the boxes
        TextField word_9 = new TextField ();
        word_9.setPromptText("Fourth Word");

        //Adjusting position of the text box
        GridPane grid_9 = new GridPane();
        grid_9.setVgap(4);
        grid_9.setHgap(10);
        grid_9.setPadding(new Insets(5, 5, 5, 5));
        grid_9.add(word_9, 1, 0);
        grid_9.setTranslateX(200);
        grid_9.setTranslateY(400);

        //Setting up the text box and the initial text in the boxes
        TextField word_10 = new TextField ();
        word_10.setPromptText("Fifth Word");

        //Adjusting position of the text box
        GridPane grid_10 = new GridPane();
        grid_10.setVgap(4);
        grid_10.setHgap(10);
        grid_10.setPadding(new Insets(5, 5, 5, 5));
        grid_10.add(word_10, 1, 0);
        grid_10.setTranslateX(500);
        grid_10.setTranslateY(400);
  
        //Setting up a button and checking the user's responses
        Button btn_chk_2 = new Button();
        btn_chk_2.setTranslateX(400);
        btn_chk_2.setTranslateY(200);
        btn_chk_2.setText("Check");
        btn_chk_2.setOnAction(new EventHandler<ActionEvent>() {
          public void handle (ActionEvent event) {
            String w_1, w_2, w_3, w_4, w_5;

            w_1 = word_6.getText();
            w_2 = word_7.getText();
            w_3 = word_8.getText();
            w_4 = word_9.getText();
            w_5 = word_10.getText();

          //If the word is correct the text box turns green
          if (w_1.equals("all")) {
              word_6.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
           }
           else{
              word_6.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
           }
     
          if (w_2.equals("good")) {
              word_7.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_7.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_3.equals("God")) {
              word_8.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_8.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_4.equals("called")) {
              word_9.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
             word_9.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_5.equals("purpose")) {
            word_10.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
             word_10.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }       
        }
        });

        //Setting up a button to reset the users answers
        Button btn_rst_2 = new Button();
        btn_rst_2.setTranslateX(450);
        btn_rst_2.setTranslateY(-200);
        btn_rst_2.setText("Reset");
        btn_rst_2.setOnAction(new EventHandler<ActionEvent>() {
          public void handle (ActionEvent event) {
            word_6.clear();
            word_6.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_7.clear();
            word_7.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_8.clear();
            word_8.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_9.clear();
            word_9.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_10.clear();
            word_10.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
          }
        });

        //Setting up a back button
        Button bt_3 = new Button("<-- Back");
        bt_3.setTranslateX(-450);
        bt_3.setTranslateY(-200);
        bt_3.setOnAction(e -> primaryStage.setScene(scene_EV));

        //Adding everything to the scene
        StackPane root_R8 = new StackPane();
        root_R8.getChildren().add(imgv_4);
        root_R8.getChildren().add(txt_5);
        root_R8.getChildren().add(txt_6);
        root_R8.getChildren().add(grid_6);
        root_R8.getChildren().add(grid_7);
        root_R8.getChildren().add(grid_8);
        root_R8.getChildren().add(grid_9);
        root_R8.getChildren().add(grid_10);
        root_R8.getChildren().add(btn_chk_2);
        root_R8.getChildren().add(btn_rst_2);
        root_R8.getChildren().add(bt_3);

        //Creating a new scene
        scene_R8 = new Scene(root_R8, 1000, 500);
        //End of Romans 8:28

        //Proverbs 3:5-6
        Image img_5 = new Image("verse.jpg");
        ImageView imgv_5 = new ImageView(img_5);
        imgv_5.setFitHeight(500);
        imgv_5.setFitWidth(1000);

        //Setting up the the Proverbs 3:5-6
        Text txt_7 = new Text();
        txt_7.setText("Trust in the _____ with all thine ______; and lean not unto _____ own understanding.\n"
        + " In _____ thy ways acknowledge him, and he shall ______ thy paths.\n"
        + "                                                           Proverbs 3:5-6 KJV\n");
        txt_7.setTranslateY(-50);
        txt_7.setFont(Font.font(25));

        //Setting up the instructions
        Text txt_8 = new Text();
        txt_8.setText("Please enter the missing words");
        txt_8.setTranslateX(-350);
        txt_8.setTranslateY(75);

        //Setting up the the text fields for entering answers
        TextField word_11 = new TextField ();
        word_11.setPromptText("First Word");

        GridPane grid_11 = new GridPane();
        grid_11.setVgap(4);
        grid_11.setHgap(10);
        grid_11.setPadding(new Insets(5, 5, 5, 5));
        grid_11.add(word_11, 1, 0);
        grid_11.setTranslateX(50);
        grid_11.setTranslateY(350);

        TextField word_12 = new TextField ();
        word_12.setPromptText("Second Word");

        GridPane grid_12 = new GridPane();
        grid_12.setVgap(4);
        grid_12.setHgap(10);
        grid_12.setPadding(new Insets(5, 5, 5, 5));
        grid_12.add(word_12, 1, 0);
        grid_12.setTranslateX(350);
        grid_12.setTranslateY(350);

        TextField word_13 = new TextField ();
        word_13.setPromptText("Third Word");

        GridPane grid_13 = new GridPane();
        grid_13.setVgap(4);
        grid_13.setPadding(new Insets(5, 5, 5, 5));
        grid_13.add(word_13, 1, 0);
        grid_13.setTranslateX(600);
        grid_13.setTranslateY(350);

        TextField word_14 = new TextField ();
        word_14.setPromptText("Fourth Word");

        GridPane grid_14 = new GridPane();
        grid_14.setVgap(4);
        grid_14.setHgap(10);
        grid_14.setPadding(new Insets(5, 5, 5, 5));
        grid_14.add(word_14, 1, 0);
        grid_14.setTranslateX(200);
        grid_14.setTranslateY(400);

        TextField word_15 = new TextField ();
        word_15.setPromptText("Fifth Word");

        GridPane grid_15 = new GridPane();
        grid_15.setVgap(4);
        grid_15.setHgap(10);
        grid_15.setPadding(new Insets(5, 5, 5, 5));
        grid_15.add(word_15, 1, 0);
        grid_15.setTranslateX(500);
        grid_15.setTranslateY(400);
        //End of text field set up

        //Setting up the button for checking the entered words
        Button btn_chk_3 = new Button();
        btn_chk_3.setTranslateX(400);
        btn_chk_3.setTranslateY(200);
        btn_chk_3.setText("Check");
        btn_chk_3.setOnAction(new EventHandler<ActionEvent>() {
          public void handle (ActionEvent event) {
            String w_1, w_2, w_3, w_4, w_5;

            w_1 = word_11.getText();
            w_2 = word_12.getText();
            w_3 = word_13.getText();
            w_4 = word_14.getText();
            w_5 = word_15.getText();


          if (w_1.equals("Lord")) {
              word_11.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
           }
           else{
              word_11.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
           }
     
          if (w_2.equals("heart")) {
              word_12.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_12.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_3.equals("thine")) {
              word_13.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_13.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_4.equals("all")) {
              word_14.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_14.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_5.equals("direct")) {
             word_15.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
             word_15.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }       
        }
        });
        //End of checking the entered words 


        //Reset button to clear the text fields
        Button btn_rst_3 = new Button();
        btn_rst_3.setTranslateX(450);
        btn_rst_3.setTranslateY(-200);
        btn_rst_3.setText("Reset");
        btn_rst_3.setOnAction(new EventHandler<ActionEvent>() {
          public void handle (ActionEvent event) {
            word_11.clear();
            word_11.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_12.clear();
            word_12.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_13.clear();
            word_13.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_14.clear();
            word_14.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_15.clear();
            word_15.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
          }
        });
        //End of reset button

        //Back button
        Button bt_4 = new Button("<-- Back");
        bt_4.setTranslateX(-450);
        bt_4.setTranslateY(-200);
        bt_4.setOnAction(e -> primaryStage.setScene(scene_EV));
        //End of back button

        //Adding all the items to the StackPane
        StackPane root_P3 = new StackPane();
        root_P3.getChildren().add(imgv_5);
        root_P3.getChildren().add(txt_7);
        root_P3.getChildren().add(txt_8);
        root_P3.getChildren().add(grid_11);
        root_P3.getChildren().add(grid_12);
        root_P3.getChildren().add(grid_13);
        root_P3.getChildren().add(grid_14);
        root_P3.getChildren().add(grid_15);
        root_P3.getChildren().add(btn_chk_3);
        root_P3.getChildren().add(btn_rst_3);
        root_P3.getChildren().add(bt_4);
        //End of the StackPane

        //Creating the scene
        scene_P3 = new Scene(root_P3, 1000, 500);
        //End of Proverbs 3:5-6

        //Mark 12:30
        //Setting up the background image
        Image img_6 = new Image("verse.jpg");
        ImageView imgv_6 = new ImageView(img_6);
        imgv_6.setFitHeight(500);
        imgv_6.setFitWidth(1000);
        //End of background image

        //Setting up verse text
        Text txt_9 = new Text();
        txt_9.setText("And thou shalt ______ the Lord thy God with all thy _____, and with all thy soul, and with all thy ______,\n"
        + "and with _____ thy strength: this is the first ___________.\n"
        + "                                                           Mark 12:30 KJV\n");
        txt_9.setTranslateY(-50);
        txt_9.setFont(Font.font(25));
        //End of verse text

        //Setting up the text fields
        Text txt_10 = new Text();
        txt_10.setText("Please enter the missing words");
        txt_10.setTranslateX(-350);
        txt_10.setTranslateY(75);

        TextField word_16 = new TextField ();
        word_16.setPromptText("First Word");

        GridPane grid_16 = new GridPane();
        grid_16.setVgap(4);
        grid_16.setHgap(10);
        grid_16.setPadding(new Insets(5, 5, 5, 5));
        grid_16.add(word_16, 1, 0);
        grid_16.setTranslateX(50);
        grid_16.setTranslateY(350);

        TextField word_17 = new TextField ();
        word_17.setPromptText("Second Word");

        GridPane grid_17 = new GridPane();
        grid_17.setVgap(4);
        grid_17.setHgap(10);
        grid_17.setPadding(new Insets(5, 5, 5, 5));
        grid_17.add(word_17, 1, 0);
        grid_17.setTranslateX(350);
        grid_17.setTranslateY(350);

        TextField word_18 = new TextField ();
        word_18.setPromptText("Third Word");

        GridPane grid_18 = new GridPane();
        grid_18.setVgap(4);
        grid_18.setPadding(new Insets(5, 5, 5, 5));
        grid_18.add(word_18, 1, 0);
        grid_18.setTranslateX(600);
        grid_18.setTranslateY(350);

        TextField word_19 = new TextField ();
        word_19.setPromptText("Fourth Word");

        GridPane grid_19 = new GridPane();
        grid_19.setVgap(4);
        grid_19.setHgap(10);
        grid_19.setPadding(new Insets(5, 5, 5, 5));
        grid_19.add(word_19, 1, 0);
        grid_19.setTranslateX(200);
        grid_19.setTranslateY(400);

        TextField word_20 = new TextField ();
        word_20.setPromptText("Fifth Word");

        GridPane grid_20 = new GridPane();
        grid_20.setVgap(4);
        grid_20.setHgap(10);
        grid_20.setPadding(new Insets(5, 5, 5, 5));
        grid_20.add(word_20, 1, 0);
        grid_20.setTranslateX(500);
        grid_20.setTranslateY(400);
        //End of the textfields

        //Setting up checking system
        Button btn_chk_4 = new Button();
        btn_chk_4.setTranslateX(400);
        btn_chk_4.setTranslateY(200);
        btn_chk_4.setText("Check");
        btn_chk_4.setOnAction(new EventHandler<ActionEvent>() {
          public void handle (ActionEvent event) {
            String w_1, w_2, w_3, w_4, w_5;

            w_1 = word_16.getText();
            w_2 = word_17.getText();
            w_3 = word_18.getText();
            w_4 = word_19.getText();
            w_5 = word_20.getText();


          if (w_1.equals("love")) {
              word_16.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
           }
           else{
              word_16.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
           }
     
          if (w_2.equals("heart")) {
              word_17.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_17.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_3.equals("mind")) {
              word_18.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_18.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_4.equals("all")) {
              word_19.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_19.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_5.equals("commandment")) {
             word_20.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
             word_20.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }       
        }
        });
        //End of checking system

        //Reset button
        Button btn_rst_4 = new Button();
        btn_rst_4.setTranslateX(450);
        btn_rst_4.setTranslateY(-200);
        btn_rst_4.setText("Reset");
        btn_rst_4.setOnAction(new EventHandler<ActionEvent>() {
          public void handle (ActionEvent event) {
            word_16.clear();
            word_16.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_17.clear();
            word_17.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_18.clear();
            word_18.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_19.clear();
            word_19.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_20.clear();
            word_20.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
          }
        });
        //End of reset button

        //Back button
        Button bt_5 = new Button("<-- Back");
        bt_5.setTranslateX(-450);
        bt_5.setTranslateY(-200);
        bt_5.setOnAction(e -> primaryStage.setScene(scene_EV));
        //End of the back button

        //Adding all the items to the StackPane
        StackPane root_M12 = new StackPane();
        root_M12.getChildren().add(imgv_6);
        root_M12.getChildren().add(txt_9);
        root_M12.getChildren().add(txt_10);
        root_M12.getChildren().add(grid_16);
        root_M12.getChildren().add(grid_17);
        root_M12.getChildren().add(grid_18);
        root_M12.getChildren().add(grid_19);
        root_M12.getChildren().add(grid_20);
        root_M12.getChildren().add(btn_chk_4);
        root_M12.getChildren().add(btn_rst_4);
        root_M12.getChildren().add(bt_5);
        //End of StackPane

        //Creating the Scene
        scene_M12 = new Scene(root_M12, 1000, 500);
        //End of Mark 12:30

        //Ephesians 4:32
        //Setting up the background image
        Image img_7 = new Image("verse.jpg");
        ImageView imgv_7 = new ImageView(img_7);
        imgv_7.setFitHeight(500);
        imgv_7.setFitWidth(1000);
        //End of Background image

        //Setting up verse text
        Text txt_11 = new Text();
        txt_11.setText("And be ye _____ one to another, tenderhearted, _______ one another,\n"
        + "even as _____ for Christ's ____ hath forgiven _____.\n"
        + "                                                           Ephesians 4:32 KJV\n");
        txt_11.setTranslateY(-50);
        txt_11.setFont(Font.font(25));
        //End of verse text

        //Setting up instructions
        Text txt_12 = new Text();
        txt_12.setText("Please enter the missing words");
        txt_12.setTranslateX(-350);
        txt_12.setTranslateY(75);
        //End of instructions

        //Setting up textfields
        TextField word_21 = new TextField ();
        word_21.setPromptText("First Word");

        GridPane grid_21 = new GridPane();
        grid_21.setVgap(4);
        grid_21.setHgap(10);
        grid_21.setPadding(new Insets(5, 5, 5, 5));
        grid_21.add(word_21, 1, 0);
        grid_21.setTranslateX(50);
        grid_21.setTranslateY(350);

        TextField word_22 = new TextField ();
        word_22.setPromptText("Second Word");

        GridPane grid_22 = new GridPane();
        grid_22.setVgap(4);
        grid_22.setHgap(10);
        grid_22.setPadding(new Insets(5, 5, 5, 5));
        grid_22.add(word_22, 1, 0);
        grid_22.setTranslateX(350);
        grid_22.setTranslateY(350);

        TextField word_23 = new TextField ();
        word_23.setPromptText("Third Word");

        GridPane grid_23 = new GridPane();
        grid_23.setVgap(4);
        grid_23.setPadding(new Insets(5, 5, 5, 5));
        grid_23.add(word_23, 1, 0);
        grid_23.setTranslateX(600);
        grid_23.setTranslateY(350);

        TextField word_24 = new TextField ();
        word_24.setPromptText("Fourth Word");

        GridPane grid_24 = new GridPane();
        grid_24.setVgap(4);
        grid_24.setHgap(10);
        grid_24.setPadding(new Insets(5, 5, 5, 5));
        grid_24.add(word_24, 1, 0);
        grid_24.setTranslateX(200);
        grid_24.setTranslateY(400);

        TextField word_25 = new TextField ();
        word_20.setPromptText("Fifth Word");

        GridPane grid_25 = new GridPane();
        grid_25.setVgap(4);
        grid_25.setHgap(10);
        grid_25.setPadding(new Insets(5, 5, 5, 5));
        grid_25.add(word_25, 1, 0);
        grid_25.setTranslateX(500);
        grid_25.setTranslateY(400);
        //End of the textfield
  
        //Setting up the checking system
        Button btn_chk_5 = new Button();
        btn_chk_5.setTranslateX(400);
        btn_chk_5.setTranslateY(200);
        btn_chk_5.setText("Check");
        btn_chk_5.setOnAction(new EventHandler<ActionEvent>() {
          public void handle (ActionEvent event) {
            String w_1, w_2, w_3, w_4, w_5;

            w_1 = word_21.getText();
            w_2 = word_22.getText();
            w_3 = word_23.getText();
            w_4 = word_24.getText();
            w_5 = word_25.getText();


          if (w_1.equals("kind")) {
              word_21.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
           }
           else{
              word_21.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
           }
     
          if (w_2.equals("forgiving")) {
              word_22.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_22.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_3.equals("God")) {
              word_23.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_23.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_4.equals("sake")) {
              word_24.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_24.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_5.equals("you")) {
             word_25.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
             word_25.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }       
        }
        });
        //End of checking system

        //Setting up reset button
        Button btn_rst_5 = new Button();
        btn_rst_5.setTranslateX(450);
        btn_rst_5.setTranslateY(-200);
        btn_rst_5.setText("Reset");
        btn_rst_5.setOnAction(new EventHandler<ActionEvent>() {
          public void handle (ActionEvent event) {
            word_21.clear();
            word_21.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_22.clear();
            word_22.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_23.clear();
            word_23.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_24.clear();
            word_24.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_25.clear();
            word_25.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
          }
        });
        //End of reset button

        //Setting up back button
        Button bt_6 = new Button("<-- Back");
        bt_6.setTranslateX(-450);
        bt_6.setTranslateY(-200);
        bt_6.setOnAction(e -> primaryStage.setScene(scene_EV));
        //End of back button

        //Adding the items to the StackPane
        StackPane root_E4 = new StackPane();
        root_E4.getChildren().add(imgv_7);
        root_E4.getChildren().add(txt_11);
        root_E4.getChildren().add(txt_12);
        root_E4.getChildren().add(grid_21);
        root_E4.getChildren().add(grid_22);
        root_E4.getChildren().add(grid_23);
        root_E4.getChildren().add(grid_24);
        root_E4.getChildren().add(grid_25);
        root_E4.getChildren().add(btn_chk_5);
        root_E4.getChildren().add(btn_rst_5);
        root_E4.getChildren().add(bt_6);
        //End of the StackPane

        //Creating the Scene
        scene_E4 = new Scene(root_E4, 1000, 500);
        //End of Ephesians 4:32


        //Isaiah 40:28
        //Setting up the background
        Image img_9 = new Image("verse.jpg");
        ImageView imgv_9 = new ImageView(img_9);
        imgv_9.setFitHeight(500);
        imgv_9.setFitWidth(1000);
        //End of the background

        //Setting up the verse text
        Text txt_14 = new Text();
        txt_14.setText("Do you not _______? Have you not heard? The _____ is the everlasting God, the _______ of the ends of the earth.\n"
        + "He will not grow ______ or weary, and his understanding no one can _____.\n"
        + "                                                           Isaiah 40:28 NIV\n");
        txt_14.setTranslateY(-50);
        txt_14.setFont(Font.font(20));
        //End of verse text

        //Setting up the text fields
        Text txt_15 = new Text();
        txt_15.setText("Please enter the missing words");
        txt_15.setTranslateX(-350);
        txt_15.setTranslateY(75);

        TextField word_26 = new TextField ();
        word_26.setPromptText("First Word");

        GridPane grid_26 = new GridPane();
        grid_26.setVgap(4);
        grid_26.setHgap(10);
        grid_26.setPadding(new Insets(5, 5, 5, 5));
        grid_26.add(word_26, 1, 0);
        grid_26.setTranslateX(50);
        grid_26.setTranslateY(350);

        TextField word_27 = new TextField ();
        word_27.setPromptText("Second Word");

        GridPane grid_27 = new GridPane();
        grid_27.setVgap(4);
        grid_27.setHgap(10);
        grid_27.setPadding(new Insets(5, 5, 5, 5));
        grid_27.add(word_27, 1, 0);
        grid_27.setTranslateX(350);
        grid_27.setTranslateY(350);

        TextField word_28 = new TextField ();
        word_28.setPromptText("Third Word");

        GridPane grid_28 = new GridPane();
        grid_28.setVgap(4);
        grid_28.setPadding(new Insets(5, 5, 5, 5));
        grid_28.add(word_28, 1, 0);
        grid_28.setTranslateX(600);
        grid_28.setTranslateY(350);

        TextField word_29 = new TextField ();
        word_29.setPromptText("Fourth Word");

        GridPane grid_29 = new GridPane();
        grid_29.setVgap(4);
        grid_29.setHgap(10);
        grid_29.setPadding(new Insets(5, 5, 5, 5));
        grid_29.add(word_29, 1, 0);
        grid_29.setTranslateX(200);
        grid_29.setTranslateY(400);

        TextField word_30 = new TextField ();
        word_30.setPromptText("Fifth Word");

        GridPane grid_30 = new GridPane();
        grid_30.setVgap(4);
        grid_30.setHgap(10);
        grid_30.setPadding(new Insets(5, 5, 5, 5));
        grid_30.add(word_30, 1, 0);
        grid_30.setTranslateX(500);
        grid_30.setTranslateY(400);
        //End of the textfields

        //Setting up the checking system
        Button btn_chk_6 = new Button();
        btn_chk_6.setTranslateX(400);
        btn_chk_6.setTranslateY(200);
        btn_chk_6.setText("Check");
        btn_chk_6.setOnAction(new EventHandler<ActionEvent>() {
          public void handle (ActionEvent event) {
            String w_1, w_2, w_3, w_4, w_5;

            w_1 = word_26.getText();
            w_2 = word_27.getText();
            w_3 = word_28.getText();
            w_4 = word_29.getText();
            w_5 = word_30.getText();


          if (w_1.equals("know")) {
              word_26.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
           }
           else{
              word_26.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
           }
     
          if (w_2.equals("Lord")) {
              word_27.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_27.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_3.equals("Creator")) {
              word_28.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_28.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_4.equals("tired")) {
              word_29.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_29.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_5.equals("fathom")) {
             word_30.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
             word_30.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }       
        }
        });
        //End of the checking system

        //Setting up the reset button
        Button btn_rst_6 = new Button();
        btn_rst_6.setTranslateX(450);
        btn_rst_6.setTranslateY(-200);
        btn_rst_6.setText("Reset");
        btn_rst_6.setOnAction(new EventHandler<ActionEvent>() {
          public void handle (ActionEvent event) {
            word_26.clear();
            word_26.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_27.clear();
            word_27.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_28.clear();
            word_28.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_29.clear();
            word_29.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_30.clear();
            word_30.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
          }
        });
        //End of reset system

        //Setting up back button
        Button bt_8 = new Button("<-- Back");
        bt_8.setTranslateX(-450);
        bt_8.setTranslateY(-200);
        bt_8.setOnAction(e -> primaryStage.setScene(scene_HV));
        //End of back button

        //Adding all items to the StackPane
        StackPane root_I40 = new StackPane();
        root_I40.getChildren().add(imgv_9);
        root_I40.getChildren().add(txt_14);
        root_I40.getChildren().add(txt_15);
        root_I40.getChildren().add(grid_26);
        root_I40.getChildren().add(grid_27);
        root_I40.getChildren().add(grid_28);
        root_I40.getChildren().add(grid_29);
        root_I40.getChildren().add(grid_30);
        root_I40.getChildren().add(btn_chk_6);
        root_I40.getChildren().add(btn_rst_6);
        root_I40.getChildren().add(bt_8);
        //End of the StackPane

        //Creating the Scene
        scene_I40 = new Scene(root_I40, 1000, 500);
        //End of Isaiah 40:28

        //Romans 8:38-39
        //Setting up the background
        Image img_10 = new Image("verse.jpg");
        ImageView imgv_10 = new ImageView(img_10);
        imgv_10.setFitHeight(500);
        imgv_10.setFitWidth(1000);
        //End of the background

        //Setting up the verse text
        Text txt_16 = new Text();
        txt_16.setText("For I am convinced that neither ______ nor life, neither angels nor _____, neither the present nor the future, nor any _______,\n"
        + "neither height nor depth, nor _______ else in all creation, will be able to separate us from the _____ of God that is in Christ Jesus our Lord.\n"
        + "                                                                                         Romans 8:38-39 NIV\n");
        txt_16.setTranslateY(-50);
        txt_16.setFont(Font.font(15));
        //End of the verse text

        //Setting up the instructions 
        Text txt_17 = new Text();
        txt_17.setText("Please enter the missing words");
        txt_17.setTranslateX(-350);
        txt_17.setTranslateY(75);
        //End of the  instrcutions

        //Setting up the text fields
        TextField word_31 = new TextField ();
        word_31.setPromptText("First Word");

        GridPane grid_31= new GridPane();
        grid_31.setVgap(4);
        grid_31.setHgap(10);
        grid_31.setPadding(new Insets(5, 5, 5, 5));
        grid_31.add(word_31, 1, 0);
        grid_31.setTranslateX(50);
        grid_31.setTranslateY(350);

        TextField word_32 = new TextField ();
        word_32.setPromptText("Second Word");

        GridPane grid_32 = new GridPane();
        grid_32.setVgap(4);
        grid_32.setHgap(10);
        grid_32.setPadding(new Insets(5, 5, 5, 5));
        grid_32.add(word_32, 1, 0);
        grid_32.setTranslateX(350);
        grid_32.setTranslateY(350);

        TextField word_33 = new TextField ();
        word_28.setPromptText("Third Word");

        GridPane grid_33 = new GridPane();
        grid_33.setVgap(4);
        grid_33.setPadding(new Insets(5, 5, 5, 5));
        grid_33.add(word_33, 1, 0);
        grid_33.setTranslateX(600);
        grid_33.setTranslateY(350);

        TextField word_34 = new TextField ();
        word_34.setPromptText("Fourth Word");

        GridPane grid_34 = new GridPane();
        grid_34.setVgap(4);
        grid_34.setHgap(10);
        grid_34.setPadding(new Insets(5, 5, 5, 5));
        grid_34.add(word_34, 1, 0);
        grid_34.setTranslateX(200);
        grid_34.setTranslateY(400);

        TextField word_35 = new TextField ();
        word_35.setPromptText("Fifth Word");

        GridPane grid_35 = new GridPane();
        grid_35.setVgap(4);
        grid_35.setHgap(10);
        grid_35.setPadding(new Insets(5, 5, 5, 5));
        grid_35.add(word_35, 1, 0);
        grid_35.setTranslateX(500);
        grid_35.setTranslateY(400);
        //End of the text fields

        //Setting up checking system
        Button btn_chk_7 = new Button();
        btn_chk_7.setTranslateX(400);
        btn_chk_7.setTranslateY(200);
        btn_chk_7.setText("Check");
        btn_chk_7.setOnAction(new EventHandler<ActionEvent>() {
          public void handle (ActionEvent event) {
            String w_1, w_2, w_3, w_4, w_5;

            w_1 = word_31.getText();
            w_2 = word_32.getText();
            w_3 = word_33.getText();
            w_4 = word_34.getText();
            w_5 = word_35.getText();


          if (w_1.equals("death")) {
              word_31.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
           }
           else{
              word_31.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
           }
     
          if (w_2.equals("demons")) {
              word_32.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_32.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_3.equals("powers")) {
              word_33.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_33.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_4.equals("anything")) {
              word_34.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_34.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_5.equals("love")) {
             word_35.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
             word_35.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }       
        }
        });
        //End of the checking system

        //Setting up the reset button
        Button btn_rst_7 = new Button();
        btn_rst_7.setTranslateX(450);
        btn_rst_7.setTranslateY(-200);
        btn_rst_7.setText("Reset");
        btn_rst_7.setOnAction(new EventHandler<ActionEvent>() {
          public void handle (ActionEvent event) {
            word_31.clear();
            word_31.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_32.clear();
            word_32.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_33.clear();
            word_33.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_34.clear();
            word_34.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_35.clear();
            word_35.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
          }
        });
        //End of the reset button

        //Setting up back button
        Button bt_9 = new Button("<-- Back");
        bt_9.setTranslateX(-450);
        bt_9.setTranslateY(-200);
        bt_9.setOnAction(e -> primaryStage.setScene(scene_HV));
        //End of the back button

        //Adding all the items to the StackPane
        StackPane root_R83 = new StackPane();
        root_R83.getChildren().add(imgv_10);
        root_R83.getChildren().add(txt_16);
        root_R83.getChildren().add(txt_17);
        root_R83.getChildren().add(grid_31);
        root_R83.getChildren().add(grid_32);
        root_R83.getChildren().add(grid_33);
        root_R83.getChildren().add(grid_34);
        root_R83.getChildren().add(grid_35);
        root_R83.getChildren().add(btn_chk_7);
        root_R83.getChildren().add(btn_rst_7);
        root_R83.getChildren().add(bt_9);
        //End of the StackPane

        //Creating a new Scene
        scene_R83 = new Scene(root_R83, 1000, 500);
        //End of Romans 8:38-39

        //2 Peter 3:9
        //Setting up the background
        Image img_11 = new Image("verse.jpg");
        ImageView imgv_11 = new ImageView(img_11);
        imgv_11.setFitHeight(500);
        imgv_11.setFitWidth(1000);
        //End of the background

        //Setting up the verse text
        Text txt_18 = new Text();
        txt_18.setText("The Lord is not _____ in keeping His promise, as some ________ slowness. He is ______ with you,\n"
        + "not wanting anyone to ______, but everyone to come to _________.\n"
        + "                                                      2 Peter 3:9 NIV\n");
        txt_18.setTranslateY(-50);
        txt_18.setFont(Font.font(15));
        //End of the verse text

        //Setting up the text fields
        Text txt_19 = new Text();
        txt_19.setText("Please enter the missing words");
        txt_19.setTranslateX(-350);
        txt_19.setTranslateY(75);

        TextField word_36 = new TextField ();
        word_36.setPromptText("First Word");

        GridPane grid_36= new GridPane();
        grid_36.setVgap(4);
        grid_36.setHgap(10);
        grid_36.setPadding(new Insets(5, 5, 5, 5));
        grid_36.add(word_36, 1, 0);
        grid_36.setTranslateX(50);
        grid_36.setTranslateY(350);

        TextField word_37 = new TextField ();
        word_37.setPromptText("Second Word");

        GridPane grid_37 = new GridPane();
        grid_37.setVgap(4);
        grid_37.setHgap(10);
        grid_37.setPadding(new Insets(5, 5, 5, 5));
        grid_37.add(word_37, 1, 0);
        grid_37.setTranslateX(350);
        grid_37.setTranslateY(350);

        TextField word_38 = new TextField ();
        word_38.setPromptText("Third Word");

        GridPane grid_38 = new GridPane();
        grid_38.setVgap(4);
        grid_38.setPadding(new Insets(5, 5, 5, 5));
        grid_38.add(word_38, 1, 0);
        grid_38.setTranslateX(600);
        grid_38.setTranslateY(350);

        TextField word_39 = new TextField ();
        word_39.setPromptText("Fourth Word");

        GridPane grid_39 = new GridPane();
        grid_39.setVgap(4);
        grid_39.setHgap(10);
        grid_39.setPadding(new Insets(5, 5, 5, 5));
        grid_39.add(word_39, 1, 0);
        grid_39.setTranslateX(200);
        grid_39.setTranslateY(400);

        TextField word_40 = new TextField ();
        word_40.setPromptText("Fifth Word");

        GridPane grid_40 = new GridPane();
        grid_40.setVgap(4);
        grid_40.setHgap(10);
        grid_40.setPadding(new Insets(5, 5, 5, 5));
        grid_40.add(word_40, 1, 0);
        grid_40.setTranslateX(500);
        grid_40.setTranslateY(400);
        //End of the text fields
  
        //Setting up the check system
        Button btn_chk_8 = new Button();
        btn_chk_8.setTranslateX(400);
        btn_chk_8.setTranslateY(200);
        btn_chk_8.setText("Check");
        btn_chk_8.setOnAction(new EventHandler<ActionEvent>() {
          public void handle (ActionEvent event) {
            String w_1, w_2, w_3, w_4, w_5;

            w_1 = word_36.getText();
            w_2 = word_37.getText();
            w_3 = word_38.getText();
            w_4 = word_39.getText();
            w_5 = word_40.getText();


          if (w_1.equals("slow")) {
              word_36.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
           }
           else{
              word_36.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
           }
     
          if (w_2.equals("understand")) {
              word_37.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_37.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_3.equals("patient")) {
              word_38.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_38.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_4.equals("perish")) {
              word_39.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_39.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_5.equals("repentance")) {
             word_40.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
             word_40.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }       
        }
        });
        //End of the checking system

        //Setting up the reset
        Button btn_rst_8 = new Button();
        btn_rst_8.setTranslateX(450);
        btn_rst_8.setTranslateY(-200);
        btn_rst_8.setText("Reset");
        btn_rst_8.setOnAction(new EventHandler<ActionEvent>() {
          public void handle (ActionEvent event) {
            word_36.clear();
            word_36.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_37.clear();
            word_37.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_38.clear();
            word_38.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_39.clear();
            word_39.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_40.clear();
            word_40.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
          }
        });
        //End of the reset

        //Setting up the back button
        Button bt_10 = new Button("<-- Back");
        bt_10.setTranslateX(-450);
        bt_10.setTranslateY(-200);
        bt_10.setOnAction(e -> primaryStage.setScene(scene_HV));
        //End of the back button

        //Adding all the items to StackPane
        StackPane root_2P3 = new StackPane();
        root_2P3.getChildren().add(imgv_11);
        root_2P3.getChildren().add(txt_18);
        root_2P3.getChildren().add(txt_19);
        root_2P3.getChildren().add(grid_36);
        root_2P3.getChildren().add(grid_37);
        root_2P3.getChildren().add(grid_38);
        root_2P3.getChildren().add(grid_39);
        root_2P3.getChildren().add(grid_40);
        root_2P3.getChildren().add(btn_chk_8);
        root_2P3.getChildren().add(btn_rst_8);
        root_2P3.getChildren().add(bt_10);
        //End of the StackPane

        //Create the Scene
        scene_2P3 = new Scene(root_2P3, 1000, 500);
        //End of 2 Peter 3:9

        //Lamentations 3:22-23
        //Setting up the background
        Image img_12 = new Image("verse.jpg");
        ImageView imgv_12 = new ImageView(img_12);
        imgv_12.setFitHeight(500);
        imgv_12.setFitWidth(1000);
        //End of the background

        //Setting up the verse text
        Text txt_20 = new Text();
        txt_20.setText("Because of the Lord's great ______ we are not _______,\n"
        + "for his __________ never fail. They are ____ every morning; great is your _________.\n"
        + "                                                      Lamentations 3:22-23 NIV\n");
        txt_20.setTranslateY(-50);
        txt_20.setFont(Font.font(20));
        //End of the verse text

        //Setting of the instructions
        Text txt_21 = new Text();
        txt_21.setText("Please enter the missing words");
        txt_21.setTranslateX(-350);
        txt_21.setTranslateY(75);
        //End of the instructions

        //Setting up the text fields 
        TextField word_41 = new TextField ();
        word_41.setPromptText("First Word");

        GridPane grid_41= new GridPane();
        grid_41.setVgap(4);
        grid_41.setHgap(10);
        grid_41.setPadding(new Insets(5, 5, 5, 5));
        grid_41.add(word_41, 1, 0);
        grid_41.setTranslateX(50);
        grid_41.setTranslateY(350);

        TextField word_42 = new TextField ();
        word_42.setPromptText("Second Word");

        GridPane grid_42 = new GridPane();
        grid_42.setVgap(4);
        grid_42.setHgap(10);
        grid_42.setPadding(new Insets(5, 5, 5, 5));
        grid_42.add(word_42, 1, 0);
        grid_42.setTranslateX(350);
        grid_42.setTranslateY(350);

        TextField word_43 = new TextField ();
        word_43.setPromptText("Third Word");

        GridPane grid_43 = new GridPane();
        grid_43.setVgap(4);
        grid_43.setPadding(new Insets(5, 5, 5, 5));
        grid_43.add(word_43, 1, 0);
        grid_43.setTranslateX(600);
        grid_43.setTranslateY(350);

        TextField word_44 = new TextField ();
        word_44.setPromptText("Fourth Word");

        GridPane grid_44 = new GridPane();
        grid_44.setVgap(4);
        grid_44.setHgap(10);
        grid_44.setPadding(new Insets(5, 5, 5, 5));
        grid_44.add(word_44, 1, 0);
        grid_44.setTranslateX(200);
        grid_44.setTranslateY(400);

        TextField word_45 = new TextField ();
        word_45.setPromptText("Fifth Word");

        GridPane grid_45 = new GridPane();
        grid_45.setVgap(4);
        grid_45.setHgap(10);
        grid_45.setPadding(new Insets(5, 5, 5, 5));
        grid_45.add(word_45, 1, 0);
        grid_45.setTranslateX(500);
        grid_45.setTranslateY(400);
        //End of the textfields

        //Setting up the check system
        Button btn_chk_9 = new Button();
        btn_chk_9.setTranslateX(400);
        btn_chk_9.setTranslateY(200);
        btn_chk_9.setText("Check");
        btn_chk_9.setOnAction(new EventHandler<ActionEvent>() {
          public void handle (ActionEvent event) {
            String w_1, w_2, w_3, w_4, w_5;

            w_1 = word_41.getText();
            w_2 = word_42.getText();
            w_3 = word_43.getText();
            w_4 = word_44.getText();
            w_5 = word_45.getText();


          if (w_1.equals("love")) {
              word_41.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
           }
           else{
              word_41.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
           }
     
          if (w_2.equals("consumed")) {
              word_42.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_42.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_3.equals("compassions")) {
              word_43.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_43.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_4.equals("new")) {
              word_44.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_44.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_5.equals("faithfulness")) {
             word_45.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
             word_45.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }       
        }
        });
        //End of the check system

        //Setting up the reset button
        Button btn_rst_9 = new Button();
        btn_rst_9.setTranslateX(450);
        btn_rst_9.setTranslateY(-200);
        btn_rst_9.setText("Reset");
        btn_rst_9.setOnAction(new EventHandler<ActionEvent>() {
          public void handle (ActionEvent event) {
            word_41.clear();
            word_41.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_42.clear();
            word_42.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_43.clear();
            word_43.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_44.clear();
            word_44.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_45.clear();
            word_45.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
          }
        });
        //End of the reset button

        //Setting up the back button
        Button bt_11 = new Button("<-- Back");
        bt_11.setTranslateX(-450);
        bt_11.setTranslateY(-200);
        bt_11.setOnAction(e -> primaryStage.setScene(scene_HV));
        //End of the back button

        //Adding all the items to the StackPane
        StackPane root_L3 = new StackPane();
        root_L3.getChildren().add(imgv_12);
        root_L3.getChildren().add(txt_20);
        root_L3.getChildren().add(txt_21);
        root_L3.getChildren().add(grid_41);
        root_L3.getChildren().add(grid_42);
        root_L3.getChildren().add(grid_43);
        root_L3.getChildren().add(grid_44);
        root_L3.getChildren().add(grid_45);
        root_L3.getChildren().add(btn_chk_9);
        root_L3.getChildren().add(btn_rst_9);
        root_L3.getChildren().add(bt_11);
        //End of the StackPane

        //Creating a Scene
        scene_L3 = new Scene(root_L3, 1000, 500);
        //End of Lamentations 3:22-23

        //2 Corithians 12:9
        //Setting up the background
        Image img_13 = new Image("verse.jpg");
        ImageView imgv_13 = new ImageView(img_13);
        imgv_13.setFitHeight(500);
        imgv_13.setFitWidth(1000);
        //End of the background

        //Setting up the verse text
        Text txt_22 = new Text();
        txt_22.setText("But he said to me, 'My _______ is ________ for you, for my power is made perfect in ________.'\n"
        + "Therefore I will _______ all the more gladly about my weaknesses, so that Christ's ______ may rest on me.\n"
        + "                                                      2 Corithians 12:9 NIV\n");
        txt_22.setTranslateY(-50);
        txt_22.setFont(Font.font(20));
        //End of the verse text

        //Setting up the instruction
        Text txt_23 = new Text();
        txt_23.setText("Please enter the missing words");
        txt_23.setTranslateX(-350);
        txt_23.setTranslateY(75);
        //End of the instructions

        //Setting up the text fields
        TextField word_46 = new TextField ();
        word_46.setPromptText("First Word");

        GridPane grid_46= new GridPane();
        grid_46.setVgap(4);
        grid_46.setHgap(10);
        grid_46.setPadding(new Insets(5, 5, 5, 5));
        grid_46.add(word_46, 1, 0);
        grid_46.setTranslateX(50);
        grid_46.setTranslateY(350);

        TextField word_47 = new TextField ();
        word_47.setPromptText("Second Word");

        GridPane grid_47 = new GridPane();
        grid_47.setVgap(4);
        grid_47.setHgap(10);
        grid_47.setPadding(new Insets(5, 5, 5, 5));
        grid_47.add(word_47, 1, 0);
        grid_47.setTranslateX(350);
        grid_47.setTranslateY(350);

        TextField word_48 = new TextField ();
        word_48.setPromptText("Third Word");

        GridPane grid_48 = new GridPane();
        grid_48.setVgap(4);
        grid_48.setPadding(new Insets(5, 5, 5, 5));
        grid_48.add(word_48, 1, 0);
        grid_48.setTranslateX(600);
        grid_48.setTranslateY(350);

        TextField word_49 = new TextField ();
        word_49.setPromptText("Fourth Word");

        GridPane grid_49 = new GridPane();
        grid_49.setVgap(4);
        grid_49.setHgap(10);
        grid_49.setPadding(new Insets(5, 5, 5, 5));
        grid_49.add(word_49, 1, 0);
        grid_49.setTranslateX(200);
        grid_49.setTranslateY(400);

        TextField word_50 = new TextField ();
        word_50.setPromptText("Fifth Word");

        GridPane grid_50 = new GridPane();
        grid_50.setVgap(4);
        grid_50.setHgap(10);
        grid_50.setPadding(new Insets(5, 5, 5, 5));
        grid_50.add(word_50, 1, 0);
        grid_50.setTranslateX(500);
        grid_50.setTranslateY(400);
        //End of the text fields

        //Setting up the checking system
        Button btn_chk_10 = new Button();
        btn_chk_10.setTranslateX(400);
        btn_chk_10.setTranslateY(200);
        btn_chk_10.setText("Check");
        btn_chk_10.setOnAction(new EventHandler<ActionEvent>() {
          public void handle (ActionEvent event) {
            String w_1, w_2, w_3, w_4, w_5;

            w_1 = word_46.getText();
            w_2 = word_47.getText();
            w_3 = word_48.getText();
            w_4 = word_49.getText();
            w_5 = word_50.getText();


          if (w_1.equals("grace")) {
              word_46.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
           }
           else{
              word_46.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
           }
     
          if (w_2.equals("sufficient")) {
              word_47.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_47.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_3.equals("weakness")) {
              word_48.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_48.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_4.equals("boast")) {
              word_49.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
              word_49.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }
     
          if (w_5.equals("power")) {
             word_50.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
          }
          else{
             word_50.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
          }       
        }
        });
        //End of the checking system

        //Setting up the reset button
        Button btn_rst_10 = new Button();
        btn_rst_10.setTranslateX(450);
        btn_rst_10.setTranslateY(-200);
        btn_rst_10.setText("Reset");
        btn_rst_10.setOnAction(new EventHandler<ActionEvent>() {
          public void handle (ActionEvent event) {
            word_46.clear();
            word_46.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_47.clear();
            word_47.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_48.clear();
            word_48.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_49.clear();
            word_49.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));

            word_50.clear();
            word_50.setBackground(new Background(new BackgroundFill(Color.WHITE, CornerRadii.EMPTY, Insets.EMPTY)));
          }
        });
        //End of the reset button

        //Setting up the back button
        Button bt_12 = new Button("<-- Back");
        bt_12.setTranslateX(-450);
        bt_12.setTranslateY(-200);
        bt_12.setOnAction(e -> primaryStage.setScene(scene_HV));
        //End of the back button

        //Adding all the items to the StackPane
        StackPane root_2C12 = new StackPane();
        root_2C12.getChildren().add(imgv_13);
        root_2C12.getChildren().add(txt_22);
        root_2C12.getChildren().add(txt_23);
        root_2C12.getChildren().add(grid_46);
        root_2C12.getChildren().add(grid_47);
        root_2C12.getChildren().add(grid_48);
        root_2C12.getChildren().add(grid_49);
        root_2C12.getChildren().add(grid_50);
        root_2C12.getChildren().add(btn_chk_10);
        root_2C12.getChildren().add(btn_rst_10);
        root_2C12.getChildren().add(bt_12);
        //End of the StackPane

        //Creating a Scene
        scene_2C12 = new Scene(root_2C12, 1000, 500);
        //End of 2 Corithians 12:9

        //Setting primary scene
        primaryStage.setScene(scene);
        primaryStage.show();
        //End of show
        
    }
  }
//End of program