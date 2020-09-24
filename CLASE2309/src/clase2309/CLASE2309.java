
package clase2309;
public class CLASE2309 {
    public static void main(String[] args) {
       
     System.out.println("HOLA MUNDO");
    //variables
    boolean llueve = false;
    boolean soltero = true;
    int suel_max = 2000;
    int sueldo = 25000;
    int edad = 18;
    int edad_minima = 21;
    boolean mayor;
             
     //condicionales
     if(llueve == true){
         System.out.println("llevar paraguas");
     }else {
         System.out.println("no lleves paraguas");
           }
     // condicional con operaciones
     if (soltero){
         if(sueldo > suel_max){
          System.out.println("pagas ganancias");
         }
     }  
    // Condicional una linea
    if (soltero && sueldo > suel_max){
    System.out.println("pagas ganancias");
    }
    // condicional por edades
    if(edad < edad_minima){
        mayor = false;   
        System.out.println("Es mayor =" +  mayor);
    }else {
        mayor = true;
         System.out.println("Es mayor =" +  mayor);
    }
    
    
    
    
      
     



     
    }
    
}
