package QUADRATICEQUATION;

import java.util.Scanner;
public class QuadraticEquationDemo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double a,b,c;
        double eps = 0.000001;
        a=kb.nextDouble();
        b=kb.nextDouble();
        c=kb.nextDouble();
        QuadraticEquation tmp =new QuadraticEquation(a,b,c);
        if(tmp.getDiscriminant()>eps){
            System.out.println(tmp.getRoot1());
            System.out.println(tmp.getRoot2());
        }else if(Math.abs(tmp.getDiscriminant())<eps){
            System.out.println(tmp.getRoot1());
        }else{
            System.out.println("The equation has no roots.");
        }
    }
}
