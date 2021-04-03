package Students_task;

public class Student implements Learning {
    public final int learnHour = 66;
    private double learnhours;
    private double talant,TotalTime,flow,razbor;
    private String name;

    public Student(String name, double talant) {
        this.name=name;
        this.talant = talant;
    }

    public Student() {
    }

    public double getLearnHours(double talant) {
        learnhours = learnHour/talant;
        flow = learnhours;
        razbor = learnhours;
        TotalTime = learnhours + flow + razbor;
        System.out.println("Студент " + name + "тип 1" + " талант " + talant);
        System.out.println("Общее время " + TotalTime);
        System.out.println("Время на поток " + flow);
        System.out.println("Время на разбор " + razbor);
        System.out.println("Время на практику " + learnhours);
        return TotalTime;
    }
}
