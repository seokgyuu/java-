package com.javaex.objectclass.ex2;

import java.util.Arrays;

// clone 메서드 이용을 위해 Cloneable 인터페이스를 구현
public class Scoreboard implements Cloneable {
    private int scores[];

    public Scoreboard(int[] scores) {
        this.scores = scores;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Scoreboard [scores=" + Arrays.toString(scores) + "]";
    }

    // 복제본 생성 메서드
    public Scoreboard getClone() {
        Scoreboard clone = null;

        try {
            clone = (Scoreboard) super.clone();
            clone.scores = Arrays.copyOf(scores, scores.length);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Scoreboard clone = (Scoreboard) super.clone();
        clone.scores = Arrays.copyOf(scores, scores.length);
        return clone;
    }
}
