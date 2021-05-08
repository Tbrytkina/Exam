package drawutils;

import by.teachmeskills.figuresfx.Exception.UnknownFigureException;
import by.teachmeskills.figuresfx.figures.Figure;
import javafx.scene.canvas.GraphicsContext;

import java.util.List;

public class Drawer <T extends Figure> implements Drawable {
    private List<T> figures;

    @Override
    public void draw(GraphicsContext gc){
        for (T figure : figures) {
            figure.draw(gc);
        }
    }

    public Drawer(List<T> figures) {
        this.figures = figures;


    }
}
