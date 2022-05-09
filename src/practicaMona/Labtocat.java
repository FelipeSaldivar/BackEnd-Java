package practicaMona;

public class Labtocat extends MainOctocat{
    public String accesorio, outfit;

    public Labtocat(String nombre, String genero, String colorCara, String colorCuerpo, int index,
                    String accesorio, String outfit){
        super(nombre, genero, colorCara, colorCuerpo, index);
        this.accesorio = accesorio;
        this.outfit = outfit;
    }

    //Acción que realiza
    public void lab(){
        System.out.println("Descubriendo la cura definitiva al cobicho.\n");
    }

    public static void main(String[] args){
        showLabtocat();
    }

    public static void showLabtocat(){
        Labtocat labcat = new Labtocat(
                "Labtocat",
                "Hombre",
                "Color piel",
                "Negro",
                104,
                "Tubos de ensayo y matrazes",
                "Bata y lentes de protección"
        );

        System.out.println("Octocat: "+ labcat.index +
                "\nNombre: "+ labcat.nombre +
                "\nGenero: "+ labcat.genero +
                "\nColor de cara: "+ labcat.colorCara +
                "\nColor de cuerpo: "+ labcat.colorCuerpo +
                "\nAccesorios: "+ labcat.accesorio +
                "\nOutfit: "+ labcat.outfit);
        labcat.lab();
    }
}
