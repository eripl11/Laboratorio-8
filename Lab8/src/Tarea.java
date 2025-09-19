// Tarea.java
public class Tarea {
    private int id;
    private String nombre;
    private boolean completada;

    public Tarea(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.completada = false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    @Override
    public String toString() {
        return id + " - " + nombre + (completada ? " [✔]" : " [ ]");
    }
}
