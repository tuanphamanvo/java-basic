package lesson7;

public class MethodOverloading {

    public int sum(int num1, int num2){
        return num1+num2;
    }
    public int sum(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public int sum(int num1, String num2){
        return num1;
    }


    //Rest params | Varagrs
//    public int sum(int ...nums){
//        System.out.println("Length: "+ nums.length);
//        int total = 0;
//        for (int num : nums) {
//            total = total+num;
//        }
//        return total;
//    }

    public int sum(int count, int ...nums){
        System.out.println("Length: "+ nums.length);
        int total = 0;
        for (int num : nums) {
            total = total+num;
        }
        return total;
    }

    public static void main(String[] args) {
        MethodOverloading calculator = new MethodOverloading();
        calculator.sum(1,2);
        calculator.sum(1,2,3);
        calculator.sum(1,"abc");
        calculator.sum(1,2,3,4,5,6);
    }
}
