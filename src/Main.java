import  java.util.Scanner;

public class Main {

    static int toplama(int n1,int n2){
        int result=n1+n2;
        System.out.print("Toplama sonucu= "+result);
        return result;
    }
    static int cikarma(int n1,int n2){
        int result=n1-n2;
        System.out.print("Çıkarma Sonucu= "+result);
        return result;
    }
    static int carpma(int n1,int n2){
        int result=n1*n2;
        System.out.print("Çarpma sonucu= "+result);
        return result;
    }
    static int bolme(int n1,int n2){
        int result=n1/n2;
        System.out.print("Bölme sonucu= "+result);
        return result;
    }
static int us(int n1,int n2){
        int result=1;
        for(int i=1;i<=n2;i++){
        result*=n1;}
    System.out.print("üst alma sonucu= "+result);
    return result;
}
static int kombinasyon(int n1,int n2) {
    int toplam1 = 1,toplam2 = 1,toplam3 = 1;
    for (int i = 1; i <= n1; i++) {
        toplam1 = toplam1 * i;}
    for (int j = 1; j <= n2; j++) {
        toplam2 = toplam2 * j;}
    for (int k = 1; k <= (n1 - n2); k++) {
        toplam3 = toplam3 * k;}
    int result=((toplam1) / ((toplam2) * (toplam3)));
    System.out.print("Kombinasyon Sonucu= " + result);
    return result;
}
static int mod(int n1,int n2){
        int result=n1%n2;
    System.out.println("Mod alma sonucu= "+result);
    return result;
}
static int alancevre(int n1,int n2){
        int alan=n1*n2;
        int cevre=2*(n1+n2);
    System.out.println("Alan="+alan+"  &&  "+ "Çevre="+cevre);
    return alan;

}

        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            int select;
            String menu = "1- Toplama İşlemi\n" +
                    "2- Çıkarma İşlemi\n" +
                    "3- Çarpma İşlemi\n" +
                    "4- Bölme işlemi\n" +
                    "5- Üslü Sayı Hesaplama\n" +
                    "6- Kombinasyon Hesaplama\n" +
                    "7- Mod Alma\n" +
                    "8- Dikdörtgen Alan ve Çevre Hesabı\n";
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz:");
            select = scan.nextInt();
            System.out.print("Sayi biri giriniz: ");
            int n1 = scan.nextInt();
            System.out.print("Sayi ikiyi giriniz: ");
            int n2 = scan.nextInt();

            switch (select) {
                case 1:
                    toplama(n1, n2);
                    break;
                case 2:
                    cikarma(n1, n2);
                    break;
                case 3:
                    carpma(n1, n2);
                    break;
                case 4:
                    bolme(n1, n2);
                    break;
                case 5:
                    us(n1, n2);
                    break;
                case 6:
                    kombinasyon(n1,n2);
                    break;
                case 7:
                    mod(n1,n2);
                    break;
                case 8:
                     alancevre(n1,n2);
                     break;
            }

        }

    }