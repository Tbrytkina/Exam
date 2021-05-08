package drawutils;

import by.teachmeskills.figuresfx.Exception.UnknownFigureException;
import javafx.scene.canvas.GraphicsContext;

public interface Drawable {
    void draw(GraphicsContext gc) throws UnknownFigureException;
}
