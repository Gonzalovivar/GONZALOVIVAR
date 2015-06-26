/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author T-107
 */
class Bebida {
    
    
       private String tipo;
            
        private String [] BebidaS;
    
 
    public String []ObtenerRecomendaciones(){
    
    /*
    String []bebidas_alcoholicas = new String[5];
    

    bebidas_alcoholicas [1] = "FF";
    bebidas_alcoholicas [2] = "";
    
    
    */
       if(tipo.equals("alcoholicas")){
       String []alcohol={"cerveza","sol" };
       //String []sinalcohol={"coca","sol" };

return alcohol;
        
        }else
       
       {
                String []sinalcohol={"agua","coca","pepsi","red-bull"};
                        return sinalcohol;
                
                        }
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getBebidaS() {
        return BebidaS;
    }

    public void setBebidaS(String[] BebidaS) {
        this.BebidaS = BebidaS;
    }
}