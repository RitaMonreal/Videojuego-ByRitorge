 

import java.util.Objects;

public class GameRecord {
    public String playerName;
    public int score;

    public GameRecord(String playerName, int score) {
        this.playerName = playerName;
        this.score = score;
    }

    public GameRecord() {

    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameRecord that = (GameRecord) o;
        return score == that.score && Objects.equals(playerName, that.playerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerName, score);
    }
}
