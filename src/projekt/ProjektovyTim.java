package projekt;

import projekt.clenovia.Programator;

public class ProjektovyTim {
    protected String nazov;
    protected ClenTimu[] clenovia;

    public ProjektovyTim(String nazov){
        this.nazov = nazov;
        this.clenovia = null;
    }

    public ClenTimu[] getClenovia() {
        return clenovia;
    }

    public String getNazov() {
        return nazov;
    }

    public void pridajClena(ClenTimu clen){

        clen.tim = this;
        /*System.out.println("Pridavam clena");
        System.out.println(clen.tim.nazov);
        System.out.println(clen.meno);*/

        if(this.clenovia == null) {
            ClenTimu[] new_clenovia = new ClenTimu[1];
            new_clenovia[0] = clen;
            clenovia = new_clenovia;
           /* System.out.println("clenovia su null");
            System.out.println("");*/
        }

        else {
            ClenTimu[] new_clenovia = new ClenTimu[clenovia.length+1];

            for(int x = 0; x < clenovia.length; x++)
            {
                new_clenovia[x] = this.clenovia[x];
               /* System.out.println(" ");
                System.out.println(new_clenovia[x].meno);
                System.out.println(new_clenovia[x].tim.nazov);
                System.out.println(" ");*/
            }
            new_clenovia[clenovia.length] = clen;
            clenovia = new_clenovia;


        }
    }

    public void programuj(String uloha){
        for(int x = 0; x < clenovia.length;x++)
        {
            if(clenovia[x] instanceof Programator)
                clenovia[x].spracujUlohu(uloha);
        }
    }
}
