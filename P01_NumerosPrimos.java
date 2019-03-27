package bug;


//LIstar los numeros según el numero de digitos indicado
//Considero solo hasta numeros menores a 100000 (5 digitos), por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
public class P01_NumerosPrimos
{
  public static void main(String arg[])
      {
      int numDigitos=0;
      int ndigitos=0;
      numDigitos=Integer.parseInt(arg[0]);
      if(numDigitos<0)
          System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
          for(int i = 1; i <= 99999; i++ )
      {
          ndigitos=contarDigitos(i);
          if(ndigitos==numDigitos)
              if (primo(i) == true) 
                  System.out.println(i);    
      }
      }

      public static boolean primo(int num)
      {
          boolean p = false;
   
          if (num == 4) p = true;
          else
          {
          if (num % 2 == 0) p = false; 
              else
              {
                  int contador = 0;  
                  int i = 1; 
                  int limite = (num - 1) / 2; 
                  if  (limite % 2 == 0) limite--;  
           
                  while(i <= limite)
                  {
                      if (num % i == 0) contador++;
                          i += 2;
                          if (contador == 2) i = limite + 1;
                  }

      if (contador == 1) p = true;
          } 
      } 
   
      return p;
  }

  public static int contarDigitos(int numeroEntero)
  {
          int divisionEntera = numeroEntero;

          int contador=1;

          while (divisionEntera != 0)
      {
          divisionEntera = divisionEntera / 10;
          
      }
          contador++;
  return contador;
  }

}