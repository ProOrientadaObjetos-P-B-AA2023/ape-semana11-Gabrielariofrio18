package paquete8;

import paquete2.CuentaPago;
import paquete3.Menu;
import paquete4.MenuCarta;
import paquete5.MenuDia;
import paquete6.MenuNiños;
import paquete7.MenuEconomico;

import java.util.ArrayList;

public class Ejecutor02 {
    public static void main(String[] args) {
        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5","1"},
                {"Niños 02", "3.00", "1", "1.5","3"},
                {"Niños 03", "2.00", "2", "0.5","7"},
        };
        String[][] datos002 = {{"Econo 001", "4", "25","23"},
                {"Econo 002", "4", "15","12"},
                {"Econo 003", "4", "35","59"}
        };
        String[][] datos003 = { {"Dia 001", "5", "1", "1","2"},
                {"Dia 002", "6", "2", "2","5"},
                {"Dia 003", "5.5", "3", "1","7"},
        };

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10","5"},
                {"Carta 002", "7", "1.7", "2.1", "5","2"},
                {"Carta 003", "8", "1.9", "2.2", "5","8"},
                {"Carta 004", "9", "2.5", "2.9", "5","9"},
        };

        ArrayList<Menu> lista = new ArrayList<>();

        for (String[] dato : datos001) {
            String nombrePlato = dato[0];
            double valorMenu = Double.parseDouble(dato[1]);
            double valorInicialMenu = Double.parseDouble(dato[2]);
            double valorPorcionHelado = Double.parseDouble(dato[3]);
            double valorPorcioPastel = Double.parseDouble(dato[4]);
            MenuNiños menuNiños = new MenuNiños(nombrePlato, valorMenu, valorInicialMenu, 0, valorPorcionHelado, valorPorcioPastel);
            lista.add(menuNiños);
        }
        for (String[] dato : datos002) {
            String nombrePlato = dato[0];
            double valorMenu = Double.parseDouble(dato[1]);
            double valorInicialMenu = Double.parseDouble(dato[2]);
            double porcentajeDescuento = Double.parseDouble(dato[3]);
            MenuEconomico menuEconomico = new MenuEconomico(nombrePlato, valorMenu, valorInicialMenu, 0, porcentajeDescuento);
            lista.add(menuEconomico);
        }
        for (String[] dato : datos003) {
            String nombrePlato = dato[0];
            double valorMenu = Double.parseDouble(dato[1]);
            double valorInicialMenu = Double.parseDouble(dato[2]);
            double valorBebida = Double.parseDouble(dato[3]);
            double valorPostre = Double.parseDouble(dato[4]);
            MenuDia menuDia = new MenuDia(nombrePlato, valorMenu, valorInicialMenu, valorBebida,valorPostre);
            lista.add(menuDia);
        }

        for (String[] dato : datos004) {
            String nombrePlato = dato[0];
            double valorMenu = Double.parseDouble(dato[1]);
            double valorInicialMenu = Double.parseDouble(dato[2]);
            double valorBebida = Double.parseDouble(dato[3]);
            double valorPorcionGuarnicion = Double.parseDouble(dato[4]);
            double valorPorcentajeAdicionalServicio = Double.parseDouble(dato[5]);
            MenuCarta menuCarta = new MenuCarta(nombrePlato, valorMenu, valorInicialMenu, valorBebida, valorPorcionGuarnicion,valorPorcentajeAdicionalServicio);
            lista.add(menuCarta);
        }

        for (Menu menu : lista) {
            menu.calcularValorPagar();
        }

        CuentaPago miCuenta = new CuentaPago("Luis Andrade", lista, 10);
        miCuenta.calcularTotal();
        System.out.printf("%s\n", miCuenta);
    }
}
