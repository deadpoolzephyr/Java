package proje.pkg3;
/*

NYP	Lab	– 3	Uygulama	Sorusu
Bilgisayar	 4	 basamakli	 random	 bir	 sayi	 uretecektir.	 Kullanicidan	 tahminler	
isteyecek ve	 tahmin	 ile	 uretilen	 sayinin	 buyukluk	 kucukluk	 durumuna	 gore	
“Daha	 buyuk	 bir	 sayi	giriniz” veya	“Daha	 kucuk	 bir	 sayi	giriniz” seklinde	mesaj	
vererek	 kullanicidan	 uretilen	 sayi	 bulmasi	 icin	 yonlendirecektir.	 Cikti	 olarak	
kacinci	tahminde	sayinin	bulundugu	gosterilecektir.
Java’da	rastgele	bir	sayi [min,	max] araliginda	sayi	uretmek	icin	asagidaki	kod	
parcasini	kullanabilirsiniz.	
(Math.random() * ((max - min) + 1)) + min
Math.random()	komutunu	kullanmak	icin	java.lang.Math	kutuphanesini	import	
etmeniz	gerekmektedir.

*/


import java.util.Random;
import java.util.Scanner;

public class Proje3 {

    static void satirBul(int tahminTmp,int rastgeleTmp){
        int sayac=0;
        for(int i=0; i<4;i++){      
            
                if(tahminTmp%10==rastgeleTmp%10){
                    System.out.println(""+tahminTmp%10);
                }                        // 9999  9998
                tahminTmp/=10;
                rastgeleTmp/=10;
            }
    }
    
    static int uniq(int random){
        int[] a = new int[4];
        for(int i=0;i<4;i++){
            a[i]=random%10;
            random/=10;
        }
        for(int j = 0; j<4;j++){
            for(int k = j+1;k<4; k++){
                if(a[j]==a[k]){
                    return 0;
                }
            }
        }
        return 1;
    }
    
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanf = new Scanner(System.in);
        int rastgeleSayi = rand.nextInt(8999) + 1000;
        
        while(uniq(rastgeleSayi)==0){
            rastgeleSayi = rand.nextInt(8999) + 1000;
        }
        
        System.out.println(rastgeleSayi);

        System.out.println("Tahmininizi giriniz:");
        int tahmin = 1;
        int deneme = 0;
        
        
        while (tahmin != rastgeleSayi) {
            tahmin = scanf.nextInt();
            
            satirBul(tahmin,rastgeleSayi);
            
            if (tahmin < rastgeleSayi) {
                System.out.println("Daha büyük bir sayi giriniz");
            } else if (tahmin > rastgeleSayi) {
                System.out.println("Daha küçük bir sayi giriniz");
            }
            deneme++;
        }
        System.out.println(deneme + ". denemede sayiyi buldunuz.");
    }
    
    
}


/*

NYP	– 3	Lab	uygulama	sorusu	(II	ogretim)
Bu	uygulamada,	size	onceden	verilen	sayi	bulmacasi	asagidaki	sekilde	
genisletilecektir:
• Bilgisayarin	urettigi	her	sayinin	basamaklarinda	farkli	sayi	olacak.	2342	
gecersiz	bir	sayidir.
• Her	tahmin	sonunda	ayni	pozisyonda	olan	sayilar	ekrana	yizalacaktir.	
Ornek	olarak	bilgisayarin	urettigi sayi 2346 olsun, tahmin	edilen	sayi	
7316	olsun.	Bu	durumda	program	3 ve 6 degerlerini ekrana basacak ve	
yeni	tahmin	girilmesini	isteyecektir.

*/
