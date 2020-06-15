package HomeWork1;

public class App {
    public static void main(String[] args) {
        race(getParticipants(),getObstacle());
    }

    public static Participant[] getParticipants() {
        Participant[] participants = {new Cat("Барсик"), new Robot("Robocop"), new Human("Вася")};
        return participants;
    }

    public static Obstacle[] getObstacle() {
        Obstacle[] obstacles = {new Wall(), new RunningTrack(), new Wall(), new RunningTrack()};
        return obstacles;

    }

    public static void race(Participant[] x, Obstacle[] y) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                if (!y[j].action(x[i])) {
                    System.out.print(String.format("%s не преодолел препядствие и выходит из гонки!", x[i].getName()));
                    break;
                }
            }

            System.out.println();
        }
    }
}
