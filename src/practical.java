
public class practical {
    public static void main(String[]args) {

        System.out.print("Number        SquareRoot"); 
        for(int i = 0; i <= 20; i+=2)
        {
            double squareRoot;
            squareRoot = Math.sqrt(i);
            System.out.printf("\n%-2d %17.4f", i, squareRoot);
        }
    }
}
