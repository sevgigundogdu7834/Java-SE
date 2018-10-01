
enum whoISRIR{

    ARIN("whois.arin.net"),
    RIPE("whois.ripe.net"),
    APNIC("whois.apnic.net"),
    AFRINIC("whois.afrinic.net"),
    LACNIC("whois.lacnic.net"),
    JPNIC("whois.nic.ad.jp"),
    KRNIC("whois.nic.or.kr"),
    CNNIC("ipwhois.cnnic.cn"),
    UNKNOWN("");

    private String URL;

    public String url() {
        return URL;
    }

    whoISRIR(String URL) {
        this.URL = URL;
    }
}

public class mixedExample{

    public static void main(String[] args) {

        System.out.println(whoISRIR.ARIN.url());
    }
}


