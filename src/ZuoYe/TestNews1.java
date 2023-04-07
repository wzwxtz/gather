package ZuoYe;

//第4题：
import java.util.HashSet;

public class TestNews1 {
    public static void main(String[] args) {
        //实例化四个对象
        News1 news1 = new News1("中国多地遭雾霾笼罩空气质量再成热议话题");
        News1 news2 = new News1("民进党台北举行“火大游行”");
        News1 news3 = new News1("春节临近北京“卖房热”");
        News1 news4 = new News1("春节临近北京“卖房热”");

        //将新闻对象存入HashSet集合中
        HashSet hashSet = new HashSet();
        //hashSet.add(news1);
        hashSet.add(news2);
        hashSet.add(news3);
        hashSet.add(news4);
        //打印新闻标题
        for (Object news : hashSet){
            News1 news5 = (News1) news;
            System.out.println(news5.getTitle());
        }

        //要求使用equals方法比较新闻时，只要标题相同，就认为是同一新闻
        //新闻一与新闻二的比较结果
        System.out.println("新闻一与新闻二的比较结果是："+(news1.getTitle()).equals((news2.getTitle())));
        //news1.equals(news2);
        //新闻三与新闻四的比较结果
        System.out.println("新闻三与新闻四的比较结果是："+(news3.getTitle()).equals((news4.getTitle())));
        //news3.equals(news4);

        //遍历集合，打印新闻类对象
        for (Object news : hashSet){
            News1 news6 = (News1) news;
            System.out.println(news6.toString());
        }

        //打印集合中新闻数量
        System.out.println("集合中的新闻数量是："+hashSet.size());
    }
}
