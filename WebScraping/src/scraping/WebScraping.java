package scraping;

/*
**********************************************************
Programa: DesafioPoo
Autor: Iago H. Nunes
Criado em 02/09/2020
Descricao:
    Essa é a classe principal do programa.
    No corpo do método main e definido o link que vai ser 
usado para a extração de dados.
    O link usado e do e-commerce "Amazon".
    O método "descricao" e ond vai ser feito o trabalho de
extração de dados.
***********************************************************
*/

import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;

public class WebScraping {

    public static void descricao(String url) {
        //Um try Catch e caso ocorra um erro na conexão.
        try {
            //Requisião solicitando a pagina e extraindo o dados HTML e salvando no objeto do tipo "Document"
            Document document = org.jsoup.Jsoup.connect(url).get();
            
            //Retirando do objeto Document o nome do produto contito no titulo da págia
            Element title = document.select("h1#title").first(); //First e para selecionar so o primeiro elemento com o id "title"
            
            //Imprime na tel o nome do produto para o usuario 
            System.out.printf("%-30s : %s\n",
                    "Produto",
                    title.text());
            
            //Extrai do documento toda as tabela de descrição do produto
            Elements selector = document.select("table#productDetails_techSpec_section_1 tr");
            
            //Iteração para percorrer cada tabela
            for(Element row:selector){
                //Iteração para percorrer cada linha da tabela e com o número extrair o dado especifico de cada linha
                for(int i = 1; i < selector.size();i++){
                    //Atribui a uma variável o texto escrito na primeira coluna da linha
                    String result = row.select("tr:nth-child("+i+") > th").text();
                    
                    //Verifica se a celula da primeira coluna não esta vazia
                    if(!(result.equals(""))) {
                        //Imprime para o usuário as informações do produto já formatado para que facilite a leitura
                        //caracteristica      : informação
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
        //Link do produto que vai ser extraido as informações
        final String url = "https://www.amazon.com.br/Monitor-LG-Gamer-UltraWide-Full/dp/B086M4KK5F/ref=sr_1_1?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&crid=3AFAFZKR3O8Q2&dchild=1&keywords=monitor&qid=1599008270&sprefix=Moni%2Caps%2C312&sr=8-1";

        descricao(url);
    }
}
