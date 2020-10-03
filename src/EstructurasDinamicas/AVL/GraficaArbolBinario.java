
package EstructurasDinamicas.AVL;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GraficaArbolBinario extends JPanel {

    private final ArbolAVL arbolAvl;
    public static final int DIAMETRO = 40;
    public static final int RADIO = DIAMETRO / 2;
    public static final int ANCHO = 50;

    public GraficaArbolBinario(ArbolAVL arbolAvl) {
        this.arbolAvl = arbolAvl;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        pintar(g, getWidth() / 2, 20, arbolAvl.raiz);
    }

    private void pintar(Graphics g, int x, int y, Nodo r) {
        if (r == null) {
            return;
        }
    
        int EXTRA = new ArbolAVL().NodosCompletos(r) * (ANCHO / 2);
        g.setColor(Color.red);
        g.drawOval(x, y, DIAMETRO, DIAMETRO);
       g.setColor(Color.red);
        g.fillOval(x, y, DIAMETRO, DIAMETRO);
        g.setColor(Color.black);
        g.drawString( r.getDato()+"", x + 10, y + 20);
          g.setColor(Color.black);
        if (r.getIzquierda() != null) {
            g.drawLine(x + RADIO - 5, y + RADIO + 15, x - ANCHO - EXTRA + RADIO, y - 15 + ANCHO + RADIO);
        }
        if (r.getDerecha() != null) {
            g.drawLine(x + RADIO - 5, y + RADIO + 15, x + ANCHO + EXTRA + RADIO, y - 15 + ANCHO + RADIO);
        }
        pintar(g, x - ANCHO - EXTRA, y + ANCHO, r.getIzquierda());
        pintar(g, x + ANCHO + EXTRA, y + ANCHO, r.getDerecha());

    }
}






