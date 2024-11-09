/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Tarea2 {
  public class Principal {

    
    public static class Recursos {
        

        public String mensajeCurso() {
            return "Programación Orientada a Objetos 2021";
        }
        

        public String verificarEdad(int edad) {
            if (edad >= 21) {
                return "Mayor de edad";
            } else {
                return "Menor de edad";
            }
        }

        public int multiplicar(int a, int b) {
            return a * b;
        }

        public int[] generarLista(int x) {
            int[] lista = new int[x];
            for (int i = 0; i < x; i++) {
                lista[i] = i + 1;
            }
            return lista;
        }
    }

    public static void main(String[] args) {
       
        Recursos recursos = new Recursos();
        
        
        System.out.println(recursos.mensajeCurso());
        
        
        int edad = 20;  
        System.out.println(recursos.verificarEdad(edad));
        
        int resultadoMultiplicacion = recursos.multiplicar(5, 7);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
        
        
        int[] listaNumeros = recursos.generarLista(10);  
        System.out.print("Lista de números: ");
        for (int numero : listaNumeros) {
            System.out.print(numero + " ");
        }
    }
}  
}
