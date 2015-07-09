package basesdatos;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class VentanaTabla {

    JFrame marco;
    JPanel panel1;

    DefaultTableModel modelo;
    JTable tabla;

    JScrollPane scrollpane;

    public void crearVentana(String[][] datosDevueltos, String[] nombresColumnas) {
        marco = new JFrame("Tabla");

        modelo = new DefaultTableModel(datosDevueltos, nombresColumnas);
        tabla = new JTable(modelo);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 70));

        //Creamos un JscrollPane y le agregamos la JTable
        JScrollPane scrollPane = new JScrollPane(tabla);

        //Agregamos el JScrollPane al contenedor
        marco.add(scrollPane, BorderLayout.CENTER);

        marco.setBounds(0, 0, 285, 300);
        marco.setLocationRelativeTo(null); //lo pone en el centro
        marco.setVisible(true);
        marco.setResizable(false);

    }

}
