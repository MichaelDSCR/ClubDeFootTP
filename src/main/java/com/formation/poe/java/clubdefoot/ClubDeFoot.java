package com.formation.poe.java.clubdefoot;

public class ClubDeFoot {
    private String nom;
    private int matchsRemportes;
    private int matchsNuls;
    private int matchsPerdus;
    private int butsMarques;

    public ClubDeFoot(String nom) {
        this.nom = nom;
        this.matchsRemportes = 0;
        this.matchsNuls = 0;
        this.matchsPerdus = 0;
        this.butsMarques = 0;
    }

    public String getNom() {
        return nom;
    }

    public int getMatchsRemportes() {
        return matchsRemportes;
    }

    public void setMatchsRemportes(int matchsRemportes) {
        if (matchsRemportes < 0) {
            throw new IllegalArgumentException("Le nombre de matchs remportés ne peut pas être négatif");
        }
        this.matchsRemportes = matchsRemportes;
    }

    public int getMatchsNuls() {
        return matchsNuls;
    }

    public void setMatchsNuls(int matchsNuls) {
        if (matchsNuls < 0) {
            throw new IllegalArgumentException("Le nombre de matchs nuls ne peut pas être négatif");
        }
        this.matchsNuls = matchsNuls;
    }

    public int getMatchsPerdus() {
        return matchsPerdus;
    }

    public void setMatchsPerdus(int matchsPerdus) {
        if (matchsPerdus < 0) {
            throw new IllegalArgumentException("Le nombre de matchs perdus ne peut pas être négatif");
        }
        this.matchsPerdus = matchsPerdus;
    }

    public int getButsMarques() {
        return butsMarques;
    }

    public void setButsMarques(int butsMarques) {
        if (butsMarques < 0) {
            throw new IllegalArgumentException("Le nombre de buts marqués ne peut pas être négatif");
        }
        this.butsMarques = butsMarques;
    }

    public int getScore() {
        return (matchsRemportes * 3) + matchsNuls;
    }

    @Override
    public String toString() {
        return "ClubDeFoot{" +
                "nom='" + nom + '\'' +
                ", matchsRemportes=" + matchsRemportes +
                ", matchsNuls=" + matchsNuls +
                ", matchsPerdus=" + matchsPerdus +
                ", butsMarques=" + butsMarques +
                ", score=" + getScore() +
                '}';
    }
}
