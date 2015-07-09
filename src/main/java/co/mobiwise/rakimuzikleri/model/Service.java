package co.mobiwise.rakimuzikleri.model;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.persistence.*;

/**
 * Created by yusufcakmak on 6/23/15.
 */

@Entity
@Table(name="service")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Service {


    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;


    @Column(name="songName")
    private String songName;

    @Column(name="singerName")
    private String singerName;

    @Column(name="songUrl")
    private String songUrl;

    @Column(name="viewCount")
    private int songViewCount;

    @Column(name="isApproved")
    private String isApproved;

    public String getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(String isApproved) {
        this.isApproved = isApproved;
    }

    public int getSongViewCount() {
        return songViewCount;
    }

    public void setSongViewCount(int songViewCount) {
        this.songViewCount = songViewCount;
    }

    public String getSongUrl() {
        return songUrl;
    }

    public void setSongUrl(String songUrl) {
        this.songUrl = songUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

}
