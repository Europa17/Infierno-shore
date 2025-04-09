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

// Segunda pantalla
class PantallaPrincipal extends JFrame {
    public PantallaPrincipal() {
        setTitle("Noticias y Grupos de Fútbol");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel titulo = new JLabel("Noticias de Fútbol", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setBounds(50, 20, 300, 30);
        add(titulo);

        JLabel noticia = new JLabel("<html>EL REAL MADRID LOGRÓ EL TÍTULO TRAS UNA EDICIÓN IMPECABLE EN LA QUE NO CONOCIÓ LA DERROTA (9 VICTORIAS Y 4 EMPATES).</html>", SwingConstants.CENTER);
        noticia.setBounds(50, 60, 300, 60);
        add(noticia);

        JLabel desafio = new JLabel("<html><b>Desafío del día:</b> Intenta hacer 30 dominadas sin que se caiga el balón</html>", SwingConstants.CENTER);
        desafio.setBounds(50, 130, 300, 40);
        add(desafio);

        JLabel grupos = new JLabel("<html><b>Grupos que te pueden interesar:</b><br>- Fans de Hala Madrid<br>- Fans de Karim Benzema<br>- Liga Mexicana</html>", SwingConstants.CENTER);
        grupos.setBounds(50, 180, 300, 60);
        add(grupos);

        JLabel jugador = new JLabel("<html><b>Jugador del momento:</b> Mbappé se ha colocado como uno de los mejores jugadores por su impecable hazaña en esta temporada</html>", SwingConstants.CENTER);
        jugador.setBounds(50, 250, 300, 60);
        add(jugador);

        JButton menuButton = new JButton("Menú principal");
        menuButton.setBounds(30, 320, 120, 30);
        add(menuButton);

        JButton inicioButton = new JButton("Inicio");
        inicioButton.setBounds(155, 320, 80, 30);
        add(inicioButton);

        JButton juegosButton = new JButton("Juegos");
        juegosButton.setBounds(240, 320, 120, 30);
        add(juegosButton);

        JButton crearPersonajeButton = new JButton("Crear personaje");
        crearPersonajeButton.setBounds(120, 370, 128, 30);
        add(crearPersonajeButton);

        // botón "Juegos"
        juegosButton.addActionListener(e -> {
            dispose();
            new PantallaJuegos();
        });

        crearPersonajeButton.addActionListener(e -> {
            dispose();
            new PantallaCrearPersonaje();
        });

        inicioButton.addActionListener(e -> {
            dispose();
            new PantallaInicio();
        });

        menuButton.addActionListener(e -> {
            dispose();
            new PantallaTendencias();
        });

        setVisible(true);
    }
}

// Pantalla para crear personaje
class PantallaCrearPersonaje extends JFrame {
    private String equipoSeleccionado = "";
    private String generoSeleccionado = "";
    private String habilidad1 = "";
    private String habilidad2 = "";

    public PantallaCrearPersonaje() {
        setTitle("Creador de Personaje");
        setSize(400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel titulo = new JLabel("Crea tu Jugador", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 18));
        titulo.setBounds(50, 30, 300, 30);
        add(titulo);

        JLabel lblEquipo = new JLabel("Equipo Preferido:");
        lblEquipo.setBounds(50, 70, 150, 20);
        add(lblEquipo);

        String[] equipos = {"Real Madrid", "Barcelona", "Atlético de Madrid", "Real Sevilla", "Real Sociedad", "Valencia CF"};
        JComboBox<String> comboEquipos = new JComboBox<>(equipos);
        comboEquipos.setBounds(200, 70, 150, 20);
        comboEquipos.addActionListener(e -> equipoSeleccionado = (String) comboEquipos.getSelectedItem());
        add(comboEquipos);

        JLabel nombreLabel = new JLabel("Nombre del jugador:");
        nombreLabel.setBounds(50, 100, 150, 25);
        add(nombreLabel);

        JTextField nombreField = new JTextField();
        nombreField.setBounds(200, 100, 150, 25);
        add(nombreField);

        JLabel lblGenero = new JLabel("Género:");
        lblGenero.setBounds(50, 140, 150, 20);
        add(lblGenero);

        String[] generos = {"Masculino", "Femenino"};
        JComboBox<String> comboGenero = new JComboBox<>(generos);
        comboGenero.setBounds(200, 140, 150, 20);
        comboGenero.addActionListener(e -> generoSeleccionado = (String) comboGenero.getSelectedItem());
        add(comboGenero);

        JLabel lblHabilidades = new JLabel("Habilidades (elige 2):");
        lblHabilidades.setBounds(50, 180, 200, 20);
        add(lblHabilidades);

        String[] habilidades = {"Correr rápido", "Agilidad sorprendente", "Aguante máximo", "Goleador de Oro", "Mejor Receptor"};
        JComboBox<String> comboHabilidad1 = new JComboBox<>(habilidades);
        comboHabilidad1.setBounds(50, 210, 150, 20);
        comboHabilidad1.addActionListener(e -> habilidad1 = (String) comboHabilidad1.getSelectedItem());
        add(comboHabilidad1);

        JComboBox<String> comboHabilidad2 = new JComboBox<>(habilidades);
        comboHabilidad2.setBounds(200, 210, 150, 20);
        comboHabilidad2.addActionListener(e -> habilidad2 = (String) comboHabilidad2.getSelectedItem());
        add(comboHabilidad2);

        JButton finalizarButton = new JButton("Finalizar personaje");
        finalizarButton.setBounds(120, 260, 160, 30);
        add(finalizarButton);
   
        finalizarButton.addActionListener(e -> {
            String nombre = nombreField.getText().trim();
            if (!nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "¡Felicidades " + nombre + ", has creado tu personaje exitosamente!");
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, ingresa un nombre.");
            }
        });

        setVisible(true);
    }
}

