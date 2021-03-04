package projekt.clenovia;

import projekt.ClenTimu;

public class Programator extends ClenTimu {

    public Programator(String meno) {
        super(meno);
    }

    @Override
    public void spracujUlohu(String uloha) {
        System.out.println("Programator " + this.meno + " " + uloha);
    }
}
