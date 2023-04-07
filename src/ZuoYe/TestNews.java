package ZuoYe;

//第1题：
import java.util.*;

public class TestNews {
    public static void main(String[] args) {
        //实例化两个对象
        News news = new News("中国多地遭雾霾笼罩空气质量再成热议话题");
        News news1 = new News("春节临近北京“卖房热”");
        /*News news = new News("中国多地遭雾霾笼罩空气质量再成热议话题","15455");
        News news1 = new News("春节临近北京“卖房热”","232626");*/

        //将新闻对象添加到ArrayList集合中
        ArrayList list = new ArrayList();
        list.add(news);
        list.add(news1);

        //遍历的写法1：使用ListIterator（迭代器）遍历
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()){ //判断下面是否有值
            News news2 = (News) listIterator.next();
            System.out.println(news2.toString());
            //System.out.println(news2.getContent());
            //System.out.println("==========================");
        }

        //遍历的写法2：for(遍历数据的数据类型 别名：遍历的数据集合)遍历
        /*for (Object news3 : list){
            News new10 = (News) news3;
            System.out.println(new10.toString());
        }*/
    }
}
