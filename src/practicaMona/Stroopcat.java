package practicaMona;

public class Stroopcat extends MainOctocat{
    public String accesorio, outfit;

    public Stroopcat(String nombre, String genero, String colorCara, String colorCuerpo, int index,
                     String accesorio, String outfit){
        super(nombre, genero, colorCara, colorCuerpo, index);
        this.accesorio = accesorio;
        this.outfit = outfit;
    }

    //Accion que realiza
    public void Trooper(){
        System.out.println("Nunca atina un tiro contra un jedi\n");
    }

    public static void main(String[] args) {
        showStroopcat();
    }

    public static void showStroopcat(){
        Stroopcat storm = new Stroopcat(
                "Stormtroopercat",
                "Hombre(?)",
                "Desconocido",
                "Desconocido",
                84,
                "Blaster",
                "Uniforme de Stormtrooper"
        );

        System.out.println("Octocat: "+ storm.index +
                "\nNombre: "+ storm.nombre +
                "\nGenero: "+ storm.genero +
                "\nColor de cara: "+ storm.colorCara +
                "\nColor de cuerpo: "+ storm.colorCuerpo +
                "\nAccesorios: "+ storm.accesorio +
                "\nOutfit: "+ storm.outfit);
        storm.Trooper();
    }
}
