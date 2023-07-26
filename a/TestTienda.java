package VIII.patrones.strategy.a;
public class TestTienda {

    public static void main(String[] args) {
        Tienda laTienda = new Tienda();

        laTienda.setPago(new Tarjeta("Luis Lopez", "223455423323443","123", "02/29"));
        laTienda.pago();
        System.out.println("----------------------------------------------------");

        laTienda.setPago(new Bitcoin("ADSDW#FSDS02/29"));
        laTienda.pago();
        System.out.println("----------------------------------------------------");

        laTienda.setPago(new Paypal("leandro@fuice.com", "miClaveSecreta"));
        laTienda.pago();


    }
}
