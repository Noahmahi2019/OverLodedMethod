import java.util.Arrays;

public class Media {
    private String tvSchedule;
    private String title;
    private String length;
    private String[] Directors;
    private boolean isAdvertisingAllowed;

    public Media(String tvSchedule, String title, String categories, String[] directors, String length) {
        this.tvSchedule = tvSchedule;
        this.title = title;
        this.length=length;
        this.Directors = directors;
        this.isAdvertisingAllowed = false;
    }
     public Media(String title){
        this.title=title;
     }

    public String getTvSchedule() {
        return tvSchedule;
    }

    public void setTvSchedule(String program) {
        this.tvSchedule = tvSchedule;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirectors() {
        return Arrays.toString(this.Directors);
    }

    public void setDirectors(String[] directors) {
        Directors = directors;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public boolean isAdvertisingAllowed() {
        return isAdvertisingAllowed;
    }

    public void setIsAdvertisingAllowed(boolean isAdvertisingAllowed) {
        this.isAdvertisingAllowed = isAdvertisingAllowed;
    }
}
