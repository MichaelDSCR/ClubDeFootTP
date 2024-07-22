package com.formation.poe.java.clubdefoot;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ClubDeFoot> clubs = new ArrayList<>();

        ClubDeFoot club1 = new ClubDeFoot("Paris Saint-Germain");
        club1.setMatchsRemportes(20);
        club1.setMatchsNuls(5);
        club1.setMatchsPerdus(3);
        club1.setButsMarques(60);

        ClubDeFoot club2 = new ClubDeFoot("Marseille");
        club2.setMatchsRemportes(18);
        club2.setMatchsNuls(6);
        club2.setMatchsPerdus(4);
        club2.setButsMarques(55);

        ClubDeFoot club3 = new ClubDeFoot("Lyon");
        club3.setMatchsRemportes(15);
        club3.setMatchsNuls(10);
        club3.setMatchsPerdus(3);
        club3.setButsMarques(50);

        clubs.add(club1);
        clubs.add(club2);
        clubs.add(club3);

        System.out.println("Clubs triés par nom:");
        clubs.sort(Comparator.comparing(ClubDeFoot::getNom));
        for (ClubDeFoot club : clubs) {
            System.out.println(club);
        }

        System.out.println("\nClubs triés par classement:");
        clubs.sort((c1, c2) -> {
            int scoreComparison = Integer.compare(c2.getScore(), c1.getScore());
            if (scoreComparison == 0) {
                return Integer.compare(c2.getButsMarques(), c1.getButsMarques());
            }
            return scoreComparison;
        });
        for (ClubDeFoot club : clubs) {
            System.out.println(club);
        }
    }
}
