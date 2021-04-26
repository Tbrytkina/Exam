package by.teachmeskills.figuresfx.figures;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Objects;

public class Eclipse extends Figure {
    private double radius1;
    private double radius2;


    private Eclipse(double cx, double cy, double lineWidth, Color color) {
        super(FIGURE_TYPE_ECLIPSE, cx, cy, lineWidth, color);
    }

    public Eclipse(double cx, double cy, double lineWidth, Color color, double radius1, double radius2) {
        this(cx, cy, lineWidth, color);
        this.radius1 = radius1 < 30 ? 30 : radius1;
        this.radius2 = radius2 < 30 ? 30 : radius2;

    }

    public double getRadius1() {
        return radius1;
    }

    public void setRadius1(double radius1) {
        this.radius1 = radius1;
    }

    public double getRadius2() {
        return radius2;
    }

    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.setLineWidth(lineWidth);
        graphicsContext.setStroke(color);
        graphicsContext.strokeOval(cx - radius1 / 2, cy - radius2 / 2, radius1, radius2);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Eclipse eclipse = (Eclipse) o;
        return Double.compare(eclipse.radius1, radius1) == 0 && Double.compare(eclipse.radius2, radius2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius1, radius2);
    }

    @Override
    public String toString() {
        return "Eclipse{" +
                "cx=" + cx +
                ", cy=" + cy +
                ", lineWidth=" + lineWidth +
                ", color=" + color +
                ", width=" + radius1 +
                ", height=" + radius2 +
                '}';
    }
}
