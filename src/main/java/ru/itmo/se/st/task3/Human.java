package ru.itmo.se.st.task3;

public class Human {
    private String name;
    private Posture posture;

    public Human (String name) {
        this.name = name;
        posture = Posture.STAND;
    }

    public Human (String name, Posture posture) {
        this.name = name;
        this.posture = posture;
    }

    public void lightUp (Matchstick matchstick) {
        if (matchstick.fire() ) {
            System.out.printf("%s зажёг спичку", name);
        } else {
            System.out.printf("%s не смог зажечь спичку", name);
        }
    }

    public void standUp () {
        if (posture == Posture.STAND) {
            System.out.printf("%s попытался встать, хотя он уже стоял.", name);
        } else {
            System.out.printf("%s встал из положения %s", name, posture.getPostureAdj());
        }
    }


}
