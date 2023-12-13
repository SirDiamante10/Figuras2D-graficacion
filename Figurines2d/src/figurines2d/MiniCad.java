
package figurines2d;

/**
 *
 * @author DIAMANTE TERREMOTE
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Figura {
    private int[] puntosX;
    private int[] puntosY;

    public Figura(int[] puntosX, int[] puntosY) {
        this.puntosX = puntosX;
        this.puntosY = puntosY;
    }

    public void trasladar(int deltaX, int deltaY) {
        for (int i = 0; i < puntosX.length; i++) {
            puntosX[i] += deltaX;
            puntosY[i] += deltaY;
        }
    }

    public void rotar(double angulo) {
        int centroX = calcularCentroX();
        int centroY = calcularCentroY();

        double cos = Math.cos(angulo);
        double sin = Math.sin(angulo);

        for (int i = 0; i < puntosX.length; i++) {
            int x = puntosX[i] - centroX;
            int y = puntosY[i] - centroY;

            puntosX[i] = (int) (x * cos - y * sin) + centroX;
            puntosY[i] = (int) (x * sin + y * cos) + centroY;
        }
    }

    public void escalar(double factor) {
        int centroX = calcularCentroX();
        int centroY = calcularCentroY();

        for (int i = 0; i < puntosX.length; i++) {
            puntosX[i] = (int) ((puntosX[i] - centroX) * factor) + centroX;
            puntosY[i] = (int) ((puntosY[i] - centroY) * factor) + centroY;
        }
    }

    private int calcularCentroX() {
        int sumaX = 0;
        for (int x : puntosX) {
            sumaX += x;
        }
        return sumaX / puntosX.length;
    }

    private int calcularCentroY() {
        int sumaY = 0;
        for (int y : puntosY) {
            sumaY += y;
        }
        return sumaY / puntosY.length;
    }

    public void dibujar(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillPolygon(puntosX, puntosY, puntosX.length);
    }
}

class Ventana extends JFrame {
    private Figura figura;
    private JTextField txtTraslacionX, txtTraslacionY, txtRotacion, txtEscalamiento, txtLados;

    public Ventana() {
        int[] puntosX = {100, 120, 150};
        int[] puntosY = {100, 120, 150};

        figura = new Figura(puntosX, puntosY);

        txtTraslacionX = new JTextField(5);
        txtTraslacionY = new JTextField(5);
        txtRotacion = new JTextField(5);
        txtEscalamiento = new JTextField(5);
        txtLados = new JTextField(5);

        JButton btnTraslacion = new JButton("Traslación");
        JButton btnRotacion = new JButton("Rotación");
        JButton btnEscalamiento = new JButton("Escalamiento");
        JButton btnCambiarFigura = new JButton("Cambiar Figura");

        btnTraslacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int deltaX = Integer.parseInt(txtTraslacionX.getText());
                int deltaY = Integer.parseInt(txtTraslacionY.getText());
                figura.trasladar(deltaX, deltaY);
                repaint();
            }
        });

        btnRotacion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double angulo = Math.toRadians(Double.parseDouble(txtRotacion.getText()));
                figura.rotar(angulo);
                repaint();
            }
        });

        btnEscalamiento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double factor = Double.parseDouble(txtEscalamiento.getText());
                figura.escalar(factor);
                repaint();
            }
        });

        btnCambiarFigura.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cambiarFigura();
                repaint();
            }
        });

        setLayout(new FlowLayout());
        add(new JLabel("Traslación X:"));
        add(txtTraslacionX);
        add(new JLabel("Traslación Y:"));
        add(txtTraslacionY);
        add(btnTraslacion);

        add(new JLabel("Rotación (grados):"));
        add(txtRotacion);
        add(btnRotacion);

        add(new JLabel("Escalamiento:"));
        add(txtEscalamiento);
        add(btnEscalamiento);

        add(new JLabel("Lados (3 para triángulo, 4 para cuadrado, etc.):"));
        add(txtLados);
        add(btnCambiarFigura);

        setSize(1000, 600);
        setTitle("Proyecto - MiniCad");
        setLocationRelativeTo(null);  // Centra la ventana en la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void cambiarFigura() {
        int lados = Integer.parseInt(txtLados.getText());

        if (lados < 3) {
            JOptionPane.showMessageDialog(this, "Número de lados debe ser al menos 3", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int radio = 50;

        int[] puntosX = new int[lados];
        int[] puntosY = new int[lados];

        for (int i = 0; i < lados; i++) {
            double angulo = 2 * Math.PI * i / lados;
            puntosX[i] = (int) (radio * Math.cos(angulo)) + 150;
            puntosY[i] = (int) (radio * Math.sin(angulo)) + 150;
        }

        figura = new Figura(puntosX, puntosY);
    }

    public void paint(Graphics g) {
        super.paint(g);
        figura.dibujar(g);
    }
}

public class MiniCad {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Ventana();
            }
        });
    }
}
