import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class ListaOrtogonal extends JFrame implements KeyListener, Runnable{
	
	private Nodo Head, p , q ,r, aux, aux3,aux4, aux5;
	private int dato = 0,x,y, aux1, aux2, Scorre = 0;
	private JButton btn[][], puntos,llave;
	private JPanel panel, scorre;
	private ImageIcon imagen, imagen2, imagen3,imagen4,imagen5,imagen6;
	Mapas mapa = new Mapas();
	Ventana vent = new Ventana();
	Thread bomba;
	private boolean bombaBandera = false,puerta = false;
	
	public ListaOrtogonal(){
		Nivel();
		
	}
	
	public void Nivel(){
		dato++;
		scorre = new JPanel();
		llave = new JButton();
		puntos = new JButton();
		bomba = new Thread(this);
		bomba.start();
		CrearLista();
		desplegar();
		vent.add(scorre,BorderLayout.NORTH);
		vent.setVisible(true);
		vent.addKeyListener(this);
		x = 0;
		y = 0;
		Head = null;
		puerta = false;
	}
	
	public void CrearLista(){
		
		for(int x = 0; x < 25; x++){
			for(int y = 0; y < 25; y++){
				p = new Nodo();
				p.setDato(mapa.Mapas(x, y,dato));
				p.setSiguiente(null);
				p.setAbajo(null);
				if(y == 0){
					p.setAnterior(null);
					if(Head == null){
						Head = p;
					}
					q = p;
				}
				else{
					p.setAnterior(q);
					q.setSiguiente(p);
					q = p;
				}
				if(x == 0){
					p.setArriba(null);
					q = p;
				}
				else{
					p.setArriba(r);
					r.setAbajo(p);
					r = r.getSiguiente();
				}
			}
			r = Head;
			while(r.getAbajo() != null){
				r = r.getAbajo();
			}
		}
	}
	
	public void desplegar(){
		btn = new JButton[25][25];
		panel = new JPanel();
		panel.setLayout(new GridLayout(btn.length, btn[0].length));
		
		if(Head != null){
			p = Head;
			while(p != null){
				q = p;
				while(q != null){
					if(q.getDato() == 0){
						imagen = new ImageIcon("src/imagenes/metal.jpg");
						btn[x][y] = new JButton();
						btn[x][y].setIcon(imagen);
						Dimension tamaño = new Dimension(imagen.getIconHeight(),imagen.getIconWidth());
						btn[x][y].setPreferredSize(tamaño);
					}
					else{
						if(q.getDato() == 2){
							imagen = new ImageIcon("src/imagenes/monito2.gif");
							btn[x][y] = new JButton();
							btn[x][y].setIcon(imagen);
							Dimension tamaño = new Dimension(imagen.getIconHeight(),imagen.getIconWidth());
							btn[x][y].setPreferredSize(tamaño);
							btn[x][y].setBackground(Color.green);
							aux = q;
							aux1 = x;
							aux2 = y;
						}
						else{
							if(q.getDato() == 3){
								imagen = new ImageIcon("src/imagenes/ladrillo.png");
								btn[x][y] = new JButton();
								btn[x][y].setIcon(imagen);
								Dimension tamaño = new Dimension(imagen.getIconHeight(),imagen.getIconWidth());
								btn[x][y].setPreferredSize(tamaño);
							}
							else{
								if(q.getDato() == 4){
									imagen = new ImageIcon("src/imagenes/llave.gif");
									btn[x][y] = new JButton();
									btn[x][y].setIcon(imagen);
									Dimension tamaño = new Dimension(imagen.getIconHeight(),imagen.getIconWidth());
									btn[x][y].setPreferredSize(tamaño);
								}
								else{
									if(q.getDato() == 5){
										imagen = new ImageIcon("src/imagenes/puerta.png");
										btn[x][y] = new JButton();
										btn[x][y].setIcon(imagen);
										Dimension tamaño = new Dimension(imagen.getIconHeight(),imagen.getIconWidth());
										btn[x][y].setPreferredSize(tamaño);
									}
									else{
										btn[x][y] = new JButton();
										btn[x][y].setBackground(Color.green);
									}
								}
								
							}
							
						}
						
					}
					btn[x][y].setBorder(null);
					panel.add(btn[x][y], BorderLayout.CENTER);
					System.out.print(q.getDato() + " ");
					q = q.getSiguiente();
					y++;
				}
				System.out.println( );
				p = p.getAbajo();
				y = 0;
				x++;
			}
		}
		vent.add(panel);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == 39 && (aux.getSiguiente().getDato() != 0 && aux.getSiguiente().getDato() != 3)){
			if(aux.getDato() != 0 && aux.getDato() != 3){
				imagen3 = new ImageIcon("src/imagenes/piso.png");
				btn[aux1][aux2].setIcon(imagen3);
				if(aux.getAnterior().getDato() != 0 && aux.getAnterior().getDato() != 3){
					btn[aux1][aux2-1].setIcon(imagen3);
				}
			}
			imagen2 = new ImageIcon("src/imagenes/monito4.gif");
			btn[aux1][++aux2].setIcon(imagen2);
			aux = aux.getSiguiente();
		}
		if(e.getKeyCode() == 37 && aux.getAnterior().getDato() != 0 && aux.getAnterior().getDato() != 3){
			if(aux.getDato() != 0 && aux.getDato() != 3){
				imagen3 = new ImageIcon("src/imagenes/piso.png");
				btn[aux1][aux2].setIcon(imagen3);
				if(aux.getSiguiente().getDato() != 0 && aux.getSiguiente().getDato() != 3){
					btn[aux1][aux2+1].setIcon(imagen3);
				}
			}
			imagen2 = new ImageIcon("src/imagenes/monito.gif");
			btn[aux1][--aux2].setIcon(imagen2);
			aux = aux.getAnterior();
			if(aux.getDato() == 4){
				imagen6 = new ImageIcon("src/imagenes/llave.gif");
				llave.setIcon(imagen6);
				llave.setBackground(Color.green);
				scorre.add(llave);
				puerta= true;
			}
		}
		
		if(e.getKeyCode() == 40 && aux.getAbajo().getDato() != 0 && aux.getAbajo().getDato() != 3){
			if(aux.getDato() != 0 && aux.getDato() != 3){
				imagen3 = new ImageIcon("src/imagenes/piso.png");
				btn[aux1][aux2].setIcon(imagen3);
				if(aux.getArriba().getDato() != 0 && aux.getArriba().getDato() != 3){
					btn[aux1-1][aux2].setIcon(imagen3);
				}
			}
			imagen2 = new ImageIcon("src/imagenes/monito2.gif");
			btn[++aux1][aux2].setIcon(imagen2);
			aux = aux.getAbajo();
		}
		
		if(e.getKeyCode() == 38 && aux.getArriba().getDato() != 0 && aux.getArriba().getDato() != 3){
			if(aux.getDato() != 0 && aux.getDato() != 3){
				imagen3 = new ImageIcon("src/imagenes/piso.png");
				btn[aux1][aux2].setIcon(imagen3);
				if(aux.getAbajo().getDato() != 0 && aux.getAbajo().getDato() != 3){
					btn[aux1+1][aux2].setIcon(imagen3);
				}
			}
			imagen2 = new ImageIcon("src/imagenes/monito3.gif");
			btn[--aux1][aux2].setIcon(imagen2);
			aux = aux.getArriba();
			if(aux.getDato() == 5 && puerta == true){
				Nivel();
				btn[aux1][aux2].setIcon(imagen3);
				panel.disable();
			}
		}
		
		if(e.getKeyCode() == 65){
			bombaBandera = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(;;){
			int x,y;
			if(bombaBandera){
				bombaBandera = false;
				imagen4 = new ImageIcon("src/imagenes/bomba.gif");
				imagen2 = new ImageIcon("src/imagenes/monito2.gif");
				imagen3 = new ImageIcon("src/imagenes/piso.png");
				imagen5 = new ImageIcon("src/imagenes/fuegoAA.jpg");
				imagen6 = new ImageIcon("src/imagenes/fuegoDI.jpg");
				
				try{
					
					btn[aux1][aux2].setIcon(imagen4);
					x = aux1;
					y = aux2;
					aux3 = aux;
					
					if(aux3.getSiguiente().getDato() != 3 && aux3.getSiguiente().getDato() != 0){
						btn[aux1][aux2+1].setIcon(imagen2);
					}
					else{
						if(aux3.getAnterior().getDato() != 3 && aux3.getAnterior().getDato() != 0){
							btn[aux1][aux2-1].setIcon(imagen2);
						}
						else{
							if(aux3.getAbajo().getDato() != 3 && aux3.getAbajo().getDato() != 0){
								btn[aux1+1][aux2].setIcon(imagen2);
							}
							else{
								if(aux3.getArriba().getDato() != 3 && aux3.getArriba().getDato() != 0){
									btn[aux1-1][aux2].setIcon(imagen2);
								}
							}
						}
					}
					
				
					Thread.sleep(2000);
					
					imagen4 = new ImageIcon("src/imagenes/fuego.jpg");
						btn[x][y].setIcon(imagen4);
						if(aux3.getSiguiente().getDato() == 3 ){
							System.out.println("ladrillo");
							aux3.getSiguiente().setDato(1);
							btn[x][y+1].setIcon(imagen3);
							Scorre+=10;
						}
						if(aux3.getAnterior().getDato() == 3){
							System.out.println("ladrillo");
							aux3.getAnterior().setDato(1);
							btn[x][y-1].setIcon(imagen3);
							Scorre+=10;
						}
						if(aux3.getArriba().getDato() == 3){
							System.out.println("ladrillo");
							aux3.getArriba().setDato(1);
							btn[x-1][y].setIcon(imagen3);
							Scorre+=10;
						}
						if(aux3.getAbajo().getDato() == 3){
							System.out.println("ladrillo");
							aux3.getAbajo().setDato(1);
							btn[x+1][y].setIcon(imagen3);
							Scorre+=10;
						}
						if(aux3.getSiguiente().getDato() != 3 && aux3.getSiguiente().getDato() != 0){
							btn[x][y+1].setIcon(imagen6);
						}
						if(aux3.getAnterior().getDato() != 3 && aux3.getAnterior().getDato() != 0){
							btn[x][y-1].setIcon(imagen6);
						}
						if(aux3.getArriba().getDato() != 3 && aux3.getArriba().getDato() != 0){
							btn[x-1][y].setIcon(imagen5);
						}
						if(aux3.getAbajo().getDato() != 3 && aux3.getAbajo().getDato() != 0){
							btn[x+1][y].setIcon(imagen5);
						}
						
						btn[x][y].setIcon(imagen4);
							
						aux3.setDato(1);
						Thread.sleep(1000);
					puntos.setText("puntos: " + Scorre);
					scorre.add(puntos, BorderLayout.SOUTH);
					if(aux3.getSiguiente().getDato() != 3 && aux3.getSiguiente().getDato() != 0){
						btn[x][y+1].setIcon(imagen3);
					}
					if(aux3.getAnterior().getDato() != 3 && aux3.getAnterior().getDato() != 0){
						btn[x][y-1].setIcon(imagen3);
					}
					if(aux3.getArriba().getDato() != 3 && aux3.getArriba().getDato() != 0){
						btn[x-1][y].setIcon(imagen3);
					}
					if(aux3.getAbajo().getDato() != 3 && aux3.getAbajo().getDato() != 0){
						btn[x+1][y].setIcon(imagen3);
					}
					btn[x][y].setIcon(imagen3);
					
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		
	}

}
