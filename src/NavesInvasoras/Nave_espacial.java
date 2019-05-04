
package NavesInvasoras;


public class Nave_espacial extends Graficos{
    
    Juego juego;

    public Nave_espacial(Juego juego, String imagen, int columna, int fila) {
        
        super(imagen,columna,fila);
        
        this.juego = juego;
        
    }
    
    public void mover(long valor){
        if ((desplaza_columna < 0)&&(columna < 10)) {
            return;
        }
        if ((desplaza_columna > 0)&&(columna > 750)) {
            return;
        }
        
        super.mover(valor);
        
    }
    
    public void colisiona_con(Graficos imagen){
        if (imagen instanceof Alien) {
            juego.notificar_perdedor();
        }
    }
    
    
    
}
