package football.tournament.player;

public class Amateur extends Team {
    private String pub;
    private String mascot;
    public final String teamLevel = "Amateur";

    public String getPop() {
        return pub;
    }

    public void setPop(String pub) {
        this.pub = pub;
    }

    public String getMascot() {
        return mascot;
    }

    public void setMascot(String mascot) {
        this.mascot = mascot;
    }

    public Amateur(String name,String pub,String mascot) {
        this.setName(name);
        this.setPop(pub);
        this.setMascot(mascot);
        this.setPlayerCategory(teamLevel);

    }
}
