
package abstraccion;


public class InterfazImc {
    public static void main (String []oso){
  
        Imc imc=new Imc(80,1.67f);
        imc.setPeso(90);
        
        
        
        
        
        
        System.out.println(imc.calcular());
    System.out.println(imc.getPeso());
            
            
           


//primitivos integrales


        
        byte b=2;
        short s=2;
        int i=2;
        long l=2;
       
        b=(byte)s;
        s=b;
        i=(int)l;
        i=s;
        s=(short)i;
        
        
        float f=2.0f;
        double d=2.0;
        
        
        boolean valor=false;
       
        
        Imc otro=new Imc();
        otro.setFLaco(true);
         System.out.println(otro.isFlaco());
        
        
        }}