package VIII.patrones.strategy.a;
public class Tienda {
    private StrategyPago formaPago;

    public void pago() {
        formaPago.pago();
    }

    public void setPago(StrategyPago nuevoPago) {
        formaPago = nuevoPago;
    }
}
