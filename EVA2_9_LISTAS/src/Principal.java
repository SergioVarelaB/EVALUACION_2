
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
 * 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista miLista = new Lista();
        try {
            System.out.println(miLista.listaVacia());
            miLista.imprimir();
            miLista.agregarNodo(new Nodo(15));
            miLista.imprimir();
            System.out.println("");
            miLista.agregarNodo(new Nodo(30));
            miLista.imprimir();
            System.out.println("");
            miLista.agregarNodo(new Nodo(45));
            miLista.imprimir();
            System.out.println("");
            System.out.println(miLista.find(45));
            miLista.borrar(2);
            miLista.imprimir();
            System.out.println("");
            miLista.insertarEn(1, new Nodo(1234));
            miLista.imprimir();
            System.out.println("");
            System.out.println("el valor en la posicion 2 es: "+miLista.valoeEn(2));
            System.out.println("el tamaño de la lista es: "+miLista.contarElementos());
            System.out.println("la lista esta vacia? " + miLista.listaVacia());
            miLista.vaciarLisa();
            System.out.println("la lista esta vacia? " + miLista.listaVacia());
       
        } catch (Exception ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
class Nodo{
    private int iVal;
    private Nodo nSig;
    public Nodo(){
        iVal = 0;
        nSig=null;
    }
    public Nodo(int iValor){
        iVal = iValor;
        nSig=null;
    }
    public Nodo(int iValor,Nodo nNod){
        iVal = iValor;
        nSig=null;
    }
    public int getiVal() {
        return iVal;
    }
    public Nodo getnSig() {
        return nSig;
    }
    public void setiVal(int iVal) {
        this.iVal = iVal;
    }
    public void setnSig(Nodo nSig) {
        this.nSig = nSig;
    } 
}
class Lista{
    private Nodo nIni;
    private Nodo nFin;
    
    public Lista(){
        nIni=null;
        nFin=null;
    }
    public Lista(Nodo nNodo){
        nIni = nNodo;
    }
    //Agregar nodos los coloca al final de la lista 
    public void agregarNodo(Nodo nNodo){
        //mover al final de la lista
        Nodo nTemp = nIni;
        if(nIni==null){
            nIni =nNodo ;//cuando la lista esta vacia
        }else{
            while(nTemp.getnSig()!=null){
                nTemp = nTemp.getnSig();
            }
            nTemp.setnSig(nNodo);
        }
    }//no utilizarlo jamas 
    public void imprimir(){
        //mover al final de la lista
        Nodo nTemp = nIni;
  
            while(nTemp!=null){
                System.out.print(nTemp.getiVal()+"-");
                nTemp=nTemp.getnSig();
            }
        
    }
    public boolean listaVacia(){
        if(nIni==null)return true;
        else{
            return false;
        }
    }

    public void agregarNodoMejorado(Nodo nNodo){
        if(nIni==null){
            nIni = nNodo;
            nFin = nNodo;
        }
        else{
            nFin.setnSig(nNodo);
            nFin=nNodo;
            
        }
    }
    //vaciar la lista----> al menos para java el primer elemento se declara nulo
    public void vaciarLisa(){
        nIni = null;
    }
    //contar los elementos de la lista
    public int contarElementos(){
        Nodo nTemp = nIni;
        if(nIni==null){
            return 0;
        }else{
            int iCont = 0;
            while(nTemp!=null){
                iCont++;
                nTemp=nTemp.getnSig();
            }
            return iCont;
        }
    }
    public int valoeEn (int pos) throws Exception{
        //verificar que la posicion sea menor al tamaño de la lista
        int iVal = 0;
         if((pos<contarElementos())&& (pos>=0)){
            int iCont = 0;
            Nodo nTemp=nIni;
            for(int i =0 ; i < pos; i++){
                nTemp=nTemp.getnSig();
            }
            iVal=nTemp.getiVal();
            return iVal;
        }else{
            throw new Exception("la posicion no es valida");
        }
         
    }
    public void insertarEn(int iPos,Nodo nNodo){
        //verificar iPos < tama;o lista
        //
        if(iPos==0){
            nNodo.setnSig(nIni);
            nIni =nNodo;
        }else{ //insertar en cualquier posicion menos la final
            Nodo nTemp = nIni;
            for (int i = 0; i < (iPos-1); i++) {
                nTemp = nTemp.getnSig();
            }
            nNodo.setnSig(nTemp.getnSig());
            nTemp.setnSig(nNodo);
            
        }
            
    }
    public void borrar(int pos){
        if(pos == 0){
                nIni = nIni.getnSig();
            }else{
                Nodo temp = nIni;
                for (int i = 0; i < pos-1; i++) {
                    temp = temp.getnSig();
                }
                temp.setnSig(temp.getnSig().getnSig());
                if(temp.getnSig() == null){
                    nFin = temp;
                }
            }
    }
    public int find(int numAB){
        Nodo nTemp = nIni;
        int cont = 0, index=-1;
        while(nTemp != null){
            if(nTemp.getiVal()==numAB){
                index = cont;
                break;    
            }else{
                cont++;
                nTemp=nTemp.getnSig(); 
            } 
        }  
        return index;
    }
}