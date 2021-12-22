package cs.vsu.ru.lyashenko_e_v;

public class Picture {
    public static final HorizontalParabola P1 = new HorizontalParabola(4, -3, -0.25);
    public static final shapeCircle C1 = new shapeCircle(1, -3, 4);
    public static final shapeCircle C2 = new shapeCircle(-2, -5, 2);

    public static SimpleColor getColor(double x, double y) {
        if (P1.isPointLeftOfParabola(x, y)) {
            if (C1.insideCoord(x, y)) {
                if (C2.insideCoord(x, y)) {
                    return SimpleColor.WHITE;
                }
                else return SimpleColor.GRAY;
            }
            else if (C2.insideCoord(x, y)) {
                return SimpleColor.ORANGE;
            }
            else return SimpleColor.WHITE;
        }
        else if (C1.insideCoord(x, y)) {
            return SimpleColor.BLUE;
        }
        else return SimpleColor.GRAY;
    }
}