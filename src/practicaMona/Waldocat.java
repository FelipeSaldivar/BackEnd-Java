package practicaMona;

public class Waldocat extends MainOctocat{
    public String accesorio, outfit;

    public Waldocat(String nombre, String genero, String colorCara, String colorCuerpo, int index,
                    String accesorio, String outfit){
        super(nombre, genero, colorCara, colorCuerpo, index);
        this.accesorio = accesorio;
        this.outfit = outfit;
    }

    //Acción que realiza
    public void waldo(){
        System.out.println("Se pierde entre la gente y tardas en encontrarlo.\n");
    }

    public static void main(String[] args) {
        showWaldocat();
    }

    public static void showWaldocat(){
        Waldocat wcat = new Waldocat(
                "Waldocat",
                "Hombre",
                "Color piel",
                "Negro",
                52,
                "Baston",
                "Gorrito, playera a rayas y jeans"
        );

        System.out.println("Octocat: "+ wcat.index +
                "\nNombre: "+ wcat.nombre +
                "\nGenero: "+ wcat.genero +
                "\nColor de cara: "+ wcat.colorCara +
                "\nColor de cuerpo: "+ wcat.colorCuerpo +
                "\nAccesorios: "+ wcat.accesorio +
                "\nOutfit: "+ wcat.outfit);
        wcat.waldo();
    }
}