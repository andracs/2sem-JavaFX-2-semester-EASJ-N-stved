/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxplayground;

import java.util.Random;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author Peggy Fisher
 */
public class Challange2 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        Group root = new Group();
        int amountOfShapes = 100;
        
        for (int i=0; i<amountOfShapes; i++){
            Random rand = new Random();
            int x = rand.nextInt(400);
            int y = rand.nextInt(400);
            int r = rand.nextInt(200);
            int color = rand.nextInt(255);
            double opacity = Math.random();
            
            Circle cir = new Circle(x,y,r);
            cir.setStroke(Color.grayRgb(color));
            cir.setStrokeWidth(5);
            cir.setFill(Color.grayRgb(color, opacity));  
            root.getChildren().addAll(cir);
        }
        
        
        Rectangle rec = new Rectangle(240,90,80,70);
        rec.setStroke(Color.GREEN);
        rec.setStrokeWidth(5);
        rec.setFill(Color.YELLOWGREEN);
        
        
        Scene scene = new Scene(root, 400, 400, Color.SKYBLUE);
        
        primaryStage.setTitle("Challange");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
