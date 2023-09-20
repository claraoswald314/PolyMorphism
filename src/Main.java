public class Main {
    public static void konustur(Hayvan hayvan) {
        System.out.println(hayvan.konus());
    }

    public static void main(String[] args) {
        /*Hayvan hayvan1 = new Kedi("Tekir");
        Hayvan hayvan2 = new Kopek("Karabaş");
        Hayvan hayvan3 = new At("Şahbatur");
        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus()); */

        konustur(new Kedi("Tekir"));
        konustur(new Kopek("Karabaş"));
        konustur(new At("Şahbatur"));


    }
}
