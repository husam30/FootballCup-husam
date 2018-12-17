package football.tournament.round;

import football.tournament.player.*;
import football.tournament.player.Professional;
import football.tournament.player.Team;

import java.util.ArrayList;

public class RoundController {
    public static void startTournament(ArrayList<Team> teams) {
        System.out.println("All Team Info. : \n");

        for (Team team : teams) {
            if (team.getClass().equals(Professional.class)) {
                team = (Professional) team;
                System.out.println("Team Name : " + team.getName() + ", Sponsor Name : " + ((Professional) team).getSponsor() + ", Team Budget : " + ((Professional) team).getBudget() + ", Level : " + team.getteamCategory());
            } else if (team.getClass().equals(Amateur.class)) {
                team = (Amateur) team;
                System.out.println("Team Name : " + team.getName() + ", Pop Name : " + ((Amateur) team).getPop() + ", Team Mascot is : " + ((Amateur) team).getMascot() + ", Level : " + team.getteamCategory());
            }
        }
    }

    public static ArrayList<Team> roundResults(Round round, ArrayList<Team> playerList) {

        System.out.println("\n \n------------  Ronde " + round.getName() + "  ------------    \n\n");

        ArrayList<Team> firstGroup = new ArrayList();
        ArrayList<Team> secondGroup = new ArrayList();

        for (int i = 0; i < playerList.size(); i = i + 2) {
            firstGroup.add(playerList.get(i));
            secondGroup.add(playerList.get(i + 1));
        }

        ArrayList<Team> winnenPlayers = new ArrayList();

        for (int i = 0; i < firstGroup.size(); i++) {
            System.out.println("\n   Game " + (i + 1) + ": ");
            System.out.println(firstGroup.get(i).getName() + " VS " + secondGroup.get(i).getName());


            int player1Score = 1 + (int) (Math.random() * ((50 - 1) + 1));
            int player2Score = 1 + (int) (Math.random() * ((50 - 1) + 1));
            if (player1Score > player2Score) {
                winnenPlayers.add(firstGroup.get(i));
            } else if (player1Score < player2Score) {
                winnenPlayers.add(secondGroup.get(i));
            } else {
                winnenPlayers.add(secondGroup.get(i));
            }

        }
        System.out.println("\n\n ------------- Round " + round.getName() + "Winning Team ------------- \n\n ");
        for (Team team : winnenPlayers) {
            if (team.getClass().equals(Professional.class)) {
                team = (Professional) team;
                System.out.println("Team Name : " + team.getName() + ", Sponsor Name : " + ((Professional) team).getSponsor() + ", Team Budget : " + ((Professional) team).getBudget() + ", Level : " + team.getteamCategory());
            } else if (team.getClass().equals(Amateur.class)) {
                team = (Amateur) team;
                System.out.println("Team Name : " + team.getName() + ", Pop Name : " + ((Amateur) team).getPop() + ", Team Mascot is : " + ((Amateur) team).getMascot() + ", Level : " + team.getteamCategory());
            }
        }

        return winnenPlayers;
    }

    public static void endTournament(ArrayList<Team> teams) {
        System.out.println("\n\n -------------The final Round " + "Winning Team ------------- \n\n ");
        for (Team team : teams) {
            if (team.getClass().equals(Professional.class)) {
                team = (Professional) team;
                System.out.println("Winner of tournament is: " + team.getName() + ", Sponsor Name : " + ((Professional) team).getSponsor() + ", Team Budget : " + ((Professional) team).getBudget() + ", Level : " + team.getteamCategory());
            } else if (team.getClass().equals(Amateur.class)) {
                team = (Amateur) team;
                System.out.println("Winner of tournament is:" + team.getName() + ", Pop Name : " + ((Amateur) team).getPop() + ", Team Mascot is : " + ((Amateur) team).getMascot() + ", Level : " + team.getteamCategory());
            }
        }
    }
}
