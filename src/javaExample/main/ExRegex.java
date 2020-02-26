package javaExample.main;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.*;

public class ExRegex {

    static final String TEXT = "Работа  с регулярными выражениями на Java";

    public static void main(String[] args) {
        System.out.println(testRegex2("Java fdvdfvdf", "[j,J]ava"));
        System.out.println(testRegex2(null, null));

        System.out.println(TEXT.replaceAll(" ", ""));

        System.out.println( regexReplaceAll("Java fdvdfvdf java javadoc", "[j,J]ava", "JS "));
        System.out.println( regexReplaceAll(" fdvdfvdf ava avadoc", "ava", "Ypy"));
        System.out.println( "1 " + regexReplaceAll(" fdvdfvdf ava avadoc", " fdvdfvdf ava avadoc", null));
        System.out.println( "2 " + regexReplaceAll(" fdvdfvdf ava avadoc", null, "Ypy"));
        System.out.println( "3 " + regexReplaceAll(  null," fdvdfvdf ava avadoc", "Ypy"));

        System.out.println( "FindAll " + regexFindAll("Java fdvdfvdf java javadoc", "[j,J]ava").groupCount());
    }

    public static String regexReplaceAll( String string, String regex, String replacement ) {
        return Pattern.compile( regex != null ? regex : "null" )
                      .matcher( string != null ? string : "null" )
                      .replaceAll( replacement != null ? replacement : "null" );

    }
    public static Matcher regexFindAll( String string, String regex ) {

        string = string == null ? "" : string;
        regex = regex == null ? "" : regex;

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string); 
        List < String > list = new ArrayList<>();
        
        while ( matcher.find()){
            System.out.println("--" + matcher.groupCount()); 
            list.add(matcher.toString());
        };        
        
        return matcher;
                      
    }

    public static void regex3(String string, String regex) {

        string = string == null ? "" : string;
        regex = regex == null ? "" : regex;

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }

    public static boolean testRegex1(String str, String desirePattern) {
        Pattern p = Pattern.compile(desirePattern);
        Matcher m = p.matcher(str);
        return m.find();
    }

    public static boolean testRegex2(String str, String desirePattern) {
        return str == null ? false : desirePattern == null ? false : Pattern.compile(desirePattern).matcher(str).find();
    }
}
