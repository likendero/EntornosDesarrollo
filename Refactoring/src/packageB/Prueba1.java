package packageB;

/**
 *
 * @author liken
 */
public class Prueba1 {
    public static void main(String[] args) {
        System.out.println("hola que tal estas");
        int a = 2;
        int b = 5;
        
        int c = metodoBonito(a, b);
        
        System.out.printf("%d",c);
        System.out.println();
    }

	private static int metodoBonito(int a, int b) {
		int c = a + b;
		return c;
	}
}
