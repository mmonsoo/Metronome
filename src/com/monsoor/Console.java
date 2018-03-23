package com.monsoor;

import java.util.Scanner;

public class Console {

	private static Scanner clavier = new Scanner(System.in);
	public static int bpm=60;
	static String choixUtilisateur="";
	static boolean verificateur=true;

	public static void display() {
		
		while (verificateur) {
			System.out.println("Entrer un nouveau tempo ou RETURN pour quitter :");
			String choixUtilisateur = clavier.next();
			if (choixUtilisateur.equals("RETURN")) {
				verificateur=false;
				System.exit(0);
			}
			else {
				verificateur=true;	
				bpm=Integer.parseInt(choixUtilisateur);
				TempoThread Tempoo=new TempoThread();
				Tempoo.setBPM(bpm);
				Tempoo.start();
			}
				
			} 
		
		}

	}


