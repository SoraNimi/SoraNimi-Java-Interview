package Lambda;

import java.util.Arrays;
import java.util.List;

//实战4： reduce函数。
//Reduce中文含义为：减少、缩小；而Stream中的Reduce方法干的正是这样的活：
//根据一定的规则将Stream中的元素进行计算后返回一个唯一的值。
public class Test4 {
    public static void main(String[] args) {
        mapReduce();
    }

    public static void mapReduce() {
        List<Double> cost = Arrays.asList(10.0, 20.0, 30.0);
        double allCost = cost.stream().map(x -> x + x * 0.05).reduce((sum, x) -> sum + x).get();
        System.out.println(allCost);
    }
}