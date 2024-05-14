import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author damarisguzman
 */
public class vistaGame extends javax.swing.JPanel {
     ImageIcon Imagen[] = new ImageIcon[5];
    int contador = 0;
    public vistaGame() {
        initComponents();
          SetImageLabel(img,"src/pics/Cuadrado fondo enfocado.png", new Dimension (620,300)); 
                    
          for(int a = 0;a < Imagen.length;a++) {
              Imagen[a] = new ImageIcon ("src/pics/Ascensor"+a+".png");
             
          } 
         label.setIcon(Imagen[0]);
       
         
         
          switch(contador) {
            case 1 -> punto0.setIcon(new ImageIcon("src/pics/PuntoCarruselFilled"));
            case 2 -> punto1.setIcon(new ImageIcon("src/pics/PuntoCarruselFilled"));
            case 3 -> punto2.setIcon(new ImageIcon("src/pics/PuntoCarruselFilled"));
            case 4 -> punto3.setIcon(new ImageIcon("src/pics/PuntoCarruselFilled"));
            case 5 -> punto4.setIcon(new ImageIcon("src/pics/PuntoCarruselFilled"));
            default -> {;
             }
                
        }
         
          
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        izqBtn = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        punto0 = new javax.swing.JLabel();
        punto1 = new javax.swing.JLabel();
        punto2 = new javax.swing.JLabel();
        punto4 = new javax.swing.JLabel();
        dereBtn = new javax.swing.JLabel();
        punto3 = new javax.swing.JLabel();
        comenzarBtn = new javax.swing.JLabel();
        barra = new javax.swing.JLabel();
        descripcion1 = new javax.swing.JTextArea();
        descripcion = new javax.swing.JTextArea();

        setMaximumSize(new java.awt.Dimension(1110, 660));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(1110, 660));

        bg.setOpaque(false);
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 510, 340));

        izqBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Flecha izquierda.png"))); // NOI18N
        izqBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        izqBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                izqBtnMouseClicked(evt);
            }
        });
        bg.add(izqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Cuadrado fondo enfocado.png"))); // NOI18N
        bg.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 620, 300));

        punto0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/PuntoCarruselEmpty.png"))); // NOI18N
        bg.add(punto0, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, -1, -1));

        punto1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/PuntoCarruselEmpty.png"))); // NOI18N
        bg.add(punto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, -1, -1));

        punto2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/PuntoCarruselEmpty.png"))); // NOI18N
        bg.add(punto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, -1, -1));

        punto4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/PuntoCarruselEmpty.png"))); // NOI18N
        bg.add(punto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, -1, -1));

        dereBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Flecha derecha.png"))); // NOI18N
        dereBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dereBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dereBtnMouseClicked(evt);
            }
        });
        bg.add(dereBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 200, -1, -1));

        punto3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/PuntoCarruselEmpty.png"))); // NOI18N
        bg.add(punto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, -1, -1));

        comenzarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Comenzar.png"))); // NOI18N
        comenzarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        barra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pics/Barrita aislada descripci¢n.png"))); // NOI18N

        descripcion1.setBackground(new java.awt.Color(18, 38, 69));
        descripcion1.setColumns(20);
        descripcion1.setFont(new java.awt.Font("Raleway", 1, 14)); // NOI18N
        descripcion1.setForeground(new java.awt.Color(255, 255, 255));
        descripcion1.setRows(5);
        descripcion1.setText("Mantenimiento de los equipos y herramientas de extinción de incendios forestales.");
        descripcion1.setBorder(null);
        descripcion1.setOpaque(false);

        descripcion.setBackground(new java.awt.Color(18, 38, 69));
        descripcion.setColumns(20);
        descripcion.setFont(new java.awt.Font("Raleway", 1, 12)); // NOI18N
        descripcion.setForeground(new java.awt.Color(255, 255, 255));
        descripcion.setRows(5);
        descripcion.setText("Descripción: \nEn un campo de prácticas sumido en el desorden y la confusión tienes que encontrar tienes que encontrar \ny colocar las partes de los EPIs utilizados en la extinción de incendios forestales.\n\nGrado, asignatura y unidad:\n- Coordinación de emergencias y protección civil.\n- Gestión de recursos de emergencias y protección civil\n- Planificación y supervisión del mantenimiento de equipos, medios técnicos e instalaciones.\n\nDuración aproximada:  10 minutos.\n\nNivel de dificultad:  Fácil\n");
        descripcion.setBorder(null);
        descripcion.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(barra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                                .addComponent(comenzarBtn)))))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(barra)
                            .addComponent(descripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(comenzarBtn)
                        .addGap(28, 28, 28)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dereBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dereBtnMouseClicked
      if( contador == 4) {
            contador = 0;
        }else {
        contador++;
        label.setIcon(Imagen[contador]);
      }
    }//GEN-LAST:event_dereBtnMouseClicked
     
    private void izqBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_izqBtnMouseClicked
     if( contador == 0) {
            contador = 5;
        }else {
        contador--;
        label.setIcon(Imagen[contador]);
     }
    }//GEN-LAST:event_izqBtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barra;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel comenzarBtn;
    private javax.swing.JLabel dereBtn;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JTextArea descripcion1;
    private javax.swing.JLabel img;
    private javax.swing.JLabel izqBtn;
    private javax.swing.JLabel label;
    private javax.swing.JLabel punto0;
    private javax.swing.JLabel punto1;
    private javax.swing.JLabel punto2;
    private javax.swing.JLabel punto3;
    private javax.swing.JLabel punto4;
    // End of variables declaration//GEN-END:variables

    private void SetImageLabel(JLabel labelName, String root, Dimension dimension){
        ImageIcon image = new ImageIcon(root);
        ImageIcon icon = new ImageIcon( image.getImage().getScaledInstance(dimension.width, dimension.height, Image.SCALE_SMOOTH));
        labelName.setIcon(icon);
        labelName.repaint();
    }
    
    
}
