package paquete5;

import paquete3.Menu;

public class MenuDia extends Menu {
    public double valorPostre;

    public MenuDia() {}

    public MenuDia(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public MenuDia(String nombrePlato, double valorMenu, double valorInicialMenu, double valorBebida, double valorPostre) {
        super(nombrePlato, valorMenu, valorInicialMenu, valorBebida);
        this.valorPostre = valorPostre;
    }

    public double getValorPostre() {
        return valorPostre;
    }

    public void setValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public double calcularValorPagar() {
        double total = valorMenu + valorPostre + valorBebida;
        return total;
    }

    @Override
    public String toString() {
        return super.toString()+"MenuDia{" +
                "valorPostre=" + valorPostre +
                '}';
    }
}
