

import java.util.*;

public class Fechasyhoras{

    //Atributos 
    int dia; 
    int mes; 
    int año; 
    int hor; 
    int min; 
    int seg; 

    //Metodos
    public static void main (String[] args){ 

        Fechasyhoras fecha = new Fechasyhoras();
            
    fecha.dia = 20;
    fecha.mes = 01;     
    fecha.año = 2019;

    System.out.println("El dia es: " + fecha.dia);
    System.out.println("El mes es: " + fecha.mes);
    System.out.println("El año es: " + fecha.año);
    System.out.println(fecha.dia + "/" + fecha.mes + "/" + fecha.año);

    Fechasyhoras hora = new Fechasyhoras();
            
    hora.hor = 01;
    hora.min = 55;     
    hora.seg = 34;

    System.out.println("El dia es: " + hora.hor);
    System.out.println("El mes es: " + hora.min);
    System.out.println("El año es: " + hora.seg);
    System.out.println(hora.hor + ":" + hora.min + ":" + hora.seg);
    }
    

        

    
/*
    public class Hora {
            Hora 

    }
*/


}//end of class
