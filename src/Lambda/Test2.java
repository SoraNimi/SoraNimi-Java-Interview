package Lambda;

import java.util.Arrays;
import java.util.List;

//实战2：集合元素的遍历
public class Test2 {

    public static void main(String[] args) {
        // Java8之前：
        List<String> list1 = Arrays.asList("a", "b", "c", "d");
        for (String str : list1) {
            System.out.println(str);
        }

        // Java 8之后：
        List list2 = Arrays.asList("a", "b", "c", "d");
        list2.forEach(n -> System.out.println(n));

        // 使用Java 8的方法引用更方便，方法引用由::双冒号操作符标示，
        list2.forEach(System.out::println);

    }
}
