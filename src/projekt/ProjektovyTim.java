package projekt;

public class ProjektovyTim {
    protected String nazov;
    protected ClenTimu[] clenovia;

    public ProjektovyTim(String nazov){
        this.nazov = null;
        this.clenovia = null;
    }

    public void pridajClena(ClenTimu clen){

        clen.tim = this;

        ClenTimu[] new_clenovia = new ClenTimu[clenovia.length+1];

        for(int x = 0; x < clenovia.length; x++)
        {
            new_clenovia[x] = this.clenovia[x];
        }
        new_clenovia[clenovia.length] = clen;
    }
}
