import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Localization {

    //    [14:19] Peter Oloba
    public static void main(String[] args) {

    }

    public String formatAmount(BigDecimal amount) {

        if (amount == null) {
            amount = BigDecimal.ZERO;
        }
        java.util.Currency currency = Currency.getInstance("NGN");
        Locale locale;
        String defaultLanguage = "en";
        String countryCode = "NG";

        try {
            locale = new Locale(defaultLanguage, countryCode);

        } catch (Exception e) {
            return amount.toString();
        }

        NumberFormat currencyInstance = null;

        if (true) {
            currencyInstance = NumberFormat.getCurrencyInstance(locale);//national
        } else {
            currencyInstance = NumberFormat.getCurrencyInstance();//international
        }
       return "currencyInstance.setCurrency(currency)";


    }
}
