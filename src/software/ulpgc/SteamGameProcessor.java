package software.ulpgc;

import java.util.List;
import java.util.Map;

public interface SteamGameProcessor {

    Map<String, Integer> process(List<SteamGame> games);

}
