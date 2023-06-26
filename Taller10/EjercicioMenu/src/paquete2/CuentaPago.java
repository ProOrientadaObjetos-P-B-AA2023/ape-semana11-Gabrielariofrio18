package paquete2;

import paquete3.Menu;

import java.util.List;

public class CuentaPago {
    public String nombreCliente;
    public List<Menu> listadoMenu;
    public double valorTotal;
    public double subTotal;
    public double iva;

    public CuentaPago() {}

    public CuentaPago(String nombreCliente, List<Menu> listadoMenu,double iva) {
        this.nombreCliente = nombreCliente;
        this.listadoMenu = listadoMenu;
        this.valorTotal = valorTotal;
        this.subTotal = subTotal;
        this.iva = iva;
        calcularTotal();
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public List<Menu> getListadoMenu() {
        return listadoMenu;
    }

    public void setListadoMenu(List<Menu> listadoMenu) {
        this.listadoMenu = listadoMenu;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
    private void calcularTotal() {
        for (Menu menu : this.listadoMenu) {
            this.subTotal = this.subTotal+menu.calcularValorPagar();
        }
        this.valorTotal = this.subTotal + (this.subTotal * this.iva / 100);
    }

    @Override
    public String toString() {
        String cuenta = "-------------------------------------------------\n";
        cuenta += "                      Cuenta                   \n";
        cuenta += "-------------------------------------------------\n";
        cuenta += "Cliente: " + nombreCliente + "\n";
        cuenta += "-------------------------------------------------\n";
        for (Menu menu : listadoMenu) {
            cuenta += "Plato: " + menu.getNombrePlato() + "\n";
            cuenta += "Valor inicial del plato: " + menu.getValorInicialMenu() + "\n";
            cuenta += "Valor Menu: " + menu.getValorMenu() + "\n";
        }
        cuenta += "-------------------------------------------------\n";
        cuenta+= "Subtotal: $" + subTotal + "\n";
        cuenta += "IVA: $" + iva + "\n";
        cuenta += "TOTAL: $" + valorTotal + "\n";
        cuenta += "-------------------------------------------------\n";
        return cuenta;
    }
}

