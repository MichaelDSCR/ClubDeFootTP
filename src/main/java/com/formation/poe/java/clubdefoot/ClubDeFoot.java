package com.formation.poe.java.clubdefoot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClubDeFoot {
    private static final Logger logger = LoggerFactory.getLogger(ClubDeFoot.class);

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
        logger.debug("Création du club : {}", nom);
    }

    public String getNom() {
        return nom;
    }

    public int getMatchsRemportes() {
        return matchsRemportes;
    }

    public void setMatchsRemportes(int matchsRemportes) {
        if (matchsRemportes < 0) {
            logger.error("Tentative de définir un nombre négatif de matchs remportés");
            throw new IllegalArgumentException("Le nombre de matchs remportés ne peut pas être négatif");
        }
        this.matchsRemportes = matchsRemportes;
        logger.info("Matchs remportés mis à jour à : {}", matchsRemportes);
    }

    public int getMatchsNuls() {
        return matchsNuls;
    }

    public void setMatchsNuls(int matchsNuls) {
        if (matchsNuls < 0) {
            logger.error("Tentative de définir un nombre négatif de matchs nuls");
            throw new IllegalArgumentException("Le nombre de matchs nuls ne peut pas être négatif");
        }
        this.matchsNuls = matchsNuls;
        logger.info("Matchs nuls mis à jour à : {}", matchsNuls);
    }

    public int getMatchsPerdus() {
        return matchsPerdus;
    }

    public void setMatchsPerdus(int matchsPerdus) {
        if (matchsPerdus < 0) {
            logger.error("Tentative de définir un nombre négatif de matchs perdus");
            throw new IllegalArgumentException("Le nombre de matchs perdus ne peut pas être négatif");
        }
        this.matchsPerdus = matchsPerdus;
        logger.info("Matchs perdus mis à jour à : {}", matchsPerdus);
    }

    public int getButsMarques() {
        return butsMarques;
    }

    public void setButsMarques(int butsMarques) {
        if (butsMarques < 0) {
            logger.error("Tentative de définir un nombre négatif de buts marqués");
            throw new IllegalArgumentException("Le nombre de buts marqués ne peut pas être négatif");
        }
        this.butsMarques = butsMarques;
        logger.info("Buts marqués mis à jour à : {}", butsMarques);
    }

    public int getScore() {
        int score = (matchsRemportes * 3) + matchsNuls;
        logger.trace("Calcul du score pour {} : {}", nom, score);
        return score;
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
