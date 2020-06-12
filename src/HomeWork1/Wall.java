package HomeWork1;

public class Wall implements Obstacle {

    private double height;

    public Wall() {
        height = Math.random() * 1 + 0.1;
    }

    @Override
    public boolean action(Participant a) {
        boolean jumpedOver;
        if (height > a.getMaxJump()) {
            jumpedOver = false;
            System.out.println(String.format("Участник %s не смог перепрыгнуть через стену высотой: %.2f",
                    a.getName(), height));
        } else {
            jumpedOver = true;
            System.out.println(String.format("Участник %s перепрыгнул через стену высотой: %.2f",
                    a.getName(), height));
        }
        return jumpedOver;
    }
}
