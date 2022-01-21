/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colas;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Alumnos
 */
public class Colas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// Clase Queue en java para el manejo de colas        
        Queue<Integer> q = new LinkedList<>(); 
  
    // Adds elements {0, 1, 2, 3, 4} to queue 
    for (int i=0; i<5; i++) 
     q.add(i); 
  
    // Display contents of the queue. 
    System.out.println("Elements of queue-"+q); 
  
    // To remove the head of queue. elimina el primer elemento de la cola
    int removedele = q.remove(); 
    System.out.println("removed element-" + removedele); 
  
    System.out.println(q); 
  
    // To view the head of queue, muestra ek primer elemento de la cola
    int head = q.peek(); 
    System.out.println("head of queue-" + head); 
  
     
    int size = q.size();  // Asigna el tamaño de la cola con el metodo size de la cola q a la variable size
    System.out.println("Size of queue-" + size); 
  } 
    }
    
