package football.tournament.round;
import football.tournament.player.*;

public class Round {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Round(String name) {

        this.name = name;
    }
}
