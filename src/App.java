import INterface.iActorBehviour;
import classes.ActionClient;
import classes.Market;
import classes.OrdinariClient;
import classes.SpecialClient;
import classes.TaxInspector;

public class App {
    public static void main(String[] args) throws Exception {
        
        Market magnit = new Market();
        iActorBehviour client1 = new OrdinariClient("Иван");
        iActorBehviour client2 = new OrdinariClient("Маша");
        iActorBehviour client3 = new SpecialClient("Dima", 123);
        iActorBehviour client4 = new TaxInspector();
        iActorBehviour client5 = new ActionClient();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.update();
    }
}
