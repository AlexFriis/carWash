package src.carWash;

import java.util.ArrayList;
import java.util.Random;

public class WashCardIdGenerator {
    static ArrayList<Integer> idArrList = new ArrayList<>();
    private static final Random random = new Random();

    public static int idGenerator() {
        int Id = random.nextInt(100)+1;
        int i;
        for (i = 0; i < idArrList.size(); i++) {
            if (idArrListEqualsId(i, Id)) {
                Id = random.nextInt(100)+1;
            }
            else {
                idArrList.add(Id);
            }
        }
        return Id;
    }
    public static boolean idArrListEqualsId(int i, int Id) {
        return (idArrList.get(i)==(Id));
    }
}