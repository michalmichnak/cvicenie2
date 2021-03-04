package projekt.clenovia;

import projekt.ClenTimu;

public class Tester extends ClenTimu {

    public Tester(String meno) {
        super(meno);
    }

    @Override
    public void spracujUlohu(String uloha) {
        System.out.println("Tester " + this.meno + " " + uloha);
    }
}
