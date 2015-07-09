package co.mobiwise.rakimuzikleri.model;

import java.util.List;

/**
 * Created by yusufcakmak on 6/23/15.
 */
public class ServiceReturn {

    private List<Service> songsList;

    public List<Service> getSongsList() {
        return songsList;
    }

    public void setServiceList(List<Service> songsList) {
        this.songsList = songsList;
    }
}
