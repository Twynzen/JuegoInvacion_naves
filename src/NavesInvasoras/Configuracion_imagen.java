
package NavesInvasoras;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;


public class Configuracion_imagen {
    
    static Configuracion_imagen configuracion = new  Configuracion_imagen();
    
    HashMap hashmap = new HashMap(); // estructura para guardar elementos asociados a una clase
    
    public Dibujo_imagen transparentar_imagen(String grafico){
        if (hashmap.get(grafico)!= null) {
            return (Dibujo_imagen) hashmap.get(grafico);
        }
        BufferedImage imagen_buffer = null;
        try{
            URL url = this.getClass().getClassLoader().getResource(grafico);
            if (url == null) {
                System.err.println("No se encontro el archivo: "+grafico);
                
            }
            try {
                imagen_buffer = ImageIO.read(url);
            } catch (IOException ex) {
                Logger.getLogger(Configuracion_imagen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    //minuto 11 de https://www.youtube.com/watch?v=LhBztaksmNo
}
