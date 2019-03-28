package Lambda;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class Lambda {
    public static void main(String[] args) {
        //语法格式一：无参，无返回值，Lambda体只需要一条语句。
        Runnable r=()->System.out.println("Hello Lambda");
        //语法格式二：Lambda需要一个参数
        Consumer<String> con = (x) -> System.out.println(x);
        //语法格式五：当Lambda体只有一条语句时，return与大括号可以省略
        Comparator<Integer> com = (x, y) -> Integer.compare(x, y);
        //语法格式六：数据类型可以省略，因为可由编译器推断得出，称为类型推断
        BinaryOperator<Long> operator = (Long x, Long y) -> {
            System.out.println("实现函数接口方法");
            return x + y;
        };
    }
}
