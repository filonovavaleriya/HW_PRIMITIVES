public class Main {
    public static void main(String[] args) {
        // Объявляем переменную для хранения стоимости билета (в рублях)
        int ticketPrice = 5000;

        // Объявляем переменную для количества рублей, необходимых для одной бонусной мили
        int amountOneMiles = 20;

        // Рассчитываем количество бонусных миль
        // Дробные мили не начисляются — используем целочисленное деление
        int bonusMiles = ticketPrice / amountOneMiles;

        // Выводим результат на экран
        System.out.println("Стоимость билета:" + ticketPrice + "рублей");
        System.out.println("Количество начисленных миль:" + bonusMiles);
    }
}