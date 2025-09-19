// Main.java
public class Main {
    public static void main(String[] args) {
        GestorTareas gestor = new GestorTareas();
        VistaTareas vista = new VistaTareas();
        new ControladorTareas(gestor, vista);

        vista.setVisible(true);
    }
}
