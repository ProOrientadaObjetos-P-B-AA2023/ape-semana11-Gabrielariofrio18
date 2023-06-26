package paquete1;

import paquete2.CuentaPago;
import paquete3.Menu;
import paquete4.MenuCarta;
import paquete5.MenuDia;
import paquete6.MenuNiños;
import paquete7.MenuEconomico;

import java.util.ArrayList;
import java.util.List;

public class Ejecutor {
    public static void main(String[] args) {
        MenuCarta menuCarta=new MenuCarta("Asado de pollo",2,3,5,2);
        MenuDia menuDia=new MenuDia("Guata",2,3,5,5);
        MenuNiños menuNiños=new MenuNiños("Papipollo",2,3,4,5,5);
        MenuEconomico menuEconomico=new MenuEconomico("Pescado frito",4,3,6,2);
        List<Menu> listado = new ArrayList<>();
        listado.add(menuCarta);
        listado.add(menuDia);
        listado.add(menuNiños);
        listado.add(menuEconomico);
        CuentaPago cuentaPago=new CuentaPago("Maria", listado,12);
        System.out.println(cuentaPago);

    }
}
