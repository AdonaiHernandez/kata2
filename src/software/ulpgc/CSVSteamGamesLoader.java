package software.ulpgc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CSVSteamGamesLoader implements  SteamGameLoader{

    private File file;

    public CSVSteamGamesLoader(File file) {
        this.file = file;
    }

    @Override
    public List<SteamGame> load() throws java.io.IOException{
        List<SteamGame> list = new ArrayList<>();

        FileReader reader = new FileReader(file);

        BufferedReader buffer = new BufferedReader(reader);

        String line = buffer.readLine();

        while (line != null){
            list.add(toSteamGame(line));
        }

        buffer.close();

        return list;
    }

    private SteamGame toSteamGame(String line){

        String[] columns = line.split("\",\"");

        int column4 = Integer.parseInt(columns[4].replaceAll(",|\"", ""));
        int column3 = Integer.parseInt(columns[3].replaceAll(",|\"", ""));

        return new SteamGame(columns[1], column4, column3);
    }
}
