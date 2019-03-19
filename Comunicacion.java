package terceratandaJAVA;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Comunicacion {
 public static ArrayList<Producto> lista=new ArrayList<Producto>();
  static Scanner s = new Scanner(System.in);
  static Scanner ss = new Scanner(System.in);
  /**
   * Muestra el menu cuando se imprime por pantalla : )
   */
  public static String Menu () {
    return(" 1. Listado \n 2. Alta \n 3. Baja \n 4. Modificacion \n 5. Entrada de mercancia \n 6. Salida de mercancia \n 7. Salir");
  }
  
  
  
  /**
   * Automaticamente muestra un listado de los elementos en el array.
   */
  public static void Listado() {
    for(int i=0;i<lista.size();i++) {
      System.out.println(lista.get(i));
    }
  }
  public static void Alta(int cod, int prec, int prev,int stock, String desc ) {
    
    boolean repite=false;
    for(int i=0;i<lista.size() && !repite ;i++) {
      
      if(lista.get(i).getCodigo()==cod) {
        repite=true;        
      }
    }
    if(repite) {
      ///tirar excepcion
      System.out.println("Esto sera un error");
    }else {    
      lista.add(new Producto(cod,prec,prev,stock,desc));
    }
  }
  /**
   * Elimina del array list un elemento identificado por codigo
   * @param codigo
   */
  public static  void Baja(int codigo) {
    boolean repite=false;
    int indice=0;
    for(int i=0;i<lista.size() && !repite ;i++) {
      
      if(lista.get(i).getCodigo()==codigo) {
        repite=true;       
        lista.remove(i);
      }
    }
    if(repite=true) {
      System.out.println("Producto eliminado con exito.");
    }else {
      System.out.println("El codigo introducido no es valido, introduzca un codigo existente.");
    }    
  }
  /**
   * Modifica algunos valores del objeto identificado por el codigo
   * @param cod
   */
  public static  void Modificacion(int codigo) {
    int indice=0;
    boolean repite=false;
    /**
     * Un for que comprueba si el codigo existe en el array y
     *  que guarda el indice en el que se encuentra el codigo
     */
    for(int i=0;i<lista.size() && !repite ;i++) {
      if(lista.get(i).getCodigo()==codigo) {
        repite=true;
        
        indice=i;
      }
    }if(!repite) {
      System.out.println("El codigo introducido no es valido, intentelo de nuevo.");
     }
    int respuesta=0;
    for(;respuesta!=4 && repite;) {
      int valornum=0;
      String valorcar="";
      System.out.println("Valor quiere cambiar?:\n 1. Precio de Compra \n 2. Precio de Venta \n 3. Descripcion \n 4.Salir");
     
        try {
          respuesta=s.nextInt();
          
          if(respuesta==1) {
            System.out.println("Introduzca el nuevo precio de compra: ");
            valornum=s.nextInt();
            lista.get(indice).setPrecioc(valornum);
          }
          if(respuesta==2) {
            System.out.println("Introduzca el nuevo precio de venta: ");
            valornum=s.nextInt();
            lista.get(indice).setPreciov(valornum);
          }
          if(respuesta==3) {
            System.out.println("Introduzca la nueva descripcion: ");
            valorcar=ss.nextLine();
            lista.get(indice).setDescripcion(valorcar);
          }
        } catch (InputMismatchException e) {
          // TODO Auto-generated catch block
          //e.printStackTrace();
          s.nextLine();
          System.out.println("ERROR VALOR NO VALIDO");
        }
      
      
    }
    
    }
    /**
     * 
     * @param codigo
     * @param cantidad
     */
    public static void Stock(int codigo,int cantidad) {
      int indice=0;
      boolean repite=false;
      /**
       * Un for que comprueba si el codigo existe en el array y
       *  que guarda el indice en el que se encuentra el codigo
       */
      for(int i=0;i<lista.size() && !repite ;i++) {
        if(lista.get(i).getCodigo()==codigo) {
          repite=true;
          
          indice=i;
        }
      }if(!repite) {
        System.out.println("El codigo introducido no es valido, intentelo de nuevo.");
       }
      
      
      lista.get(indice).Entrada(cantidad);

    }
}