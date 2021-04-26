package by.teachmeskills.figuresfx.controller;

import by.teachmeskills.figuresfx.figures.*;
import by.teachmeskills.figuresfx.figures.Rectangle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

import java.awt.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;

public class MainScreenViewController implements Initializable {
    private List<Figure> figures;
    private Random random;

    @FXML
    private Canvas canvas;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        figures = new ArrayList<>();
        random = new Random(System.currentTimeMillis());
    }

    private void addFigure(Figure figure){
        figures.add(figure);

    }

    private Figure createFigure (double x, double y){
        Figure figure = null;
        switch (random.nextInt(3)) {
            case Figure.FIGURE_TYPE_CIRCLE:
                figure = new Circle(x, y, random.nextInt(3), Color.GREEN, random.nextInt(50));
                break;

            case Figure.FIGURE_TYPE_ECLIPSE:
                figure = new Eclipse(x,y, random.nextInt(3), Color.ORANGE, random.nextInt(60),
                        random.nextInt(100));
                break;

            case Figure.FIGURE_TYPE_RECTANGLE:
                figure = new Rectangle(x, y, random.nextInt(3), Color.AQUA,
                        random.nextInt(60),random.nextInt(100));
                break;

            default:
                System.out.println("Unknown figure type!");
        }

        return figure;

    }

        private void repaint(){
            canvas.getGraphicsContext2D().clearRect(0,0, canvas.getWidth(), canvas.getHeight());
            for(Figure figure : figures){
                if(figure != null){
                    figure.draw(canvas.getGraphicsContext2D());
                }
            }

    }


    @FXML
    private void onMousedClicked(MouseEvent mouseEvent) {
        addFigure(createFigure(mouseEvent.getX(),mouseEvent.getY()));
        repaint();
    }
}
