package Students_task;

public class Student2 extends Student {
    private double learnhours;
    private double talant,flow,razbor,TotalTime;
    private String name;

    public Student2 (String name) {
        this.name = name;
    }


    public void getLearnHours(double talant) {
        learnhours = (learnHour*2)/talant;
        flow = learnhours;
        razbor = learnhours;
        TotalTime = learnhours + flow + razbor;
        System.out.println("Студент " +name+" тип 2" + " талант" + talant);
        System.out.println("Общее время " + TotalTime);
        System.out.println("Время на поток " + flow);
        System.out.println("Время на разбор " + razbor);
        System.out.println("Время на практику " + learnhours);
    }
}
