package practicaHarry;

public class Wizards {

    public static void main(String[] args) {

        descripLuna();
        descripLupin();
        descripSirius();
        descripSnape();
        descripTonks();
    }

    public static void descripLuna(){
        Luna luna = new Luna();

        luna.setNombre("Luna Lovegood");
        luna.setCasa("Ravenclaw");
        luna.setGenero("Mujer");
        luna.setBoggart("Ver morir a su padre");
        luna.setPatronus("Liebre");

        String msg = "Soy "+luna.getNombre()+" y estos son mis datos:";
        msg +="\nCasa: "+luna.getCasa();
        msg +="\nGenero: "+luna.getGenero();
        msg +="\nBoggart: "+luna.getBoggart();
        msg +="\nPatronus: "+luna.getPatronus()+"\n";
        System.out.println(msg);
    }

    public static void descripLupin(){
        Lupin lupin = new Lupin();

        lupin.setNombre("Remus Lupin");
        lupin.setCasa("Gryffindor");
        lupin.setGenero("Hombre");
        lupin.setBoggart("Luna llena");
        lupin.setPatronus("Lobo");

        String msg = "Soy "+lupin.getNombre()+" y estos son mis datos:";
        msg +="\nCasa: "+lupin.getCasa();
        msg +="\nGenero: "+lupin.getGenero();
        msg +="\nBoggart: "+lupin.getBoggart();
        msg +="\nPatronus: "+lupin.getPatronus()+"\n";
        System.out.println(msg);
    }

    public static void descripSirius(){
        Sirius sirius = new Sirius();

        sirius.setNombre("Sirius Black");
        sirius.setCasa("Gryffindor");
        sirius.setGenero("Hombre");
        sirius.setBoggart("Lord Voldemort");
        sirius.setPatronus("No-corporeo");

        String msg = "Soy "+sirius.getNombre()+" y estos son mis datos:";
        msg +="\nCasa: "+sirius.getCasa();
        msg +="\nGenero: "+sirius.getGenero();
        msg +="\nBoggart: "+sirius.getBoggart();
        msg +="\nPatronus: "+sirius.getPatronus()+"\n";
        System.out.println(msg);
    }

    public static void descripSnape(){
        Snape snape = new Snape();

        snape.setNombre("Severus Sanpe");
        snape.setCasa("Slytherin");
        snape.setGenero("Hombre");
        snape.setBoggart("Lord Voldemort");
        snape.setPatronus("Ciervo");

        String msg = "Soy "+snape.getNombre()+" y estos son mis datos:";
        msg +="\nCasa: "+snape.getCasa();
        msg +="\nGenero: "+snape.getGenero();
        msg +="\nBoggart: "+snape.getBoggart();
        msg +="\nPatronus: "+snape.getPatronus()+"\n";
        System.out.println(msg);
    }

    public static void descripTonks(){
        Tonks tonks = new Tonks();

        tonks.setNombre("Nymphadora Tonks");
        tonks.setCasa("Hufflepuff");
        tonks.setGenero("Mujer");
        tonks.setBoggart("Perder sus habilidades");
        tonks.setPatronus("Jack Rabbit y/o Lobo");

        String msg = "Soy "+tonks.getNombre()+" y estos son mis datos:";
        msg +="\nCasa: "+tonks.getCasa();
        msg +="\nGenero: "+tonks.getGenero();
        msg +="\nBoggart: "+tonks.getBoggart();
        msg +="\nPatronus: "+tonks.getPatronus()+"\n";
        System.out.println(msg);
    }
}
