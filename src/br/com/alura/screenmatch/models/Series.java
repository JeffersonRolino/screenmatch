package br.com.alura.screenmatch.models;

public class Series extends Title {
    private int seasons;
    private boolean isInProgress;
    private int numberOfEpisodesBySeason;
    private int minutesByEpisode;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isInProgress() {
        return isInProgress;
    }

    public void setInProgress(boolean inProgress) {
        isInProgress = inProgress;
    }

    public int getNumberOfEpisodesBySeason() {
        return numberOfEpisodesBySeason;
    }

    public void setNumberOfEpisodesBySeason(int numberOfEpisodesBySeason) {
        this.numberOfEpisodesBySeason = numberOfEpisodesBySeason;
    }

    public int getMinutesByEpisode() {
        return minutesByEpisode;
    }

    public void setMinutesByEpisode(int minutesByEpisode) {
        this.minutesByEpisode = minutesByEpisode;
    }

    @Override
    public int getDurationInMinutes() {
        return this.seasons * this.numberOfEpisodesBySeason * this.minutesByEpisode;
    }
}
