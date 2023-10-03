package ch4_control_statements_logical_operators;

/**
 * Bu Java programı, mantıksal operatörleri (&&, ||, &, |, ^, !) kullanarak koşullu ifadelerin doğruluğunu değerlendirir.
 */
public class LogicalOperators {
    public static void main(String[] args) {
        // && (Koşullu VE) operatörü için doğruluk tablosunu oluştur
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Koşullu VE (&&)", "false && false", (false && false),
                "false && true", (false && true),
                "true && false", (true && false),
                "true && true", (true && true));

        // || (Koşullu VEYA) operatörü için doğruluk tablosunu oluştur
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Koşullu VEYA (||)", "false || false", (false || false),
                "false || true", (false || true),
                "true || false", (true || false),
                "true || true", (true || true));

        // & (boolean mantıksal VE) operatörü için doğruluk tablosunu oluştur
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Boolean mantıksal VE (&)", "false & false", (false & false),
                "false & true", (false & true),
                "true & false", (true & false),
                "true & true", (true & true));

        // | (boolean mantıksal dahil VEYA) operatörü için doğruluk tablosunu oluştur
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Boolean mantıksal dahil VEYA (|)",
                "false | false", (false | false),
                "false | true", (false | true),
                "true | false",(true | false) ,
                "true | true", (true | true));

        // ^ (boolean mantıksal özel VEYA) operatörü için doğruluk tablosunu oluştur
        System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n",
                "Boolean mantıksal özel VEYA (^)",
                "false ^ false", (false ^ false),
                "false ^ true", (false ^ true),
                "true ^ false", (true ^ false),
                "true ^ true", (true ^ true));

        // ! (mantıksal değil) operatörü için doğruluk tablosunu oluştur
        System.out.printf("%s%n%s: %b%n%s: %b%n", "Mantıksal DEĞİL (!)",
                "!false", (!false), "!true", (!true));
    }
}
