import java.util.concurrent.ExecutorService;  //executorservice, executor used to run program operations concurrently using threads
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;

class WebCrawler implements Runnable {
    private String url;                     //to store url given
    private Set<String> visitedUrls;        //this will store all visited urls in a list
    private static final int MAX_DEPTH = 1; //depth of search = 1

    public WebCrawler(String url, Set<String> visitedUrls) {    //constructor
        this.url = url;
        this.visitedUrls = visitedUrls;
    }

    @Override
    public void run() {     
        if (!visitedUrls.contains(url)) {   //if url not present in visited list, 
            visitedUrls.add(url);           //add url to visited list and
            crawl(url, 1);            //start crawling
        }
    }

    private void crawl(String url, int depth) {
        if (depth > MAX_DEPTH) {            //if depth goes above mx depth, return
            return;
        }

        try {
            Document document = Jsoup.connect(url).get();   //this will get the html page of a given link
            Elements links = document.select("a[href]");    //this will extract all <a> href tags (links present in webpage)

            for (Element link : links) {                    //for each link present in links,
                String nextUrl = link.absUrl("href");   //get a link in webpage and store it in nextUrl
                System.out.println("Crawling: " + nextUrl); //print
                crawl(nextUrl, depth + 1);                  //now crawl the obtained url too, but width depth = depth+1
            }
        } catch (IOException e) {
            System.err.println("Error crawling: " + url);
        }
    }
}

public class WebCrawlerExample {
    public static void main(String[] args) {
        Set<String> visitedUrls = new HashSet<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10); // Number of concurrent threads

        // Seed URLs to start crawling
        String[] seedUrls = {"https://github.com/"};    //list of urls to crawl

        for (String url : seedUrls) {       //for each url present in seedUrls, execute crawling (the run function in WebCrawler class will execute)
            executorService.execute(new WebCrawler(url, visitedUrls));
        }

        executorService.shutdown();         //After finished crawling, shutdown executor
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);  //check if shutdown happens correctly after all operations finished
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Crawling completed.");
    }
}