package EstructurasDinamicas.AVL;

import javax.swing.JOptionPane;

public class ArbolAVL {

    public Nodo raiz;
    private int conta;
    private int nodoHoja;
    private int altura;

    public ArbolAVL() {
        this.raiz = null;
    }

    public boolean esVacia() {
        return raiz == null;

    }

    public boolean esHoja() {
        return raiz.getDerecha() == null & raiz.getIzquierda() == null;
    }

    public int Altura(Nodo r) {
        altura = 0;
        Altura(r, 1);
        return altura;
    }

    public int NodosCompletos(Nodo r) {
        if (r == null) {
            return 0;
        } else {
            if (r.getIzquierda() != null && r.getDerecha() != null) {
                return NodosCompletos(r.getIzquierda()) + NodosCompletos(r.getDerecha()) + 1;
            }
            return NodosCompletos(r.getIzquierda()) + NodosCompletos(r.getDerecha());
        }
    }

    private void Altura(Nodo raiz, int nivel) {
        if (raiz != null) {
            Altura(raiz.getIzquierda(), nivel + 1);
            if (nivel > altura) {
                altura = nivel;
            }
            Altura(raiz.getDerecha(), nivel + 1);
        }
    }

    public void Anadir(int id, String nombre) {
        Nodo nuevo = new Nodo(new Equipo(id, nombre));
        if (esVacia()) {
            raiz = nuevo;
        } else {
            Insertar(nuevo, raiz);
            raiz = this.Balance(raiz);
        }
    }

    private void Insertar(Nodo nuevo, Nodo raiz) {
        if (nuevo.getDato().getId() < raiz.getDato().getId()) {
            if (raiz.getIzquierda() == null) {
                raiz.setIzquierda(nuevo);
            } else {
                Insertar(nuevo, raiz.getIzquierda());
            }
        } else if (nuevo.getDato().getId() > raiz.getDato().getId()) {
            if (raiz.getDerecha() == null) {
                raiz.setDerecha(nuevo);
            } else {
                Insertar(nuevo, raiz.getDerecha());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dato duplicado" + nuevo.getDato().getId());

        }
    }

  

    public int factorEquilibrio(Nodo r) {
        return (Altura(r.getDerecha())) - (Altura(r.getIzquierda()));
    }

    public Nodo Balance(Nodo raiz) {
        if (raiz != null) {
            raiz.setIzquierda(Balance(raiz.getIzquierda()));
            raiz.setDerecha(Balance(raiz.getDerecha()));
            int f = factorEquilibrio(raiz);
            if (f == 2) {
                int fq = factorEquilibrio(raiz.getDerecha());
                if (fq == 1) {
                    return rsi(raiz);

                } else {
                    return rdi(raiz);
                }
            } else if (f == -2) {

                int fq = factorEquilibrio(raiz.getIzquierda());
                if (fq == 1) {
                    return rsd(raiz);
                } else {
                    return rdd(raiz);
                }
            }

        }
        return raiz;
    }

    public Nodo rsi(Nodo p) {
        Nodo q = p.getDerecha();
        p.setDerecha(q.getIzquierda());
        q.setIzquierda(p);
        return q;

    }

    public Nodo rsd(Nodo p) {
        Nodo q = p.getIzquierda();
        p.setIzquierda(q.getDerecha());
        q.setDerecha(p);
        return q;

    }

    public Nodo rdd(Nodo p) {
        Nodo q;
        p.setIzquierda(rsi(rsd(p.getIzquierda())));
        q = rsi(p);
        return q;
    }

    public Nodo rdi(Nodo p) {
        Nodo q;
        p.setDerecha(rsd(rsi(p.getDerecha())));
        q = rsd(p);
        return q;

    }
}


