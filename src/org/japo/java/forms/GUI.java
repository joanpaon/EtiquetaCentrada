/*
 * Copyright 2017 José A. Pacheco Ondoño - joanpaon@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.forms;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author José A. Pacheco Ondoño - joanpaon@gmail.com
 */
public class GUI extends JFrame {
    // Tamaño de la ventana
    public static final int VENTANA_ANC = 500;
    public static final int VENTANA_ALT = 400;

    public GUI() {
        // Inicialización PREVIA
        beforeInit();

        // Creación del interfaz
        initComponents();

        // Inicialización POSTERIOR
        afterInit();
    }

    // Construcción del IGU
    private void initComponents() {
        // Fuente de la etiqueta
        Font f = new Font("Calibri", Font.BOLD, 80);

        // Panel Principal
        JPanel pnlPpal = new JPanel();
        pnlPpal.setLayout(new BorderLayout());
        
        // Etiqueta del rótulo
        JLabel lblRotulo = new JLabel("EN VENTA");
        lblRotulo.setHorizontalAlignment(JLabel.CENTER);
        lblRotulo.setOpaque(true);
        lblRotulo.setBackground(Color.BLUE);
        lblRotulo.setForeground(Color.WHITE);
        lblRotulo.setFont(f);
        pnlPpal.add(lblRotulo, BorderLayout.CENTER);
        
        // Ventana principal
        setTitle("Etiqueta Centrada");
        setContentPane(pnlPpal);
//        setResizable(false);
        setSize(VENTANA_ANC, VENTANA_ALT);
//        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }

    // Inicialización antes del IGU
    private void beforeInit() {

    }

    // Inicialización después del IGU
    private void afterInit() {

    }

}
