package football.tournament.round;

import football.tournament.player.*;
import football.tournament.player.Professional;
import football.tournament.player.Team;

import java.util.ArrayList;

public class RoundController {
    public static void startTournament(ArrayList<Professional> pro,ArrayList<Amateur> ama ){
        System.out.println("All Team Info. : \n");
        pro.forEach(proinfo -> System.out.println("Team Name : " + proinfo.getName() + ", Sponsor Name : " + proinfo.getSponsor()+ ", Team Budget : "+ proinfo.getBudget()+ ", Level : "+ proinfo.teamLevel ));
        ama.forEach(amainfo -> System.out.println("Team Name : " + amainfo.getName() + ", Pop Name : " + amainfo.getPop()+ ", Team Mascot is : "+ amainfo.getMascot()+ ", Level : "+ amainfo.teamLevel ));
    }
}
