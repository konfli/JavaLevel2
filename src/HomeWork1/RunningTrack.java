package HomeWork1;

public class RunningTrack implements Obstacle {
    double distance;

    public RunningTrack() {
        distance = Math.random() * 5000 + 400;
    }

    @Override
    public boolean action(Participant a) {
        boolean ran;
        if (distance > a.getMaxRun()) {
            ran = false;
            System.out.println(String.format("Участник %s не смог пробежать беговую дорожку длиной: %.0f",
                    a.getName(), distance));
        } else {
            ran = true;
            System.out.println(String.format("Участник %s пробежал беговую дорожку длиной: %.0f",
                    a.getName(), distance));
        }
        return ran;
    }
}
