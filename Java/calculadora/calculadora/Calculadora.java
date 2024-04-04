
package calculadora;

public class Calculadora {
        int x;
        int y;
        static float r;

        //constructor method:constructor
        public Calculadora(int a, int b) {
          x = a;
          y = b;
          r = 0;
        }
    
      public float suma (int a , int b) {
           x = a;
           y = b;
           r = x + y;
           return r;
        }

        public float  restar(int a, int b) {
           x = a;
           y = b;
           r = x - y;
           return  r;
      }

      public float multiplicar (int a, int b) {
        x = a;
        y = b;
        r = x * y;
        return  r;    
      }

      public float dividir (int a, int b) {
        x = a;
        y = b;
        r = (float) x / (float)  y;
        return r;
      }
      public float quadraticanumero1 (int a) {
        x = a;
        r = x * x;
        return r;
      }

      public float quadraticanumero2 (int b) {
        y = b;
        r = y * y;
        return r;
      }

      public float quadratica (int a, int b) {
        x = a;
        y = b;
        r = (x * x) + (y * y);
        return r;
      }

      public static void imprimirResultado() {
         System.out.println("RESULTADOS = " + r);
      }
        public static void main(String[] args) {
          Calculadora micalculadora = new Calculadora (0,0);
          micalculadora.suma(4,21);
          //System.out.println("Resultado suma =  " + resultsuma );
          micalculadora.imprimirResultado();
          micalculadora.restar(4,21);
          //System.out.println("Resultado resta =  " + resultresta );
          micalculadora.imprimirResultado();
          
          micalculadora.multiplicar(4,21);
          //System.out.println("Resultado multiplicacion =  " + resultmultiplicar );
          micalculadora.imprimirResultado();
          micalculadora.dividir(4,21);
          
//System.out.println("Resultado dividicion =  " + resultdividir );
          micalculadora.imprimirResultado();
          micalculadora.quadraticanumero1(4);
          //System.out.println("Resultado quadratica numero 1 =  " + resultquadraticanumero1 );
          
          micalculadora.imprimirResultado();
          micalculadora.quadraticanumero2(21);
          //System.out.println("Resultado quadratica numero 2 =  " + resultquadraticanumero2 );
          micalculadora.imprimirResultado();
          
          micalculadora.quadratica(4,21);
          //System.out.println("Resultado quadratica =  " + resultquadratica );
          micalculadora.imprimirResultado();

        } 
      }