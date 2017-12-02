
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

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
        LinkedList <Persona> LPersona = new LinkedList<>();
        LPersona.add(new Persona("Sergio","Varela",19,true,2));
        LPersona.add(new Persona("Daniel","Lopez",21,true,3));
        LPersona.add(new Persona("Maria","Perez",2,false,1000));
        LPersona.add(new Persona("Juana","Fernandez",30,false,2369852));
        for (Persona lpersona : LPersona) {
        System.out.println("Nombre "+lpersona.getNombre()+"\n"+
        "Apellido: "+lpersona.getApellido()+"\n"+
        "Edad: " + lpersona.getEdad()+"\n"+
        "Sexo: "+lpersona.getSexo()+"\n"+
        "Salario :"+lpersona.getSalario()+"\n");
        }
        Comparator criterioOrden = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona)o1;
                Persona p2 = (Persona)o2;
                String ape1,ape2;
                ape1=p1.getApellido();
                ape2=p2.getApellido();
                char c1,c2;
                c1 = ape1.charAt(0);//Arreglo
                c2 = ape2.charAt(0);
                return c1-c2;
            }
        };//clase anonima
        System.out.println("lista orddenada por apellido");
        Collections.sort(LPersona, criterioOrden);
        for (Persona lpersona : LPersona) {
            System.out.println("Nombre "+lpersona.getNombre()+"\n"+
                    "Apellido: "+lpersona.getApellido()+"\n"+
                    "Edad: " + lpersona.getEdad()+"\n"+
                    "Sexo: "+lpersona.getSexo()+"\n"+
                    "Salario :"+lpersona.getSalario()+"\n");
        }
        Comparator criterioOrdenEdad = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona)o1;
                Persona p2 = (Persona)o2;
                int e1,e2;
                e1=p1.getEdad();
                e2=p2.getEdad();
                return e1-e2;
            }
        };
        System.out.println("lista orddenada por Edad");
        Collections.sort(LPersona, criterioOrdenEdad);
        for (Persona lpersona : LPersona) {
            System.out.println("Nombre "+lpersona.getNombre()+"\n"+
                    "Apellido: "+lpersona.getApellido()+"\n"+
                    "Edad: " + lpersona.getEdad()+"\n"+
                    "Sexo: "+lpersona.getSexo()+"\n"+
                    "Salario :"+lpersona.getSalario()+"\n");
        }
        Comparator criterioOrdenSalario = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona)o1;
                Persona p2 = (Persona)o2;
                int s1,s2;
                s1=(int)p1.getSalario();
                s2=(int)p2.getSalario();
                return (s1-s2);
            }
        };
        System.out.println("lista orddenada por Salario");
        Collections.sort(LPersona, criterioOrdenSalario);
        for (Persona lpersona : LPersona) {
            System.out.println("Nombre "+lpersona.getNombre()+"\n"+
                    "Apellido: "+lpersona.getApellido()+"\n"+
                    "Edad: " + lpersona.getEdad()+"\n"+
                    "Sexo: "+lpersona.getSexo()+"\n"+
                    "Salario :"+lpersona.getSalario()+"\n");
        }
        Comparator criterioOrdenSexo = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Persona p1 = (Persona)o1;
                Persona p2 = (Persona)o2;
                int s1=0,s2=0;
                if(p1.getSexo()==true)s1=1;
                if(p2.getSexo()==true)s2=1;
                return (s1-s2);
            }
        };
        System.out.println("lista orddenada por Sexo");
        Collections.sort(LPersona, criterioOrdenSalario);
        for (Persona lpersona : LPersona) {
            System.out.println("Nombre "+lpersona.getNombre()+"\n"+
                    "Apellido: "+lpersona.getApellido()+"\n"+
                    "Edad: " + lpersona.getEdad()+"\n"+
                    "Sexo: "+lpersona.getSexo()+"\n"+
                    "Salario :"+lpersona.getSalario()+"\n");
        }
    }
    }
    
//ordenar por edad por salario y por sexo
//apellido y edad 
//apellido con todos los caracteres
class Persona{
    private String nombre;
    private String Apellido;
    private int edad;
    private Boolean sexo;
    private double salario;

    public Persona(String nombre, String Apellido, int edad, Boolean sexo, double salario) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.sexo = sexo;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Boolean getSexo() {
        return sexo;
    }

    public void setSexo(Boolean sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
 }
