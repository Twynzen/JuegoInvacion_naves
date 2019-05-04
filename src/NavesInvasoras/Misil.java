
package NavesInvasoras;


public class Misil {
    
    Juego juego;
    
    boolean misil_disparado = false;

    public Misil(Juego juego, String imagen, int x, int y) {
        
        super(imagen,x,y);
        this.juego = juego;
        desplaza_fila =- 300;
    }
    
    @Override
    public void mover(long valor){
        super.mover(valor);
    }
    
    @Override
    public void colisiona_con (Graficos imagen){
        if (misil_disparado) {
            return;
        }
        if (imagen instanceof Alien) {
            juego.lista_eliminados.add(imagen);
            
            juego.descontar_eliminados();
            
            misil_disparado = true;
        }
    }
    
}
