package projekt;

public class ClenTimu {
    public String meno;
    public ProjektovyTim tim;

    public ClenTimu(String meno){
        this.meno = meno;
        new ClenTimu(meno, null);
    }

    public ClenTimu(String meno, ProjektovyTim tim){
        this.meno = meno;
        this.tim = tim;

    }

}
