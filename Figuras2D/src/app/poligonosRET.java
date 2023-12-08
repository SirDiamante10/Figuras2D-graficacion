package app;

import java.awt.*;
import java.util.ArrayList;

public class poligonosRET extends javax.swing.JFrame {
    int contador = 0;
    ArrayList<Polygon> figura = new ArrayList<Polygon>();


    public poligonosRET() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LabelTransformar = new javax.swing.JLabel();
        LabelEscalar = new javax.swing.JLabel();
        LabelRazonX = new javax.swing.JLabel();
        razonX = new javax.swing.JTextField();
        LabelRazonY = new javax.swing.JLabel();
        razonY = new javax.swing.JTextField();
        escalar = new javax.swing.JButton();
        LabelRotar = new javax.swing.JLabel();
        LabelAngulo = new javax.swing.JLabel();
        angulo = new javax.swing.JTextField();
        rotar = new javax.swing.JButton();
        dibujar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        poligonos = new javax.swing.JComboBox<>();
        LabelTrasladar = new javax.swing.JLabel();
        LabelDesplazarX = new javax.swing.JLabel();
        LabelDesplazarY = new javax.swing.JLabel();
        trasladar = new javax.swing.JButton();
        aumentarX = new javax.swing.JTextField();
        aumentarY = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Click en la zona blanca para marcar los vertices de un polígono");

        LabelTransformar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        LabelTransformar.setText("TRANSFORMACIONES");

        LabelEscalar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelEscalar.setForeground(new java.awt.Color(102, 0, 102));
        LabelEscalar.setText("Escalamiento");

        LabelRazonX.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        LabelRazonX.setText("Razon X:");

        razonX.setText("0");

        LabelRazonY.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        LabelRazonY.setText("Razon Y:");

        razonY.setText("0");
        razonY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                razonYActionPerformed(evt);
            }
        });

        escalar.setBackground(new java.awt.Color(255, 153, 255));
        escalar.setForeground(new java.awt.Color(102, 0, 51));
        escalar.setText("APLICAR");
        escalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escalarActionPerformed(evt);
            }
        });

        LabelRotar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelRotar.setForeground(new java.awt.Color(102, 0, 0));
        LabelRotar.setText("Rotación");

        LabelAngulo.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        LabelAngulo.setText("Angulo:");

        angulo.setText("0");

        rotar.setBackground(new java.awt.Color(255, 132, 126));
        rotar.setForeground(new java.awt.Color(102, 0, 0));
        rotar.setText("APLICAR");
        rotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotarActionPerformed(evt);
            }
        });

        dibujar.setBackground(new java.awt.Color(102, 255, 255));
        dibujar.setText("Dibujar");
        dibujar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dibujarActionPerformed(evt);
            }
        });

        limpiar.setBackground(new java.awt.Color(204, 255, 255));
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        poligonos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                poligonosItemStateChanged(evt);
            }
        });

        LabelTrasladar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        LabelTrasladar.setForeground(new java.awt.Color(0, 0, 255));
        LabelTrasladar.setText("Traslación");

        LabelDesplazarX.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        LabelDesplazarX.setText("Desplazamiento X:");

        LabelDesplazarY.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        LabelDesplazarY.setText("Desplazamiento Y:");

        trasladar.setBackground(new java.awt.Color(204, 204, 255));
        trasladar.setForeground(new java.awt.Color(0, 0, 153));
        trasladar.setText("APLICAR");
        trasladar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trasladarActionPerformed(evt);
            }
        });

        aumentarX.setText("0");

        aumentarY.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(dibujar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(poligonos, 0, 149, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelTrasladar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(LabelTransformar))
                            .addComponent(LabelEscalar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelRotar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelDesplazarY)
                                        .addGap(18, 18, 18)
                                        .addComponent(aumentarY, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelDesplazarX)
                                        .addGap(18, 18, 18)
                                        .addComponent(aumentarX, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(trasladar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelAngulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rotar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelRazonY)
                                        .addGap(34, 34, 34)
                                        .addComponent(razonY, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LabelRazonX)
                                        .addGap(34, 34, 34)
                                        .addComponent(razonX, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(angulo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(escalar)))
                        .addGap(12, 12, 12)))
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelTransformar)
                        .addGap(41, 41, 41)
                        .addComponent(LabelTrasladar)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelDesplazarX, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aumentarX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelDesplazarY, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aumentarY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(trasladar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addComponent(LabelEscalar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelRazonX, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(razonX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LabelRazonY, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(razonY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(LabelRotar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(escalar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelAngulo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rotar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(dibujar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(poligonos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(763, 763, 763))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
            if (contador == 0) {
                figura.add(new Polygon());
            }
            figura.get(figura.size() - 1).addPoint(evt.getX(), evt.getY());
            contador++;     
    }//GEN-LAST:event_formMouseClicked

        
    
    private void escalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escalarActionPerformed
        double sx = Double.parseDouble(razonX.getText());
        double sy = Double.parseDouble(razonY.getText());
        double[] puntoI = new double[3];
        double[] puntoF = new double[3];
        int index = poligonos.getSelectedIndex();
        
        int[] puntosX = figura.get(index).xpoints;
        int[] puntosY = figura.get(index).ypoints;

        int centroX = figura.get(index).getBounds().x;
        int centroY = figura.get(index).getBounds().y;

        for (int i = 0; i < puntosX.length; i++) {
            int x = puntosX[i] - centroX;
            int y = puntosY[i] - centroY;

            int newX = centroX + (int) (x * sx);
            int newY = centroY + (int) (y * sy);

            puntosX[i] = newX;
            puntosY[i] = newY;
        }
        figura.remove(index);
        figura.add(index,new Polygon(puntosX,puntosY,puntosX.length));        
        repaint();
    }//GEN-LAST:event_escalarActionPerformed

    private void rotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotarActionPerformed
        double alpha = Math.toRadians(Double.parseDouble(angulo.getText()));
        int index = poligonos.getSelectedIndex();
        
        int[] puntosX = figura.get(index).xpoints;
        int[] puntosY = figura.get(index).ypoints;
        
        int centroX = figura.get(index).getBounds().x;
        int centroY = figura.get(index).getBounds().y;
        
        for(int i = 0; i < puntosX.length; i++){
            int x = puntosX[i] - centroX;
            int y = puntosY[i] - centroY;
            
            int newX = centroX + (int) (x * Math.cos(alpha) - y * Math.sin(alpha));
            int newY = centroY + (int) (x * Math.sin(alpha) + y * Math.cos(alpha));
            
            puntosX[i] = newX;
            puntosY[i] = newY;
        }
        figura.remove(index);
        figura.add(index,new Polygon(puntosX,puntosY,puntosX.length));        
        repaint();
    }//GEN-LAST:event_rotarActionPerformed

    private void dibujarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dibujarActionPerformed
        draw(figura.get(figura.size() - 1));
        contador = 0;
        fillcombo();
    }//GEN-LAST:event_dibujarActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        figura.clear();
        contador = 0;
        repaint();
        poligonos.removeAllItems();
    }//GEN-LAST:event_limpiarActionPerformed

    private void poligonosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_poligonosItemStateChanged
        if(poligonos.getItemCount() > 0){
            Graphics g = getGraphics();
            g.drawPolygon(figura.get(poligonos.getSelectedIndex()));
        }
    }//GEN-LAST:event_poligonosItemStateChanged

    private void trasladarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trasladarActionPerformed
        int moveX = Integer.parseInt(aumentarX.getText());
        int moveY = Integer.parseInt(aumentarY.getText());
        
        int index = poligonos.getSelectedIndex();
        
        int[] puntosX = figura.get(index).xpoints;
        int[] puntosY = figura.get(index).ypoints;
        
        int centroX = figura.get(index).getBounds().x;
        int centroY = figura.get(index).getBounds().y;
        
        for(int i = 0; i < puntosX.length; i++){
            int x = puntosX[i] - centroX;
            int y = puntosY[i] - centroY;
            
            int newX = centroX + x - moveX;
            int newY = centroY + y - moveY;
            
            puntosX[i] = newX;
            puntosY[i] = newY;
        }
        figura.remove(index);
        figura.add(index,new Polygon(puntosX,puntosY,puntosX.length));        
        repaint();
    }//GEN-LAST:event_trasladarActionPerformed

    private void razonYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_razonYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_razonYActionPerformed

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for(int i = 0; i < figura.size(); i++){
            g.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
            g.fillPolygon(figura.get(i));
        }
    }
    
    public void draw(Polygon p){
        Graphics g = getGraphics();
        g.setColor(new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256)));
        g.fillPolygon(figura.get(figura.size() - 1));
    }
    
    public void fillcombo() {
        poligonos.removeAllItems();        
        for (int i = 0; i < figura.size(); i++) {
            poligonos.addItem("Poligono " + i + " No. Lados: " + figura.get(i).npoints);
        }        
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new poligonosRET().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAngulo;
    private javax.swing.JLabel LabelDesplazarX;
    private javax.swing.JLabel LabelDesplazarY;
    private javax.swing.JLabel LabelEscalar;
    private javax.swing.JLabel LabelRazonX;
    private javax.swing.JLabel LabelRazonY;
    private javax.swing.JLabel LabelRotar;
    private javax.swing.JLabel LabelTransformar;
    private javax.swing.JLabel LabelTrasladar;
    private javax.swing.JTextField angulo;
    private javax.swing.JTextField aumentarX;
    private javax.swing.JTextField aumentarY;
    private javax.swing.JButton dibujar;
    private javax.swing.JButton escalar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton limpiar;
    private javax.swing.JComboBox<String> poligonos;
    private javax.swing.JTextField razonX;
    private javax.swing.JTextField razonY;
    private javax.swing.JButton rotar;
    private javax.swing.JButton trasladar;
    // End of variables declaration//GEN-END:variables
}
