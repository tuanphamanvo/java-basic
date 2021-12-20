package lesson12.InterfaceAsADeclarationMethod;

public class TestSlugs implements Slugs{
    private String articleURL;
    public void Article(String articleURL){
        this.articleURL = articleURL;
    }
    public String lesson1FullPath(){
        return articleURL.concat(lesson1);
    }

    public static void main(String[] args) {
        String baseURL = "https://sdetpro.com";
        String articleURL = "/selenium-tutorial/";
    }
}
