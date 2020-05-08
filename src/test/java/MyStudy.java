import org.junit.Test;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author chenglutao
 */
public class MyStudy {

    Locale chinaLocale = new Locale("zh", "CN");
    Locale americaLocale = new Locale("en", "US");


    @Test
    public void numberFormat() {
        final double money = 2972.29d;

        NumberFormat format = NumberFormat.getCurrencyInstance(chinaLocale);
        System.out.println("中国：" + format.format(money));

        NumberFormat format2 = NumberFormat.getCurrencyInstance(americaLocale);
        System.out.println("美国：" + format2.format(money));
    }

    @Test
    public void index() {
        String key = "01";
        String us = ResourceBundle.getBundle("i18n/msg", Locale.US).getString(key);
        String zh = ResourceBundle.getBundle("i18n/msg", Locale.CHINA).getString(key);
        System.out.println("us----->" + us);
        System.out.println("zh----->" + zh);
    }
}
