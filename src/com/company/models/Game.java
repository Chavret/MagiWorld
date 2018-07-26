package com.company.models;

import com.company.Personnage;
import com.company.exceptions.SommeCaracteristiqueSuperieurAuNiveau;

import java.util.Scanner;
import java.io.IOException;

public class Game {
    private Personnage player1;
    private Personnage player2;

    public Game() throws IOException {
        this.player1 = createPlayer(1);
        this.player2 = createPlayer(2);
    }

    private Personnage createPlayer(int playerNumber) throws IOException {
        System.out.println("Création du personnagedu joueur " + playerNumber);
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Geurrier, 2 : Rôdeur, 3 : Mage)");
        Scanner sc = new Scanner(System.in);
        int playerClass = sc.nextInt();
        System.out.println("Niveau du Personnage ?");
        int niveau = sc.nextInt();
        System.out.println("Force du Personnage ?");
        int force = sc.nextInt();
        System.out.println("Agilité du Personnage ?");
        int agilite = sc.nextInt();
        System.out.println("Intelligence du Personnage ?");
        int intelligence = sc.nextInt();
        Personnage p = null;
        try {
            p = new Personnage(niveau, force, agilite, intelligence);
            return p;
        } catch (SommeCaracteristiqueSuperieurAuNiveau s) {
            System.out.println("Le personnage " + playerNumber +" a trop de compétences par rapport à son niveau");
        }
        return p;
    }

    public void run() {
        while (this.player1.getVie() > 0 && this.player2.getVie() > 0) {
            
        }
    }
}
