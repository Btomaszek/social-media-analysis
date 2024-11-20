public class Post {
    public int id;
    public Date creationDate;
    public String content;
    public User author;
    public String timestamp;
    List<Comment> comments; 
    List<User> seenBy; 

    public Post(int id, String content, User author, String timestamp) {
        this.id = id;
        this.content = content;
        this.author = author;
        this.timestamp = timestamp;
        this.creationDate = creationDate; 
        this.comments = new ArrayList<>(); 
        this.seenBy = new ArrayList<>(); 
    }
}
