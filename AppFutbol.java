import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FutbolApp {
    public static void main(String[] args) {
        new PantallaInicio();  // Iniciar la primera pantalla
    }
}

// Primera pantalla (Inicio de sesión/registro)
class PantallaInicio extends JFrame {
    public PantallaInicio() {
        setTitle("El Mundo del Fútbol");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        ImageIcon iconoFutbol = new ImageIcon("futbol.png");
        Image imagenFutbol = iconoFutbol.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon imagenEscalada = new ImageIcon(imagenFutbol);

        JLabel imagenLabel = new JLabel(imagenEscalada);
        imagenLabel.setBounds(150, 10, 100, 100); // Ajusta x, y, ancho, alto
        add(imagenLabel);


        JLabel titulo = new JLabel("EL MUNDO DEL FÚTBOL", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        titulo.setBounds(50, 20, 300, 30);
        add(titulo);

        JLabel subtitulo = new JLabel("<html><center>\"Convierte el mundo del fútbol<br>en tu aplicación favorita\"</center></html>", SwingConstants.CENTER);
        subtitulo.setBounds(50, 60, 300, 40);
        add(subtitulo);

        JButton emailButton = new JButton("Continuar con email existente");
        emailButton.setBounds(80, 120, 250, 30);
        add(emailButton);

        JButton googleButton = new JButton("Continuar con Google");
        googleButton.setBounds(80, 160, 250, 30);
        add(googleButton);

        JButton facebookButton = new JButton("Continuar con Facebook");
        facebookButton.setBounds(80, 200, 250, 30);
        add(facebookButton);

        JButton newAccountButton = new JButton("Crea una cuenta nueva");
        newAccountButton.setBounds(80, 240, 250, 30);
        add(newAccountButton);

        JLabel forgotPassword = new JLabel("<html><a href='#'>¿Olvidaste tu contraseña?</a></html>");
        forgotPassword.setBounds(140, 280, 200, 30);
        add(forgotPassword);

        JLabel soporteLabel = new JLabel("SOPORTE", SwingConstants.CENTER);
        soporteLabel.setFont(new Font("Arial", Font.BOLD, 14));
        soporteLabel.setBounds(50, 320, 300, 20);
        add(soporteLabel);

        JLabel telefonoLabel = new JLabel("<html><a href='#'>Tel 221 270 2979</a></html>", SwingConstants.CENTER);
        telefonoLabel.setBounds(50, 340, 300, 20);
        add(telefonoLabel);

        JLabel redesSociales = new JLabel("📘 Instagram  📷 Facebook  💬 WhatsApp", SwingConstants.CENTER);
        redesSociales.setBounds(50, 380, 300, 30);
        add(redesSociales);

        JButton siguienteButton = new JButton("Siguiente");
        siguienteButton.setBounds(140, 430, 120, 30);
        add(siguienteButton);

        siguienteButton.addActionListener(e -> {
            dispose();
            new PantallaPrincipal();
        });

        setVisible(true);
    }
}
