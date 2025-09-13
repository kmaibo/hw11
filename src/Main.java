public class Main {
    public static void leapYear(int year) {
        year = 2024;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void deviceYear() {
        int clientOs = 0;
        int clientDeviceYear = 2015;
        if ((clientOs == 0 && clientDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if(clientOs==0){
            System.out.println("Установите версию приложения для iOS по ссылке");
            if ((clientOs == 1 && clientDeviceYear < 2015)) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOs==1){
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void deliveryDistance(int deliveryDistance) {
        deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + (deliveryDays + 1));
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (deliveryDays + 2));
        } else {
            System.out.println("Доставка не осуществляется");
        }
    }
    public static void main(String[] args) {
        leapYear(2024);
        deviceYear();
        deliveryDistance(95);
    }
}