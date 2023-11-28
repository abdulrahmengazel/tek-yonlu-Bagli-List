import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Node A = new Node();
        Node B = new Node();
        Node C = new Node();
        Node D = new Node();
        A.sayi=11;
        B.sayi=22;
        C.sayi=33;

        A.next=B;
        B.next=C;
        C.next = null;
         Node temp =A;
        while (temp!=null){
            System.out.println(temp.sayi);
            temp=temp.next;
        }


        TekYonluBagliLİst liste = new TekYonluBagliLİst();
        liste.ekle(11);
        liste.ekle(22);
        liste.ekle(33);
        liste.ekle(44);
        liste.ekle(55);

        liste.yazdir();

        liste.basaEkle(10);
        liste.yazdir();
        liste.sonaEkle(66);
        liste.yazdir();
        liste.arayaEkle(0,1);
        liste.arayaEkle(3,100);
        liste.arayaEkle(9,77);
        liste.yazdir();
        liste.basasil();
        liste.yazdir();
        liste.sonasil();
        liste.ardansil(3);
        liste.yazdir();

*/
        TekYonluBagliLİst liste =new TekYonluBagliLİst();
        Scanner scanner=new Scanner(System.in);
        int secim;
        int sayi;
        int indis;
        while (true){
            System.out.println("1 basa ekle");
            System.out.println("2 sona ekle");
            System.out.println("3 araya ekle");
            System.out.println("4 bastan sil");
            System.out.println("5 sondan sil");
            System.out.println("6 aradan sil");
            System.out.println("7 liste yazdir ");
            System.out.println("0 cikis");
            System.out.println("seciminiz : ");
            secim=scanner.nextInt();

            switch (secim){
                case 1 :
                    System.out.println("basa eklenecek sayi girin : ");
                    sayi=scanner.nextInt();
                    liste.basaEkle(sayi);
                    break;
                case 2:
                    System.out.println("sona eklenecek sayi girin : ");
                    sayi=scanner.nextInt();
                    liste.sonaEkle(sayi);
                    break;

                case 3:
                    System.out.println("Araya eklenecek sayi  girin : ");
                    sayi=scanner.nextInt();
                    System.out.println(" hangi indise ekelenceksiniz");
                    indis=scanner.nextInt();
                    liste.arayaEkle(indis,sayi);
                    break;
                case 4:
                    liste.basasil();
                    break;
                case 5:
                    liste.sonasil();
                    break;
                case 6:
                    System.out.println("silinecek sayi indisi girin : ");
                    indis=scanner.nextInt();
                    liste.ardansil(indis);
                    break;

                case 7:
                    liste.yazdir();
                    break;
                case 0:
                    return;

            }

        }
    }
}
