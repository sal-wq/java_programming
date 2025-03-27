package OOPLesson.InterFace;

interface Service{
    void convertRielToDollar(Double riel);
    void convertDollarToRiel(Double dollar);
}
class CurrencyExchange implements Service{
    @Override
    public void convertRielToDollar(Double riel){
        System.out.println("Result of Dollar: " + (riel/4000));
    }
    @Override
    public void convertDollarToRiel(Double dollar){
        System.out.println("Result of Riel: " + (dollar*4000));
    }
}

public class PolyDemo {
    public static void main(String[] args) {
        CurrencyExchange currencyExchange = new CurrencyExchange();
        currencyExchange.convertDollarToRiel(50d);
        currencyExchange.convertRielToDollar(250000d);
    }
}
