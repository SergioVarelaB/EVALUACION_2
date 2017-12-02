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
        int[] aiDatos = new int[3];
        aiDatos[0]=1;
        aiDatos[1]=5;
        aiDatos[2]=6;
        int[] aiBackUp = new int[3];
        int i = 0;
        //se puede utilizar un for "normal"
        for (int aiDato : aiDatos) {
            System.out.println(aiDato);
            aiBackUp[i]=aiDato;
            i++;
        }
        //**esta manera NO es efectiva**
        //ocupa tiempo y memoria
        aiDatos = new int[4];
        //pasamos los datos del back up a el nuevo array
        for (int j = 0; j < aiBackUp.length; j++) {
            aiDatos[j] = aiBackUp[j];
        }
                for (int aiDato : aiDatos) {
            System.out.println(aiDato);
        }
    }
    
}
