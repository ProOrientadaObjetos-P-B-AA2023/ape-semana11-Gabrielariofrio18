package paquete4;

import paquete1.Arquero;
import paquete3.Guerrero;
import paquete5.Personaje;

public class Mago extends Personaje {
    private double hechizos;
    private double poderesMagicos;
    private Guerrero guerrero;
    private Arquero arquero;
    public Mago() {}
    public Mago(String nombrePersonaje, int puntosVida, int nivelExperiencia,int nivel) {
        super(nombrePersonaje, puntosVida, nivelExperiencia,nivel);
    }
    public Mago(double hechizos,double poderesMagicos,Guerrero guerrero,Arquero arquero) {
        this.hechizos = 20;
        this.poderesMagicos = 30;
        this.guerrero=guerrero;
        this.arquero=arquero;
    }
    public Guerrero getGuerrero() {
        return guerrero;
    }
    public void setGuerrero(Guerrero guerrero) {
        this.guerrero = guerrero;
    }
    public Arquero getArquero() {
        return arquero;
    }
    public void setArquero(Arquero arquero) {
        this.arquero = arquero;
    }
    public double getHechizos() {
        return hechizos;
    }
    public void setHechizos(double hechizos) {
        this.hechizos = hechizos;
    }
    public double getPoderesMagicos() {
        return poderesMagicos;
    }
    public void setPoderesMagicos(double poderesMagicos) {
        this.poderesMagicos = poderesMagicos;
    }
    public void establecerAtaque() {
        int danio = (int) (Math.random() * 100);
        int danioMagico = (int) (hechizos + poderesMagicos) * danio / 100;
        Guerrero.setPuntosVida(Guerrero.getPuntosVida() - danioMagico);
        Arquero.setPuntosVida(Arquero.getPuntosVida() - danioMagico);
    }
    public int establecerDefensa() {
        int valorDefensa = 20;
        return valorDefensa;
    }
    public void establecerSubirNivel() {
        if (Personaje.nivelExperiencia && (poderesMagicos > 0 || hechizos > 0)) {
            nivel = nivel + 20;
        }
    }
}
