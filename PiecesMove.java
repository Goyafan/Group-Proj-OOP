public class PiecesMove extends ImageOverlay implements MouseListener{

    private int pieceX, pieceY; // coordinates of the piece to be moved
    
    public PiecesMove() {
        super(); 
        addMouseListener(this); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();

        // Check if the click is within the bounds of the images
        if (x >= 15 && x <= 115 && y >= 15 && y <= 115) {
            // Clicked on black piece at (15, 15)
            pieceX = 15;
            pieceY = 15;
            //Do what is supposed to do after clicking
        } else if (x >= 215 && x <= 315 && y >= 15 && y <= 115) {
            // Clicked on black piece at (215, 15)
            pieceX = 215;
            pieceY = 15;
            //Do what is supposed to do after clicking
        } 
        // Adding the code for the other pieces 
    }

    // other methods of the MouseListener interface
}
