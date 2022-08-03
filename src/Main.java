// задание 5
public class Main {
    public static void main(String[] args) {
        int MashaZp =67_760;
        int DenisZp =83_690;
        int KristinaZp =76_230;
        int PovihenieMashiZp =(MashaZp/10)+MashaZp;
        int PovihenieDenisZp =(DenisZp/10)+DenisZp;
        int PovihenieKristinaZp =(KristinaZp/10)+KristinaZp;
        int RasnizaMashiZp =(PovihenieMashiZp*12)-(MashaZp*12);
        int RasnizaDenisZp =(PovihenieDenisZp*12)-(DenisZp*12);
        int RasnizaKristinaZp =(PovihenieKristinaZp*12)-(KristinaZp*12);


        System.out.println("Маша теперь получает "+PovihenieMashiZp+" рублей в месяц. Годовой доход вырос на "+RasnizaMashiZp +" рублей");
        System.out.println("Денис теперь получает "+PovihenieDenisZp+" рублей в месяц. Годовой доход вырос на "+RasnizaDenisZp +" рублей");
        System.out.println("Кристина теперь получает "+PovihenieKristinaZp+" рублей в месяц. Годовой доход вырос на "+RasnizaKristinaZp +" рублей");

    }
}