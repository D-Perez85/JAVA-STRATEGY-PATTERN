package VIII.patrones.strategy.a;
public class Tarjeta implements StrategyPago {
    private String titular;
    private String numero;
    private String verificador;
    private String vence;

    public Tarjeta(String titular, String numero, String verificador, String vence) {
        this.titular = titular;
        this.numero = numero;
        this.verificador = verificador;
        this.vence = vence;
    }

    public void pago() {
        System.out.println("Ud ha pagado con tarjeta");
        System.out.println("Nombre del titular: " + titular);
        System.out.println("Nro de tarjeta: " + numero);
        System.out.println("Codigo de verificacion: "+ verificador);
        System.out.println("Fecha de vencimiento: " + vence);
    }

}
