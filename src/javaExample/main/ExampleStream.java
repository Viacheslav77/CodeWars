package javaExample.main;

import java.util.Arrays;

import java.util.List;
import java.util.Optional;

public class ExampleStream {
    private static List<Artical> articals;

    public static void main(String[] args) {

        articals = Arrays.asList(null, new Artical("JAVA"), new Artical("NoAVA"));
        System.out.println(getArtJava().isPresent() ? getArtJava().map(Artical::getTitle).get() : "none");

        articals = null;
        System.out.println(getArtJava().isPresent() ? getArtJava().map(Artical::getTitle).get() : "none");

    }

    public static Optional <Artical> getArtJava() {
        return articals == null ? Optional.empty() : 
                    articals.stream()
                        .filter(a -> (a != null ? a : new Artical("")).getTitle().contains("JAVA"))
                        .findFirst() ;              
    }

}

class Artical {

    private String title;
    private String text;

    public Artical(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
