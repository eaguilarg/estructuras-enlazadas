
package estructurasenlasadas;


public class miLista {
    Nodo <T> cabeza;
    int cont;
    
    
    public void insertaInicio(T elem){
      Nodo<T> temp=cabeza.getSiguiente();
      cabeza.setSiguiente(elem);
      elem.setSiguiente(temp);
                       
    }
    public void insertaFinal(T elem){
        
    }
    public  Nodo<T> borra(T elem)extends Checked {
        
    }
    
    
}
