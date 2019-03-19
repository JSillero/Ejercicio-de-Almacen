package terceratandaJAVA;


public class Producto {
  private int codigo=0;
  private String descripcion="";
  private int precioc=0;//EL precio se guarda en centimos.
  private int preciov=0;
  private int stock=0;
  public static int indicet=0;///nos permite dar un indice correcto a cada producto
  public int indice=0;
  /**
   * A la hora de poner nombre a la clase, el  nombre sera igual a su codigo(asi sera hecho en el programa principal)
   * , así se le podra identificar facilmente cuando se le quieran alterar los valores.
   * Ademas se almacena la posicion que tiene en el arraylist que almacena su descripción.
   * 
   * @param cod codigo
   * @param precc precio compra
   * @param precv precio venta
   * @param stock numero de existencias
   * @param desc descripcion
   */
  public Producto(int cod,int precc,int precv, int stock, String desc) {
    
    
    
    this.codigo=cod;
    this.precioc=precc;
    this.preciov=precv;
    this.stock=stock;
    this.descripcion=desc;
    
  }
  public String toString() {
    return("Codigo: "+Integer.toString(this.codigo)+" Descripción: "+this.descripcion+" Precio compra: "+Integer.toString(this.precioc)+" Precio venta: "
        +Integer.toString(this.preciov)+" Stock: "+Integer.toString(this.stock));
  }
  
  /**
   * Cantidad se puede incorporar como un valor negativo para la salida de stock
   * @param cantidad
   */
  public void Entrada(int cantidad) {
    if(cantidad*-1>this.stock) {
      System.out.println("La cantidad a retirar es mayor que la que hay en stock, no es posible hacer la operacion.");
    }else {
      this.stock+=cantidad;
    }
  }
  
  ///  necesarios para el apartado modificacion .
  public void setPrecioc(int p){
    this.precioc=p;
    
  }
  public void setPreciov(int p){
    this.preciov=p;
    
  }
  public void setDescripcion(String p){
    this.descripcion=p;
    
  }
  public int getCodigo(){
    return codigo;
    
  }
  /**
   * hacer un sacar del array list en brevas
   */
  public void Borrar() {
    this.indice=-1;//este metodo combinado con el if del codigo programa hace que si indice tiene valor -1 no lo imprime.
  }
  
  public int getIndice() {
    return this.indice;
  }
  public int getStock() {
    return this.stock;
  }
}
