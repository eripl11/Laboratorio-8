// GestorTareas.java
import java.util.ArrayList;
import java.util.List;

public class GestorTareas {
    private List<Tarea> tareas;
    private int contadorId = 1;

    public GestorTareas() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(String nombre) {
        tareas.add(new Tarea(contadorId++, nombre));
    }

    public void eliminarTarea(int id) {
        tareas.removeIf(t -> t.getId() == id);
    }

    public List<Tarea> getTareas() {
        return tareas;
    }
}

