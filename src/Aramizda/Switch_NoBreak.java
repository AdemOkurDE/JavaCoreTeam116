package Aramizda;

public class Switch_NoBreak {
    public static void main(String[] args) {

        int gun=5; // 1-7 olmalidir

        switch (gun){
            case 1:
                //System.out.println("Pazartesi");break;
            case 2:
                //System.out.println("Sali");break;
            case 3:
                //System.out.println("Carsamba");break;
            case 4:
                //System.out.println("Persembe");break;
            case 5:
                //System.out.println("Cuma");break;
                System.out.println("Hafta ici");break;
            case 6:
                //System.out.println("Cumartesi");break;
            case 7:
                //System.out.println("Pazar");break;
                System.out.println("Haftasonu");break;
            default:
                System.out.println("Hatali giris");
        }
    }
}
