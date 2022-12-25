package design.patterns.creational.simpleFactory;

public class NewsPost extends Post{
    private String headline;
    private String news;

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
