
/**
 * Clase ArrayUtils: contiene implementaciones de rutinas fundamentales
 * sobre arreglos.
 * 
 * @author N. Aguirre
 * @version 0.1
 */
public class ArrayUtils
{
    /**
     * Comprueba si un elemento (entero) pertenece a un arreglo.
     */
    public boolean pertenece(int elem, int[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        //TODO: Completar la implementación, reemplazando la línea siguiente
        for (int i= 0 ; i < arreglo.length ; i++)
        {
            if (elem == arreglo[i])
            {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Calcula la suma de los elementos de un arreglo de enteros
     */
    public int suma(int[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        //TODO: Completar la implementación, reemplazando la línea siguiente
        int suma = 0;
        for (int i= 0 ; i < arreglo.length ; i++)
        {
            suma += arreglo[i];
        }
        return suma;
    }
    
    /**
     * Calcula el valor mínimo de un arreglo de reales
     */
    public float minimo(float[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        //TODO: Completar la implementación, reemplazando la línea siguiente
        float min = Integer.MAX_VALUE;
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
    public float maximo(float[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        //TODO: Completar la implementación, reemplazando la línea siguiente
        float max = Integer.MIN_VALUE;
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
    public float promedio(float[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
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
    public int[] fibSequence(int n) {
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
    public float mediana(float[] arreglo) {
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
    public boolean iguales(int[] arr1, int[] arr2) {
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
    public boolean tieneRepetidos(int[] arreglo) {
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
    public boolean tieneOpuestos(float[] arreglo) {
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