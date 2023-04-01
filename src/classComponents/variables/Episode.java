package classComponents.variables;

public class Episode {
    int episodeId;
    String episodeTitle;

    public Episode() {
    }

    public Episode(int episodeId, String episodeTitle) {
        this.episodeId = episodeId;
        this.episodeTitle = episodeTitle;
    }

    public int getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(int episodeId) {
        this.episodeId = episodeId;
    }

    public String getEpisodeTitle() {
        return episodeTitle;
    }

    public void setEpisodeTitle(String episodeTitle) {
        this.episodeTitle = episodeTitle;
    }
}
