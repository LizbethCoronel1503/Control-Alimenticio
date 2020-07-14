import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.io.*;
class PlanAlimenticio extends JFrame implements ActionListener{
  
   JLabel etiqueta1;
   JLabel etiqueta2;
   JLabel etiqueta3;

   JPanel panel;
   JLabel lblTexto1;
   JLabel lblTexto2;
   JButton btnBoton1;


   JTextField txtCampoTexto1;
   JTextField txtCampoTexto2;

   JTextArea txaArea1;

   ArrayList<String> contenido_1;

  JMenuBar menuBar;
  JMenu menu;
  JMenuItem menuItem;

 public PlanAlimenticio ()
 {
  //etiquetas
   JLabel etiqueta1 = new JLabel();
   etiqueta1.setText("Alimentacion cotidiana");
   etiqueta1.setBounds(20, 0, 400, 80); //(x, y, w, h)

   etiqueta1.setForeground(Color.BLACK);
   etiqueta1.setFont(new Font("copper black", 0, 40));


   JLabel etiqueta2 = new JLabel();
   etiqueta2.setText("**Nota: Escribir  .txt  despues del dia");
   etiqueta2.setBounds(20, 350, 700, 80); //(x, y, w, h)
   etiqueta2.setForeground(Color.RED);
   etiqueta2.setFont(new Font("copper black", 0, 15));

   JLabel etiqueta3 = new JLabel();
   etiqueta3.setText(" *Escribe tus Kcal calculadas y dia que deseas consltar");
   etiqueta3.setBounds(20, 330, 700, 80); //(x, y, w, h)
   etiqueta3.setForeground(Color.BLUE);
   etiqueta3.setFont(new Font("copper black", 0, 15));




  //
   panel = new JPanel();
   panel.setLayout(null);

   lblTexto1 = new JLabel ("Calorias: ");
   lblTexto1.setBounds(145, 170, 200, 10); //(x, y, w, h)

   lblTexto2 = new JLabel ("Dia: ");
   lblTexto2.setBounds(170, 210, 200, 10); //(x, y, w, h)


   btnBoton1 = new JButton("Buscar");
   btnBoton1.setBounds(200, 240, 100, 30);
   btnBoton1.setBackground(java.awt.Color.yellow);

  

   txtCampoTexto1 = new JTextField();
   txtCampoTexto1.setBounds(200, 200, 100, 30);

   txtCampoTexto2 = new JTextField();
   txtCampoTexto2.setBounds(200, 160, 100, 30);

 

   txaArea1 = new JTextArea();
   txaArea1.setBounds(450, 20, 300, 380);
 
   contenido_1 = new ArrayList<String>();
   

   menuBar = new JMenuBar();
   menu = new JMenu("Contador Calorico");
   menuItem = new JMenuItem("Kcal por Alimento");

   menu.add(menuItem);
   menuBar.add(menu);

   this.setJMenuBar(menuBar);

   panel.add(etiqueta1);
   panel.add(etiqueta2);
   panel.add(etiqueta3);

   panel.add(lblTexto1);
   panel.add(lblTexto2);
   panel.add(btnBoton1);

   panel.add(txtCampoTexto1);
   panel.add(txtCampoTexto2);
   
   
   panel.add(txaArea1);

  
   this.add(panel);
   this.setTitle("Alimentacion");
   this.setSize(800, 500);
   this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
   this.setVisible(true);
   this.setLocationRelativeTo(null);

   btnBoton1.addActionListener(this);
   menuItem.addActionListener(this);
   
 }


 public void actionPerformed(ActionEvent event)
 {
   if(event.getSource() == this.btnBoton1)
   {


     String nombre_archivo_leer;
     nombre_archivo_leer = txtCampoTexto1.getText();
     contenido_1 = Archivo_1.leerTodo(nombre_archivo_leer);
     String cadena = "";
     for (int i=0; i<contenido_1.size(); i++) 
     {
      cadena = cadena + contenido_1.get(i) + "\n";
     }
     
     txaArea1.setText(cadena);
     txaArea1.setEditable(false);
    }
   

       else if(event.getSource() == this.menuItem)
    {
      Personalizada per = new Personalizada();
    }
  
 }

}


