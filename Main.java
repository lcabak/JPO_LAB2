
import java.util.Random;

class Main extends punktMaterialny {
    
public static void main(String[] args) {
		
                //utworzenie obiektow
                System.out.println("1");
		walec walec1 = new walec(4,5);
                System.out.println("2");
                walec walec2 = new walec(2,3);
                System.out.println("3");
		kula kula1 = new kula(4,5);
                System.out.println("4");
                kula kula2 = new kula(2,3);
                System.out.println("5");
		pret pret1 = new pret(4,5);
                System.out.println("6");
                pret pret2 = new pret(2,3);
		
		punktMaterialny[] Obiekty = new punktMaterialny[8];
		//stworzenie tablicy obiektow
                System.out.println("0");
                Obiekty[0] = new punktMaterialny(2,3,4);
                System.out.println("1");
                Obiekty[1] = new punktMaterialny(2,3,0);
                System.out.println("2");
		Obiekty[2] = new walec (4, 8, 6, 7);
                System.out.println("3");
		Obiekty[3] = new walec (2, 5, 6, 6);
                System.out.println("4");
		Obiekty[4] = new kula (2, 1, 5, 4);
                System.out.println("5");
		Obiekty[5] = new kula (7, 6, 0, 1);
                System.out.println("6");
		Obiekty[6] = new pret (9, 2, 4, 2);
                System.out.println("7");
		Obiekty[7] = new pret (1, 2, 3, 4);
	//petla odczytujaca tablice obiektow i zmieniajaca ich parametry odleglosci od poszczegolnych osi	
        for (int iterator=0; iterator<Obiekty.length; iterator++){
        System.out.println(iterator);
        Obiekty[iterator].zmienOdleglosci(5, 8);
        Obiekty[iterator].parametryObiektu();
    }       
}


    