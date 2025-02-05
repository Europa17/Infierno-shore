import javax.swing.*;

public class ProyectoFinal {
public static void main(String[] args) {
JFrame frame = new JFrame("Mi primera Ventana");
  frame.setSize(width:500, height:300);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  frame.setLayout(manager:null);

  JLabel etiqueta_anuncio = new JLabel(" ¡Hola, somos Team Infierno! ");
  JLabel etiqueta_2 = new JLabel("Prueba");
  JLabel etiqueta_3 = new JLabel("Prueba encima 1");
  JLabel etiqueta_4 = new JLabel("Prueba encima 2");
  JButton button = new JButton ("Enviar");
  JLabel nombre_usuario = new  JLabel ("Nombre de Usuario");
  JTextField textField = new JTextField(columns:20);
  
  etiqueta_anuncio.setBounds(x:30, y:50, width:100, height:30); 
  etiqueta_2.setBounds(x:300, y:50,width:200,height:30);
  etiqueta_3.setbounds(x:30, y:90, width:100,height:30);
  etiqueta_4.setbounds(x:300, y:90, width:150,height:30);
  button.set.Bounds(x:100, y:120, width:150, height:30); 
  nombre_usuario.setBounds(x:100, y:180, width:200, height:30);
  textField.setBounds(x:200, y:160, width:200, height:30); 

  


  
}
}
