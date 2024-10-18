public class Main {
    public static void main(String[] args) {
        //Задача 1
        int a = 33_333;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 33;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = 333;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 3_333_333_333_333L;
        System.out.println("Значение переменной d с типом long равно " + d);
        float i = 3.1234567f;
        System.out.println("Значение переменной i с типом float равно " + i);
        double f = 3.123456789;
        System.out.println("Значение переменной f с типом double равно " + f);
        //Задача 2
        float ii = 27.12f;
        long dd = 987_678_965_549L;
        float iii = 2.786f;
        short cc = 569;
        short ccc = -159;
        short cccc = 27_897;
        byte aa = 67;
        //Задача 3
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short sheetsPaper = 480;
        int sheetsPaperOneStudent = sheetsPaper / (ludmilaPavlovna+annaSergeevna+ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + sheetsPaperOneStudent + " листов бумаги");
        //Задача 4
        byte bottles = 16;
        byte time = 2;
        byte efficiency1 = 20;
        short efficiency2 = 1_440;
        short efficiency3 = 4_320;
        int efficiency4 = 43_200;
        System.out.println("За 20 минут машина произвела " + efficiency1/time*bottles + " штук бутылок" );
        System.out.println("За сутки машина произвела " + efficiency2/time*bottles + " штук бутылок");
        System.out.println("за 3 дня машина произвела " + efficiency3/time*bottles + " штук бутылок");
        System.out.println("за месяц машина произвела " + efficiency4/time*bottles + " штук бутылок");
        //Задача 5
        byte cans = 120;
        byte cansWhitePaint = 2;
        byte cansBrownPaint = 4;
        int classes = cans/(cansWhitePaint+cansBrownPaint);
        System.out.println("В школе, где " + classes + " классов, нужно " + cansWhitePaint*classes + " банок белой краски и " + cansBrownPaint*classes + " банок коричневой краски");
        //Задача 6
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte eggs = 70;
        int weightBanana = banana*5;
        int weightMilk = milk*2;
        int weightIceCream = iceCream*2;
        int weightEggs = eggs*4;
        int weightBreakFast1 = weightEggs+weightIceCream+weightMilk+weightBanana;
        System.out.println("Вес завтрака спортсмена " + weightBreakFast1 + " грамм");
        float weightBreakFast2 = weightBreakFast1/1000f;
        System.out.println("Вес завтрака спортсмена " + weightBreakFast2 + " килограмм");
        //Задача 7
        byte weight = 7;
        float throwOffWeight1 = 250/1000f;
        float throwOffWeight2 = 500/1000f;
        float day1 = weight/throwOffWeight1;
        float day2 = weight/throwOffWeight2;
        float averageDay = (day1+day2)/2;
        System.out.println(day1+ " дней нужно спортсмену, если сбрасывать в день по 250г");
        System.out.println(day2 + " дней нужно спортсмену, если сбрасывать в день по 500г");
        System.out.println("В среднем, спортсмену понадобится " + averageDay + " день");
        //Задача 8
        int incomeMawa = 67_760;
        int incomeDenis = 83_690;
        int incomeKristina = 76_230;
        int incomeMawaElevated = incomeMawa + (incomeMawa/100*10);
        int incomeDenisElevated = incomeDenis + (incomeDenis/100*10);
        int incomeKristinaElevated = incomeKristina + (incomeKristina/100*10);
        int differenceIncomeMawaYear = (incomeMawaElevated - incomeMawa)*12;
        int differenceIncomeDenisYear = (incomeDenisElevated - incomeDenis)*12;
        int differenceIncomeKristinaYear = (incomeKristinaElevated - incomeKristina)*12;
        System.out.println("Маша теперь получает " + incomeMawaElevated + " рублей. Годовой доход вырос на " +differenceIncomeMawaYear+" рублей");
        System.out.println("Денис теперь получает " + incomeDenisElevated + " рублей. Годовой доход вырос на " +differenceIncomeDenisYear+" рублей");
        System.out.println("Кристина теперь получает " + incomeKristinaElevated + " рублей. Годовой доход вырос на " +differenceIncomeKristinaYear+" рублей");

    }

}