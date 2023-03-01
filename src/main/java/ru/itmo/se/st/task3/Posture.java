package ru.itmo.se.st.task3;

public enum Posture {
    LAY ("лежать", "лёжа"),
    SIT ("сидеть", "сидя"),
    STAND ("стоять", "стоя");

    private String postureVerb;
    private String postureAdj;

    Posture(String postureVerb, String postureAdj) {
        this.postureVerb = postureVerb;
        this.postureAdj = postureAdj;
    }

    public String getPostureAdj() {
        return postureAdj;
    }

    public String getPostureVerb() {
        return postureVerb;
    }
}
