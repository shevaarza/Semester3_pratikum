public class Circle {
    private double phi ;
    private double r ;

    public Circle (double phi , double r){
        this.phi = phi;
        this.r = r;
    }

    public double area(){
        double area = phi * r * r;
        return area;
    }
    public double circumference(){
        double circumference = 2 * phi * r;
        return circumference;
    }
    public double r(){
        return r;
    }
}
