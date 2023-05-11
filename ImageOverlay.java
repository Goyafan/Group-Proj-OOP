import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.*;


public class ImageOverlay extends JPanel { // furthur also implements MouseListener
    
    private BufferedImage blackPiece;
    private BufferedImage whitePiece;
    private BufferedImage board;
    
    
    public ImageOverlay() {        
        try {
            // Load the images
            blackPiece = ImageIO.read(new File("black.png"));
            whitePiece = ImageIO.read(new File("white.png"));
            board = ImageIO.read(new File("board.jpg"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Draw the bottom image
        g.drawImage(board, 0, 0, null);
        
        // Draw the top image on top of the bottom image
        // Black pieces
        g.drawImage(blackPiece, 15, 15, null);
        g.drawImage(blackPiece, 215, 15, null);
        g.drawImage(blackPiece, 415, 15, null);
        g.drawImage(blackPiece, 615, 15, null);

        g.drawImage(blackPiece, 115, 115, null);
        g.drawImage(blackPiece, 315, 115, null);
        g.drawImage(blackPiece, 515, 115, null);
        g.drawImage(blackPiece, 715, 115, null);

        g.drawImage(blackPiece, 15, 215, null);
        g.drawImage(blackPiece, 215, 215, null);
        g.drawImage(blackPiece, 415, 215, null);
        g.drawImage(blackPiece, 615, 215, null);

        // White pieces
        g.drawImage(whitePiece, 115, 720, null);
        g.drawImage(whitePiece, 315, 720, null);
        g.drawImage(whitePiece, 515, 720, null);
        g.drawImage(whitePiece, 715, 720, null);

        g.drawImage(whitePiece, 15, 615, null);
        g.drawImage(whitePiece, 215, 615, null);
        g.drawImage(whitePiece, 415, 615, null);
        g.drawImage(whitePiece, 615, 615, null);

        g.drawImage(whitePiece, 115, 520, null);
        g.drawImage(whitePiece, 315, 520, null);
        g.drawImage(whitePiece, 515, 520, null);
        g.drawImage(whitePiece, 715, 520, null);

    }
    
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        
        ImageOverlay panel = new ImageOverlay();
        
        frame.add(panel);

        frame.setTitle("Checkers");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(810, 840);
        frame.setResizable(false);
        frame.setVisible(true);

        ImageIcon image = new ImageIcon("icon.jpg");
        frame.setIconImage(image.getImage());
    }
}