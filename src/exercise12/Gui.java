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
        pane.setPrefSize(400, 400);
        this.drawShapes(pane,100,300,81);
        return pane;
    }

    private void drawShapes(Pane pane,double x,double y, double h){

        drawTriangle(pane,x,y,h);
        drawInTriangle(pane,x,y,h);
        double x1= x;
        double y1= y;
        double x2= x+h-h/3;
        double y2= y-h+h/3;
        double x3= x+2*h-2*h/3;
        double y3= y;
        for (int i = 0; i < 2; i++) {
            h= h/3;

        }
        drawInTriangle(pane,x,y,h/3);



    }

    private void drawTriangle(Pane pane, double x, double y, double h){
        Line line1 = new Line(x,y,x+2*h,y);
        Line line2 = new Line(x,y,x+h,y-h);
        Line line3 = new Line(x+h,y-h,x+2*h,y);
        pane.getChildren().add(line1);
        pane.getChildren().add(line2);
        pane.getChildren().add(line3);
    }
    private void drawInTriangle(Pane pane, double x, double y, double h){
        double hNew=h/3;
        for (int j = 0; j < 2; j++) {
            drawTriangle(pane,x,y,hNew);
            drawTriangle(pane,x+h-hNew,y-h+hNew,hNew);
            drawTriangle(pane,x+2*h-2*hNew,y,hNew);
        }
    }

    private void drawInTriangleMany(Pane pane, double x, double y, double h, int howMany){
        double x1= x;
        double y1= y;
        double x2= x+h-h/3;
        double y2= y-h+h/3;
        double x3= x+2*h-2*h/3;
        double y3= y;
        double hNew = h/3;
        for (int i = 0; i < howMany-1; i++) {

        }
    }

}


