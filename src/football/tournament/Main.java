package football.tournament;
import football.tournament.player.*;
import football.tournament.round.*;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] professionalListName = {"ARGENTINA", "BRAZIL", "BELGIUM", "GERMANY"};
        String[] professionalSponsorListName = {"Dhl", "Sony", "Coca Cola", "Opel"};
        double[] professionalBudgetList = {1500, 2000,5000, 4000};

        String[] amateurlListName = {"Russia", "Netherland", "Iran", "Iceland"};
        String[] amateurlPubList = {"Ace of Clubs", "Alibi Bar", "The Aidensfield Arm", "The Anchor"};
        String[] amateurlMascotList = {"The Jolly Kangaroo", "The Cheery Donkey", "The Brown Peafowl", "Twinkles"};

        ArrayList<Professional> allprofessional = new ArrayList();
        ArrayList<Amateur> allAmateur = new ArrayList();

        for (int i = 0; i < professionalListName.length; i++) {
            allprofessional.add(new Professional(professionalListName[i],professionalSponsorListName[i],professionalBudgetList[i]));
        }
        for (int i = 0; i < amateurlListName.length; i++) {
            allAmateur.add(new Amateur(amateurlListName[i],amateurlPubList[i],amateurlMascotList[i]));
        }
        Round round1 = new Round("One");
        Round round2 = new Round("Two");
        Round round3 = new Round("Three");

        RoundController.startTournament(allprofessional,allAmateur);

    }
}
