import java.util.Random;
        
public class punktMaterialny {
    protected double masa; //zaincjowanie prywatnej zmiennej masa
              int odlegloscOdOsiX, odlegloscOdOsiY; //zainicjowanie zmiennych odleglosci od poszczegolnych osi
              double glownyMomentBezwladnosci; //inicjacja zmiennej o wartosci glownego momentu bezwladnosci
              double wzglednyMomentBezwladnosci; //inicjacja zmiennej o wartosci wzglednego momentu bezwladnosci
              
    //miejsce programu, gdzie generuje się losową wartość masy, konstruktor domyslny
    public punktMaterialny() {
        Random liczbaLosowa = new Random(); //miejce wygenerowania liczby losowej
        masa = liczbaLosowa.nextInt(10000); //przypisanie masie wartosci od 0 do 10000
        odlegloscOdOsiX = liczbaLosowa.nextInt(100);
        odlegloscOdOsiY = liczbaLosowa.nextInt(100);       
    }
    //konstruktor z parametrami klasy punktMaterialny, za pomocą którego inicjujemy wartość masy
    public punktMaterialny(int masa, int X, int Y){
        this.masa = masa;
        odlegloscOdOsiX = X;
        odlegloscOdOsiY = Y;
        glownyMomentBezwladnosci();
        wzglednyMomentBezwladnosci(odlegloscOdOsiX, odlegloscOdOsiY);
    }

    // metoda ktora pozwala na ustawienie masy punktu (masa jest zmienną chroniona, oznacza, że można mieć dostęp do jej zmiany jedynie za pomoca metody)
    public void zmienMase(int masa) {
        if (masa >= 0) {
            System.out.println("Masa jest poprawna.");
            this.masa = masa;
        } else {
            System.out.println("Masa nie moze byc ujemna.");
        }
    }
    // metoda 
    public void zmienOdleglosci(int X, int Y) {
        if (X >= 0 && Y >= 0) {
            System.out.println("Odleglosci sa poprawne.");
            this.odlegloscOdOsiX = X;
            this.odlegloscOdOsiY = Y;
        } else {
            System.out.println("Odleglosc nie moze byc ujemna. \nPodaj wartosc bezwzlegdna.");
        }
    }
    

    // metoda pozwalająca na obliczenie głównego momentu bezwladności, jest rowny zero dla punktu materialnego
    public void glownyMomentBezwladnosci(){
        glownyMomentBezwladnosci = 0;
    }

    // metoda pozwalająca na obliczenie momentu bezwladności względem innej osi
    public void wzglednyMomentBezwladnosci(int X, int Y) {
        zmienOdleglosci(X,Y);
        wzglednyMomentBezwladnosci = glownyMomentBezwladnosci+masa*odlegloscOdOsiX*odlegloscOdOsiY;
    }

    // metoda, która pozwala na wypisanie zmiennej prywatnej masa
    public double wypiszMase() {
        return masa;
    }
    
    public String opisObiektu(){
    return "Punkt Materialny";
    }
           
    // metoda zwracająca stały opis obiektu
    public void parametryObiektu() {
        System.out.println(opisObiektu() + "\nMasa: " + wypiszMase());
        System.out.println("\nGlowny moment bezwladnosci: " + glownyMomentBezwladnosci);
        System.out.println("Wzgledny moment bezwladnosci: " + wzglednyMomentBezwladnosci);
        System.out.println("\nOdleglosc: " +
                            "\nod osi X = " + odlegloscOdOsiX +
                            "\nod osi Y = " + odlegloscOdOsiY);
        System.out.println();
    }
}