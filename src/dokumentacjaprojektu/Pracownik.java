
package dokumentacjaprojektu;

/**
 * Obiekt <code>Pracownik</code> reprezentuje Pracownika
 * @author pawelstradomski
 * @version 1.0 17/01/2022
 * @see <a href="http://adres strony internetowej" target="_blank"></a>
 * z "@"deprecated przekresla
 */
public class Pracownik 
{
    /**
     * Pracownik() to konstruktor domyslny
     */
    public Pracownik(){}
    
    /**
     * Konstruktor tworzacy obiekt <code>Pracownik</code> z imieniem i nazwiskiem
     * @param imie ustawia imie
     * @param nazwisko ustawia nazwisko
     */
    public Pracownik(String imie, String nazwisko)
    {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    /**
     * Konstruktor tworzacy obiekt <code>Pracownik</code> z imieniem i nazwiskiem
     * @param imie ustawia imie 
     * @param nazwisko ustawia nazwisko
     * @param wynagrodzenie ustawia wynagrodzenie
     */
    public Pracownik(String imie, String nazwisko, double wynagrodzenie)
    {
        this(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
    }
    /**
     * <pre>
     * jak uzywac:
     * Pracownik p = new Pracownik();
     * p.setWynagrodzenie(1000);
     * @param noweWynagrodzenie ustawia Pracownikowi nowe wynagrodzenie
     * </pre>
     */
    public void setWynagrodzenie(double noweWynagrodzenie)
    {
        this.wynagrodzenie = noweWynagrodzenie;
    }
    
    /**
     * @since 1.0
     * @return zwraca wartosc wynagrodzenia Pracownika w złotówkach
     */
    public double getWynagrodzenie()
    {
        return this.wynagrodzenie;
    }
    
    /**
     * imie pracownika
     */
    private String imie;
    
    /**
     * nazwisko pracownika
     */
    private String nazwisko;
    
    /**
     * wynagrodzenie pracownika
     */
    private double wynagrodzenie;
}
