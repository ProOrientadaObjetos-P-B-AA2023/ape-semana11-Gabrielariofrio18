package paquete6;

import paquete3.Menu;

public class MenuNiños extends Menu {
    public double valorPorcionHelado;
    public double valorPorcionPastel;

    public MenuNiños() {}

    public MenuNiños(double valorPorcionHelado, double valorPorcionPastel) {
        this.valorPorcionHelado = valorPorcionHelado;
        this.valorPorcionPastel = valorPorcionPastel;
    }

    public MenuNiños(String nombrePlato, double valorMenu, double valorInicialMenu, double valorBebida, double valorPorcionHelado, double valorPorcionPastel) {
        super(nombrePlato, valorMenu, valorInicialMenu, 0);
        this.valorPorcionHelado = valorPorcionHelado;
        this.valorPorcionPastel = valorPorcionPastel;
    }

    public double getValorPorcionHelado() {
        return valorPorcionHelado;
    }

    public void setValorPorcionHelado(double valorPorcionHelado) {
        this.valorPorcionHelado = valorPorcionHelado;
    }

    public double getValorPorcionPastel() {
        return valorPorcionPastel;
    }

    public void setValorPorcionPastel(double valorPorcionPastel) {
        this.valorPorcionPastel = valorPorcionPastel;
    }

    public double calcularValorPagar() {
        double total = this.valorMenu + this.getValorPorcionHelado() + this.getValorPorcionPastel();
        return total;
    }

    @Override
    public String toString() {
        return super.toString()+"MenuNiños{" +
                "valorPorcionHelado=" + valorPorcionHelado +
                ", valorPorcionPastel=" + valorPorcionPastel +
                '}';
    }
}
