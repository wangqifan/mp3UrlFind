import imp.httpUtil;
import imp.mp3urlfind;
import imp.mp3urlfindhtml;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class application {
    public static void  main(String[] args)
    {
        System.out.println("-----------------");
        String url="http://english.cri.cn/4926/2018/07/06/4421s956177.htm";
        mp3urlfind urlfind=new mp3urlfindhtml();
        System.out.println(urlfind.urlfind(url));

    }
}