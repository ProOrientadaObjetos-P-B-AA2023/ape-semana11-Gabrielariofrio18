package paquete7;

import paquete3.Menu;

public class MenuEconomico extends Menu {
    public double porcentajeDescuento;

    public MenuEconomico() {}

    public MenuEconomico(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public MenuEconomico(String nombrePlato, double valorMenu, double valorInicialMenu, double valorBebida, double porcentajeDescuento) {
        super(nombrePlato, valorMenu, valorInicialMenu, 0);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double getPorcentajeDescuento() {
        this.porcentajeDescuento=super.valorInicialMenu * this.porcentajeDescuento / 100;
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public double calcularValorPagar() {
        double total = super.valorMenu - this.getPorcentajeDescuento();
        return total;
    }

    @Override
    public String toString() {
        return super.toString()+"MenuEconomico{" +
                "porcentajeDescuento=" + porcentajeDescuento +
                '}';
    }
}
