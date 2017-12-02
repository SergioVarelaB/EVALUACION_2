
import java.util.logging.Level;
import java.util.logging.Logger;

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
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Arbol miArbol = new Arbol();
        try {
            miArbol.insertarNodo(new Nodo(100));
            miArbol.insertarNodo(new Nodo(101));
            miArbol.insertarNodo(new Nodo(97));
            miArbol.insertarNodo(new Nodo(80));
            miArbol.insertarNodo(new Nodo(115));
            miArbol.insertarNodo(new Nodo(114));
            System.out.println("arbol post order:");
            miArbol.imprimirPosO();
            System.out.println("");
            System.out.println("arbol in order:");
            miArbol.imprimirIOrder();
            System.out.println("");
            System.out.println("arbol pre order:");
            miArbol.imprimirPrOrder();
            System.out.println("");
            miArbol.findN(100);
            miArbol.findN(101);
            miArbol.findN(102);

        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
class Nodo{
    private int val;
    private Nodo nIzq;
    private Nodo nDer;
    public Nodo(){
        val = 0;
        nIzq=null;
    }
    public Nodo(int iNum){
        val = iNum;
        nDer = null;
        nIzq=null;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Nodo getnIzq() {
        return nIzq;
    }

    public void setnIzq(Nodo nIzq) {
        this.nIzq = nIzq;
    }

    public Nodo getnDer() {
        return nDer;
    }

    public void setnDer(Nodo nDer) {
        this.nDer = nDer;
    }
    
}
class Arbol{
    private Nodo root;
    
    public Arbol(){
        root = null;
    }
    public Arbol(Nodo nNodo){
        root=nNodo;
    }
    public void insertarNodo(Nodo nNodo) throws Exception{
        agregarNodo(root, nNodo);
    }

     public void agregarNodo(Nodo nActual, Nodo nNodo) throws Exception {
        if(root == null) {
            root = nNodo;
        }else{
            if(nNodo.getVal() < nActual.getVal()){ //menor
                if(nActual.getnIzq() == null) { //posicion vacia (null) aqui va
                    nActual.setnIzq(nNodo);
                }else{ //nodo
                    agregarNodo(nActual.getnIzq(), nNodo);
                }
            }else if (nNodo.getVal() > nActual.getVal()){ //mayor
                if(nActual.getnDer() == null) { //posicion vacia (null) aqui va
                    nActual.setnDer(nNodo);
                }else{ //nodo
                    agregarNodo(nActual.getnDer(), nNodo);
                }                
            }else{ //NO SE ACEPTAN VALORES IGUALES
                throw new Exception("NO SE ACEPTAN VALORES IGUALES");
                }
        }
    
    }
    public void imprimirPrOrder(){
        imprimirPreOrder(root);
            
        }
    public void imprimirPreOrder(Nodo nActual){
        if(nActual != null){
            System.out.print(nActual.getVal() + " - "); //VISITAR EL NODO
            imprimirPreOrder(nActual.getnIzq()); //RECORRE EL LADO IZQUIERDO
            imprimirPreOrder(nActual.getnDer()); //RECORRE EL LADO DERECHO
        }
        }
    public void imprimirPosO(){
        imprimirPostOr(root);
    }
    
    public void imprimirPostOr(Nodo nActual){
        if(nActual != null){
            
            imprimirPostOr(nActual.getnIzq()); //RECORRE EL LADO IZQUIERDO
            imprimirPostOr(nActual.getnDer()); //RECORRE EL LADO DERECHO
            System.out.print(nActual.getVal() + " - "); //VISITAR EL NODO
        }
    }
    public void imprimirIOrder(){
        imprimirInOrder(root);
    
    }
    public void imprimirInOrder(Nodo nActual){
        if(nActual!=null){
        imprimirPostOr(nActual.getnIzq()); //RECORRE EL LADO IZQUIERDO
        System.out.print(nActual.getVal() + " - "); //VISITAR EL NODO
        imprimirPostOr(nActual.getnDer()); //RECORRE EL LADO DERECHO
        
    }     
  }
      public void findN(int val){
        buscarNodo(root, val);
    }

     public void buscarNodo(Nodo nActual, int val) {
        if(root == null) {
            System.out.println("no se encuentra el nodo");
        }else{
            if(val < nActual.getVal()){ //menor
                if(nActual.getnIzq() == null) { //posicion vacia (null) aqui va
                    System.out.println("no se encuentra el nodo");
                }else{ //nodo
                    buscarNodo(nActual.getnIzq(), val);
                }
            }else if (val > nActual.getVal()){ //mayor
                if(nActual.getnDer() == null) { //posicion vacia (null) aqui va
                    System.out.println("no se encuentra el nodo");
                }else{ //nodo
                    buscarNodo(nActual.getnDer(), val);
                }                
            }else{
                System.out.println("el nodo si se encuentra en el arbol");
                }
        }
    
    }

}
