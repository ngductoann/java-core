public class Rectangle3 extends Shape {
    private int width;
    private int height;

    // 1st constructor
    private Rectangle3(int x, int y) {
        this(x, y, 0, 0); // calls 2nd constructor
    }

    // 2nd constructor
    public Rectangle3(int x, int y, int width, int height) {
        super(x, y); // calls constructor from parent (shape)
        this.width = width;
        this.height = height;
    }
}
