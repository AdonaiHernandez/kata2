package software.ulpgc;

public class SteamGame {

    private final String name;
    private final int last24HPlayers;
    private final int allTimePeakPlayers;

    public SteamGame(String name, int last24HPlayers, int allTimePeakPlayers) {
        this.name = name;
        this.last24HPlayers = last24HPlayers;
        this.allTimePeakPlayers = allTimePeakPlayers;
    }

    @Override
    public String toString() {
        return "SteamGame{" +
                "name='" + name + '\'' +
                ", last24HPlayers=" + last24HPlayers +
                ", allTimePeakPlayers=" + allTimePeakPlayers +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getLast24HPlayers() {
        return last24HPlayers;
    }

    public int getAllTimePeakPlayers() {
        return allTimePeakPlayers;
    }
}
