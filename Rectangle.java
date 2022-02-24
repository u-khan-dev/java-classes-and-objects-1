class Rectangle {
    Point topLeft, bottomRight;

    Rectangle(Point p1, Point p2) {
        this.topLeft = p1;
        this.bottomRight = p2;
    }

    Rectangle() {
        new Rectangle(new Point(0, 0), new Point(2, 1));
    }

    void printRectangle() {
        System.out.printf("\nThis rectangle has top left point (%d, %d) and bottom right point " +
                "(%d, %d).\n", topLeft.x, topLeft.y, bottomRight.x, bottomRight.y);
    }

    @Override
    public String toString() {
        return "This rectangle has top left point (" +
                topLeft.x + ", " + topLeft.y + ") and bottom right point (" +
                bottomRight.x + ", " + bottomRight.y + ").\n";
    }
}
