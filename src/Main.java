import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
               for (int sayi = 2; sayi <= 100; sayi++) {
         boolean asal = true;
                for (int bolen = 2; bolen < sayi; bolen++) {
                    if (sayi % bolen == 0) {
                             asal = false;
                        break;
                    }
                }
                if (asal) {
                    System.out.print(sayi + " ");
                }
            } */
        //Java döngüler ile fibonacci serisi bulan program
        Scanner sc = new Scanner(System.in);
        System.out.print("ededi daxil edin: ");
        int a = sc.nextInt();
        int first = 0;
        int second=1;
        int third;
        System.out.print(first+" "+second);
        for(int i =0; i<=a-2; i++){
            third=first+second;
            first=second;
            second=third;
            System.out.print(" "+third);
        }
    }
}
