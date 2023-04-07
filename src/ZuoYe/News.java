package ZuoYe;

//第1题：
public class News {
    private String title;   //标题属性
    private String content;    //内容属性

    public News(String title) {
        this.title = title;
    }

    /*public News(String title, String content) {
        this.title = title;
        this.content = content;
    }*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //重写toString方法，打印对象时只打印标题
    @Override
/*    public String toString() {
        if (title.length()<=15){
            return "News{" +
                    "title='" + title + '\'' +
                    '}';
        }else{
            return "News{" +
                    "title='" + title.substring(0,14) +"..."+ '\'' +
                    '}';
        }
    }*/
    public String toString() {
        if (title.length()<=15){
            return title ;
        }else{
            return title.substring(0,14) +"...";
        }
    }

}
