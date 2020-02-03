/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import javaapplication1.Item;

/**
 *
 * @author Arnob
 */
public class JavaApplication1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, IOException {
        // TODO code application logic here
        StaXParser read = new StaXParser();
        
        // final url = new URL("https://www.vogella.com/article.rss");
        List<Item> readConfig = read.readConfig("http://rss.cnn.com/rss/edition.rss");
        for (Item item : readConfig) {
            System.out.println(item);
        }
    }

}
