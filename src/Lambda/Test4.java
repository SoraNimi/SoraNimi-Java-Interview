package Lambda;

import java.util.Arrays;
import java.util.List;

//实战4： reduce函数。
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