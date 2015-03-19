
package estructurasenlasadas;

public class Nodo <T> {
   
//atributos
   private T elemento;
   private Nodo <T> siguiente;
   
//constructores
   public Nodo(T elemento){
         this.elemento=elemento;
         siguiente=null;
    }
   public Nodo(){
       
   }
   
 //gets y sets
   public Nodo<T> getSiguiente(){
       return siguiente;
   }
   
   public void setSiguiente(Nodo<T> siguiente){
       this.siguiente=siguiente;
   }
   
   
 //toString
   public String toString(){
       StringBuilder sb=new StringBuilder();
       sb.append("Elemento: "+elemento);
       return sb.toString();
     }
   
   
    
}
