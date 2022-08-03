// задание 4
public class Main {
    public static void main(String[] args) {
        int excessWeightKg =7;
        int excessWeightGr= excessWeightKg*1000;
        int diet250= 250;
        int diet500= 500;
        int weightLoss250= excessWeightGr/diet250;
        int weightLoss500= excessWeightGr/diet500;
        System.out.println("Спортсмен похудеет за "+weightLoss250+" дней, при диете на 250гр" );
        System.out.println("Спортсмен похудеет за "+weightLoss500+" дней, при диете на 500гр" );
        int totalDays= (weightLoss250+weightLoss500)/2;
        System.out.println("Может потребоваться "+totalDays+" день в среднем, чтобы добиться результата похудения");
    }
}