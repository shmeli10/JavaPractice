package java_regular.data.type.enums.example2;

public class ShapeSquareMain {
    public static void main(String[] args) {
        double x=2, y=3;

        Shape[] arr = Shape.values();

        for(Shape sh : arr)
            System.out.printf("%10s = %5.2f%n", sh, sh.square(x, y));
    }
}
