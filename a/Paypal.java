package VIII.patrones.strategy.a;
public class Paypal implements StrategyPago {
    private String email;

    public Paypal(String email, String clave) {
        this.email = email;
        this.clave = clave;
    }

    private String clave;

    public void pago() {
        System.out.println("Ud ha pagado con paypal");
        System.out.println("Direccion de email: " + email);
        System.out.println("Clave personal: " + clave);
    }
}

