
/**
 * Clase NumberUtils: contiene implementaciones de rutinas fundamentales
 * sobre números.
 * 
 * @author N. Aguirre
 * @version 0.1
 */
import java.util.ArrayList;

public class NumberUtils
{
    /**
     * Comprueba si un número es primo.
     */
    public boolean esPrimo(int n) {
        if( n == 0 || n == 1)
            throw new IllegalArgumentException("n y m no puede ser 0 ni 1");
        //TODO: Completar la implementación, reemplazando la línea siguiente
        boolean primo = true;
        for (int i= 2 ; i < n ; i++)
        {
            if(n % i == 0)
            {
                return false;   
            }
        }
        return primo;
    }
    
    /**
     * Comprueba si un número es compuesto.
     */
    public boolean esCompuesto(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return false;
    }

    /**
     * Calcula el máximo común divisor de dos números.
     */
    public int maximoComunDivisor(int n, int m) {
        if( n == 0 || n == 1)
            throw new IllegalArgumentException("n y m no puede ser 0 ni 1");
        if( m == 0 || m == 1)
            throw new IllegalArgumentException("n y m no puede ser 0 ni 1");    
        //TODO: Completar la implementación, reemplazando la línea siguiente
        int[] divisores = new int[100];
        int index = 0;
        for (int i = 2 ; i < n ; i++)
        {
            if (n % i == 0)
            {
                divisores[index] = i;
                index++;
            }
        }
        for (int j = 2 ; j < m ; j++)
        {
            if (m % j == 0)
            {
                divisores[index] = j;
                index++;
            }    
        }
        int max = Integer.MIN_VALUE;
        boolean repetidos = false;
        for(int y = 0; y < divisores.length ; y++)
        {
            for (int x = 1; x < divisores.length ; x++)
            {
                if (divisores[x] == divisores[y])
                {
                    repetidos = true;
                    if (repetidos == true && x != y)
                    {
                        if(divisores[x] > max)
                        {
                            max = divisores[x];                
                        }
                    }
                }    
            }
        }
        return max;
    }

    /**
     * Calcula el mínimo común múltiplo de dos números.
     */
    public int minimoComunMultiplo(int n, int m) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Calcula los divisores de un número.
     */
    public ArrayList<Integer> divisores(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return null;
    }
    
    /**
     * Calcula los primeros n números primos
     */
    public int[] primos(int n) {
        if( n == 0 || n == 1)
            throw new IllegalArgumentException("n y m no puede ser 0 ni 1");
        //TODO: Completar la implementación, reemplazando la línea siguiente
        int[] primo = new int[n];
        int index = 0;
        for (int i= 2 ; i < n ; i++)
        {
            if(esPrimo(i) == true)
            {
                primo[index] = i;
                index++;
            }
        }
        return primo;
    }
    
    /**
     * Calcula el n-ésimo número de Fibonacci
     */
    public int nthFib(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Calcula los dígitos de un número entero positivo.
     */
    public ArrayList<Integer> digitos(int n) {
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return null;
    }
    
    /**
     * Calcula el valor mínimo de un arreglo de reales
     */
    private int minimo(int[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        //TODO: Completar la implementación, reemplazando la línea siguiente
        int min = Integer.MAX_VALUE;
        for (int i= 0 ; i < arreglo.length ; i++)
        {
            if (min > arreglo[i])
            {
                min = arreglo[i];    
            }
        }
        return min;
    }
    
    /**
     * Calcula el valor máximo de un arreglo de reales
     */
    private int maximo(int[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        //TODO: Completar la implementación, reemplazando la línea siguiente
        int max = Integer.MIN_VALUE;
        for (int i= 0 ; i < arreglo.length ; i++)
        {
            if (max < arreglo[i])
            {
                max = arreglo[i];    
            }
        }
        return max;
    }
    
    
    /**
     * Calcula el valor promedio de un arreglo de reales
     */
    private float promedio(float[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        //TODO: Completar la implementación, reemplazando la línea siguiente
        float suma = 0;
        for (int i= 0 ; i < arreglo.length ; i++)
        {
            suma += arreglo[i];
        }
        return suma / arreglo.length;
    }
    
    /**
     * Retorna un arreglo con los primeros n números de Fibonacci
     */
    private int[] fibSequence(int n) {
        if(n == 0)
            throw new IllegalArgumentException("n no puede ser 0");
        //TODO: Completar la implementación, reemplazando la línea siguiente
        int[] fib = new int[n]; 
        int num1 = 0;
        int num2 = 1;
        for (int i= 0 ; i < n ; i++)
        {
            num2 += num1;
            fib[i] = num1;
            num1 = num2;
            num2 = fib[i];
        }
        return fib;
    }
    
    /**
     * Calcula la mediana de un arreglo de reales
     */
    private float mediana(float[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        //TODO: Completar la implementación, reemplazando la línea siguiente
        float mediana = 0;
        if(arreglo.length == 1)
        {
            return arreglo[0];
        }   else if (arreglo.length == 0)
        {
            return 0;            
        }
        if(arreglo.length % 2 == 0)
        {
                mediana = (arreglo [ arreglo.length / 2 ] + arreglo [ (arreglo.length / 2) - 1 ]) / 2;
        }   else    {
                mediana = arreglo [arreglo.length / 2];
        }
        return mediana;
    }
    
    /**
     * Comprueba si dos arreglos de enteros son iguales
     */
    private boolean iguales(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null)
            throw new IllegalArgumentException("Arreglo nulo");
        //TODO: Completar la implementación, reemplazando la línea siguiente
        boolean iguales = false;
        for (int i= 0 ; i < arr1.length ; i++)
        {
            for(int j= 1 ; j < arr2.length ; j++)
            {
                if (i == j && arr1[i] == arr2[j])
                {
                    return true;
                }
            }
        }
        return iguales;
    }
    
    /**
     * Comprueba si un arreglo tiene valores repetidos
     */
    private boolean tieneRepetidos(int[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        //TODO: Completar la implementación, reemplazando la línea siguiente
        boolean repetidos = false;
        for (int i= 0 ; i < arreglo.length ; i++)
        {
            for (int j= 1 ; j < arreglo.length ; j++)
            {
                if (arreglo[i] == arreglo[j])
                {
                     repetidos = true;
                }
                if (repetidos == true && i != j)
                {
                    return true;
                }   else    {
                    repetidos = false;
                }
            }
        }
        return repetidos;
    }
    
    /**
     * Comprueba si un arreglo tiene dos valores cuya suma dé cero.
     */
    private boolean tieneOpuestos(float[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        //TODO: Completar la implementación, reemplazando la línea siguiente
        boolean opuestos = false;
        for (int i= 0 ; i < arreglo.length ; i++)
        {
            for (int j= 1 ; j < arreglo.length ; j++)
            {
                if (arreglo[j] + arreglo[i] == 0 && arreglo[j] != 0 && arreglo[i] != 0)
                {
                    return true;
                }
            }   
        }
        return opuestos;
    }
}