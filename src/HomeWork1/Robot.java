package HomeWork1;

public class Robot implements Motion, Participant {
    private String name;
    private double maxJump;
    private int maxRun;

    public Robot(String name) {
        this.name = name;
        setMaxJump(Math.random() * 2 + 0.2);
        setMaxRun((int) (Math.random() * 5000 + 500));
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
    public void jump(){
        System.out.println(String.format("Robot[%s] is jumping", this.name));
    }

    @Override
    public void run(){
        System.out.println(String.format("Robot[%s] is running", this.name));
    }
}
