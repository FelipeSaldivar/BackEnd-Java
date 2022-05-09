package practicaMona;

public class Homercat extends MainOctocat{
    public String accesorio, outfit;

    public Homercat(String nombre, String genero, String colorCara, String colorCuerpo, int index,
                    String accesorio, String outfit){
        super(nombre, genero, colorCara, colorCuerpo, index);
        this.accesorio = accesorio;
        this.outfit = outfit;
    }

    //Acción que realiza
    public void homerc(){
        System.out.println("Le gusta la cerveza fria, la tele fuerte y los homosexuales locas locas");
    }

    public static void main(String[] args) {
        showHomercat();
    }

    public static void showHomercat(){
        Homercat hcat = new Homercat(
                "Homercat",
                "Hombre",
                "Amarillo",
                "Amarillo",
                80,
                "Cerveza Duff",
                "Playera blanca y pantalon azul"
        );

        System.out.println("Octocat: "+ hcat.index +
                "\nNombre: "+ hcat.nombre +
                "\nGenero: "+ hcat.genero +
                "\nColor de cara: "+ hcat.colorCara +
                "\nColor de cuerpo: "+ hcat.colorCuerpo +
                "\nAccesorios: "+ hcat.accesorio +
                "\nOutfit: "+ hcat.outfit);
        hcat.homerc();
    }
}
