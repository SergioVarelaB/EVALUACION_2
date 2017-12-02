/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sergio Alberto Varela Bencomo #16550457
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo nObj = new Nodo();
        nObj.val = 100;
        Nodo nObj2 = new Nodo();
        nObj2.val = 200;
        Nodo nObj3 = new Nodo();
        nObj3.val = 300;
        //-------------------------
        //para vincularlos 
        
        nObj.nSig= nObj2;
        nObj2.nSig= nObj3;
        
        Nodo nMover=nObj;
        while(nMover!=null){
            System.out.println(nMover.val);
            nMover = nMover.nSig;
        }
    }
}
class Nodo{
    public int val;
    public Nodo nSig;
    public Nodo(){
        nSig = null;
    }
}