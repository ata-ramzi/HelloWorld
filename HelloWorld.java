import java.util.ArrayList;

public class HelloWorld {


    public static void main(String[] args) 
    {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
  HelloWorld.computePrimes();
    }

    public static ArrayList<Integer> primes = new ArrayList<Integer>();

    public static void computePrimes()
    {
  primes.add(2);
  int i = 3;

  while(i < 1000000)
  {
      boolean primeDetected = true;
      for(Integer p : primes)
      {
    if(i % p == 0)
    {
        primeDetected = false;
        break;
    }
      }
      if(primeDetected)
      {
    System.out.println(i);
    primes.add(i);
      }
            i++;
        }
    }


}