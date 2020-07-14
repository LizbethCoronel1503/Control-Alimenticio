import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.sound.midi.*;
import java.util.*;

class Principal extends JFrame implements ActionListener{

	JLabel etiqueta1;
	JLabel etiqueta2;
	JLabel etiqueta3;
	JLabel etiqueta4;
	JLabel etiqueta5;
	JLabel etiqueta6;
	JLabel etiqueta7;
	JLabel etiqueta8;

	

	 /* declaración de objetos */
	 JPanel panel;
	 //texto para datos
	 JLabel lblTexto1;
	 JLabel lblTexto2;
	 JLabel lblTexto3;
	 JLabel lblTexto4;
	 JLabel lblTexto5;
	 //imc
	 JLabel lblTexto6;
	 JLabel lblTexto7;
	 JLabel lblTexto8;	
	//botones
	 JButton btnBotonImc;
	 JButton btnBoton2;

	// JLabel lblTextoP;
	 JLabel lblTextoKcal;
	 JLabel lblTextoagua;

	 
	 JTextField txtCampoTexto2;
	 //imc
	 JTextField txtCampoTexto6;
	 JTextField txtCampoTexto7;
	// JTextField txtCampoTextoKcal;


	 JTextArea txtArea2;
	 ArrayList <String> contenido_1;

	 //ventana emergente
	JMenuBar menuBar;
	JMenu menu;
	JMenuItem menuItem;

	public Principal()

	{
	


	//etiquetas

	 JLabel etiqueta1 = new JLabel();
	 etiqueta1.setText("DATOS");
	 etiqueta1.setBounds(300, 0, 300, 80); //(x, y, w, h)

	 etiqueta1.setForeground(Color.BLACK);
	 etiqueta1.setFont(new Font("copper black", 0, 40));


	 JLabel etiqueta2 = new JLabel();
	 etiqueta2.setText("*Nota: Escribir  .txt  despues de su nombre");
	 etiqueta2.setBounds(20, 350, 700, 80); //(x, y, w, h)
	 etiqueta2.setForeground(Color.RED);
	 etiqueta2.setFont(new Font("copper black", 0, 15));

	 JLabel etiqueta3 = new JLabel();
	 etiqueta3.setText("*Consumir: ");
	 etiqueta3.setBounds(445, 215, 700, 80); //(x, y, w, h)
	 etiqueta3.setForeground(Color.GREEN);
	 etiqueta3.setFont(new Font("copper black", 0, 12));

	 JLabel etiqueta6 = new JLabel();
	 etiqueta6.setText(" al dia ");
	 etiqueta6.setBounds(560, 217, 700, 80); //(x, y, w, h)
	 etiqueta6.setForeground(Color.GREEN);
	 etiqueta6.setFont(new Font("copper black", 0, 12));


	 etiqueta3.setForeground(Color.GREEN);
	 etiqueta3.setFont(new Font("copper black", 0, 12));


	  JLabel etiqueta4 = new JLabel();
	 etiqueta4.setText("*Consumir: ");
	 etiqueta4.setBounds(445, 237, 700, 80); //(x, y, w, h)

	 etiqueta4.setForeground(Color.BLUE);
	 etiqueta4.setFont(new Font("copper black", 0, 12));


	 JLabel etiqueta5 = new JLabel();
	 etiqueta5.setText("L al dia ");
	 etiqueta5.setBounds(547, 237, 700, 80); //(x, y, w, h)

	 etiqueta5.setForeground(Color.BLUE);
	 etiqueta5.setFont(new Font("copper black", 0, 12));



	 JLabel etiqueta7 = new JLabel();
	 etiqueta7.setText("Kg");
	 etiqueta7.setBounds(550, 120,100,20); //(x, y, w, h)

	 etiqueta7.setForeground(Color.BLACK);
	 etiqueta7.setFont(new Font("copper black", 0, 12));

	 JLabel etiqueta8 = new JLabel();
	 etiqueta8.setText("m");
	 etiqueta8.setBounds(550, 165,100,20); //(x, y, w, h)

	 etiqueta8.setForeground(Color.BLACK);
	 etiqueta8.setFont(new Font("copper black", 0, 12));

	   /* creación de objetos y valores iniciales */
	  panel = new JPanel();
	  panel.setLayout(null);


	  lblTexto1 = new JLabel("Nombre: ");
	  lblTexto1.setBounds(155, 90, 200, 10); //(x, y, w, h)

	  lblTexto2 = new JLabel("Fecha: ");
	  lblTexto2.setBounds(110, 152, 200, 10); //(x, y, w, h)

	  lblTexto3 = new JLabel("Edad: ");
	  lblTexto3.setBounds(115, 168, 200, 10); //(x, y, w, h)

	  lblTexto4 = new JLabel("Genero: ");
	  lblTexto4.setBounds(100, 184, 200, 10); //(x, y, w, h)

	  lblTexto5 = new JLabel("Alergias: ");
	  lblTexto5.setBounds(95, 200, 200, 15); //(x, y, w, h)

	  //llenado de datos
	  btnBoton2 = new JButton("Guardar");
	  btnBoton2.setBounds(155, 230, 100, 30);
	  btnBoton2.setBackground(java.awt.Color.pink);
	 //guardar
	  txtCampoTexto2 = new JTextField();
	  txtCampoTexto2.setBounds(155, 110, 100, 30);
	 //escribir
	  txtArea2 = new JTextArea();
	  txtArea2.setBounds(155,150,100,70);
	  contenido_1 = new ArrayList<String>();


	  lblTexto6 = new JLabel("Imc");
	  lblTexto6.setBounds(515, 200,100,10);

	 /* lblTextoP = new JLabel("Estado");
	  lblTextoP.setBounds(515, 225,100,10);*/

	  lblTextoKcal = new JLabel("Kcal");
	  lblTextoKcal.setBounds(515, 250,100,15);

	  lblTextoagua = new JLabel("Agua");
	  lblTextoagua.setBounds(515, 270,100,15);



	  btnBotonImc = new JButton("Calcular Imc");
	  btnBotonImc.setBounds(390,190,110,30);
	  btnBotonImc.setBackground(java.awt.Color.yellow);
	  //peso
	  txtCampoTexto6 = new JTextField();
	  txtCampoTexto6.setBounds(500,115,50,30);

	  lblTexto7 = new JLabel("Peso: ");
	  lblTexto7.setBounds(460, 125,100,10);
	  //altura
	  txtCampoTexto7 = new JTextField();
	  txtCampoTexto7.setBounds(500,155,50,30);

	  lblTexto8 = new JLabel("Altura: ");
	  lblTexto8.setBounds(455, 165,100,10);

	 

		menuBar = new JMenuBar();
		menu = new JMenu("Dia");
		menuItem = new JMenuItem("Alimentacion por Dias");


		menu.add(menuItem);
		menuBar.add(menu);

		this.setJMenuBar(menuBar);


		//etiquetas
	  panel.add(etiqueta1);
	  panel.add(etiqueta2);	
	  panel.add(etiqueta3);
	  panel.add(etiqueta4);
	  panel.add(etiqueta5);
	  panel.add(etiqueta6);
	  panel.add(etiqueta7);
	  panel.add(etiqueta8);

	


	  /* agregando objetos al panel */
	  panel.add(lblTexto1);
	  panel.add(lblTexto2);
	  panel.add(lblTexto3);
	  panel.add(lblTexto4);
	  panel.add(lblTexto5);

	  //panel.add(lblTextoP);
	  panel.add(lblTextoKcal);
	  panel.add(lblTextoagua);


	

	  //guardar
	  panel.add(btnBoton2);
	  panel.add(txtCampoTexto2);
	  panel.add(txtArea2);

	  //imc
	  panel.add(lblTexto6);
	  panel.add(lblTexto7);
	  panel.add(lblTexto8);
	  panel.add(btnBotonImc);
	  panel.add(txtCampoTexto6);
	  panel.add(txtCampoTexto7);
	 // panel.add(txtCampoTextoKcal);
	  		  
	  /* agregar panel a la ventana y valores iniciales de la ventana */
	  this.add(panel);
	  this.setTitle("Introduccion de datos");
	  this.setSize(800, 500);
	  this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	  this.setVisible(true);
	  
	  this.setLocationRelativeTo(null);

	  
	  btnBoton2.addActionListener(this);
	  menuItem.addActionListener(this);
  	  btnBotonImc.addActionListener(this);
			
	}

	//imc
	 public void actionPerformed(ActionEvent event)
 {
	 	if(event.getSource() == this.btnBotonImc)
	  {
	   String txt6 = txtCampoTexto6.getText();
	   double txt_double6 = Double.parseDouble(txt6);
	   String txt7 = txtCampoTexto7.getText();
	   double txt_double7 = Double.parseDouble(txt7);
	   double imc = imc(txt_double6,txt_double7);
	   String imc_string = Double.toString(imc);
	   
	   cambiarTextoLblTexto6(imc_string);
	  }

	  	if(event.getSource() == this.btnBotonImc)
	  {
	   String txt6 = txtCampoTexto6.getText();
	   double txt_double6 = Double.parseDouble(txt6);
	  
	   double kcal = kcal(txt_double6);
	   String kcal_string = Double.toString(kcal);
	   
	   cambiarTextoLblTextoKcal(kcal_string);
	  }

	  if(event.getSource() == this.btnBotonImc)
	  {
	   String txt6 = txtCampoTexto6.getText();
	   double txt_double6 = Double.parseDouble(txt6);
	  
	   double agua = agua(txt_double6);
	   String agua_string = Double.toString(agua);
	   
	   cambiarTextoLblTextoagua(agua_string);
	  }

	  /*	if(event.getSource() == this.btnBotonImc)
	  {
	  	String txt6 = lblTexto6.getText();
	   double txt_double6 = Double.parseDouble(txt6);
	  
	   double estadoP = estadoP(txt_double6);
	   String p_string = Double.toString(estadoP);

	   cambiarTextoLblTextoP(p_string);

	  }*/


	   
	  	//guardar datos
		  else if (event.getSource() == this.btnBoton2) 
		  {
		   String contenido_a_guardar;
		   contenido_a_guardar = txtArea2.getText();
		   String nombre_archivo_guardar;
		   nombre_archivo_guardar = txtCampoTexto2.getText();
		   Archivo_1.guardarTodo(contenido_a_guardar,nombre_archivo_guardar);
		  }

				
				else if(event.getSource() == this.menuItem)
		{
			PlanAlimenticio plan = new PlanAlimenticio();
		}
 }

 	//resultado del imc
	 public void cambiarTextoLblTexto6(String cadena)

	{
 		this.lblTexto6.setText(cadena);
   	}

   	 public void cambiarTextoLblTextoKcal(String cadena)

	{
 		this.lblTextoKcal.setText(cadena);
   	}

   	public void cambiarTextoLblTextoagua(String cadena)

	{
 		this.lblTextoagua.setText(cadena);
   	}

  /* 	public void cambiarTextoLblTextoP(String cadena)

	{
 		this.lblTextoP.setText(cadena);
   	}*/


   	//calcular imc
   	public double imc (Double p, Double h)

	 {
	  double imc = 0;
	  imc = p/(h*h);
	  return imc;
	 }
	 

	 public double kcal (Double p)

	 {
	  double kcal = 0;
	  double generoF = 0.9;
	  double generoM = 1;

	  kcal = p*24*generoF;
	  return kcal;
	 }


	 public double agua (Double p)

	 {
	  double agua = 0;
	  

	  agua = (p*35)/1000 ;
	  return agua;
	 }





	/* public double estadoP (Double imc)

	 {
	 	double pB = 0;

	 	if(imc <= 18.5)

	 		pB =1*-1;


	 	else if(imc > 18.5 || imc <= 24.9)

	 		pB =1*2;


	 	else if(imc >24.5 || imc <=29.9 )

	 		pB =1*3;


	 	
	 
	 	else if(imc >29.9 || imc <=34.5)

	 		pB =1*4;


	 	
	 	else if(imc >34.5 || imc <=39.9 )

	 		pB =1*5;


	 	
	 	else if(imc >40)

	 		pB =1*6;;


	 	return pB;
	 }*/





}