package javabeans;

import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {

    Album emotion = new Album(1, "Carly Rae Jepsen", "Emotion", 2015, 100000, "pop");
    Album HIIAPL = new Album(2, "Maggie Roders", "Heard It In A Past Life", 2019, 100000, "sad indie girl pop");
    Album TTSOOSN = new Album(3, "Bleachers", "Take The Sadness Out Of Saturday Night", 2021, 100000, "indie pop");

    Author JPJ = new Author(1, "John Paul", "Jones");
    Author bokuto = new Author(2, "Kotaro", "Bokuto");
    Author nancy = new Author(3, "Nancy", "Drew");

    Quote quote1 = new Quote(1, JPJ, "My name is John Paul Jones. My friends call me John Paul Jones. So, you can call me John Paul Jones");
    Quote quote2 = new Quote(2, bokuto, "Hey, Hey, Hey!");
    Quote quote3 = new Quote(3, nancy, "It's locked.");

    System.out.println(quote1.getText());

    ArrayList<Quote> quotes = new ArrayList<>();
    quotes.add(quote1);
    quotes.add(quote2);
    quotes.add(quote3);

    for(Quote quote: quotes){
        System.out.println("Author: " + (quote.getAuthor()).getFirst_name() + " " + (quote.getAuthor()).getLast_name());
        System.out.println("Quote: " + quote.getText() + "\n");
    }

    }






}
