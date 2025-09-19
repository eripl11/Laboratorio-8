// VistaTareas.java
import javax.swing.*;
import java.awt.*;

public class VistaTareas extends JFrame {
    private JTextField campoTexto;
    private JButton botonAgregar, botonEliminar;
    private JList<Tarea> listaTareas;
    private DefaultListModel<Tarea> modeloLista;

    public VistaTareas() {
        setTitle("Gestión de Tareas");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        campoTexto = new JTextField(20);
        botonAgregar = new JButton("Agregar");
        botonEliminar = new JButton("Eliminar");

        modeloLista = new DefaultListModel<>();
        listaTareas = new JList<>(modeloLista);

        JPanel panelSuperior = new JPanel();
        panelSuperior.add(campoTexto);
        panelSuperior.add(botonAgregar);

        JPanel panelInferior = new JPanel();
        panelInferior.add(botonEliminar);

        add(panelSuperior, BorderLayout.NORTH);
        add(new JScrollPane(listaTareas), BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);
    }

    public String getTextoTarea() {
        return campoTexto.getText();
    }

    public void limpiarCampo() {
        campoTexto.setText("");
    }

    public JButton getBotonAgregar() {
        return botonAgregar;
    }

    public JButton getBotonEliminar() {
        return botonEliminar;
    }

    public JList<Tarea> getListaTareas() {
        return listaTareas;
    }

    public DefaultListModel<Tarea> getModeloLista() {
        return modeloLista;
    }
}
