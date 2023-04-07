package ZuoYe;

//第4题：
public class News1 {
    private String title;   //标题
    private String author;  //作者
    private String content; //内容
    private int time;   //发布时间

    //仅含标题参数的构造函数
    public News1(String title) {
        this.title = title;
    }

    //set/get方法
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", time=" + time;
    }
}
