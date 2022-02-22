package cons;

public class ClasedePrueba {


    public static void main(String args[]){
    
    Auto[] carro = new Auto[50];
    int contador = 0;
    boolean ban=false;
    String opc=""; 
    
   	Auto.declarator(carro);
   	
   		
    	do{
    		Menu.mostrar(" _______________________________________________________________________________________");
    		Menu.mostrar("|¡Bienvenido, ingresa los datos de los autos que quieras registrar a este concesionario |");
    		Menu.mostrar("|                             ingresando a la opción 1!                                 |");
    		Menu.mostrar("|                                                                                       |");
    		Menu.mostrar("|(1) Entrar al menú de registro de autos en lista de espera.                            |"); 
    		Menu.mostrar("|(2) Mostrar el listado de autos más demandados según su tipo (Sincrónico o Automático).|"); 
    		Menu.mostrar("|(3) Mostrar el listado de autos más demandados según su método de pago.                |");
    		Menu.mostrar("|(4) Mostrar el listado de autos más demandados según su número de puertas.             |");
    		Menu.mostrar("|(5) Mostrar todos los autos registrados                                                |"); 	
    		Menu.mostrar("|(6) Salir                                                                              |"); 	
    		Menu.mostrar("|_______________________________________________________________________________________|");
    			
    		opc=Menu.leerCadena(opc);	
    			
    		switch(opc){
    			
    			case "1":
    				
   					opc=""; //Limpiando la entrada por teclado  
   					
    			Menu.registro(carro,contador);
    			
    				contador++; //Aumenta el contador, para evitar que se sobreescriba un registro reciente.
   					
   					Menu.mostrar("Registro realizado con éxito"+"\n");
    			  	
    				break;
    			
    			case "2":
    				
    			if(contador==0){
    			Menu.mostrar("Aún no has registrado ningún auto");
    			opc=""; //Limpiando buffer
    			}
    			
    			else if(contador<3){
    			Menu.mostrar("Error, muy pocos autos registrados");
    			opc=""; //Limpiando buffer
    			}
    			else{
    			Consultar_Demanda.demand_tipo(carro,contador);		
    			}	
    			   			
    			break;
    			
    			case "3":
    				
    		    if(contador==0){
    			Menu.mostrar("Aún no has registrado ningún auto");
    			}
    			
    			else if(contador<3){
    			Menu.mostrar("Error, muy pocos autos registrados");
    			}
    					
    			else{
    			Consultar_Demanda.demand_fdp(carro,contador);	
    			}
    			
    			break;
    			
    			case "4":
    				
    			if(contador==0){
    			Menu.mostrar("Aún no has registrado ningún auto");
    			}
    			
    			else if(contador<3){
    			Menu.mostrar("Error, muy pocos autos registrados");
    			}			
    						
    			else{
    			Consultar_Demanda.demand_n_p(carro,contador);	
    			}
    			    				
    			break;
    			
    			case "5":
    			
    			if(contador==0){
    			Menu.mostrar("Aún no has registrado ningún auto");
    			}
    			
    			else if(contador<3){
    			Menu.mostrar("Error, muy pocos autos registrados");
    			}				
    			
    			else{
    			Consultar_Demanda.mostrar_todo(carro,contador);	
    			}	
    		    			
    			break;
    			
    			case "6":
    			
    			opc="6";
    			Menu.mostrar("Hasta la próxima, cuídate mucho, toma agua y saludos a la familia." + "\n");
    			
    			break;
    			
    			default:
    			Menu.mostrar("Tecla equivocada");
    			opc=""; //Para limpiar la entrada por teclado	
    		}
    			
    			
    	}while(opc!="6");
   	
   	
   	 	
    }
    
    
}