package projekt.clenovia;

import projekt.ClenTimu;

public class Manazer extends ClenTimu {

    public Manazer(String meno) {
        super(meno);
    }

    @Override
    public void spracujUlohu(String uloha) {
        System.out.println("Manazer " + this.meno + " " + uloha);
    }
}
