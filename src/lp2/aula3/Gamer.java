
package lp2.aula3;

import java.io.Serializable;

/**
 *
 * @author 31381243
 */
public class Gamer implements Serializable
{
    private String name;
    private int maxScore, lastScore, currentScore;

    public Gamer(String name, int maxScore, int lastScore) {
        this.name = name;
        this.maxScore = maxScore;
        this.lastScore = lastScore;
    }
public void incrementScore()
{
    this.currentScore++;
}

    public int getCurrentScore() {
        return currentScore;
    }

    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    public Gamer(String name, int maxScore, int lastScore, int currentScore) {
        this.name = name;
        this.maxScore = maxScore;
        this.lastScore = lastScore;
        this.currentScore = currentScore;
    }
    public Gamer() {
    }

    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    public int getLastScore() {
        return lastScore;
    }

    public void setLastScore(int lastScore) {
        this.lastScore = lastScore;
    }

    @Override
    public String toString() {
        return "Gamer{" + "name=" + name + ", maxScore=" + maxScore + ", lastScore=" + lastScore + ", currentScore=" + currentScore + '}';
    }
    

}
