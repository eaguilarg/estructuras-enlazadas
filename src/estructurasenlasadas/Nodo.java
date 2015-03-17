
package estructurasenlasadas;

public class Nodo <T> {
   
//atributos
   private T elemento;
   private Nodo <T> siguiente;
   
//constructor
   public Nodo(T elemento){
         this.elemento=elemento;
         siguiente=null;
    }
   
 //gets y sets
   public Nodo<T> getSiguiente(){
       return siguiente;
   }
   
   public void setSiguiente(Nodo<T> siguiente){
       this.siguiente=siguiente;
   }
    
}
