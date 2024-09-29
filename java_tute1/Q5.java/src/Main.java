class Circle{
    private double radius;
    public Circle(double radius){
        this.radius=radius;

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double computeArea() {
        return Math.PI*radius*radius;
    }
    public double computeCircumference(){
        return 2*Math.PI*radius;
    }
}
public class Main {
    public static void main(String[] args) {
        double innerRadius=3.0;
        double outerRadius=5.0;
        Circle innerCircle=new Circle(innerRadius);
        Circle outerCircle=new Circle(outerRadius);
        double shadedArea=outerCircle.computeArea()-innerCircle.computeArea();
        System.out.println("The area of the shaded area is:"+shadedArea);

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


    }
}