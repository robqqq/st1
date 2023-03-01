package ru.itmo.se.st.task3;

public class Matchstick {
    private boolean isBurn;
    private boolean isFire;

    public Matchstick() {
        isBurn = false;
        isFire = false;
    }

    public Matchstick(boolean isBurn, boolean isFire) {
        if (isBurn && isFire) {
            System.err.println("Сгоревшая спичка не может гореть");
            return;
        }
        this.isBurn = isBurn;
        this.isFire = isFire;
    }

    public boolean fire() {
        if (isFire) {
            System.out.println("Спичка итак горела.");
            return false;
        } else if (isBurn) {
            System.out.println("Спичка не зажглась, потому что она сгоревшая.");
            return false;
        } else {
            System.out.println("Спичка зажглась.");
            isFire = true;
            return true;
        }
    }

    public boolean burn() {
        if (!isFire) {
            System.out.println("Спичка не горела, значит не могла сгореть.");
            return false;
        } else if (isBurn) {
            System.out.println("Спичка итак была сгоревшей");
            return false;
        } else {
            System.out.println("Спичка  сгорела.");
            isFire = false;
            isBurn = true;
            return true;
        }
    }
}
