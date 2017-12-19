package com.igs.ipi.tpspringbootsalyndiaye.modele;

public class GameModele{
	public String Joueur1;
	public String Joueur2;

	public String getJoueur1() {
		return Joueur1;
	}

	public void setJoueur1(String joueur1) {
		Joueur1 = joueur1;
	}

	public String getJoueur2() {
		return Joueur2;
	}

	public void setJoueur2(String joueur2) {
		Joueur2 = joueur2;
	}
	
	public GameModele(String Joueur1, String Joueur2) {
		this.Joueur1=Joueur1;
		this.Joueur2=Joueur2;
	}
	
	private static final int largeur = 7;
	private static final int hauteur = 6;
	public int[][] getTableau() {
		return tableau;
	}

	public void setTableau(int[][] tableau) {
		this.tableau = tableau;
	}

	public static int getLargeur() {
		return largeur;
	}

	public static int getHauteur() {
		return hauteur;
	}

	public int[][]  tableau = new int [hauteur][largeur];
	
	
	public GameModele() {
		         for (int i = 0; i < tableau.length; i++) {
		             for (int j = 0; j < tableau[i].length; j++) {
		                 tableau[i][j] = 0;
		             }
		         }
	        }

	
}