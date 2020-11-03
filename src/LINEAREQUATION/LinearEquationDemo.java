package LINEAREQUATION;

import java.util.Scanner;
public class LinearEquationDemo {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double a,b,c,d,e,f;
        a=kb.nextDouble();
        b=kb.nextDouble();
        c=kb.nextDouble();
        d=kb.nextDouble();
        e=kb.nextDouble();
        f=kb.nextDouble();
        LinearEquation tmp = new LinearEquation(a,b,c,d,e,f);
        if(!tmp.isSolvable()){
            System.out.println("The equation has no solution");
        }else{
            System.out.println(tmp.getX());
            System.out.println(tmp.getY());
        }

    }
}
