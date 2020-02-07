package Stream;

import java.util.Random;
import java.util.stream.Stream;

public class StreamsMain2 {
    public static void main (String[] args){
        long count = Stream
                .generate(() -> new Random().nextInt(255))
                .limit(100)
                .filter(intValue -> intValue !=0)
                .map(intValue -> (char) intValue.intValue())
                .peek(System.out::print)
                .count();                   //завершается операция
        System.out.println(count);
    }
}
