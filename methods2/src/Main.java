public class Main {

    public static void main(String[] args) {
        String message = "What a lovely day.";
        String newMessage = giveCity();
        System.out.println(newMessage);
        int number = sum(5,7);
        System.out.println(number);
        int summation = sum2(1,2,3,4,5,6,7,8,9,10);
        System.out.println(summation);

    }

    public static void add()
    {
        System.out.println("Added!");
    }
    public static void delete()
    {
        System.out.println("Deleted!");
    }
    public static void update()
    {
        System.out.println("Updated!");
    }
    public static int sum(int number1, int number2){return number1+number2;}
    public static int sum2(int... numbers){
        int summ = 0;
        for(int i : numbers)
            summ += i;
        return summ;
    }
    public static String giveCity(){return "Antalya";}
}
