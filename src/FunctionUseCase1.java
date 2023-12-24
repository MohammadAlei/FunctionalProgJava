import java.util.function.Function;

public class FunctionUseCase1 {
    
    protected static class MathTriple {
        public static Integer tripleIt(Integer x){
            return x*3;
        }

        public static Integer doubleIt(Integer x){
            return x*2;
        }
    }

    public static void main(String[] args) {
        Function<Integer,Integer> myFunct1  = MathTriple:: tripleIt;
        Function<Integer,Integer> myFunct2  = MathTriple:: doubleIt;

        Integer result =  myFunct1.apply(5);
        Integer result2 =  myFunct2.apply(5);

        System.out.println(result);
        System.out.println(result2);
    }
}
