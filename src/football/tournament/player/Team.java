package football.tournament.player;

public abstract class Team {
    private String name;
    private String teamCategory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getteamCategory() {
        return teamCategory;
    }

    public void setPlayerCategory(String teamCategory) {
        this.teamCategory = teamCategory;
    }


}
