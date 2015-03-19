
package estructurasenlasadas;

public class miLista<T> {
    Nodo <T> cabeza;
    int contador;
    
 //constructor
    public miLista(){
        cabeza=new Nodo();
        contador=0;
    }
    
    
    public void insertaInicio(Nodo <T> elem){
      Nodo<T> temporal=cabeza.getSiguiente();
      cabeza.setSiguiente(elem);
      elem.setSiguiente(temporal);
                       
    }
    
    //iterativo
    public void insertaFinal(T elem){
     Nodo<T> nuevo=new Nodo(elem);
     Nodo<T> aux = cabeza;
        while(aux.getSiguiente()!=null){
         aux=aux.getSiguiente();
     }
         aux.setSiguiente(nuevo);
         contador++;               
    }
    
    //recursivo
    public void insertaFinalR(T elem){
        insertaFinal(cabeza,elem);
        contador++;
    }
    private void insertaFinal(Nodo<T> actual, T elem){
        //paso base
        if(actual.getSiguiente()==null)
            actual.setSiguiente(new Nodo(elem));
        else
            insertaFinal(actual.getSiguiente(),elem);
    }
    
    
    public  String borrar(Nodo<T> elem) throws Unchecked {
        Nodo<T> aux = cabeza;
        while(aux.getSiguiente()!=elem ){
         aux=aux.getSiguiente();
         if(aux.getSiguiente()==null)
              new Unchecked("No existe el elemento");
        }
        contador--;
                      
        return elem.toString();
      }
    
    //borrar clase
    public Nodo<T> borra(T elem){
        Nodo<T> actual=cabeza;
        Nodo<T> pasado= cabeza;
    }
    
    
    
  public void imprimeLista(){
      for(Nodo<T> i=cabeza;i.getSiguiente()!=null;i=i.getSiguiente())
          System.out.println(i);
  }  
  
  //insertar i-esima posicion
  public void insertarIpos(int pos, T elem) throws Unchecked{
      Nodo<T> nuevo=new Nodo(elem);
      Nodo<T> aux=cabeza;
      if(pos>contador)
          new Unchecked("No existe esa posicion");
      if(pos==0)
          insertaInicio(nuevo);
      for(int i=0;i<pos;i++)
          aux=aux.getSiguiente();
      
      nuevo.setSiguiente(aux.getSiguiente());
      aux.setSiguiente(nuevo);
      
      
  }
  
  
  
  //invertir lista(iterativo y recursivo)
  public void invertirLista(){
      for(Nodo<T> i=cabeza; i.getSiguiente()!=null;i.getSiguiente())
       null=cabeza;
      cabeza =null;
      
  }
  
  //elimina elemetos repetidos
 public String borraTodos(Nodo<T> elem) throws Unchecked{
     while()
     
     return elem.toString();
 }
 
 public static void main(String[] args){
     
 }
    
    
    
}
