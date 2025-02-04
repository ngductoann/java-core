public class Rectangle2 {
    // Constructors Good Example

    private int x;
    private int y;
    private int width;
    private int height;

    // 1st constructor
    public Rectangle2() {
        this(0, 0);
    }

    // 2nd constructor
    public Rectangle2(int width, int height) {
        this(0, 0, width, height);
    }

    public Rectangle2(int x, int y, int width, int height) {
        // initalize variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
