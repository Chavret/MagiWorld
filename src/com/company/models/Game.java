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
        System.out.print(player1.introduce() + " joueur 1 niveau " + player1.getNiveau() + " je possède ");
        System.out.print(player1.getVie() + " de vitalité, " + player1.getForce() + " de force, ");
        System.out.print(player1.getAgilite() + " d'agilite et " + player1.getIntelligence() + " d'intelligence");
        this.player2 = createPlayer(2);
        System.out.print(player2.introduce() + " joueur 2 niveau " + player2.getNiveau() + " je possède ");
        System.out.print(player2.getVie() + " de vitalité, " + player2.getForce() + " de force, ");
        System.out.print(player2.getAgilite() + " d'agilite et " + player2.getIntelligence() + " d'intelligence");
    }

    private Personnage createPlayer(int playerNumber) throws IOException {
        System.out.println("Création du personnage du joueur " + playerNumber);
        System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
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
