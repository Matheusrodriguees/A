	/******************************************************************************
	Exemplos com Operadores Matemáticos
	*******************************************************************************/
	public class Aula2a2
	{
		public static void main(String[] args) {
			// Variaveis inteiras
			int x=9, y=10, z=15;
			
			// Variaveis float
			float k=10.5f, n=12.7f;
			
			System.out.println("x="+x + ", y="+y + ",  z="+z);
			System.out.println("x * y = " + (x *  y) );
			System.out.println("x / y = " + (x /  y) );
			System.out.println("x - y = " + (x -  y) );
			System.out.println("x + z = " + (x +  z) );
			System.out.println("y % z = " + (y %  z) );
			
			System.out.println("\nk="+k + ", n="+n );
			System.out.println("k + n = " + (k +  n) );
			System.out.println("k / n = " + (k /  n) );

			x++; // "x++" é igual a "x = x + 1"
			y--; // "y--" é igual a "y = y - 1"
			System.out.println("\nx="+x + ", y="+y + ",  z="+z);
			
			x += y; // x = x + y;
			System.out.println("\nx="+x + ", y="+y + ",  z="+z);
			
			x *= y; // x = x * y;
			System.out.println("\nx="+x + ", y="+y + ",  z="+z);
		}
	}
