package practicaMona;

public class Catstello extends MainOctocat{
    public String accesorio1, accesorio2, accesorio3, outfit;

    public Catstello(String nombre, String genero, String colorCara, String colorCuerpo, int index,
                     String accesorio1, String accesorio2, String accesorio3, String outfit){
        super(nombre, genero, colorCara, colorCuerpo, index);
        this.accesorio1 = accesorio1;
        this.accesorio2 = accesorio2;
        this.accesorio3 = accesorio3;
        this.outfit = outfit;
    }

    //Acción que realiza
    public void DJ() {
        System.out.println("La verdadera alma de la fiesta con la mejor musica.\n");
    }

    public static void main(String[] args) {
        showCatstello();
    }

    public static void showCatstello(){
        Catstello djtello = new Catstello(
                "Catstello",
                "Hombre",
                "Color Piel",
                "Negro",
                126,
                "Audifonos",
                "Consola",
                "Laptop",
                "Playera casual y lentes obscuros"
        );

        System.out.println("Octocat: " + djtello.index +
                "\nNombre: " + djtello.nombre +
                "\nGenero: " + djtello.genero +
                "\nColor de cara: " + djtello.colorCara +
                "\nColor de cuerpo: " + djtello.colorCuerpo +
                "\nAccesorios: " + djtello.accesorio1 + ", " + djtello.accesorio2 + " y " + djtello.accesorio3 +
                "\nAccesorios: "+ djtello.outfit);
        djtello.DJ();
    }
}