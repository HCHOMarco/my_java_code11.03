package QUADRATICEQUATION;

public class QuadraticEquation {
    private double a,b,c;
    QuadraticEquation(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminant(){
        return b*b-4*a*c;
    }

    public double getRoot1(){
        return (-b+Math.sqrt(b*b-4*a*c))/2.0*a;
    }

    public double getRoot2(){
        return (-b-Math.sqrt(b*b-4*a*c))/2.0*a;
    }
}
