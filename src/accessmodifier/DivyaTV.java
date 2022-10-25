package accessmodifier;

public class DivyaTV {
    private String correspondent;
    private String newsReporter;
    private String photographer;

    void documentaryFilm(){
        System.out.println("Photographer " + photographer + " With correspondent " + getCorrespondent() + " and news reporter " + getNewsReporter());
    }

    public String getCorrespondent() {
        return correspondent;
    }

    public void setCorrespondent(String correspondent) {
        this.correspondent = correspondent;
    }

    public String getNewsReporter() {
        return newsReporter;
    }

    public void setNewsReporter(String newsReporter) {
        this.newsReporter = newsReporter;
    }

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }
}
