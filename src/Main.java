import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int sayi,eskiTaban,yeniTaban;
		System.out.println("sayiyi giriniz: ");
		sayi=input.nextInt();
		System.out.println("sayi kaç tabanýnda: ");
		eskiTaban=input.nextInt();
		System.out.println("sayi kaç tabanýnda olsun: ");
		yeniTaban=input.nextInt();
		
		int z=1,sayiBoyut=1;
		while(sayi/z >9){
			z=z*10;
			sayiBoyut++;
		}
		
		int dizi[]=new int[sayiBoyut];
		for(int i=sayiBoyut;i>1;i--){
			dizi[i-1]=sayi-((sayi/10)*10);
			sayi=sayi/10;
		}
		dizi[0]=sayi;
		
		int yeniSayi=0;
		int j=0;
		for(int i=sayiBoyut-1;i>=0;i--){
			yeniSayi=(int) (yeniSayi+(dizi[i]*Math.pow(eskiTaban, j)));
			j++;
		}
		
		int x=1,y=1;
		while(yeniSayi/x >9){
			x=x*10;
			y++;
		}
		int yeniDizi[]=new int [10];
	

		boolean durum=true;
		int i=0;
		while(durum){
		if(yeniSayi>=yeniTaban){
			yeniDizi[i]=yeniSayi%yeniTaban;
			yeniSayi=yeniSayi/yeniTaban;
			i++;

		}
		else{
			yeniDizi[i]=yeniSayi;
			durum=false;}
		
		}
		try{
			System.out.print("Yeni Sayiniz: ");
			for(int a=i;a>=0;a--){
			System.out.print(yeniDizi[a]);
		}}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(" ");
		}
	}

}
