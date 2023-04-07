package ZuoYe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//第2题：第1问：
public class Work2_Map {
    public static void main(String[] args) {
        Map map = new HashMap();    //定义一个Map接口类型的变量，引用一个实现类

        //添加键值对
        map.put("哈士奇",15);
        map.put("柯基",18);
        map.put("拉布拉多",12);
        map.put("贵宾",20);
        System.out.println("添加键值对后的Map集合为：\n"+map);

        //判断集合中是否包含某一key值
        System.out.println("集合中是否包含“哈士奇”一值: "+map.containsKey("哈士奇"));
        //通过某一key值得到value值
        System.out.println("通过柯基的key值得到柯基的value值是："+map.get("柯基"));
        //通过某一key删除键值对
        map.remove("哈士奇");
        System.out.println("通过柯基的key值删除“哈士奇”的键值对后的Map集合是：\n"+map);
        //把另一个map集合添加到此map集合
        Map map1 = new HashMap();
        map1.put("景甜","女");
        map1.put("吴京","男");
        map.putAll(map1);   //将Map1集合添加到Map集合
        System.out.println("新建的Map集合是：\n"+map1);
        System.out.println("将Map1集合添加到Map集合后的结果是：\n"+map);
        //判断是否为空
        System.out.println("集合是否为空："+map.isEmpty());
        //清除集合
        map.clear();
        System.out.println("Map集合清空后的集合是：" + map);
        //返回集合里元素的个数
        System.out.println("集合里元素的个数为：" + map.size());

        System.out.println("==========================");

        map.put("哈士奇",15);
        map.put("柯基",18);
        map.put("拉布拉多",12);
        map.put("贵宾",20);

//第2题第2问：通过两种方法遍历上题中的map集合
        //1.使用迭代器遍历
        System.out.println("迭代器遍历的结果是：");
        Set set = map.keySet();
        Iterator it = set.iterator();  // 拿到迭代器对象
        while(it.hasNext()){   //判断下面是否有值
            String key = (String) it.next();  //拿到数据的key
            String str = key+"，"+map.get(key);// 根据key获取对象
            System.out.println(str);
        }

        System.out.println("==========================");
        System.out.println("for增强遍历的结果是：");
        //2、使用for增强遍历
        Set set1 = map.keySet();
        for (Object key1 : set1){
            String str1 = (String) key1+","+map.get(key1);
            System.out.println(str1);
        }
    }
}
