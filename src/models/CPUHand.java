package models;

import java.util.Random;

public class CPUHand {
    Integer[] hands = { 0, 1, 2 };
    Random r = new Random();

    Integer cpuhand = hands[r.nextInt(1)];

    public Integer getCpuhand() {
        return cpuhand;
    }

    public void setCpuhand(Integer cpuhand) {
        this.cpuhand = cpuhand;
    }


}
//for (int i = 0; i < 3; i++) {
//  String hand = hands[r.nextInt(3)];//
