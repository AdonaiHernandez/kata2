package software.ulpgc;

import java.io.File;
import java.util.List;
import java.util.Map;

public class main {

    public static void main(String[] args) {

        SteamGameLoader loader = new CSVSteamGamesLoader(new File("data.csv"));

        List<SteamGame> gamesFromFile = null;

        try {
            gamesFromFile = loader.load();
        } catch (java.io.IOException e){

        }

        if (gamesFromFile == null){
            return;
        }

        SteamGameProcessor processor = new SteamGamesByPeakPlayers();

        Map<String, Integer> games = processor.process(gamesFromFile);

        games.forEach((name, count) -> {
            System.out.println(name+": "+count);
        });

    }

}
