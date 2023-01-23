public class Main {
    public static void main(String[] args) {
        int ticketPrice = 2_187;
        int rub = 20;
        
        int miles = ticketPrice/rub;
        System.out.println("Количество начисленных миль за купленный билет = " + miles);
    }
}
