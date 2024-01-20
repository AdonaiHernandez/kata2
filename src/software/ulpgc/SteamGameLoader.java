package software.ulpgc;

import java.util.List;

public interface SteamGameLoader {

    List<SteamGame> load() throws java.io.IOException;

}
