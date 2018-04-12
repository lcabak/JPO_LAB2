
import java.util.Random;


class pret extends punktMaterialny {
    
    private int promien;
    //kontrola wartosci
    public void ustawPromien(int promienTest){
        
        if(promienTest > 0){
            promien = promienTest;
            glownyMomentBezwladnosci();
            wzglednyMomentBezwladnosci(odlegloscOdOsiX,odlegloscOdOsiY);
        }
        else{
            System.out.println("Promien nie moze byc ujemy");
        }
    }
    
    @Override
    //przeciazona metoda mająca za zadanie obliczenie glownego momentu bezwladnosci
    public void glownyMomentBezwladnosci(){
        glownyMomentBezwladnosci = masa*promien*promien/12;
    }
    
    //przeciazona metoda zwracajaca nazwe podklasy
    @Override
    public String opisObiektu(){
    return "Pret ";
    }
    // przeciazona metoda zwracająca stały opis obiektu
    @Override
    public void parametryObiektu() {
        System.out.println(opisObiektu() + "\nMasa: " + wypiszMase());
        System.out.println("\nGlowny moment bezwladnosci: " + glownyMomentBezwladnosci);
        System.out.println("Wzgledny moment bezwladnosci: " + wzglednyMomentBezwladnosci);
        System.out.println("\nOdleglosc: " +
                            "\nod osi X = " + odlegloscOdOsiX +
                            "\nod osi Y = " + odlegloscOdOsiY);
        System.out.println();
    }
    // przeciazenie konstruktora
    public pret(){ 
    
            super(); //uzycie konstruktora superklasy
            Random rand = new Random();
            promien = rand.nextInt(1000); //nadanie losowego promienia 
            glownyMomentBezwladnosci();
            wzglednyMomentBezwladnosci(odlegloscOdOsiX,odlegloscOdOsiY);
            parametryObiektu();
    }
    
    public pret(int masaTest, int promienTest){
        super(masaTest,0,0);
        promien = promienTest;
        glownyMomentBezwladnosci();
        wzglednyMomentBezwladnosci(odlegloscOdOsiX,odlegloscOdOsiY);
        parametryObiektu();
    }
    
    public pret(int masaTest, int promienTest, int X, int Y){
        super(masaTest,3,4);
        promien = promienTest;
        odlegloscOdOsiX = X;
        odlegloscOdOsiY = Y;
        glownyMomentBezwladnosci();
        wzglednyMomentBezwladnosci(odlegloscOdOsiX,odlegloscOdOsiY);
        parametryObiektu();
    }
}