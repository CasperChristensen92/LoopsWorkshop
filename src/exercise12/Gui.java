package exercise12;

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

        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(600, 400);
        this.drawShapes(pane,30,300,243, 5);
        return pane;
    }

    private void drawShapes(Pane pane,double x,double y, double h, double howMany){

        drawTriangle(pane,x,y,h);
        drawInTriangle(pane,x,y,h,howMany);



    }

    private void drawTriangle(Pane pane, double x, double y, double h){
        Line line1 = new Line(x,y,x+2*h,y);
        Line line2 = new Line(x,y,x+h,y-h);
        Line line3 = new Line(x+h,y-h,x+2*h,y);
        pane.getChildren().add(line1);
        pane.getChildren().add(line2);
        pane.getChildren().add(line3);
    }
    private void drawInTriangle(Pane pane, double x, double y, double h, double howMany) {
        if (howMany > 0) {
            double hNew = h / 3;
            double x2 = x + h - hNew;
            double y2 = y - h + hNew;
            double x3 = x + 2 * h - 2 * hNew;
            drawTriangle(pane, x, y, hNew);
            drawTriangle(pane, x2, y2, hNew);
            drawTriangle(pane, x3, y, hNew);
            drawInTriangle(pane,x,y,hNew,howMany-1);
            drawInTriangle(pane,x2,y2,hNew,howMany-1);
            drawInTriangle(pane,x3,y,hNew,howMany-1);
        }
    }
}


