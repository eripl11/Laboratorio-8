import java.awt.event.*;
import javax.swing.JOptionPane;  // <--- ESTE IMPORT FALTABA

public class ControladorTareas {
    private GestorTareas gestor;
    private VistaTareas vista;

    public ControladorTareas(GestorTareas gestor, VistaTareas vista) {
        this.gestor = gestor;
        this.vista = vista;

        vista.getBotonAgregar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = vista.getTextoTarea();
                if (!nombre.isEmpty()) {
                    gestor.agregarTarea(nombre);
                    actualizarLista();
                    vista.limpiarCampo();
                } else {
                    JOptionPane.showMessageDialog(vista, "Ingrese una tarea");
                }
            }
        });

        vista.getBotonEliminar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tarea seleccionada = vista.getListaTareas().getSelectedValue();
                if (seleccionada != null) {
                    gestor.eliminarTarea(seleccionada.getId());
                    actualizarLista();
                } else {
                    JOptionPane.showMessageDialog(vista, "Seleccione una tarea para eliminar");
                }
            }
        });
    }

    private void actualizarLista() {
        vista.getModeloLista().clear();
        for (Tarea t : gestor.getTareas()) {
            vista.getModeloLista().addElement(t);
        }
    }
}

