package chapterSix;

public class MethodOverload {
    public static void main(String[] args) {

    }
    public static int square(double x, double y) {
        return (int) (x * x + y * y);
    }
    public static double square(int x, double y) {
        return x * x +y;
    }

    public double sphereVolume(double radius){
        return (4.0/3.0)*Math.PI*Math.pow(radius, 3);
    }
}
