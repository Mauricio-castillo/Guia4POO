/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosComplementarios;
import java.util.*;
/**
 *
 * @author jose4
 */
public class Estudiante {
    
    //Variables
    private String nombre;
    private String apellido;
    private int edad;
    private String materia1, materia2, materia3, materia4, materia5;

    public Estudiante() {   //Constructor
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese su nombre : ");
        nombre = reader.next();
        System.out.print("Ingrese su apellido : ");
        apellido = reader.next();
        System.out.print("Ingrese su edad : ");
        edad = reader.nextInt();
        
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println("edad: " + edad);
    }
    //Metodos Get y Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getMateria1() {
        return materia1;
    }

    public void setMateria1(String materia1) {
        this.materia1 = materia1;
    }

    public String getMateria2() {
        return materia2;
    }

    public void setMateria2(String materia2) {
        this.materia2 = materia2;
    }

    public String getMateria3() {
        return materia3;
    }

    public void setMateria3(String materia3) {
        this.materia3 = materia3;
    }

    public String getMateria4() {
        return materia4;
    }

    public void setMateria4(String materia4) {
        this.materia4 = materia4;
    }

    public String getMateria5() {
        return materia5;
    }

    public void setMateria5(String materia5) {
        this.materia5 = materia5;
    }
    //Procedimientos
    public void ConsultarMaterias(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese las cinco materias : ");
        materia1 = reader.next();
        materia2 = reader.next();
        materia3 = reader.next();
        materia4 = reader.next();
        materia5 = reader.next();
        System.out.println();
    }
    
    public void ImprimirMaterias(){
        System.out.println("Materias: ");
        System.out.println();
        System.out.println(materia1);
        System.out.println(materia2);
        System.out.println(materia3);
        System.out.println(materia4);
        System.out.println(materia5);
    }
}
