package Students_task;

public class Student3 extends Student {
    private double learnhours, flow, razbor,TotalTime;
    private double talant;
    private String name;

    public Student3 (String name) {
        this.name=name;
    }

    @Override
    public void getLearnHours(double talant) {
        learnhours = (learnHour*3)/talant;
        flow = learnhours;
        razbor = learnhours;
        TotalTime = learnhours + flow + razbor;
        System.out.println("Студент " + name+ " тип 3" + " талант " + talant);
        System.out.println("Общее время " + TotalTime);
        System.out.println("Время на поток " + flow);
        System.out.println("Время на разбор " + razbor);
        System.out.println("Время на практику " + learnhours);
    }

}
