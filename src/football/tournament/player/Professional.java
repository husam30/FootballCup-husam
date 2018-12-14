package football.tournament.player;

public class Professional extends Team {
    private String sponsor;
    private double budget;
    public final String teamLevel = "Professional";

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }



    public Professional(String name,String sponsor,double budget) {
        this.setName(name);
        this.setSponsor(sponsor);
        this.setBudget(budget);
        this.setPlayerCategory(teamLevel);

    }
}
