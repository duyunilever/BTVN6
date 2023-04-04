public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(30);
        rectangle.setWidth(20);
        System.out.println(rectangle.displayRec());
        rectangle.CalcRec();
        Square square = new Square();
        square.setSide(10);
        System.out.println(square.displaySquare());
        square.CalcSquare();
    }
}