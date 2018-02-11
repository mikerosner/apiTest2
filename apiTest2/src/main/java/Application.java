
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import gElevate.Response;
import hello.Quote;



public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);
    static private String key = "";

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        //Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        //log.info(quote.toString());
        
        Response resp = restTemplate.getForObject("https://maps.googleapis.com/maps/api/elevation/json?locations=39.7391536,-104.9847034&key=" + key
        											, Response.class);
        log.info(resp.toString());
        
    }
 
}