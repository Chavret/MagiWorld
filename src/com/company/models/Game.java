package com.company.models;

import com.company.models.Personnage;
import com.company.exceptions.SommeCaracteristiqueSuperieurAuNiveau;

import java.util.Scanner;
import java.io.IOException;

public class Game {
    private Personnage player1;
    private Personnage player2;

    // PUBLIC
    public Game() throws IOException {
        this.player1 = createPlayer(1);
        if (this.player1 != null) {
            System.out.println(player1.introduce());
        }
        this.player2 = createPlayer(2);
        if (this.player2 != null) {
            System.out.println(player2.introduce());
        }
    }

    public void run() {
        // Base stats of players
        int[] player1Stats = {player1.getVie(), player1.getForce(), player1.getAgilite(), player1.getIntelligence()};
        int[] player2Stats = {player2.getVie(), player2.getForce(), player2.getAgilite(), player2.getIntelligence()};
        int turn = 0;
        String playerNumber = "";
        // game execution
        while (player1.getVie() > 0 && player2.getVie() > 0) {
            playerNumber = (turn % 2 == 0) ? "2" : "1";
            if (playerNumber == "1") turn(player1, player2);
            else turn(player2, player1);
        }
        if (player1.getVie() == 0) {
            endGame(player1);
        } else {
            endGame(player2);
        }
    }

    // PRIVATE
    private void endGame(Personnage player) {
        System.out.println("Joueur " + player.getPlayerNumber() + " a perdu !");
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
        return instantiatePlayer(playerClass, niveau, force, agilite, intelligence, playerNumber);
    }

    private Personnage instantiatePlayer(int playerClass, int niveau, int force, int agilite, int intelligence, int playerNumber) {
        Personnage p = null;
        try {
            switch (playerClass) {
                case 1:
                    p = new Guerrier(niveau, force, agilite, intelligence, playerNumber);
                    break;
                case 2:
                    p = new Rodeur(niveau, force, agilite, intelligence, playerNumber);
                    break;
                case 3:
                    p = new Mage(niveau, force, agilite, intelligence, playerNumber);
                    break;
                default:
                    System.out.println("La classe choisie n'existe pas !");
            }
            return p;
        } catch (SommeCaracteristiqueSuperieurAuNiveau s) {
            System.out.println("Le personnage " + playerNumber +" a trop de compétences par rapport à son niveau");
        }
        return p;
    }

    private void turn(Personnage attackPlayer, Personnage defensePlayer) {
        Scanner sc = new Scanner(System.in);
        System.out.println(player1.askPlayerAction());
        int action = sc.nextInt();
        if (action == 1) {
            attackPlayer.basicAttack(defensePlayer);
        } else if (action == 2) {
            attackPlayer.specialAttack(defensePlayer);
        } else {
            System.out.println("Veuillez choisir une action valide (1 ou 2)");
            turn(attackPlayer, defensePlayer);
        }
    }
}
