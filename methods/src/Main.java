public class Main {

    public static void main(String[] args) {
        sayiBulmaca();

    }

    public static void sayiBulmaca() {
        int[] _numbers = {1 ,2, 5, 7, 9, 0};
        int _number = 9;
        boolean isTrue = false;

        for(int number : _numbers){
            if(number == _number){
                isTrue = true;
            }
        }
        String mesaj = "";
        if(isTrue){
            mesaj = "Sayı mevcuttur: "+ _number;
            mesajVer(mesaj);
        }else{
            mesajVer("Sayı mevcut degildir: "+ _number);
        }

    }
    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}
