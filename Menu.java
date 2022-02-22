package cons;

import java.io.IOException;
import java.io.*;

public class Menu {
      
    public static String leerCadena(String cadenita){
    	InputStreamReader cd = new InputStreamReader(System.in);
    	BufferedReader br = new BufferedReader (cd);
    	String x="";
    	try{
    		System.out.println(cadenita);
    		x=br.readLine();
    	}
    	catch(Exception ex){
    		System.out.println("Error" + ex.toString());
    	}
    	return x;
    }
    
    public static void mostrar(String m){
    	System.out.println(m);
    }
    
    public static void registro(Auto c[], int counter){
    	String opc="";
    	String aux="", aux2="", aux3="", aux4="";
    	boolean ban=false;
    	
      		//Registro del modelo
    		do{
    		mostrar("Ingrese el modelo");
    		aux = leerCadena(aux);
    		
    		if(aux.length()>35){
    		mostrar("Modelo inválido");
    		}
    		
    		else{
    		c[counter].set_model(aux);
    		}  
    			  		
    		}while(aux.length()>35);
    		
    		//Registro del color
    		do{
    		mostrar("Ingrese el color");
    		aux2 = leerCadena(aux2);
    		if(aux2.length()>15){
    		mostrar("Error, color inválido");
    		}
    		else{
    		c[counter].set_color(aux2);
    		}    		
    		}while(aux2.length()>15);
    		
    		//Registro del tipo
    			
    		do{
    			mostrar("¿El auto es sincrónico (Ingrese 1) o automático(Ingrese 2)?");
    			String tpp="";
    			tpp=leerCadena(tpp);
    		    switch(tpp){
    		    	case "1":
    		    	mostrar("Usted eligió sincrónico");
    		       	ban=true;
    		    	c[counter].set_tipo(true);
    		    	break;
    		    	
    		    	case "2":
    		    	mostrar("Usted eligió automático");
    		    	ban=true;
    		    	c[counter].set_tipo(false);	
    		    	break;
    		    	
    		    	default:
    		    	mostrar("Error");	
    		    	ban=false;	
    		    	break;	
    		    }
    		    
    		    }while(ban==false);
    		   		
    		    //Registro del número de puertas
    		    
    		    do{
    			mostrar("¿El auto tiene tres puertas (Ingrese 1) o cinco (Ingrese 2)?");
    			aux3=leerCadena(aux3);
    		    switch(aux3){
    		    	case "1":
    		    	mostrar("Usted eligió 3 puertas");
    		       	ban=true;
    		    	c[counter].set_n_puertas("Tres puertas");
    		    	break;
    		    	
    		    	case "2":
    		    	mostrar("Usted eligió 5 puertas");
    		    	ban=true;
    		    	c[counter].set_n_puertas("Cinco puertas");	
    		    	break;
    		    	
    		    	default:
    		    	mostrar("Error");	
    		    	ban=false;	
    		    	break;	
    		    }
    		    
    		    }while(ban==false);
    		    
    		    
    		    
    		    do{
    			mostrar("¿Qué método de pago está previsto para la adquisición del auto?");
    			mostrar("Ingrese (1) si es de contado, (2) para crédito, (3) financiado por una entidad bancaria");
    			aux4=leerCadena(aux4);
    		    switch(aux4){
    		    	case "1":
    		    	mostrar("Usted eligió pago de contado");
    		       	ban=true;
    		    	c[counter].set_f_dpago("Pago de contado");
    		    	break;
    		    	
    		    	case "2":
    		    	mostrar("Usted eligió crédito");
    		    	ban=true;
    		    	c[counter].set_f_dpago("Pago a crédito");	
    		    	break;
    		    	
    		    	case "3":
    		    	mostrar("Usted eligió pago financiado por una entidad bancaria");
    		    	ban=true;
    		    	c[counter].set_f_dpago("Pago financiado por una entidad bancaria");	
    		    	break;
    		    		
    		    	default:
    		    	mostrar("Error");	
    		    	ban=false;	
    		    	break;	
    		    }
    		    
    		       		    
    		    }while(ban==false);
       	
    }
     
    public void menu(Auto cars[], int c){
    	
   	  	String opc="";
    
    	
    }
    
    
}