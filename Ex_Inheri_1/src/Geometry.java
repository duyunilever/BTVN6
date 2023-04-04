public class Geometry {
    private double length;
    private double width;
    private double side;
    public Geometry() {
    }
    public Geometry(double length, double width, double side) {
        this.length = length;
        this.width = width;
        this.side = side;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }
    public void CalcRec() {
        System.out.println("Diện tích hình chữ nhật là: " + (getLength()*getWidth()));
        System.out.println("Chu vi hình chữ nhật là: " + 2*(getLength()+getWidth()));
    }
    public String displayRec() {
        return "Chiều dài hình chữ nhật bằng: " + length + "\n" +
        "Chiều rộng hình chữ nhật bằng: " + width;
    }
    public String displaySquare(){
        return "Cạnh của hình vuông bằng: " + side;
    }
    public void CalcSquare() {
        System.out.println("Diện tích hình vuông là: " + Math.pow(getSide(),2));
        System.out.println("Chu vi hình vuông là: " + getSide()*4);
    }
}


