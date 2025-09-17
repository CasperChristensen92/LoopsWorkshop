package exampleshapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);
        //this.drawShapes(pane);
        //this.exercise4a(pane);
        //this.exercise4b(pane);
        //this.exercise4c(pane);
        //this.exercise5a(pane);
        //this.exercise6a(pane);
        //this.exercise6(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {

        // Line from (70,70) to (100,70)
        Line line = new Line(70, 70, 100, 70);
        pane.getChildren().add(line);

        // Circle with center at (70,70) and radius 30
        Circle circle = new Circle(70, 70, 30);
        circle.setFill(Color.CORNFLOWERBLUE);
        circle.setStroke(Color.BLACK);
        pane.getChildren().add(circle);

        // Rectangle, upper left corner at (100,40), width 75, height 25
        Rectangle rektangel = new Rectangle(200, 40, 75, 25);
        rektangel.setFill(Color.CORAL);
        pane.getChildren().add(rektangel);

        // Polygon with 3 points (200,100), (300,100) and (250,150)
        Polygon polygon = new Polygon(200, 100, 300, 100, 250, 150);
        polygon.setFill(Color.PINK);
        pane.getChildren().add(polygon);

        // Ellipse with center at (70,230), x-radius 50 and y-radius 200/2
        Ellipse ellipse = new Ellipse(70, 230, 50, 100);
        ellipse.setFill(Color.YELLOW);
        ellipse.setStroke(Color.GREEN);
        ellipse.setStrokeWidth(5);
        pane.getChildren().add(ellipse);

        // Arc (part of ellipse) with center at (300,300), x-radius 100 and y-radius 60,
        // start angle 45 degrees, length 90 degrees
        Arc arc = new Arc(300, 300, 100, 60, 45, 90);
        arc.setFill(Color.GREEN);
        arc.setType(ArcType.ROUND);
        pane.getChildren().add(arc);

        // Text placed at (100,350)
        Text text = new Text(100, 350, "Computer Science");
        text.setFill(Color.BLUEVIOLET);
        pane.getChildren().add(text);
    }

    private void exercise4a(Pane pane) {
        int x = 200; // center: (x,y)
        int y = 200;
        int r = 30; // radius: r
        while (r <= 200) {
            Circle circle = new Circle(x, y, r);
            circle.setStroke(Color.BLACK);
            circle.setFill(null);
            pane.getChildren().add(circle);
            r += 40;
        }
    }

    private void exercise4b(Pane pane) {
        int x = 40; // center: (x,y)
        int y = 200;
        int r = 20; // radius: r
        for (int i = 0; i < 8; i++) {
            Circle circle = new Circle(x, y, r);
            circle.setStroke(Color.BLACK);
            circle.setFill(null);
            pane.getChildren().add(circle);
            x += 20;
            r += 20;
        }
    }

    private void exercise4c(Pane pane) {
        int x = 200; // center: (x,y)
        int y = 200;
        int h = 80; // height: h
        int w = 20; // width: w
        while (w <= 200) {
            Ellipse ellipse = new Ellipse(x, y, w, h);
            ellipse.setStroke(Color.BLACK);
            ellipse.setFill(null);
            pane.getChildren().add(ellipse);
            w += 25;
        }
    }

    private void exercise5a(Pane pane) {
        String str = "Datamatiker";
        int x = 10; //start: (x,y)
        int y = 10;

        for (int i = 1; i <= str.length(); i++) {
            String subStr = str.substring(0,i);
            Text text = new Text(x,y,subStr);
            pane.getChildren().add(text);
            y+=20;
        }
    }


    private void exercise6(Pane pane){
        int x1 = 20;
        int y1 = 360;
        int x2= 380;
        int h=10;
        Line line1 = new Line(x1, y1, x2, y1);
        pane.getChildren().add(line1);
        Line line2 = new Line(x2, y1, x2-10, y1+h);
        Line line3 = new Line(x2, y1, x2-10, y1-h);
        pane.getChildren().add(line2);
        pane.getChildren().add(line3);

        for (int i = 0; i < 11; i++) {
            if (i%5==0) {
                x1 += 30;
                Line line = new Line(x1, y1 - h*2, x1, y1 + h*2);
                pane.getChildren().add(line);
                Text text = new Text(x1, y1+3*h,String.valueOf(i));
                pane.getChildren().add(text);
            }
            else {
                x1 += 30;
                Line line = new Line(x1, y1 - h, x1, y1 + h);
                pane.getChildren().add(line);
            }

        }
    }


}
