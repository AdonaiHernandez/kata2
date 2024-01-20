package software.ulpgc;

import java.io.File;
import java.util.List;

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

        System.out.println(gamesFromFile.get(0));

    }

}
