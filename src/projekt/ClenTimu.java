package projekt;

public abstract class ClenTimu {
    protected String meno;
    protected ProjektovyTim tim;

    public ClenTimu (String meno){
        this(meno, null);
    }

    public ClenTimu(String meno, ProjektovyTim tim){
        this.meno = meno;
        this.tim = tim;

    }

    public String getMeno() {
        return meno;
    }

    public ProjektovyTim getTim() {
        return tim;
    }

    public String toString(){

        if(tim == null)
            return (this.meno);
        else
            return (this.meno + " je členom tímu: " + this.tim.nazov);

        //System.out.println(this.meno + ": " + this.tim.nazov);

    }

    public abstract void spracujUlohu(String uloha);

}
