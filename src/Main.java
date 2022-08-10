import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Exercise 1
        checkYear(2500);
        //Exercise 2
        checkPhoneOsAndYear(0,2015);
        //Exercise 3
        checkDistance(59);
        //Exercise 4
        checkDouble("aabccddefgghiijjkk");
        //Dop Exercise 4
        int[] arr4 = new int[]{ 5, 8, 2, 3, 9 };
        changeMass(arr4);
        //Dop Exercise 6
        dopExercise();
    }
    public static void checkYear(int year){
        boolean isLeapYear = (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
        if (isLeapYear)
        {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосным год");
        }
    }
    public static void checkPhoneOsAndYear(int clientOS2, int clientDeviceYear){
        if (clientOS2 == 0 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientOS2 == 0 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else if(clientOS2 == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if(clientOS2 == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void checkDistance(int deliveryDistance){
        if(deliveryDistance <20){
            System.out.println("Потребуется 1 день");
        }else if(deliveryDistance >=20 && deliveryDistance <60){
            System.out.println("Потребуется 2 дня");
        }else if(deliveryDistance >=60 && deliveryDistance <100){
            System.out.println("Потребуется 3 дня");
        }
    }
    public static void checkDouble(String engSt){
        char[] engArr= engSt.toCharArray();
        boolean find = false;
        for(int i =0; i<engArr.length; i++){
            for (int j =i+1; j<engArr.length; j++){
                if(engArr[i] == engArr[j]){
                    System.out.print("дублируется символ - "+engArr[i]);
                    find = true;
                    break;
                }
            }
            if(find){
                break;
            }
        }
        if(!find){
            System.out.println("Дублей нет");
        }
    }
    public static void changeMass(int[] arr4){
        int r = 0;
        System.out.println(Arrays.toString(arr4));
        for (int i = 0; i<arr4.length / 2; i++) {
            r = arr4[i];
            arr4[i] = arr4[arr4.length-i-1];
            arr4[arr4.length-i-1] = r;
        }
        System.out.println(Arrays.toString(arr4));
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void dopExercise(){
        calcMedium(generateRandomArray());
    }
    public static void calcMedium(int[] arr){
        int summ = 0;
        for (int m: arr ) {
            summ = summ + m;
        }
        System.out.println("Сумма трат за месяц составила "+summ+" рублей.");
    }

}
