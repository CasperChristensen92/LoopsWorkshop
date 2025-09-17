package exercise1011;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
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
        this.drawShapes(pane);
        return pane;
    }

    private void drawRing(Pane pane, int x, int y){
        double r = 30;
        Circle circle1 = new Circle(x,y,r-1);
        circle1.setFill(Color.WHITE);
        circle1.setStroke(Color.BLACK);
        circle1.setStrokeWidth(11);
        pane.getChildren().add(circle1);

        Circle circle2 = new Circle(x,y,r-1);
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.YELLOW);
        circle2.setStrokeWidth(8);
        pane.getChildren().add(circle2);

        Circle circle3 = new Circle(x,y,r-1);
        circle3.setFill(Color.WHITE);
        circle3.setStroke(Color.BLACK);
        circle3.setStrokeWidth(2);
        pane.getChildren().add(circle3);


        Ellipse ellipse = new Ellipse(x,y-r,r/2,r/4);
        ellipse.setFill(Color.RED);
        pane.getChildren().add(ellipse);

    }

    private void drawCross(Pane pane, int x, int y, int w){
        Line line1 = new Line (x-w,y,x+w,y);
        pane.getChildren().add(line1);
        Line line2 = new Line(x,y-w,x,y+w);
        pane.getChildren().add(line2);
    }

    private void drawShapes(Pane pane) {
        drawRing(pane, 50, 50);
        drawRing(pane, 150, 50);
        drawRing(pane, 50, 150);
        drawRing(pane, 150, 150);
        drawCross(pane,50,50,10);
        drawCross(pane,150,50,10);
        drawCross(pane,50,150,10);
        drawCross(pane,150,150,10);
    }
}
