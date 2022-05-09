package practicaMona;

public class Fcodercat extends MainOctocat{
    public String accesorio, outfit;

    public Fcodercat(String nombre, String genero, String colorCara, String colorCuerpo, int index,
                     String accesorio, String outfit){
        super(nombre, genero, colorCara, colorCuerpo, index);
        this.accesorio = accesorio;
        this.outfit = outfit;
    }

    //Acción que realiza
    public void coder(){
        System.out.println("La mejor creando codigos de todo tipo\n");
    }

    public static void main(String[] args) {
        showFcodercat();
    }

    public static void showFcodercat(){
        Fcodercat code = new Fcodercat(
                "Femalecodercat",
                "Mujer",
                "Color piel",
                "Negro",
                101,
                "Laptop",
                "Blusa y jeans"
        );

        System.out.println("Octocat: "+ code.index +
                "\nNombre: "+ code.nombre +
                "\nGenero: "+ code.genero +
                "\nColor de cara: "+ code.colorCara +
                "\nColor de cuerpo: "+ code.colorCuerpo +
                "\nAccesorios: "+ code.accesorio +
                "\nOutfit: "+ code.outfit);
        code.coder();
    }
}
