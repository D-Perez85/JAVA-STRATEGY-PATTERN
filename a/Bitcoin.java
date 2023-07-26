package VIII.patrones.strategy.a;
public class Bitcoin implements StrategyPago {
    private String billetera;

    public Bitcoin(String billetera) {
        this.billetera = billetera;
    }

    public void pago() {
        System.out.println("Ud ha pagado con bitcoin");
        System.out.println("Billetera virtual nro: " + billetera);;
    }
}
