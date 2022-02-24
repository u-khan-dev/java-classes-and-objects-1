public class BuildRectangle {
    public static void main(String[] args) {
        Point A = new Point();
        Point B = new Point(-4, 7);

        Rectangle R = new Rectangle(A, B);

        System.out.println(R);
    }
}
