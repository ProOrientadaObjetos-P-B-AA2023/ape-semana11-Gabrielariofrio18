package paquete4;

import paquete3.Menu;

public class MenuCarta extends Menu {
    public double valorPorcionGuarnicion;
    public double porcentajeAdicionalServicio;

    public MenuCarta() {}

    public MenuCarta(double valorPorcionGuarnicion) {
        this.valorPorcionGuarnicion = valorPorcionGuarnicion;
    }

    public MenuCarta(double valorPorcionGuarnicion, double porcentajeAdicionalServicio) {
        this.valorPorcionGuarnicion = valorPorcionGuarnicion;
        this.porcentajeAdicionalServicio = porcentajeAdicionalServicio;
    }

    public MenuCarta(String nombrePlato, double valorMenu, double valorInicialMenu, double valorBebida, double valorPorcionGuarnicion, double porcentajeAdicionalServicio) {
        super(nombrePlato, valorMenu, valorInicialMenu, valorBebida);
        this.valorPorcionGuarnicion = valorPorcionGuarnicion;
        this.porcentajeAdicionalServicio = porcentajeAdicionalServicio;
    }

    public double getPorcentajeAdicionalServicio() {
        return porcentajeAdicionalServicio;
    }

    public void setPorcentajeAdicionalServicio(double porcentajeAdicionalServicio) {
        this.porcentajeAdicionalServicio = porcentajeAdicionalServicio;
    }

    public double getValorPorcionGuarnicion() {
        return valorPorcionGuarnicion;
    }

    public void setValorPorcionGuarnicion(double valorPorcionGuarnicion) {
        this.valorPorcionGuarnicion = valorPorcionGuarnicion;
    }

    public double calcularValorPagar() {
        double subtotal = valorMenu + this.valorPorcionGuarnicion + super.valorBebida;
        double total = subtotal + (super.valorInicialMenu * this.porcentajeAdicionalServicio/ 100);
        return total;
    }

    @Override
    public String toString() {
        return super.toString()+"MenuCarta{" +
                "valorPorcionGuarnicion=" + valorPorcionGuarnicion +
                '}';
    }
}
