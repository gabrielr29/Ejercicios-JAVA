package cons;


public class Consultar_Demanda{
       
        public static void mostrar_datos(Auto carros[], int n){
 	
 		Menu.mostrar("\n" + "Modelo: " + carros[n].get_model() + " - " + carros[n].get_n_puertas() + " - ");
		Menu.mostrar("Color: " + carros[n].get_color() + " - " + carros[n].get_f_dpago());
		if(carros[n].get_tipo() == true){
		Menu.mostrar("Tipo: " + "Sincrónico");
		}
		else{
		Menu.mostrar("Tipo: " + "Automático");	
		}
       }
 
  		public static void mostrar_todo(Auto carros[], int contador){
  			
 		for(int n=0;n<contador;n++){
 		Menu.mostrar("\n" + "Modelo: " + carros[n].get_model() + " - " + carros[n].get_n_puertas() + " - ");
		Menu.mostrar("Color: " + carros[n].get_color() + " - " + carros[n].get_f_dpago());
		if(carros[n].get_tipo() == true){
		Menu.mostrar("Tipo: " + "Sincrónico");
		}
		else{
		Menu.mostrar("Tipo: " + "Automático");	
		}
         }
		
  		}
    
        public static void demand_fdp(Auto carros[], int c){
    	
    	int pdc=0, pc=0,pfb=0, aux=0, mayor=0;
    	
    	for(int j=0; j<c;j++){
    	    	   		
    	if(carros[j].get_f_dpago().equals("Pago de contado") == true){
    	pdc++;	
    	}	
    	    	   	
    	else if(carros[j].get_f_dpago().equals("Pago a crédito") == true){
    	pc++;	
    	}
    	
    	else if(carros[j].get_f_dpago().equals("Pago financiado por una entidad bancaria") == true){
    	pfb++;	
    	}
    	   	
    	}
    	
    	aux = (pdc>pc)? pdc : pc;

		mayor = (aux>pfb)? aux : pfb;
		
		//Mostrando el caso en el que los tres tengan igual demanda
		
		if(pfb==pc && pfb == pdc){
		Menu.mostrar("El registro indica que la demanda es igual para los tres tipos de pago");
		}
		
		//Mostrando el caso en el que solo dos tienen igual demanda (De contado y financiado).
		
		else if(pfb == pc && pfb>pdc){
		Menu.mostrar("El registro indica que hay dos tipos de pago con igual demanda, financiado y de contado");
		
		for(int i=0; i<c; i++){
		if(carros[i].get_f_dpago().equals("Pago de contado")==true){
		mostrar_datos(carros,i);}
		
		}
		
		for(int f=0; f<c;f++){
		if(carros[f].get_f_dpago().equals("Pago financiado por una entidad bancaria")==true){
		mostrar_datos(carros,f);}
		}
					
		}	
		
		//Mostrando el caso en el que solo dos tienen igual demanda (De contado y a crédito).
		
		else if(pc==pdc && pc>pfb){
		Menu.mostrar ("El registro indica que hay dos tipos de pago con igual demanda, de contado y a crédito");
		
		for(int i=0; i<c; i++){
		if(carros[i].get_f_dpago().equals("Pago de contado")==true){
		mostrar_datos(carros,i);}
		
		}
		
		for(int e=0; e<c; e++){
		if(carros[e].get_f_dpago().equals("Pago a crédito")==true){
		mostrar_datos(carros,e);}
		}	
			
		}
		
		//Mostrando todos los autos registrados por pago a contado
		
		else if(mayor == pdc){
			
		for(int i=0; i<c; i++){
		if(carros[i].get_f_dpago().equals("Pago de contado")==true){
		mostrar_datos(carros,i);}
		}	
			
		}
		
		//Mostrando todos los autos registrados por pago a crédito
		
		else if(mayor == pc){
		for(int e=0; e<c; e++){
		if(carros[e].get_f_dpago().equals("Pago a crédito")==true){
		mostrar_datos(carros,e);}
		}	
			
		}	
		// Mostrando todos los autos registrados por pago financiado
			
		else if(mayor == pfb){
		for(int f=0; f<c;f++){
		if(carros[f].get_f_dpago().equals("Pago financiado por una entidad bancaria")==true){
		mostrar_datos(carros,f);}
		}
		}

		}
		
		public static void demand_tipo(Auto carros[], int c){
		
		//Variables para contabilizar 	
		int autom=0, sincro=0;
		
		for(int j=0; j<c;j++){
    	if(carros[j].get_tipo() == true){
    	sincro++;	
    	}
    	else{
    	autom++;	
    	}      	 	
		}
		
		if(autom>sincro){
		for(int j=0; j<c;j++){
    	if(carros[j].get_tipo() == false){
    	mostrar_datos(carros,j);
    	}
    	else{	}}
		
		}
				
		else if(sincro>autom){
		for(int j=0; j<c;j++){
    	if(carros[j].get_tipo() == true){
    	mostrar_datos(carros,j);
    	}
    	else{	}}	
		}
		
		else if(sincro==autom){
		Menu.mostrar("La demanda para autos automáticos y sincrónicos es la misma");	
		}
		
		
		}
		
		public static void demand_n_p(Auto carros[], int c){
		
		//Variables para contabilizar 	
		int tresp=0, cincop=0;
		
		for(int j=0; j<c;j++){
    	if(carros[j].get_n_puertas().equals("Tres puertas")==true){
    	tresp++;	
    	}
    	else{
    	cincop++;	
    	}      	 	
		}
		
		if(tresp>cincop){
		for(int j=0; j<c;j++){
    	if(carros[j].get_n_puertas().equals("Tres puertas")==true){
    	mostrar_datos(carros,j);
    	}
    	
    	}}
    	
    	else if(cincop>tresp){
			
		for(int j=0; j<c;j++){
    	if(carros[j].get_n_puertas().equals("Cinco puertas")==true){
    	mostrar_datos(carros,j);
    	}
    	}	
		}
		
		else if(cincop==tresp){
		Menu.mostrar("El numero de autos de tres y cinco puertas en lista de espera, es el mismo");
		
			
		}
    	
	
		}
		
		}		
			
		
		
	
	
	
	
	
	
	
		

		
		

    
 

 
    


