package Students_task;

public class Student1 extends Student {
    private double learnhours, flow, razbor,TotalTime;
    private double talant;
    private String name;

    public Student1 (String name) {
        this.name=name;
    }

    @Override
    public double getLearnHours(double talant) {
        learnhours = learnHour/talant;
        flow = learnhours;
        razbor = learnhours;
        TotalTime = learnhours + flow + razbor;
        System.out.println("Студент " + name+ " тип 1" + " талант " + talant);
        System.out.println("Общее время " + TotalTime);
        System.out.println("Время на поток " + flow);
        System.out.println("Время на разбор " + razbor);
        System.out.println("Время на практику " + learnhours);
        return TotalTime;
    }
}
