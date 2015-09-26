/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializacion;

/**
 *
 * @author T-107
 */
import java.io.*;
import java.util.ArrayList;
        public class ModeloPersistenciaAnimal {
 
    String ruta="D:\\ANIMALITOS.xxx";
    
    
    ArrayList<Animal> animales;
    public ModeloPersistenciaAnimal(){
        
                animales=new ArrayList<Animal>(); 
    }
    
    public void guardar(Animal animal)throws Exception{
    
          //pasio1 crear el archivo donde se gusrada el e animal
        
         File file=new File(ruta);
       // File file=new File("D:\\ANIMALITOS.xxx");
         
         if(file.exists()){
             animales= buscarTodos();
             
         }
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        animales.add(animal);
        oos.writeObject(animales);
        System.out.println("ANIMALITO COMPRIMIDO CON EXITO");
        
        
    }
    
    
    
    public ArrayList<Animal>   buscarTodos()throws Exception{
        Animal a=new Animal();
        File f=new File(ruta);
        FileInputStream fis=new FileInputStream(f);
        ObjectInputStream ois=new ObjectInputStream(fis);
            animales=(ArrayList<Animal>) ois.readObject();
            //a=(Animal) ois.readObject();
            return animales;
    }
}

