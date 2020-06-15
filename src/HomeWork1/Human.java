package HomeWork1;

public class Human implements Motion, Participant{
    private String name;
    private double maxJump;
    private int maxRun;

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
    public Human(String name) {
        this.name = name;
        setMaxJump(Math.random() * 1.5 + 1);
        setMaxRun((int) (Math.random() * 5000 + 1000));
    }

    @Override
    public void jump(){
        System.out.println(String.format("Человек[%s] прыгает", getName()));
    }

    @Override
    public void run(){
        System.out.println(String.format("Человек[%s] бежит", getName()));
    }
}
