package GUI;

import javax.swing.*;
import java.awt.*;

public class GuiEstructura {
    private JPanel panelPrincipal;
    private JButton listasButton;
    private JButton arbolesButton;
    private JButton grafosButton;

    public GuiEstructura() {
        panelPrincipal = new JPanel(new FlowLayout(FlowLayout.LEFT));
        listasButton = new JButton("Listas");
        arbolesButton = new JButton("Arboles");
        grafosButton = new JButton("Grafos");

        // Agrega los botones al panel principal
        panelPrincipal.add(listasButton);
        panelPrincipal.add(arbolesButton);
        panelPrincipal.add(grafosButton);

        JFrame frame = new JFrame("GuiEstructura");
        frame.setContentPane(panelPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Obtiene el tamaño de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // Calcula el ancho y alto como un porcentaje de la resolución de la pantalla
        int width = (int) (screenSize.width * 0.7); // 70% del ancho de la pantalla
        int height = (int) (screenSize.height * 0.7); // 70% del alto de la pantalla

        frame.setSize(width, height); // Establece el tamaño inicial de la ventana
        frame.setLocationRelativeTo(null); // Centra la ventana en la pantalla
        frame.setVisible(true);
    }
}