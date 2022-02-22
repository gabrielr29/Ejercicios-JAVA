package cons;

public class Auto{
	
	private String modelo;
	private String color;
	private boolean tipo;
	private String n_puertas;
	private String f_dpago;

    public Auto(){
    	modelo = "";
    	color = "";
    	tipo = false;
    	n_puertas = "";
    	f_dpago = "";
    }
    
    public Auto(String md, String cl, boolean tp, String n_p, String f_dp){
    	modelo = md;
    	color = cl;
    	tipo = tp;
    	n_puertas = n_p;
    	f_dpago = f_dp;
    }
    
    public void set_model(String mdl){
    	modelo = mdl;
    }
    
    public void set_color(String cdl){
    	color = cdl;
    }
    
    public void set_tipo(boolean t){
    	tipo = t;
    }
    
    public void set_n_puertas(String p){
    	n_puertas = p;
    }
    
    public void set_f_dpago(String dp){
    	f_dpago = dp;
    }
    
    public String get_model(){
    	return modelo;
    }
  	
  	public String get_color(){
  		return color;
  	}
  	
  	public boolean get_tipo(){
  		return tipo;
  	}
  	
  	public String get_n_puertas(){
  		return n_puertas;
  	}
  	
  	public String get_f_dpago(){
  		return f_dpago;
  	}
  	
    public static void declarator(Auto c[]){
    for(int i=0; i<c.length;i++){
   		c[i] = new Auto();
    	}
    }

    
}