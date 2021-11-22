package lesson7;

public class RobotCat {
    private String name;

    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public RobotCat(){

    }
    public RobotCat(String name, int year){
        this.name = name; //this.name = name at current
        this.year = year;
    }

    //Getters | return object attribute value
    public String getName(){
        return this.name;
    }

    //Setter | set object attribute values
    public void setName(String name){
        this.name = name;
    }
}
