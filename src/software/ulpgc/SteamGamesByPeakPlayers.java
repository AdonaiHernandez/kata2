package software.ulpgc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SteamGamesByPeakPlayers implements SteamGameProcessor{

    @Override
    public Map<String, Integer> process(List<SteamGame> games) {
        Map<String, Integer> lista = new HashMap<>();

        games.forEach((game) -> {
            lista.put(game.getName(), game.getAllTimePeakPlayers());
        });

        return lista;
    }
}
