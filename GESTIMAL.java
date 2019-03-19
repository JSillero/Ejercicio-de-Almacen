package terceratandaJAVA;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class GESTIMAL {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    ///variable que almacena la respuesta
    int respuesta=0;
    ///variables para inicializar los objetos
    int codigo=0;
    int precioc=0;
    int preciov=0;
    int stock=0;
    int indi=0;
    String desc="";
    Scanner s = new Scanner(System.in);
    Scanner ss = new Scanner(System.in);
    /**
     * por hacer: convertirlo todo a clases :////
     * 
     */
    do {
      try {
        System.out.println(Comunicacion.Menu());
        respuesta=s.nextInt();
      } catch (InputMismatchException e1) {
        // TODO Auto-generated catch block
      //  e1.printStackTrace();
        s.nextLine();
      }
      
      if (respuesta==1) {
        Comunicacion.Listado();
      }
      
      if(respuesta==2) {
        try {
          System.out.println("Introduzca el codigo del producto:");
          codigo=s.nextInt();s.nextLine();
          System.out.println("Introduzca el precio de compra del producto:");
          precioc=s.nextInt();s.nextLine();
          System.out.println("Introduzca el precio de venta del producto:");
          preciov=s.nextInt();s.nextLine();
          System.out.println("Introduzca el stock del producto:");
          stock=s.nextInt();s.nextLine();
          System.out.println("Introduzca la descripcion del articulo:");
          desc=ss.nextLine();
          Comunicacion.Alta(codigo, precioc, preciov, stock, desc);
        } catch (InputMismatchException e) {
          s.nextLine();
//          // TODO Auto-generated catch block
//          e.printStackTrace();
          System.out.println("DATO NO VALIDO");
        }
      }
      
      if (respuesta==3) {
        try {
          System.out.println("Introduzca el codigo del producto a dar de baja");
          codigo=s.nextInt();
          Comunicacion.Baja(codigo);
        } catch (InputMismatchException e) {
          // TODO Auto-generated catch block
         // e.printStackTrace();
          s.nextLine();
          System.out.println("DATO NO VALIDO");
        }
        
      }
      if(respuesta==4) {
        try {
          System.out.println("Introduzca el codigo del producto a modificar:");
          codigo=s.nextInt();

        } catch (InputMismatchException e) {
          // TODO Auto-generated catch block
         // e.printStackTrace();
          s.nextLine();
          System.out.println("DATO NO VALIDO");
        }
      }
      if(respuesta==5) {
        try {
          System.out.println("Introduzca el codigo del producto que aumenta su stock");
          codigo=s.nextInt();
          System.out.println("Introduzca la cantidad a añadir, en positivo.");
          stock=s.nextInt();
          if(codigo<0) {
            System.out.println("El numero introducido no es positivo");
          }else{
          Comunicacion.Stock(codigo, stock);
          }
        } catch (InputMismatchException e) {
          // TODO Auto-generated catch block
         // e.printStackTrace();
          System.out.println("DATO NO VALIDO");
          s.nextLine();

        }
      }
      if(respuesta==6) {
        System.out.println("Introduzca el codigo del producto que decrementa su stock");
        codigo=s.nextInt();
        System.out.println("Introduzca la cantidad a añadir, en NEGATIVO.");
        stock=s.nextInt();
        if(stock>=0) {
          System.out.println("El numero introducido no es NEGATIVO");
        }else {
        Comunicacion.Stock(codigo, stock);
        }
      }
      
      
    }while (respuesta !=7);
    
    
  }

}
