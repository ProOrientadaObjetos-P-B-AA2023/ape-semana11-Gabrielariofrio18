package paquete3;

import paquete1.Arquero;
import paquete4.Mago;
import paquete5.Personaje;

import java.util.Random;
public class Guerrero extends Personaje {
    private double fuerza;
    private Mago mago;
    private Arquero arquero;
    public Guerrero(String nombre, int puntosVida, int nivelExperiencia) {}
    public Guerrero(double fuerza,int nivel) {
        this.fuerza = fuerza;
    }
    public Guerrero(String nombrePersonaje, int puntosVida,
                    int nivelExperiencia, double fuerza, Mago mago, Arquero arquero, int nivel) {
        super(nombrePersonaje, puntosVida, nivelExperiencia,nivel);
        this.fuerza = fuerza;
        this.mago=mago;
        this.arquero=arquero;
    }
    public double getFuerza() {
        return fuerza;
    }
    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }
    public void establecerAtaque() {
        Personaje personaje = null;
        int fuerzaPredeterminada = 70;
        int ataqueBasico = 10;
        Random random = new Random();
        int probabilidad = random.nextInt(100);
        if (personaje instanceof Mago) {
            if (probabilidad < 70) {
                personaje.setPuntosVida(personaje.getPuntosVida() - fuerzaPredeterminada);
            } else {
                personaje.setPuntosVida(personaje.getPuntosVida() - ataqueBasico);
            }
        } else if (personaje instanceof Arquero) {
            if (probabilidad < 50) {
                personaje.setPuntosVida(personaje.getPuntosVida() - fuerzaPredeterminada);
            } else {
                personaje.setPuntosVida(personaje.getPuntosVida() - ataqueBasico);
            }
        }
    }
    public int establecerDefensa() {
        int valorDefensa = 20;
        return valorDefensa;
    }
    public void establecerSubirNivel() {
        if (Personaje.nivelExperiencia) {
            nivel = nivel + 20;
        }
    }
}