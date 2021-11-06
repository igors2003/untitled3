package Geekbrains1;

import java.util.ArrayList;
import java.util.Arrays;

public class Secondlesson {
    public static void main(String[] args) {
        //Домашнее задание
        //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;

        System.out.println();
        // для наглядности назначаем и печатаем одномерный массив
        System.out.println("The original Array is introduced as follow:");
        int[] array = {0,0,0,1,1,0,1,0,1,0,1};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
        System.out.println();
        // делаем операцию замены значения 0 на 1 и обратно каждого элемента массива array
        for (int j=0;j<array.length;j++) {
            switch (array[j]) {
                case 0:
                    array[j] = 1;
                    break;
                case 1:
                    array[j] = 0;
                default:
            }
        }
        // снова рапечатываем массив для проверки результата
        System.out.println("The inversed Array is returned as follow:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"  ");
        }
        System.out.println();
        System.out.println("that's it");
        System.out.println();
        //Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] arr1 = new int[8];
        System.out.println("The empty array arr1 is following:");
        for (int i = 0; i < 8; i++) {
            System.out.print(arr1[i]+"  ");
        }
        System.out.println();
        for (int i=0;i<8;i++) {
            arr1[i]=i*3;
        }
        System.out.println("The filled array arr1 is following:");
        for (int i = 0; i < 8; i++) {
            System.out.print(arr1[i]+"  ");
        }
        System.out.println();
        System.out.println("I wish I correctly understood the task.");
        System.out.println();

        //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("The 3-rd task array is following:");
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+"  ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i]<6) {arr2[i]=arr2[i]*2;
            }
        }
        System.out.println("The 3-rd task array after change =числа меньшие 6 умножить на 2= is:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+"  ");
        }
        System.out.println();
        System.out.println();

        //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью
        // цикла(-ов) заполнить его диагональные элементы единицами;

        System.out.println("The 4-th task square array is:");
        int counter = 0;
        int[][] table4 = new int[15][15];
        for (int i = 0; i < table4.length; i++) {
            for (int j = 0; j < table4.length; j++) {
                System.out.print(table4 [i][j] + " ");
                counter++;
            }
            System.out.println();
        }

        int counter2 = 0;
        for (int i = 0; i < table4.length; i++) {
            for (int j = 0; j < table4.length; j++) {
                if (i==j) {
                    table4 [i][j]=1;
                }
                counter2++;
            }
        }

        System.out.println("The 4-th task square array filled with 1-s through its main diagonal is:");
        int counter1 = 0;
            for (int i = 0; i < table4.length; i++) {
            for (int j = 0; j < table4.length; j++) {
                System.out.print(table4 [i][j] + " ");
                counter1++;
            }
            System.out.println();
        }

         // в операции ниже на присвоение второй диагонали значение "1" я так и не понял почему я должен был
        //написать if (i==table4.length-j-1) ... просто поиграл с диагональю единиц и подобрал число -1 так, чтобы
        // единицы попали во вторую диагональ.

        int counter3 = 0;
        for (int i = 0; i < table4.length; i++) {
            for (int j = 0; j < table4.length; j++) {
                if (i==table4.length-j-1) {
                    table4 [i][j]=1;
                }
                counter3++;
            }
        }
        System.out.println("The 4-th task square array filled with 1-s through its second diagonal is:");
        int counter4 = 0;
        for (int i = 0; i < table4.length; i++) {
            for (int j = 0; j < table4.length; j++) {
                System.out.print(table4[i][j] + " ");
                counter4++;
            }
            System.out.println();

        }
            System.out.println();


        //** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        // предлагаю такое решение , что  в нем может быть проанализирован одномерный int массив любой длины,
        // с любым количеством минимальных и максимальных значений :)
        int[] arr3 = { 107, -5, 3, 2, 11, 4, -5, 2, 4, 11, 9, 107, 0, 23, 0, 0, 107};
        System.out.println("Task #5");
        System.out.println("Here is result of procedure of seek minimal and maximal values in the array arr3");
        // в этом блоке определяется индекс в массиве который наиболее часто больше всех
        int[] indmax=new int [arr3.length];
        for (int i = 0; i < arr3.length; i++) {
                for (int j = 0; j < arr3.length; j++) {
                if (arr3[j]<arr3[i]) {
                    indmax[j]++;
                }
            }
        }
        // в этом блоке определяется индекс в массиве который наиболее часто меньше всех
        int[] indmin=new int [arr3.length];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length; j++) {
                if (arr3[j]>arr3[i]) {
                    indmin[j]++;
                }
            }
        }

        // в этом блоке выводится номер элемента массива, в котором хранится наибольшее значение
        for (int i = 0; i < arr3.length; i++) {
            if (indmax[i]==0) {
                System.out.println("arr3["+i+"] is maximum");
            };
        }
        // в этом блоке выводится номер элемента массива, в котором хранится наименьшее значение
        for (int i = 0; i < arr3.length; i++) {
            if (indmin[i]==0) {
                System.out.println("arr3["+i+"] is minimum");
            };
        }


        // Шестое задание

        System.out.println();
        System.out.println("Task #6");
        int[] arr5 = { 107, -5, 3, 42, 11, 4, -15, 2, 4, 13, 16, 69, 0, 23, 2, 6, 12,-66};
        System.out.print(" Массив, состоящий из элементов: (");
        for (int i=0;i<arr5.length;i++) {
            System.out.print(arr5[i] + ",");
        }
        System.out.print(")");
        System.out.println();
        System.out.print("Значение метода = "+ checkbalance(arr5));
        System.out.println();



        // Седьмое задание
        System.out.println() ;
        System.out.println("Task #7");
        System.out.println("разработан метод   shiftarray (array[],n) который смещает элементы указанного массива");
        System.out.println("на n позиций вправо если n-положительное, на n позиций влево если n отрицательное");
        System.out.print("Например тот же массив, состоящий из элементов: (");
        for (int i=0;i<arr5.length;i++) {
            System.out.print(arr5[i] + ",");
        }
        System.out.print(")");
        System.out.println();

        int a=-7;

        System.out.println("Сместим массив на "+a+" мест");

        shiftarray(arr5,a);

        System.out.print(" Преобразовался в массив, состоящий из элементов: (");
        for (int m=0;m<arr5.length;m++) {
            System.out.print(arr5[m] + ",");
        }
        System.out.print(")");
        System.out.println();

        a=3;

        System.out.println("Сместим массив на "+a+" мест в обратную сторону");

        shiftarray(arr5,a);

        System.out.print(" Преобразовался в массив, состоящий из элементов: (");
        for (int m=0;m<arr5.length;m++) {
            System.out.print(arr5[m] + ",");
        }
        System.out.print(")");
        System.out.println();

        }


// метод к задаче №6
    /* Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
        если в массиве есть место, в котором сумма левой и правой части массива равны.
        Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
        граница показана символами ||, эти символы в массив не входят.

         */
    /* критерием решения шестой задачки предлагаю провести cравнение общей суммы массива с суммой его элементов
    с нарастанием номера элемента массива. как только сумма элементов с нарастанием будет равна ровно половине общей
    суммы массива то мы останавливаем поиск, говоря что в данном массиве есть такое соотношение мест что сумма
    его правой половины равна сумме левой половины
     */
    public static boolean checkbalance(int ary[]) {
        int summ1 = 0;
        int ind=0;
        // 1- to count total amount of the ary[] members:
        int summ2=0;
        for (int k=0;k<ary.length;k++) {
            summ2+=ary[k];
        }
        //System.out.println("Общая сумма элементов массива= "+summ2);

        // 2 - to compare each partial summ(i) to the whole summ3 value/2
        for (int i = 0; i < ary.length; i++) {
            summ1+=ary[i];


            if(summ2-(2*summ1)==0) {
                System.out.println(" В заданном массиве имеется такое место, в котором сумма левой части равна сумме правой части");
                System.out.println(" и это место находится после "+i+ "-го элемента данного массива");
                ind=1;
                return true;
            }

            }
        System.out.println(" В данном массиве нет места, где сумма левой и правой части были бы равны ");
            return false;

        }
    // задача №7
    //**** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
    // или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются
    // циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ]
    // при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.

    public static void shiftarray(int ary1[],int n) {
        // Если n=0 то массив остается без изменений, хотя это работает и без этого
        if (n == 0) {return;}
        // Если n<0 то элементы массива смещаются влево а каждый ушедший за пределы длины замещает последнее место в массиве
        if (n < 0) {
            //System.out.println("n="+n);
            n = -n;
            for (int k = 0; k < n; k++) {
                int arry1 = ary1[0];
                for (int i = 0; i < ary1.length - 1; i++) {
                    ary1[i] = ary1[i + 1];
                    }
                    ary1[ary1.length - 1] = arry1;

            }
            return;
        }
        // Если n>0 то элементы массива смещаются вправо а каждый ушедший за пределы длины помещается в начало массива
        if (n > 0) {
                for (int k = 0; k < n; k++) {
                    int arry2 = ary1[ary1.length - 1];
                    for (int j = ary1.length - 1; j >0; j--) {
                        ary1[j] = ary1[j - 1];
                    }
                    ary1[0]=arry2;
                }
            return;
            }
        }


    }
































