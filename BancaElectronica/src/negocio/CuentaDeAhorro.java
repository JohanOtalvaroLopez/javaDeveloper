package negocio;

public class CuentaDeAhorro extends Cuenta{
    private double tasaInteresMensual;

    public CuentaDeAhorro(int numero, double saldo, double tasaInteresMensual) {
        super(numero,saldo);
        this.setTasaInteresMensual(tasaInteresMensual);
    }
    public double calculaIntereses(){
        return 0;
    }

    public double getTasaInteresMensual() {
        return tasaInteresMensual;
    }

    public void setTasaInteresMensual(double tasaInteresMensual) {
        this.tasaInteresMensual = tasaInteresMensual;
    }

    @Override
    public String toString() {
        return "CuentaDeAhorro{" +
                "tasaInteresMensual=" + tasaInteresMensual +
                '}';
    }
}
