package practicaMona;

import static practicaMona.Catstello.showCatstello;
import static practicaMona.Labtocat.showLabtocat;
import static practicaMona.Waldocat.showWaldocat;
import static practicaMona.Fcodercat.showFcodercat;
import static practicaMona.Stroopcat.showStroopcat;
import static practicaMona.Homercat.showHomercat;

public class MainOctocat {
    public String nombre, genero, colorCara, colorCuerpo;
    public int index;

    public MainOctocat(String nombre, String genero, String colorCara, String colorCuerpo, int index){
        this.nombre = nombre;
        this.genero = genero;
        this.colorCara = colorCara;
        this.colorCuerpo = colorCuerpo;
        this.index = index;
    }

    public String msg(){
        return "Octocat "+ index +":"+
                "\nNombre: "+ nombre +
                "\nGénero: "+ genero +
                "\nColor de cara: "+ colorCara +
                "\nColor de cuerpo: "+ colorCuerpo;
    }

    public static void main(String[] args) {
        showCatstello();
        showLabtocat();
        showWaldocat();
        showFcodercat();
        showStroopcat();
        showHomercat();
    }
}
