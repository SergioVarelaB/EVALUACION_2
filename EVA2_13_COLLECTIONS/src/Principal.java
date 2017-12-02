
import java.util.ArrayList;
import java.util.Iterator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio Alberto Varela Bencomo #16550457
 * 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList <Integer> aiMiAL = new ArrayList();
        aiMiAL.add(100);//0
        aiMiAL.add(200);//1
        aiMiAL.add(300);//2
        aiMiAL.add(400);//3
        aiMiAL.add(500);//4
        for (Integer aiml1 : aiMiAL) {
            System.out.print(aiml1+"-");
        }
        aiMiAL.add(2, 299);
        System.out.println("");
        for (Integer aiml1 : aiMiAL) {
            System.out.print(aiml1+"-");
        }
        System.out.println("");
        //recorer un collection con iteradores
        Iterator iRecorrrArray = aiMiAL.iterator();
        while(iRecorrrArray.hasNext()){
            System.out.print(iRecorrrArray.next()+"-");
        }
        System.out.println("");
    }
    
}
