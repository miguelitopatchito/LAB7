/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author mpatc
 */
public class QuadraticSolver extends LAB7 {
    
    public double d, firstXintercept, secondXintercept;
    
    
    public QuadraticSolver(double a, double b, double c) {
        
       
    }

    QuadraticSolver() {
        d = b*b - 4*a*c;
        firstXintercept = (-b + Math.sqrt(d)) / (2 * a);
        secondXintercept = (-b - Math.sqrt(d)) / (2 * a);
    }
    
    
    public double get1x(double firstXintercept){
        return firstXintercept;
    }
    
    public double get2x(double secondXintercept){
        return secondXintercept;
    }
    
    public double getA(double a){
        return a;
    }
    
    public double getB(double b){
        return b;
    }
    
    public double getC (double c){
        return c;
    }
}
