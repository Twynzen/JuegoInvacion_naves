
package NavesInvasoras;


public class Alien extends Graficos{
    
    Juego juego;

    public Alien(Juego juego, String imagen, int columna, int fila) {
        super(imagen,columna,fila);
        this.juego = juego;
        
        desplaza_columna = -75;
        
    }

       
   
    public void mover(Long valor){
        if ((desplaza_columna < 0 )&&(columna < 10)){
            juego.alcanzado_limite = true;
        }
        if ((desplaza_columna > 0) &&(columna > 750)) {
            juego.alcanzado_limite = true;
        }
        super.mover(valor);
    }
    
    public void avanzarAliens(){
        desplaza_columna = -desplaza_columna;
        
        fila += 15;
        
        if (fila > 570) {
            juego.notificar_perdedor();
        }
        
        super.mover(valor);
    }
    
    public void colisona_con (Graficos imagen){
        
    }
}
