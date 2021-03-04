import projekt.*;
import projekt.clenovia.*;

public class Program {
    public static void main(String[] args) {

        ProjektovyTim tim1 = new ProjektovyTim("tim1");
        ClenTimu clen4 = new Programator("Peter Nazarej");
        ClenTimu clen5 = new Programator("Jozko Vajda");
        ClenTimu clen6 = new Tester("Zuzka Studenkova");
        ClenTimu clen7 = new Tester("Alojz hlina");
        ClenTimu clen8 = new Manazer("Andrej Danko");

        tim1.pridajClena(clen4);
        tim1.pridajClena(clen5);
        tim1.pridajClena(clen6);
        tim1.pridajClena(clen7);
        tim1.pridajClena(clen8);

        ClenTimu[] clenoviag = tim1.getClenovia();

        for(int x = 0; x < 3;x++)
            System.out.println(clenoviag[x].toString());

        tim1.programuj("chod do obchodu");







    }


}
