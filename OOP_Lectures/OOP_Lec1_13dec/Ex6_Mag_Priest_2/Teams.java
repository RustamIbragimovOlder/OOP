package OOP_Lectures.OOP_Lec1_13dec.Ex6_Mag_Priest_2;

import java.util.Random;

public class Teams {
    public static void main(String[] args) {
        int teamCount = 10;
        Random rand = new Random();
        int magicianCount = rand.nextInt(0, teamCount);
        int priestCount = teamCount - magicianCount;

        System.out.printf("magicalCount: %d priestCount: %d \n", magicianCount, priestCount);

        Priest[] priests = new Priest[priestCount];
        Magician[] magicians = new Magician[magicianCount]; 

        for (int i = 0; i < priestCount; i++) {
            priests[i] = new Priest();
            System.out.println(priests[i].getInfo());
        }
        System.out.println();

        for (int i = 0; i < magicianCount; i++) {
            magicians[i] = new Magician();
            System.out.println(magicians[i].getInfo());
        }

    }

}
