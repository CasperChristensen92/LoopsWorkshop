package loopstemplate;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Loops"); // may be changed
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(200, 200); // may be changed
        //this.drawShapes1(pane);
        //this.exercise1(pane);
        //this.exercise2(pane);
        //this.exercise3a(pane);
        //this.exercise3b(pane);
        //this.exercise3c(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes1(Pane pane) {
        Line line = new Line(10, 10, 150, 80);
        pane.getChildren().add(line);
    }

    private void exercise1(Pane pane) {
        // a is the length of the arrow and b is the space between the end of the lines
        int a = 20;
        int b = 8;
// draw an arrowhead at (100,75)
        int x = 100;
        int y = 75;
        Line line1 = new Line(x, y, x + a, y - b);
        Line line2 = new Line(x, y, x + a, y + b);
        pane.getChildren().addAll(line1, line2);
// draw an arrowhead at (100,125)
        x = 100;
        y = 125;
        Line line3 = new Line(x, y, x + a, y - b);
        Line line4 = new Line(x, y, x + a, y + b);
        pane.getChildren().addAll(line3, line4);
        // draw an arrowhead at (20,50)
        x = 20;
        y = 50;
        Line line5 = new Line(x, y, x + a, y - b);
        Line line6 = new Line(x, y, x + a, y + b);
        pane.getChildren().addAll(line5, line6);
    }
    private void exercise2(Pane pane) {
        int x1 = 100; // start point: (x1,y1)
        int y1 = 100;
        int x2 = 20; // end point: (x2,y2)
        int y2 = 10;
        while (x2 <= 180) {
            Line line = new Line(x1, y1, x2, y2);
            pane.getChildren().add(line);
            x2 += 20;
        }
    }

    private void exercise3a(Pane pane) {
        int x1 = 10; // start point: (x1,y1)
        int y1 = 190;
        int y2 = 10; // end point: (x1,y2)
        while (x1 <= 180) {
            Line line = new Line(x1, y1, x1, y2);
            pane.getChildren().add(line);
            x1 += 40;
        }
    }
    private void exercise3b(Pane pane) {
        int x1 = 10; // start point: (x1,y1)
        int y1 = 10;
        int x2 = 190; // end point: (x2,y1)
        while (y1 <= 180) {
            Line line = new Line(x1, y1, x2, y1);
            pane.getChildren().add(line);
            y1 += 40;
        }
    }
    private void exercise3c(Pane pane) {
        int x1 = 90; // start point: (x1,y1)
        int y1 = 10;
        int x2 = 110; // end point: (x2,y1)
        while (y1 <= 180) {
            Line line = new Line(x1, y1, x2, y1);
            pane.getChildren().add(line);
            y1 += 40;
            x1 -= 20;
            x2 += 20;
        }
    }

}
