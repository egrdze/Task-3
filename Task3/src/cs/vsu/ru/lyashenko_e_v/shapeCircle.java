package cs.vsu.ru.lyashenko_e_v;

public class shapeCircle {
    public double x_coord;
    public double y_coord;
    public double r;

    public shapeCircle(double x_coord, double y_coord, double r) {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.r = r;
    }

    boolean insideCoord(double x, double y)
    {
        if ((x - this.x_coord) * (x - this.y_coord) + (y - this.x_coord) * (y - this.x_coord) <= this.r * this.r)
            return true;
        else
            return false;
    }

}
