package imp;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class mp3urlfindhtml implements  mp3urlfind {
    public String urlfind(String htmlurl) {
        String res="";
        String htmlstr= httpUtil.getresoure(htmlurl);
        Document doc=Jsoup.parse(htmlstr);
        Elements eles=doc.getElementsByTag("a");
        for(Element e:eles)
        {
            String href=e.attr("href");
            if(href.contains(".mp3"))
            {
                return href;
            }
        }
        return res;
    }
}
