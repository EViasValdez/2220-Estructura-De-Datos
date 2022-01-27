/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import java.util.Iterator;

/**
 *
 * @author Biblioteca digital
 */
public class Pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
      System.out.println("------Pila------");
      Pila pila = new Pila(); //Se crea el objeto lalmado pila y se instancia a la clase Pila
      pila.apilar("A"); //Se manda llamar al metodo apilar con el onbjeto pila y se le agrega la letra A a la pila
      pila.apilar("B");
      pila.apilar("C");
      pila.apilar("D");
  
      //Con la clase Iterator se recorre el objeto pila pues se creo el objeto iterator de la clase Iterator 
      Iterator iterator = pila.iterator(); 
      System.out.println("Elementos de la Pila: "); 
      while (iterator.hasNext()) { //mientras los elementos de la pila se van recorriendo con hasNext
          System.out.print(iterator.next() + " ");  //Vas imprimiendo cada unod e lso elemntos de la lista
      }        
  
        System.out.println("Esta vacia la pila?:" + pila.vacia()); // verifica si la pila esta vacia manda llamar al metodo vacia de al clase Pila
        System.out.println("Tamaño de la pila:" + pila.size()); //Muestra el tamaño de la pila
  
      System.out.println(pila.cima()); //Manda llamar al metodo cima de la clase Pila y regresa el elemto de la cima de la pila
      pila.desapilar(); //una vez estando en la cima en el primer elemento de la pila manda llamar al metodo desapilar de la clase Pila
      System.out.println(pila.cima());//en el metodo desapilar elimina el elemento de la pila con el metodo remove
      pila.desapilar();
      System.out.println(pila.cima());
      pila.desapilar();
      System.out.println("Elementos en la pila " + pila); //Imprime los elementos de la pila 

      System.out.println("Esta vacia la pila?:" + pila.vacia()); // Manda llamar al metodoo vacia de la Clase Pila
      //donde verifica si la pila esta vacia con el metodo Empty
    
      System.out.println("------Cola------");
      Cola cola = new Cola();
      cola.encolar("A");
      cola.encolar("B");
      cola.encolar("C");
      cola.encolar("D");
  
      System.out.println("Esta vacia la cola?:" + cola.vacia());
      System.out.println("Tamaño de la cola:" + cola.size());
 
      System.out.println(cola.frente());
      cola.desencolar();
      System.out.println(cola.frente());
      cola.desencolar();
      System.out.println(cola.frente());
      cola.desencolar();

      System.out.println("Elementos en la cola " + cola);
      System.out.println("Esta vacia la cola?:" + cola.vacia());
      }
}