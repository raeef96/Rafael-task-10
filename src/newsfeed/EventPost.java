import java.time.LocalDate;
public class EventPost extends Post
{
    private String title;
    private String location;
    private LocalDate date;

    public EventPost(String author,String title, String location, LocalDate date)
    {
        super(author);
        title = this.title;
        location = this.location;
        date = this.date;
    }
    
    public void display()
    {
        System.out.println(username + title + location + date);
        System.out.println("*********************");
        super.display();
    }



}
