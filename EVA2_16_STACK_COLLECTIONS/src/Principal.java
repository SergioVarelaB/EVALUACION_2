
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author savb2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack <Double> stmiPila = new Stack();
        stmiPila.push(10.0);
        stmiPila.push(20.0);
        stmiPila.push(30.0);
        stmiPila.push(40.0);
        stmiPila.push(50.0);
        System.out.println(stmiPila.pop());
        System.out.println(stmiPila.pop());
        System.out.println(stmiPila.peek());
        System.out.println(stmiPila.pop());
        System.out.println(stmiPila.peek());
    }
    
}
