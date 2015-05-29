
package abstraccion;


public class Imc {
    
    
    //atributos*****************************************************************
    private float peso;
    private float altura;
    private boolean flaco;
    
    public void setFLaco(boolean flaco){
            this.flaco=flaco;
    }
    
    public boolean isFlaco(){
        return flaco;
        
           
            
            
            
            
         
    }
   
    // constructor por defecto**************************************************
    public Imc() {
    }

    
    public Imc(float p, float a) {
        peso=p;
        altura=a;
    }
    
    
    public float calcular(){
    float imc=peso/(altura*altura);
     return imc;
    }
        
    //Encapsulacion de los atributos********************************************

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
}
