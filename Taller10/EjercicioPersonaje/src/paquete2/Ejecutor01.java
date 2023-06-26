package paquete2;

import paquete3.Guerrero;
import paquete5.Personaje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ejecutor01 {
    public static void main(String[] args) {
        List<Personaje> listaPersonajes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("----- MENÚ -----");
            System.out.println("1. Crear personajes");
            System.out.println("2. Enfrentar personajes");
            System.out.println("3. Ver resultados");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearPersonajes(listaPersonajes, scanner);
                    break;
                case 2:
                    enfrentarPersonajes(listaPersonajes, scanner);
                    break;
                case 3:
                    verResultados(listaPersonajes);
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intenta nuevamente.");
            }
        } while (opcion != 4);
    }
    public static void crearPersonajes(List<Personaje> listaPersonajes, Scanner scanner) {
        String nombre;
        int nivelExperiencia;
        int puntosVida;
        String opcion;

        do {
            System.out.println("----- CREAR PERSONAJE -----");
            System.out.print("Nombre del personaje: ");
            nombre = scanner.next();
            System.out.print("Nivel de experiencia: ");
            nivelExperiencia = scanner.nextInt();
            System.out.print("Puntos de vida: ");
            puntosVida = scanner.nextInt();
            Guerrero guerrero = new Guerrero(nombre, puntosVida, nivelExperiencia);
            listaPersonajes.add(guerrero);
            System.out.print("¿Deseas registrar otro personaje? (S/N): ");
            opcion = scanner.next();
        } while (opcion.equalsIgnoreCase("S"));
    }
    public static void enfrentarPersonajes(List<Personaje> listaPersonajes, Scanner scanner) {
        if (listaPersonajes.size() < 2) {
            System.out.println("Debe haber al menos dos personajes registrados para enfrentarlos.");
            return;
        }
        Personaje jugador1 = elegirPersonaje(listaPersonajes, scanner, "JUGADOR 1");
        Personaje jugador2 = elegirPersonaje(listaPersonajes, scanner, "JUGADOR 2");
        System.out.println("¡Los personajes " + jugador1.getNombrePersonaje() + " y " +
                jugador2.getNombrePersonaje() + " se enfrentarán!");
        System.out.println("----- TURNO DEL JUGADOR 1 -----");
        System.out.println("1. Atacar");
        System.out.println("2. Defender");
        System.out.print("Elige una opción: ");
        int opcionJugador1 = scanner.nextInt();
        if (opcionJugador1 == 1) {
            jugador1.establecerAtaque();
        } else if (opcionJugador1 == 2) {
            jugador1.establecerDefensa();
        } else {
            System.out.println("Opción inválida. Se asumirá defensa.");
            jugador1.establecerDefensa();
        }
        System.out.println("----- TURNO DEL JUGADOR 2 -----");
        System.out.println("1. Atacar");
        System.out.println("2. Defender");
        System.out.print("Elige una opción: ");
        int opcionJugador2 = scanner.nextInt();

        if (opcionJugador2 == 1) {
            jugador2.establecerAtaque();
        } else if (opcionJugador2 == 2) {
            jugador2.establecerDefensa();
        } else {
            System.out.println("Opción inválida. Se asumirá defensa.");
            jugador2.establecerDefensa();
        }
        System.out.println("----- RESULTADOS -----");
        System.out.println("Puntos de vida de " + jugador1.getNombrePersonaje() + ": " + jugador1.getPuntosVida());
        System.out.println("Puntos de vida de " + jugador2.getNombrePersonaje() + ": " + jugador2.getPuntosVida());
    }
    public static Personaje elegirPersonaje(List<Personaje> listaPersonajes, Scanner scanner, String jugador) {
        System.out.println("----- " + jugador + " -----");
        System.out.println("Elige un personaje:");

        for (int i = 0; i < listaPersonajes.size(); i++) {
            Personaje personaje = listaPersonajes.get(i);
            System.out.println((i + 1) + ". " + personaje.getNombrePersonaje());
        }

        int opcion = scanner.nextInt();
        return listaPersonajes.get(opcion - 1);
    }
    public static void verResultados(List<Personaje> listaPersonajes) {
        System.out.println("----- RESULTADOS -----");

        for (Personaje personaje : listaPersonajes) {
            personaje.establecerSubirNivel();
            System.out.println(personaje.getNombrePersonaje() + ": Nivel " + personaje.getNivel());
        }
    }
}
