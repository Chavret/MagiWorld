package com.company.models;

import com.company.exceptions.SommeCaracteristiqueSuperieurAuNiveau;

/**
 * Cette classe represente les personnages du jeu, ell est abstraite
 */
public abstract class Personnage {

    private int niveau;
    private int vie;
    private int force;
    private int agilite;
    private int intelligence;
    private int playerNumber;

    /**
     * Constructeur
     * @param niveau
     *              le niveau du personnage
     * @param force
     *              la force du personnage
     * @param agilite
     *              l'agilite du personnage
     * @param intelligence
     *              l'intelligence du personnage
     * @param playerNumber
     *              le numero de joueur du personnage
     */
    public Personnage(int niveau, int force, int agilite, int intelligence, int playerNumber) {
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
        if ((force + agilite + intelligence) > niveau) throw new SommeCaracteristiqueSuperieurAuNiveau();
        this.niveau = niveau;
        this.vie = niveau * 5;
        this.playerNumber = playerNumber;
    }

    // PUBLIC

    /**
     * Inflige des degats au personnage
     * @param dommages
     *              les degats subits par le personnage
     */
    public void removeVie(int dommages) {
        int oldVie = vie;

        if (dommages > 0) {
            vie = (vie - dommages >= 0) ? vie - dommages : 0;
            System.out.println("Joueur " + getPlayerNumber() + " perd " + (oldVie - vie) + " points de vie");
        }
        if (vie == 0) System.out.println("Joueur " + playerNumber + " est mort");
    }

    public void setVie(int vie) {
        this.vie = vie;
    }

    public void setAgilite(int agilite) {
        this.agilite = agilite;
    }

    public int getVie() {
        return vie;
    }


    public int getForce() {
        return force;
    }

    public int getAgilite() {
        return agilite;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getPlayerNumber() { return playerNumber; }

    /**
     * Affiche un text de presentation du personnage
     * @return String
     *              le texte a afficher
     */
    public String introduce() {
        return (crie() +  " je suis le " + getClass().getSimpleName() +
            " joueur " + playerNumber + " niveau " + niveau + " je possède " +
            vie + " de vitalité, " + force + " de force, " +
            agilite + " d'agilite et " + intelligence + " d'intelligence !");
    }

    /**
     * Demande l'action a effectuer par le joueur
     * @return String
     *              le texte a afficher
     */
    public String askPlayerAction() {
        return ("Joueur " + playerNumber + " (" + vie + " Vitalité) veuillez choisir votre action " +
                "(1 : Attaque Basique, 2 : Attaque Spécial)");
    }

    // PUBLIC ABSTRACT
    public abstract void basicAttack(Personnage p);

    public abstract void specialAttack(Personnage p);

    // PROTECTED ABSTRACT
    protected abstract String crie();
}
