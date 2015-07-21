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
public class ModeloPersistenciaAnimal {
 
    public void guardar(Animal animal)throws Exception{
    
          //pasio1 crear el archivo donde se gusrada el e animal
        File file=new File("D:\\ANIMALITOS.xxx");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(animal);
        System.out.println("ANIMALITO COMPRIMIDO CON EXITO");
        
    }
}

