package Geekbrains1;

public class Firstlesson {
    public static void main(String[] args) {
        //задание №1 : Создать пустой проект в IntelliJ IDEA и прописать метод main().
        System.out.println("Урок №1");
        System.out.println();
        System.out.println("задание №1 : Создан пустой проект в IntelliJ IDEA и прописан метод main()");
        System.out.println();
        // задание №2 : Создать переменные всех пройденных типов данных и инициализировать их значения.
        System.out.println("задание №2");
        byte byte_a=-112;
        System.out.println(byte_a);
        int int_b=21474836;
        System.out.println(int_b);
        long long_C;
        long_C = 925471111;//так тоже можно : объявляется переменная, а потом ей присваивается значение.
        System.out.println(long_C);
        float flat_d= (float) 12.4568f;
        System.out.println(flat_d);
        double double_float_e= 3.1415926;
        /* для переменной с плавающей запятой нужно указывать f в конце значения,
        а для с плавающей запятой и двойной точностью не надо ни чего указывать по умолчанию
        после компиляции появится D в конце значения такой переменной
         */
        System.out.println(double_float_e);
        char char_f='e';
        System.out.println(char_f);
        boolean boolean_g= false;
        boolean boolean_h= true;
        System.out.println(boolean_g);
        System.out.println(boolean_h);
        String string_1="Хоба";
        System.out.println(string_1);
        System.out.println();

        // задание №3 : вычислялки:написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        // где a, b, c, d – аргументы этого метода, имеющие тип float.
        System.out.println("Задание №3");
        float l= expression(2.5f, 3.7f, 5.4f,6.9f);
        System.out.println(l);
        System.out.println();

        // задание №4 Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
        //(включительно), если да – вернуть true, в противном случае – false.
        System.out.println("Задание №4");
        int r= 8; int t=9;
        System.out.println(sum_a_plus_b_in_range_between_c_and_d(r,t,10,20));
        System.out.println();

        // задание №5 Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
        //    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
        System.out.println("Задание №5");

        int y=-35;
        System.out.println("Вот число:"+y);
        System.out.println("Метод P-OR-N, ответь какое оно?");
        positive_or_negative(y);
        System.out.println();

        // задание №6 Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть
        // true, если число отрицательное, и вернуть false если положительное.
        System.out.println("Задание №6");
        int q=-45;
        System.out.println("А вот это число?:"+q);
        System.out.println("Метод N-i-T-oro ответь, оно отрицательное?");
        if(negative_is_true_or_othervise(q)== true) System.out.println("Ага - true");
        else System.out.println("Неа - false");
        System.out.println();

         // задание №7 - Написать метод, которому в качестве параметра передается строка, обозначающая имя.
         // Метод должен вывести в консоль сообщение «Привет, указанное_имя!»
        System.out.println("Задание №7");
        print_your_name("Виталий");
        System.out.println();

        // задание №8 - написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
        // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
        System.out.println("Задание №8");
        visokos(2022);
        System.out.println("Вуа ля");


    }


    // метод к заданию №3 возвращает число c плавающей запятой, принимает на вход четыре числа c плавающей запятой
    public static float expression(float a, float b, float c, float d) {
        // возвращаем вычисленное значение выражения по формуле a * (b + (c / d))
        return a * (b + (c / d));
        // алиллуйя
    }

    /* метод к заданию №4 - метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    (включительно), если да – вернуть true, в противном случае – false.
     */

    public static boolean sum_a_plus_b_in_range_between_c_and_d(int a,int b, int c, int d) {
        if(a+b>c && a+b<d) {
            return true;
        }
        return false;
    }

    /* метод к заданию №5 - метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */
    public static int positive_or_negative(int a) {
        if(a>=0) {
            System.out.println("Разумеется, это положительное число");} else {
        System.out.println("Это отрицательное число, глупый вопрос");}
        return a;
    }

    /* метод к заданию №6 - метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    если число отрицательное, и вернуть false если положительное.
     */
    public static boolean negative_is_true_or_othervise(int a) {
        if(a>=0) {
        return false;}
        return true;
    }

    /* метод к заданию №7 - метод, которому в качестве параметра передается строка, обозначающая имя.
    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    */
    public static void print_your_name(String txtToPrint) {
    // выводим строку txtToPrint в консоль
        System.out.println("«Привет, "+txtToPrint+"!».");
    }



    /* метод к заданию №8 - метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    */
    public static void visokos(int year) {
        // Моя объяснялка по логике вычислений: в яндексе я узнал что самый ранний високосный год например 1600,
        // затем каждые сто лет високсность отменяется кроме каждого 400-го года от года 1600.
        // потенциалная невисокосность будет вычисляться наличием отстатка от деления на 4 разницы
        // между текущим годом и самого раннего 1600 года
        // и так выводим год про который мы желаем узнать его високосность
        System.out.println("Вы ввели год "+year);
        // вычисляем разницу между текущим годом и самым ранним високосным годом:
        int vis=year-1600;
        //System.out.println(vis);
        // если эта разница делится на цело на 4, то введенное значение текущего года будет будет потенциально високосным:
        // переменная vis1 будет отличаться от 0 в случае если разница лет не делится на цело на 4
        // vis1=0 будет показателем потенциальной високосности введенного значения года
        int vis1=vis%4;
        //System.out.println(vis1);
        // однако если разница между текущим годом и самым ранним високосным годом делится на цело на 100,
        // то этот год не должен считаться високосным:
        int vis2=vis%100;
        //System.out.println(vis2);
        // и в этом случае показатель новый vis2 должен экстренно отменить високосность года, переназначив
        // значение vis1 на отличающееся от нуля:
        if (vis2==0){vis1=1;}
        // аналогично показатель vis3 должен насильно вернуть значение високосности vis1 в нулевое значение
        // каждай 400-тый год от года 1600.
        int vis3=vis%400;
        //System.out.println(vis3);
        if (vis3==0) {vis1=0;}
        // пожинаем плоды проверки високосности:
        if (vis1>0) {
            System.out.println("Метод отвечает что это не високосный год");
        } else {
            System.out.println("Метод отвечает что этот год високосный");}
        // вуа ля


    }


}
