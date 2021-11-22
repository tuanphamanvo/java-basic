package lesson7;

public class TestRobotCat {
    public static void main(String[] args) {
        RobotCat robotCat = new RobotCat();
        RobotCat robotCat1 = new RobotCat("abc",1991);
        System.out.println(robotCat1.getName());
        robotCat1.setName("Doraemon");
        System.out.println(robotCat1.getName());
        robotCat1.setYear(1990);
        System.out.println(robotCat1.getYear());
        //. | dot notation
    }
}
