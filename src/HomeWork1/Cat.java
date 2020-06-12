package HomeWork1;

public class Cat implements Motion, Participant {
    private String name;
    private double maxJump;
    private int maxRun;

    public Cat(String name) {
        this.name = name;
        setMaxJump(Math.random() * 1.5 + 0.5);
        setMaxRun((int) (Math.random() * 1000 + 500));
    }
    public String getName() {
        return name;
    }

    public double getMaxJump() {
        return maxJump;
    }

    public void setMaxJump(double maxJump) {
        this.maxJump = maxJump;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public void setMaxRun(int maxRun) {
        this.maxRun = maxRun;
    }

    @Override
    public void jump() {
        System.out.println(String.format("Кот[%s] прыгает", getName()));
    }

    @Override
    public void run() {
        System.out.println(String.format("Кот[%s] бежит", getName()));
    }
}
