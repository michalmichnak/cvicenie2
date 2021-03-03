import projekt.*;

public class Program {
    public static void main(String[] args) {

        ProjektovyTim tim1 = new ProjektovyTim("tim1");
        ClenTimu jozko = new ClenTimu("Jozko");
        ClenTimu petko = new ClenTimu("Petko");
        ClenTimu janko = new ClenTimu("Janko");

        tim1.pridajClena(jozko);
        tim1.pridajClena(petko);
        tim1.pridajClena(janko);




    }
}
