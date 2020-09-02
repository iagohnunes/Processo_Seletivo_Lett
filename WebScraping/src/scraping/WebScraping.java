package scraping;

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;

public class WebScraping {

    public static void descricao(String url) {
        try {
            Document document = org.jsoup.Jsoup.connect(url).get();

            Element title = document.select("h1#title").first();
            System.out.printf("%-30s : %s\n",
                    "Produto",
                    title.text());

            Elements selector = document.select("table#productDetails_techSpec_section_1 tr");
            for(Element row:selector){
                for(int i = 1; i < selector.size();i++){
                    String result = row.select("tr:nth-child("+i+") > th").text();
                    if(!(result.equals(""))) {
                        System.out.printf("%-30s : %s\n",
                                result,
                                row.select("tr:nth-child(" + i + ") > td").text());
                    }
                }
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        final String url = "https://www.amazon.com.br/Monitor-LG-Gamer-UltraWide-Full/dp/B086M4KK5F/ref=sr_1_1?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=3AFAFZKR3O8Q2&dchild=1&keywords=monitor&qid=1599008270&sprefix=Moni%2Caps%2C312&sr=8-1";

        descricao(url);
    }
}
