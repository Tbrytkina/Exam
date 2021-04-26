package drawutils;

import by.teachmeskills.figuresfx.figures.Figure;
import javafx.scene.canvas.GraphicsContext;

import java.util.List;

public class Drawer <T extends Figure> implements Drawable {
    private List<T> figures;

    @Override
    public void draw(GraphicsContext gc) {
        for(int i = 0; i < figures.size(); i++ ){
            T figure = figures.get(i);
            figure.draw(gc);
        }
    }

    public Drawer(List<T> figures) {
        this.figures = figures;


    }
}
