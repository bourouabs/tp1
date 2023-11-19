import java.util.concurrent.Callable;

public class CommandeTest {
    public static void main(String[] args) {
        Commande c1= new Commande();
        c1.total= 200;
        c1.presentToi();
        Commande c2= new Commande("c-1-2020");
        c2.totalPaye= 300;
        c2.presentToi();
        Commande c3= new Commande("c-2-2020", 100, 30 );
        c3.presentToi();






    }
}
