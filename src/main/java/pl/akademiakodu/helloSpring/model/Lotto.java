package pl.akademiakodu.helloSpring.model;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by slickender on 27.07.2017.
 */
public class Lotto {
    public static Set<Integer> getRandomNumbers(){
        Set<Integer> numbers=new TreeSet<>();
        Random random=new Random();
        while (numbers.size() !=6) {
            Integer a = random.nextInt(49)+1;
            numbers.add(a);
        }
        return numbers;
    }
}
