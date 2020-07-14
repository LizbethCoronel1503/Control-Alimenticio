import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.sound.midi.*;
import java.util.*;

public class Carnes extends JFrame implements ActionListener {

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

  public Carnes()
  {
      //fondo
    ImageIcon imagen = new ImageIcon("Carnes.jpg");
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



    boton1 = new JButton("Salchicha");
    boton1.setBounds(100, 50, 150, 40);
    boton1.setFont(new Font("arial", 0,15));
    panel.add(boton1);


    boton2 = new JButton("Pato");
    boton2.setBounds(300, 50, 150, 40);
    boton2.setFont(new Font("arial", 0,15));
    panel.add(boton2);

    boton3 = new JButton("Ciervo");
    boton3.setBounds(100, 100, 150, 40);
    boton3.setFont(new Font("arial", 0,15));
    panel.add(boton3);


    boton4 = new JButton("Pechuga Pollo");
    boton4.setBounds(300, 100, 150, 40);
    boton4.setFont(new Font("arial", 0,15));
    panel.add(boton4);

    boton5 = new JButton("Ternera");
    boton5.setBounds(100, 150, 150, 40);
    boton5.setFont(new Font("arial", 0,15));
    panel.add(boton5);


    boton6 = new JButton("Cordero");
    boton6.setBounds(300, 150, 150, 40);
    boton6.setFont(new Font("arial", 0,15));
    panel.add(boton6);

    boton7 = new JButton("Pechuga Pavo");
    boton7.setBounds(100, 200, 150, 40);
    boton7.setFont(new Font("arial", 0,15));
    panel.add(boton7);


    boton8 = new JButton("Salami");
    boton8.setBounds(300, 200, 150, 40);
    boton8.setFont(new Font("arial", 0,15));
    panel.add(boton8);

    boton9 = new JButton("Jamon");
    boton9.setBounds(100, 250, 150, 40);
    boton9.setFont(new Font("arial", 0,15));
    panel.add(boton9);


    boton10 = new JButton("Tocino");
    boton10.setBounds(300, 250, 150, 40);
    boton10.setFont(new Font("arial", 0,15));
    panel.add(boton10);

    boton11 = new JButton("Grasa Puerco");
    boton11.setBounds(100, 300, 150, 40);
    boton11.setFont(new Font("arial", 0,15));
    panel.add(boton11);


    boton12 = new JButton("Filete Vacuno");
    boton12.setBounds(300, 300, 150, 40);
    boton12.setFont(new Font("arial", 0,15));
    panel.add(boton12);


    boton13 = new JButton("Filete Cerdo");
    boton13.setBounds(100, 350, 150, 40);
    boton13.setFont(new Font("arial", 0,15));
    panel.add(boton13);


    boton14 = new JButton("Trucha");
    boton14.setBounds(300, 350, 150, 40);
    boton14.setFont(new Font("arial", 0,15));
    panel.add(boton14);

    boton15 = new JButton("Salmon");
    boton15.setBounds(100, 400, 150, 40);
    boton15.setFont(new Font("arial", 0,15));
    panel.add(boton15);


    boton16 = new JButton("Arenque");
    boton16.setBounds(300, 400, 150, 40);
    boton16.setFont(new Font("arial", 0,15));
    panel.add(boton16);

    boton17 = new JButton("Atun");
    boton17.setBounds(100, 450, 150, 40);
    boton17.setFont(new Font("arial", 0,15));
    panel.add(boton17);


    boton18 = new JButton("Huevo");
    boton18.setBounds(300, 450, 150, 40);
    boton18.setFont(new Font("arial", 0,15));
    panel.add(boton18);

    boton19 = new JButton("Abadejo");
    boton19.setBounds(100, 500, 150, 40);
    boton19.setFont(new Font("arial", 0,15));
    panel.add(boton19);


    boton20 = new JButton("Escalope");
    boton20.setBounds(300, 500, 150, 40);
    boton20.setFont(new Font("arial", 0,15));
    panel.add(boton20);


    eventoOyenteDeRaton1();
    eventoOyenteDeRaton2();
    eventoOyenteDeRaton3();
    eventoOyenteDeRaton4();
    eventoOyenteDeRaton5();
    eventoOyenteDeRaton6();
    eventoOyenteDeRaton7();
    eventoOyenteDeRaton8();
    eventoOyenteDeRaton9();
    eventoOyenteDeRaton10();
    eventoOyenteDeRaton11();
    eventoOyenteDeRaton12();
    eventoOyenteDeRaton13();
    eventoOyenteDeRaton14();
    eventoOyenteDeRaton15();
    eventoOyenteDeRaton16();
    eventoOyenteDeRaton17();
    eventoOyenteDeRaton18();
    eventoOyenteDeRaton19();
    eventoOyenteDeRaton20();



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
    this.setTitle("Carnes");
    this.setSize(1000, 750);
    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
    this.setVisible(true);
    this.setLocationRelativeTo(null);

  

  menuItem.addActionListener(this);
  frutaItem.addActionListener(this);
  carneItem.addActionListener(this);
  lacteosItem.addActionListener(this);
  panItem.addActionListener(this);
  alcoholItem.addActionListener(this);
  pastaItem.addActionListener(this);
  cRapidaItem.addActionListener(this);


   
   }
	


  private void eventoOyenteDeRaton1(){
    MouseListener eventoOyenteDeRaton1 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\n Salchicha: 375Kcal\n");
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
        areaTexto.append("\n Pato: 375Kcal\n");
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
        areaTexto.append("\n Ciervo: 375Kcal\n");
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
        areaTexto.append("\n Pechuga Pollo: 75Kcal\n");
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
        areaTexto.append("\n Ternera: 94Kcal\n");
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
        areaTexto.append("\n Cordero: 178Kcal\n");
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
        areaTexto.append("\n Pechuga Pavo: 111Kcal\n");
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
        areaTexto.append("\n Salami: 507Kcal\n");
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



    private void eventoOyenteDeRaton9(){
    MouseListener eventoOyenteDeRaton9 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\n Jamon: 335Kcal\n");
    } 
    @Override
    public void mousePressed(MouseEvent me){} 

    @Override
    public void mouseReleased(MouseEvent me){} 

    @Override
    public void mouseExited(MouseEvent me){} 

    @Override
    public void mouseEntered(MouseEvent me){}};

    boton9.addMouseListener(eventoOyenteDeRaton9);}



    private void eventoOyenteDeRaton10(){
    MouseListener eventoOyenteDeRaton10 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\n Tocino: 645Kcal\n");
    } 
    @Override
    public void mousePressed(MouseEvent me){} 

    @Override
    public void mouseReleased(MouseEvent me){} 

    @Override
    public void mouseExited(MouseEvent me){} 

    @Override
    public void mouseEntered(MouseEvent me){}};

    boton10.addMouseListener(eventoOyenteDeRaton10);}



    private void eventoOyenteDeRaton11(){
    MouseListener eventoOyenteDeRaton11 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\n Grada Cerdo: 311Kcal\n");
    } 
    @Override
    public void mousePressed(MouseEvent me){} 

    @Override
    public void mouseReleased(MouseEvent me){} 

    @Override
    public void mouseExited(MouseEvent me){} 

    @Override
    public void mouseEntered(MouseEvent me){}};

    boton11.addMouseListener(eventoOyenteDeRaton11);}






    private void eventoOyenteDeRaton12(){
    MouseListener eventoOyenteDeRaton12 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\n Filete Vacuno: 115Kcal\n");
    } 
    @Override
    public void mousePressed(MouseEvent me){} 

    @Override
    public void mouseReleased(MouseEvent me){} 

    @Override
    public void mouseExited(MouseEvent me){} 

    @Override
    public void mouseEntered(MouseEvent me){}};

    boton12.addMouseListener(eventoOyenteDeRaton12);}



    private void eventoOyenteDeRaton13(){
    MouseListener eventoOyenteDeRaton13 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\n Filete Cerdo: 171Kcal\n");
    } 
    @Override
    public void mousePressed(MouseEvent me){} 

    @Override
    public void mouseReleased(MouseEvent me){} 

    @Override
    public void mouseExited(MouseEvent me){} 

    @Override
    public void mouseEntered(MouseEvent me){}};

    boton13.addMouseListener(eventoOyenteDeRaton13);}




    private void eventoOyenteDeRaton14(){
    MouseListener eventoOyenteDeRaton14 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\nTrucha: 50Kcal\n");
    } 
    @Override
    public void mousePressed(MouseEvent me){} 

    @Override
    public void mouseReleased(MouseEvent me){} 

    @Override
    public void mouseExited(MouseEvent me){} 

    @Override
    public void mouseEntered(MouseEvent me){}};

    boton14.addMouseListener(eventoOyenteDeRaton14);}



    private void eventoOyenteDeRaton15(){
    MouseListener eventoOyenteDeRaton15 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\n Salmon: 137Kcal\n");
    } 
    @Override
    public void mousePressed(MouseEvent me){} 

    @Override
    public void mouseReleased(MouseEvent me){} 

    @Override
    public void mouseExited(MouseEvent me){} 

    @Override
    public void mouseEntered(MouseEvent me){}};

    boton15.addMouseListener(eventoOyenteDeRaton15);}



    private void eventoOyenteDeRaton16(){
    MouseListener eventoOyenteDeRaton16 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\n Arenque: 146Kcal\n");
    } 
    @Override
    public void mousePressed(MouseEvent me){} 

    @Override
    public void mouseReleased(MouseEvent me){} 

    @Override
    public void mouseExited(MouseEvent me){} 

    @Override
    public void mouseEntered(MouseEvent me){}};

    boton16.addMouseListener(eventoOyenteDeRaton16);}


    private void eventoOyenteDeRaton17(){
    MouseListener eventoOyenteDeRaton17 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\n Atun: 144Kcal\n");
    } 
    @Override
    public void mousePressed(MouseEvent me){} 

    @Override
    public void mouseReleased(MouseEvent me){} 

    @Override
    public void mouseExited(MouseEvent me){} 

    @Override
    public void mouseEntered(MouseEvent me){}};

    boton17.addMouseListener(eventoOyenteDeRaton17);}


    private void eventoOyenteDeRaton18(){
    MouseListener eventoOyenteDeRaton18 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\n Huevo: 155Kcal\n");
    } 
    @Override
    public void mousePressed(MouseEvent me){} 

    @Override
    public void mouseReleased(MouseEvent me){} 

    @Override
    public void mouseExited(MouseEvent me){} 

    @Override
    public void mouseEntered(MouseEvent me){}};

    boton18.addMouseListener(eventoOyenteDeRaton18);}



    private void eventoOyenteDeRaton19(){
    MouseListener eventoOyenteDeRaton19 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\n Abadejo: 83Kcal\n");
    } 
    @Override
    public void mousePressed(MouseEvent me){} 

    @Override
    public void mouseReleased(MouseEvent me){} 

    @Override
    public void mouseExited(MouseEvent me){} 

    @Override
    public void mouseEntered(MouseEvent me){}};

    boton19.addMouseListener(eventoOyenteDeRaton19);}



    private void eventoOyenteDeRaton20(){
    MouseListener eventoOyenteDeRaton20 = new MouseListener() {
    @Override
    public void mouseClicked(MouseEvent me){
        areaTexto.append("\n Escalope:  105Kcal\n");
    } 
    @Override
    public void mousePressed(MouseEvent me){} 

    @Override
    public void mouseReleased(MouseEvent me){} 

    @Override
    public void mouseExited(MouseEvent me){} 

    @Override
    public void mouseEntered(MouseEvent me){}};


    boton20.addMouseListener(eventoOyenteDeRaton20);}


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