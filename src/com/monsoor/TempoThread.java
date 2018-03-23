package com.monsoor;

import java.util.Scanner;

public class TempoThread extends Thread {

	private int bpm = 60;
	public TempoThread() {
		// Il récupère les variables et les fonctions*
		super();
	}

	public void setBPM(int bpm) {
		this.bpm = bpm;

	}

	// On modifie la fonction run, pour ajouter toutes les instructions qu'on veut
	public void run() {
		int sleepTime_ms = 60000 / this.bpm;

		while (true) {
			try {
				java.awt.Toolkit.getDefaultToolkit().beep();
				Thread.sleep(sleepTime_ms);
				//System.out.println("Entrer un nouveau tempo ou RETURN pour quitter :");
				//String choixUtilisateur = clavier.nextLine();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}