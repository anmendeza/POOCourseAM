package com.ucreativa.vacunacion.ui;

import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.services.BitacoraService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrontEnd extends JFrame {     //Jframe es una libreria de Java que se utilizara para agregar el UI de este programa

    public FrontEnd(String titulo){
        super(titulo);
    }

    public void build(){
        this.construccionPantalla();
        super.setVisible(true);
        this.crearComponentes();
    }

    public void construccionPantalla(){
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 200);
        super.setLayout(new GridLayout(5,2));
    }

    private void agregarComponente(Component componente){
        super.getContentPane().add(componente);

    }
    private void crearComponentes(){
        // Crear Labels
        JLabel lblNombre = new JLabel("Nombre");
        JLabel lblCedula = new JLabel("Cedula");
        JLabel lblEdad = new JLabel("Edad");
        JLabel lblRiesgo = new JLabel("Riesgo");
        JLabel lblIsAmigo = new JLabel("Es amigo?");
        JLabel lblRelacion = new JLabel("Relacion ");
        JLabel lblFacebook = new JLabel("Facebook");
        JLabel lblParentesco = new JLabel("Parentesco");
        JLabel lblMarca = new JLabel("Marca");
        JLabel lblLugar = new JLabel("Lugar de vacunacion");

        //Crea textos
        JTextField txtNombre = new JTextField();
        JTextField txtCedula = new JTextField();
        JTextField txtEdad = new JTextField();
        JTextField txtRelacion = new JTextField();
        JTextField txtFacebook = new JTextField();
        JTextField txtParentesco = new JTextField();
        JTextField txtMarca = new JTextField();
        JTextField txtLugar = new JTextField();

        JCheckBox txtRiesgo = new JCheckBox();
        JCheckBox txtIsAmigo = new JCheckBox();
        txtIsAmigo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblParentesco.setVisible(!txtIsAmigo.isVisible());
                txtParentesco.setVisible(!txtIsAmigo.isVisible());
                lblRelacion.setVisible(txtIsAmigo.isVisible());
                lblFacebook.setVisible(txtIsAmigo.isVisible());
                txtFacebook.setVisible(txtIsAmigo.isVisible());
            }
        });

        JButton salvar = new JButton("Salvar");
        salvar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BitacoraService service = new BitacoraService(new FileRepository());
                service.save(
                        txtNombre.getText(),
                        txtCedula.getText(),
                        txtEdad.getText(),
                        txtRiesgo.isSelected(),
                        txtIsAmigo.isSelected(),
                        txtRelacion.getText(),
                        txtFacebook.getText(),
                        txtParentesco.getText(),
                        txtMarca.getText(),
                        txtLugar.getText());

                txtNombre.setText("");
                txtCedula.setText("");
                txtEdad.setText("");
                txtRiesgo.setText("");
                txtIsAmigo.setText("");
                txtRelacion.setText("");
                txtFacebook.setText("");
                txtParentesco.setText("");
                txtMarca.setText("");
                txtLugar.setText("");

                String reporte = String.join("\n", service.get());
                JOptionPane.showMessageDialog(((JButton)e.getSource()).getParent(),reporte);
            }
        });

        //Agrega textos
        this.agregarComponente(lblNombre);
        this.agregarComponente(txtNombre);
        this.agregarComponente(lblCedula);
        this.agregarComponente(txtCedula);
        this.agregarComponente(lblEdad);
        this.agregarComponente(txtEdad);
        this.agregarComponente(lblRiesgo);
        this.agregarComponente(txtRiesgo);
        this.agregarComponente(lblIsAmigo);
        this.agregarComponente(txtIsAmigo);
        this.agregarComponente(lblRelacion);
        this.agregarComponente(txtRelacion);
        this.agregarComponente(lblFacebook);
        this.agregarComponente(txtFacebook);
        this.agregarComponente(lblParentesco);
        this.agregarComponente(txtParentesco);
        this.agregarComponente(lblMarca);
        this.agregarComponente(txtMarca);
        this.agregarComponente(lblLugar);
        this.agregarComponente(txtLugar);
        this.agregarComponente(salvar);
    }
}
