import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.sound.midi.*;
import java.util.*;

public class Pan extends JFrame implements ActionListener {

  private JPanel panel;
  private JLabel saludo;
  private JTextField cajaTexto;
  private JButton boton1;
  private JButton boton2;
  private JButton boton3;
  private JButton boton4;
  private JButton boton5;
  private JButton boton6;
  private JButton boton7;
  private JButton boton8;
  private JButton boton9;
  private JButton boton10;
  private JButton boton11;
  private JButton boton12;
  private JButton boton13;
  private JButton boton14;
  private JButton boton15;
  private JButton boton16;
  private JButton boton17;
  private JButton boton18;
  private JButton boton19;
  private JButton boton20;
  
  private JTextArea areaTexto;
    JLabel etiqueta1;

  JMenuBar menuBar;
  JMenu menu;
  JMenuItem menuItem;
  JMenuItem frutaItem;
  JMenuItem carneItem;
  JMenuItem lacteosItem;
  JMenuItem pastaItem;
  JMenuItem panItem;
  JMenuItem alcoholItem;
  JMenuItem cRapidaItem;


  JLabel imagen1;


  public Pan()
  {

    //fondo
    ImageIcon imagen = new ImageIcon("Harinas.jpg");
    JLabel imagen1 = new JLabel();
    imagen1.setBounds(0, 0, 1000, 750);
    imagen1.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(1000,750,Image.SCALE_SMOOTH)));
    
    //
    panel = new JPanel();
    panel.setLayout(null);


    areaTexto = new JTextArea();
    areaTexto.setBounds(700,50,150,500);


    JLabel etiqueta1 = new JLabel();
    etiqueta1.setText("** kcal por 100 g");
    etiqueta1.setBounds(700, 525, 700, 80); //(x, y, w, h)
    etiqueta1.setForeground(Color.BLACK);
    etiqueta1.setFont(new Font("copper black", 1, 20));



    boton1 = new JButton("Baguette");
    boton1.setBounds(100, 50, 150, 40);
    boton1.setFont(new Font("arial", 0,15));
    panel.add(boton1);


    boton2 = new JButton("Chapta");
    boton2.setBounds(300, 50, 150, 40);
    boton2.setFont(new Font("arial", 0,15));
    panel.add(boton2);

    boton3 = new JButton("Bretzel");
    boton3.setBounds(100, 100, 150, 40);
    boton3.setFont(new Font("arial", 0,15));
    panel.add(boton3);


    boton4 = new JButton("Cruasan");
    boton4.setBounds(300, 100, 150, 40);
    boton4.setFont(new Font("arial", 0,15));
    panel.add(boton4);

    boton5 = new JButton("Pan Pita");
    boton5.setBounds(100, 150, 150, 40);
    boton5.setFont(new Font("arial", 0,15));
    panel.add(boton5);


    boton6 = new JButton("Rollo Canela");
    boton6.setBounds(300, 150, 150, 40);
    boton6.setFont(new Font("arial", 0,15));
    panel.add(boton6);

    boton7 = new JButton("Pan Integral");
    boton7.setBounds(100, 200, 150, 40);
    boton7.setFont(new Font("arial", 0,15));
    panel.add(boton7);


    boton8 = new JButton("Tortilla ");
    boton8.setBounds(300, 200, 150, 40);
    boton8.setFont(new Font("arial", 0,15));
    panel.add(boton8);

    


    eventoOyenteDeRaton1();
    eventoOyenteDeRaton2();
    eventoOyenteDeRaton3();
    eventoOyenteDeRaton4();
    eventoOyenteDeRaton5();
    eventoOyenteDeRaton6();
    eventoOyenteDeRaton7();
    eventoOyenteDeRaton8();
    


    panel.add(etiqueta1);
    panel.add(imagen1);
    panel.add(areaTexto);


     menuBar = new JMenuBar();
     menu = new JMenu("Contador Calorico");


     menuItem = new JMenuItem("Verduras");
     frutaItem = new JMenuItem("Frutas");
     carneItem = new JMenuItem("Carnes y Pescados");
     lacteosItem = new JMenuItem("Lacteos");
     pastaItem= new JMenuItem("Pastas");
     panItem = new JMenuItem("Harinas(pan)");
     alcoholItem = new JMenuItem("Bebidas Alcoholicas");
     cRapidaItem = new JMenuItem("Comida Rapida");


     menu.add(menuItem);
     menu.add(frutaItem);
     menu.add(carneItem);
     menu.add(lacteosItem);
     menu.add(pastaItem);
     menu.add(panItem);
     menu.add(alcoholItem);
     menu.add(cRapidaItem);
     
     menuBar.add(menu);



      this.setJMenuBar(menuBar);
     



    this.add(panel);
    this.setTitle("Harinas(pan)");
    this.setSize(1000, 750);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    this.setVisible(true);
    this.setLocationRelativeTo(null);

  

  menuItem.addActionListener(this);
  frutaItem.addActionListener(this);
  carneItem.addActionListener(this);
  lacteosItem.addActionListener(this);
  pastaItem.addActionListener(this);
  alcoholItem.addActionListener(this);
  panItem.addActionListener(this);
  cRapidaItem.addActionListener(this);


   
   }
	


  private void eventoOyenteDeRaton1(){
    MouseListener eventoOyenteDeRaton1 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\n Baguette: 248Kcal\n");
    } 
    @Override
    public void mousePressed(MouseEvent me){} 

    @Override
    public void mouseReleased(MouseEvent me){} 

    @Override
    public void mouseExited(MouseEvent me){} 

    @Override
    public void mouseEntered(MouseEvent me){}};

    boton1.addMouseListener(eventoOyenteDeRaton1);}



  private void eventoOyenteDeRaton2(){
    MouseListener eventoOyenteDeRaton2 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\n Chapta: 333Kcal\n");
    } 
    @Override
    public void mousePressed(MouseEvent me){} 
    @Override
    public void mouseReleased(MouseEvent me){} 
    @Override
    public void mouseExited(MouseEvent me){} 
    @Override
    public void mouseEntered(MouseEvent me){}
  };
    boton2.addMouseListener(eventoOyenteDeRaton2);}


    private void eventoOyenteDeRaton3(){
    MouseListener eventoOyenteDeRaton3 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\n Bretzel: 217Kcal\n");
    } 
    @Override
    public void mousePressed(MouseEvent me){} 

    @Override
    public void mouseReleased(MouseEvent me){} 

    @Override
    public void mouseExited(MouseEvent me){} 

    @Override
    public void mouseEntered(MouseEvent me){}};

    boton3.addMouseListener(eventoOyenteDeRaton3);}


    private void eventoOyenteDeRaton4(){
    MouseListener eventoOyenteDeRaton4 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\n Cruasan: 393Kcal\n");
    } 
    @Override
    public void mousePressed(MouseEvent me){} 

    @Override
    public void mouseReleased(MouseEvent me){} 

    @Override
    public void mouseExited(MouseEvent me){} 

    @Override
    public void mouseEntered(MouseEvent me){}};

    boton4.addMouseListener(eventoOyenteDeRaton4);}


    private void eventoOyenteDeRaton5(){
    MouseListener eventoOyenteDeRaton5 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\n Pan Pita: 290Kcal\n");
    } 
    @Override
    public void mousePressed(MouseEvent me){} 

    @Override
    public void mouseReleased(MouseEvent me){} 

    @Override
    public void mouseExited(MouseEvent me){} 

    @Override
    public void mouseEntered(MouseEvent me){}};

    boton5.addMouseListener(eventoOyenteDeRaton5);}



    private void eventoOyenteDeRaton6(){
    MouseListener eventoOyenteDeRaton6 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\n Rollo Canela: 384Kcal\n");
    } 
    @Override
    public void mousePressed(MouseEvent me){} 

    @Override
    public void mouseReleased(MouseEvent me){} 

    @Override
    public void mouseExited(MouseEvent me){} 

    @Override
    public void mouseEntered(MouseEvent me){}};

    boton6.addMouseListener(eventoOyenteDeRaton6);}



    private void eventoOyenteDeRaton7(){
    MouseListener eventoOyenteDeRaton7 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\n Integral: 244Kcal\n");
    } 
    @Override
    public void mousePressed(MouseEvent me){} 

    @Override
    public void mouseReleased(MouseEvent me){} 

    @Override
    public void mouseExited(MouseEvent me){} 

    @Override
    public void mouseEntered(MouseEvent me){}};

    boton7.addMouseListener(eventoOyenteDeRaton7);}



    private void eventoOyenteDeRaton8(){
    MouseListener eventoOyenteDeRaton8 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\n Tortilla: 170Kcal\n");
    } 
    @Override
    public void mousePressed(MouseEvent me){} 

    @Override
    public void mouseReleased(MouseEvent me){} 

    @Override
    public void mouseExited(MouseEvent me){} 

    @Override
    public void mouseEntered(MouseEvent me){}};

    boton8.addMouseListener(eventoOyenteDeRaton8);}




 public void actionPerformed(ActionEvent event)
 {
   
     if(event.getSource() == this.menuItem)
    {
      Personalizada per = new Personalizada();
    }



         else if(event.getSource() == this.frutaItem)
    {
      Frutas f = new Frutas();
    }
   

      else if(event.getSource() == this.carneItem)
    {
      Carnes c = new Carnes();
    }

         else if(event.getSource() == this.lacteosItem)
    {
      Lacteos l  = new Lacteos();
    }


         else if(event.getSource() == this.pastaItem)
    {
      Pasta past = new Pasta();
    }

         else if(event.getSource() == this.panItem)
    {
      Pan pa = new Pan();
    }

         else if(event.getSource() == this.alcoholItem)
    {
      Alcohol al = new Alcohol();
    }


         else if(event.getSource() == this.cRapidaItem)
    {
      ComidaRapida cR = new ComidaRapida();
    }


 
  
 }

}