package computacaografica;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;

public class Triangulo extends JFrame {

	private static final long serialVersionUID = 1L;

	int alt,larg;

	public Triangulo (int alt,int larg) {
	setSize(larg,alt);/*Determina o tamanho da tela*/
	setLocationRelativeTo(null);/*centraliza a tela*/
	setDefaultCloseOperation(EXIT_ON_CLOSE);/*termina o programa ao ser fechado*/
	setVisible(true);/*permite visualização*/
	}

	public int getAlt() {
		return alt;
	}

	public void setAlt(int alt) {
		this.alt = alt;
	}

	public int getLarg() {
		return larg;
	}

	public void setLarg(int larg) {
		this.larg = larg;
	}
	
	public  void limpar_tela(Triangulo t) {

		Graphics g = getGraphics();/*pega a resolução definida pelo costrutor*/
		g.clearRect(0, 0, t.getLarg(), t.getAlt());/*função resevada da bliblioteca
										que limpa a tela*/
		 
		 }
	
	public void equacao_diferecial(int x0,int xf, int y0,int yf,Triangulo t){
		
		Graphics g = getGraphics();/*pega a resolução definida pelo costrutor*/
		int auxx0,auxxf,auxy0,auxyf,alt,larg;
		
		auxx0=x0;
		auxxf=xf;
		auxy0=y0;
		auxyf=yf;
		alt=t.getAlt();
		larg=t.getLarg();
		
		g.setColor( Color.RED );/*cor do desenho*/
		g.drawLine( Math.round(auxx0+alt/2), Math.round(larg/2-auxy0), Math.round(auxxf+alt/2), Math.round(larg/2-auxyf));;/*desenha o pixel*/
				  }
	
public void Escala(int x0,int xf, int y0,int yf,Triangulo t,int ce){
		
		Graphics g = getGraphics();/*pega a resolução definida pelo costrutor*/
		int auxx0,auxxf,auxy0,auxyf,alt,larg;
		
		auxx0=x0*ce;
		auxxf=xf*ce;
		auxy0=y0*ce;
		auxyf=yf*ce;
		alt=t.getAlt();
		larg=t.getLarg();
		
		g.setColor( Color.RED );/*cor do desenho*/
		g.drawLine( Math.round(auxx0+alt/2), Math.round(larg/2-auxy0), Math.round(auxxf+alt/2), Math.round(larg/2-auxyf));;/*desenha o pixel*/
				  }

public void Rotacao(int x0,int xf, int y0,int yf,Triangulo t,double angulo) {
	Graphics g = getGraphics();/*pega a resolução definida pelo costrutor*/
	int auxx0,auxxf,auxy0,auxyf,alt,larg;
	
	auxx0=(int) (x0*Math.cos(angulo)-y0*Math.sin(angulo));
	auxy0=(int)(x0*Math.sin(angulo)+y0*Math.cos(angulo));
	auxxf=(int) (xf*Math.cos(angulo)-yf*Math.sin(angulo));
	auxyf=(int)(xf*Math.sin(angulo)+yf*Math.cos(angulo));
	alt=t.getAlt();
	larg=t.getLarg();
	
	g.setColor( Color.RED );/*cor do desenho*/
	g.drawLine( Math.round(auxx0+alt/2), Math.round(larg/2-auxy0), Math.round(auxxf+alt/2), Math.round(larg/2-auxyf));;/*desenha o pixel*/
}
	
public void Translatacao(int x0,int xf, int y0,int yf,Triangulo t,int tx,int ty) {
	Graphics g = getGraphics();/*pega a resolução definida pelo costrutor*/
	int auxx0,auxxf,auxy0,auxyf,alt,larg;
	
	auxx0=x0+tx;
	auxxf=xf+tx;
	auxy0=y0+ty;
	auxyf=yf+ty;
	alt=t.getAlt();
	larg=t.getLarg();
	
	g.setColor( Color.RED );/*cor do desenho*/
	g.drawLine( Math.round(auxx0+alt/2), Math.round(larg/2-auxy0), Math.round(auxxf+alt/2), Math.round(larg/2-auxyf));;/*desenha o pixel*/
}

public void espelhamento(int x0,int xf, int y0,int yf,Triangulo t){
	
	Graphics g = getGraphics();/*pega a resolução definida pelo costrutor*/
	int auxx0,auxxf,auxy0,auxyf,alt,larg;
	
	alt=t.getAlt();
	larg=t.getLarg();
	auxx0=x0;
	auxxf=xf;
	auxy0=-y0;
	auxyf=-yf;
	
	
	g.setColor( Color.RED );/*cor do desenho*/
	g.drawLine( Math.round(auxx0+alt/2), Math.round(larg/2-auxy0), Math.round(auxxf+alt/2), Math.round(larg/2-auxyf));;/*desenha o pixel*/
			  }

public void Escala_fixa(int x0,int xf, int y0,int yf,Triangulo t,int ce){
	
	Graphics g = getGraphics();/*pega a resolução definida pelo costrutor*/
	int auxx0,auxxf,auxy0,auxyf,alt,larg;
	
	auxx0=x0*ce+55*(1-ce);
	auxxf=xf*ce+55*(1-ce);
	auxy0=y0*ce+65*(1-ce);
	auxyf=yf*ce+65*(1-ce);
	alt=t.getAlt();
	larg=t.getLarg();
	
	g.setColor( Color.RED );/*cor do desenho*/
	g.drawLine( Math.round(auxx0+alt/2+55), Math.round(larg/2-auxy0+65), Math.round(auxxf+alt/2+55), Math.round(larg/2-auxyf+65));;/*desenha o pixel*/
			  }

public void Rotacao_fixa(int x0,int xf, int y0,int yf,Triangulo t,double angulo) {
	Graphics g = getGraphics();/*pega a resolução definida pelo costrutor*/
	int auxx0,auxxf,auxy0,auxyf,alt,larg;
	
	auxx0=(int) (x0*Math.cos(angulo)-y0*Math.sin(angulo)+55*(1-Math.cos(angulo))+65*Math.sin(angulo));
	auxy0=(int)(x0*Math.sin(angulo)+y0*Math.cos(angulo)+65*(1-Math.cos(angulo))+55*Math.sin(angulo));
	auxxf=(int) (xf*Math.cos(angulo)-yf*Math.sin(angulo)+55*(1-Math.cos(angulo))+65*Math.sin(angulo));
	auxyf=(int)(xf*Math.sin(angulo)+yf*Math.cos(angulo)+65*(1-Math.cos(angulo))+55*Math.sin(angulo));
	alt=t.getAlt();
	larg=t.getLarg();
	
	g.setColor( Color.RED );/*cor do desenho*/
	g.drawLine( Math.round(auxx0+alt/2), Math.round(larg/2-auxy0), Math.round(auxxf+alt/2), Math.round(larg/2-auxyf));;/*desenha o pixel*/
}
		 
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		int opcao;
		
		//abrir janela
		
		int larg = 500;
		int alt =  500;
		
		/*inicializa um objeto Desenhar*/
		Triangulo t = new Triangulo(alt,larg);
		t.setAlt(alt);
		t.setLarg(larg);
		
		while(true) {
			
			System.out.printf("[0] Desenha triangulo \n"+
			"[1] Escala \n"+"[2] Rotação \n"+"[3] Translatação \n"+
			"[4] Espelhamento \n"+"[5] Escala_fixa \n"+
			"[6]Rotação_fixa \n"+"[7] Sair \n");
			
			opcao=input.nextInt();
			
			if(opcao==0) {
		//desenhar triangulo
		t.equacao_diferecial(40, 70, 50, 50,t);
		t.equacao_diferecial(40, 55, 50, 90,t);
		t.equacao_diferecial(70, 55, 50, 90,t);}
			
			if(opcao==1) {
				int ce;
				System.out.println("digite o valor do Coeficiente escalar \n");
				 ce=input.nextInt(); 
				 t.Escala(40, 70, 50, 50, t, ce);
				 t.Escala(40, 55, 50, 90, t, ce);
				 t.Escala(70, 55, 50, 90, t, ce);
			}
			
			if(opcao==2) {
				double angulo;
				System.out.println("digite o valor do angulo \n");
				angulo=input.nextDouble();
				t.Rotacao(40, 70, 50, 50, t, angulo);
				 t.Rotacao(40, 55, 50, 90, t, angulo);
				 t.Rotacao(70, 55, 50, 90, t, angulo);
			}
			
			if(opcao==3) {
				int tx,ty;
				System.out.println("digite o valor do Coeficiente de translatação de x \n");
				tx=input.nextInt();
				System.out.println("digite o valor do Coeficiente de translatação de y \n");
				ty=input.nextInt();
				
				t.Translatacao(40, 70, 50, 50, t, tx,ty);
				 t.Translatacao(40, 55, 50, 90, t, tx,ty);
				 t.Translatacao(70, 55, 50, 90, t, tx,ty);
			}
			
			if(opcao==4) {
				System.out.println("desenhar triangulo invertido \n");
				t.espelhamento(40, 70, 50, 50,t);
				t.espelhamento(40, 55, 50, 90,t);
				t.espelhamento(70, 55, 50, 90,t);
			}
			
			if(opcao==5){
				int ce;
				System.out.println("digite o valor do Coeficiente escalar \n");
				 ce=input.nextInt();
				 t.Escala_fixa(40, 70, 50, 50, t, ce);
				 t.Escala_fixa(40, 55, 50, 90, t, ce);
				 t.Escala_fixa(70, 55, 50, 90, t, ce);
			}
			
			if(opcao==6) {
				double angulo;
				System.out.println("digite o valor do angulo \n");
				angulo=input.nextDouble();
				t.Rotacao_fixa(40, 70, 50, 50, t, angulo);
				 t.Rotacao_fixa(40, 55, 50, 90, t, angulo);
				 t.Rotacao_fixa(70, 55, 50, 90, t, angulo);
			}
		
			if(opcao==7) {
					 System.exit(0);
			}
		}
	}
}