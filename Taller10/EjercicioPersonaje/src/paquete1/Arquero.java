package paquete1;

import paquete3.Guerrero;
import paquete4.Mago;
import paquete5.Personaje;

import java.util.Random;
public class Arquero extends Personaje {
   private double precision;
    public Arquero() {}
    public Arquero(String nombrePersonaje, int puntosVida, int nivelExperiencia,int nivel) {
        super(nombrePersonaje, puntosVida, nivelExperiencia,nivel);
    }
    public Arquero(int precision) {
        this.precision = precision;
    }
    public Arquero(String nombrePersonaje, int puntosVida, int nivelExperiencia, double precision,int nivel) {
        super(nombrePersonaje, puntosVida, nivelExperiencia,nivel);
        this.precision = precision;
    }
    public double getPrecision() {
        return precision;
    }
    public void setPrecision(double precision) {
        this.precision = precision;
    }
    public void establecerAtaque() {
        int danioFlechas;
        Random random = new Random();
        danioFlechas = random.nextInt(50) + 50;
        Personaje personaje=null;
        if (personaje instanceof Guerrero || personaje instanceof Mago) {
            personaje.setPuntosVida(personaje.getPuntosVida() - danioFlechas);
        }
    }
    public int establecerDefensa() {
        int valorDefensa = 10;
        return valorDefensa;
    }
    public void establecerSubirNivel() {
        boolean ganador=true;
        if (ganador) {
            nivel += 1;
        }
    }
}
