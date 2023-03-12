public class CircleClass {
    private String color;
    private double radius;
    private double area;

    public CircleClass (String color, double radius){
        setColor(color);
        setRadius(radius);
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        area = 3.14 * radius * radius;
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
