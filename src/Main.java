// задание 3
public class Main {
    public static void main(String[] args) {
        short banana=80;
        short milk=105;
        short iceCream=100;
        short eggs=70;
        int bananaSum=banana*5;
        int milkSum=milk*2;
        int iceCreamSum=iceCream*2;
        int eggsSum=eggs*4;
        int sum=bananaSum+milkSum+iceCreamSum+eggsSum;
        System.out.println("Сумма продуктов в граммах "+sum+"гр" );
        float sumKg= (float) (sum*0.001);
        System.out.println("Сумма продуктов в килограммах "+sumKg+"кг" );
    }
}