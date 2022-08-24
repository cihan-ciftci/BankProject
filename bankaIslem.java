package bankProjesi;

import java.util.Scanner;
import java.lang.Math;

public class bankaIslem {
        public static void main(String[] args) {
            projeBank prj1 = new projeBank("braci","355-537");
            prj1.menuGoruntule();

        }
    }

    class projeBank{
        int bakiye;
        int oncekiIslem;
        int tutar = 0;
        String kullaniciAdi;
        String kullaniciId;

        projeBank(String kullaniciAdi, String kullaniciId){  // bu kismi this. keyword'u ile duzenlemek lazim
            this.kullaniciAdi = kullaniciAdi;
            this.kullaniciId = kullaniciId;
        }

        public projeBank(String kAdi) {
        }

        void hParaYatir(int tutar){
            if (tutar !=0){
                bakiye = bakiye + tutar;
                oncekiIslem = tutar;
            }
        }
        void hParaCek(int tutar){
            if (tutar !=0){
                bakiye = bakiye - tutar;
                oncekiIslem = tutar;
            }
        }
        void getoncekiIslem(){
            if (oncekiIslem > 0){
                System.out.println("Yatırılan Miktar : " + oncekiIslem);
            } else if (oncekiIslem < 0) {
                System.out.println("Cekilen Para : " + Math.abs(oncekiIslem));
            }
            else {
                System.out.println("Hicbir islem gerceklesmedi");
            }
        }
        void menuGoruntule(){
            String islem;/// bunlari ve alt kismi char a tekrar donder ve oyle isleme al
            Scanner scanner = new Scanner(System.in);

            System.out.println(" Hoşgeldiniz " + kullaniciAdi);
            System.out.println(" Kullanıcı ID'niz : " + kullaniciId);
            System.out.println("\n");
            System.out.println(" Bakiye'yi kontrol etmek için 1'e basınız : ");
            System.out.println(" Hesaba para yatırmak için 2'ye basınız : ");
            System.out.println(" Hesaptan para çekmek için 3'e basınız : ");
            System.out.println(" Önceki işlemleri görüntülemek için 4'e basınız : ");
            System.out.println(" Çıkış yapmak için 5'e basınız : ");

            do {
                System.out.println("==================================================================================");
                System.out.println(" Hangi işlemi yapmak istiyorsunuz : ");
                System.out.println("==================================================================================");
                islem = scanner.next();
                System.out.println("\n");

                switch (islem){
                    case "1":
                        System.out.println("-------------------------------");
                        System.out.println("Bakiyeniz = " + bakiye);
                        System.out.println("-------------------------------");
                        System.out.println("\n");
                        break;

                    case "2":
                        System.out.println("-------------------------------");
                        System.out.println(" Yatırmak istediğiniz para miktarını giriniz : ");
                        System.out.println("-------------------------------");
                        int tutar = scanner.nextInt();
                        hParaYatir(tutar);
                        System.out.println("\n");
                        break;

                    case "3":
                        System.out.println("-------------------------------");
                        System.out.println("Çekmek istediğini para miktarını giriniz : ");
                        System.out.println("-------------------------------");
                        int tutar2 = scanner.nextInt();
                        hParaCek(tutar2);
                        System.out.println("\n");
                        break;

                    case"4":
                        System.out.println("-------------------------------");
                        getoncekiIslem();
                        System.out.println("-------------------------------");
                        System.out.println("\n");
                        break;

                    case "5":
                        System.out.println("=======================================================================");
                        System.out.println(" Bankamızı kullandığınız için teşekkürler : ");
                        break;

                    default:
                        System.out.println(" Hatalı seçim yaptınız!. Lütfen yeniden deneyiniz : ");
                        break;
                }
            }while (!islem.equals("5"));

        }

    }
