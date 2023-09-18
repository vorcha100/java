package UvodUProgramiranje;

public class VarijableITipoviPodataka {

    public static void main (String[]args) {
/*
        String ime = "Slobodan";
        int godine = 30;
        double visina = 1.85;
        boolean zaposlen = true;
        float plata = 500.5f;
        char pol = 'M';

        System.out.println("Moje ime je " + ime);
        System.out.println("Ja imam: " +godine + " godina");
        System.out.println("Ja sam visok: "+visina + " centimetara");
        System.out.println("Ja sam zaposlen: " +zaposlen + " u kompaniji HTEC");
        System.out.println("Moja plata je: " +plata + " eura");
        System.out.println("Ja sam: " +pol);
       */
        //Rad sa varijablama
        int x = 5;
        int y = 3;
        int z = x + y;
        boolean jeVece = x > y;

        System.out.println("Zbir x + y daje broj: " + z + " x je vece od y " + jeVece);

        String brojText = "10";
        int brojCeo = Integer.parseInt(brojText);

        System.out.println(brojCeo);
    }
}
