package paquete5;

abstract public class Personaje {
    protected static boolean nivelExperiencia;
    public String nombrePersonaje;
    protected static int puntosVida;
    protected int experiencia;
    protected int nivel;
    public Personaje() {}
    public Personaje(String nombrePersonaje, int puntosVida, int nivelExperiencia,int nivel) {
        this.nombrePersonaje = nombrePersonaje;
        this.puntosVida = puntosVida;
        this.experiencia = experiencia;
        this.nivel=nivel;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public String getNombrePersonaje() {
        return nombrePersonaje;
    }
    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }
    public static int getPuntosVida() {
        return puntosVida;
    }
    public static void setPuntosVida(int puntosVida) {
        puntosVida = puntosVida;
    }
    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    public abstract void establecerAtaque();
    public abstract int establecerDefensa();
    public abstract void establecerSubirNivel();
}
