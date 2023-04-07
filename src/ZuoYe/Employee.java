package ZuoYe;

//第3题：
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Employee {
    public static void main(String[] args) {
        Map map = new HashMap();

        //1.添加几条信息
        System.out.println("添加的员工信息如下所示：");
        map.put("Tom",100);
        map.put("Tony",500);
        map.put("Jack",200);
        map.put("Lily",1500);
        map.put("Obama",700);
        map.put("Trump",1001);

        //2.列出所有的员工姓名
        System.out.println("所有的员工姓名是：");
        Set name = map.keySet();
        for (Object key : name){
            System.out.println(key);
        }
        System.out.println("=============");

        //3.列出所有员工姓名及其工资
        Set set = map.keySet();
        for(Object key1 : set){
            String str = (String) key1 + "，"+map.get(key1);
            System.out.println(str);
        }

        //4.删除名叫“Tom”的员工信息
        map.remove("Tom");
        System.out.println("删除Tom员工后的员工信息是：");
        Set set1 = map.keySet();
        Iterator it = set1.iterator();  //拿到迭代器对象
        while (it.hasNext()){   //判断下面是否有值
            String key2 = (String) it.next();   //拿到数据的key
            String str = key2 + "，" + map.get(key2);    //根据key获取对象
            System.out.println(str);
        }

        //5.输出Jack的工资，并将其工资加1000元(通过取值实现)
        System.out.println("Jack的工资加1000元后的员工信息是：");
        map.put("Jack",(int)map.get("Jack")+1000);
        Set set2 = map.keySet();
        Iterator it1 = set2.iterator();  //拿到迭代器对象
        while (it1.hasNext()){   //判断下面是否有值
            String key3 = (String) it1.next();   //拿到数据的key
            String str = key3 + "，" + map.get(key3);    //根据key获取对象
            System.out.println(str);
        }

        //6.将所有工资低于1000元的员工的工资上涨20%(通过取值实现)
        System.out.println("所有工资低于1000元的员工的工资上涨20%后的员工信息是：");
        Set set3 = map.keySet();
        for (Object key2 : set3){
            String str = (String) key2;
            if ((int)map.get(str)<1000){
                map.put(str,(int)map.get(str)*1.2);
            }
            System.out.println(str+"，"+map.get(str));
        }
    }
}
