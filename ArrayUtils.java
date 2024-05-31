
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
    public boolean pertenece(int elem, int[] arreglo)
    {
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
        return null;
    }
    
    /**
     * Calcula la mediana de un arreglo de reales
     */
    public float mediana(float[] arreglo) {
        if (arreglo == null)
            throw new IllegalArgumentException("Arreglo nulo");
        //TODO: Completar la implementación, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Comprueba si dos arreglos de enteros son iguales
     */
    public boolean iguales(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null)
            throw new IllegalArgumentException("Arreglo nulo");
        //TODO: Completar la implementación, reemplazando la línea siguiente
        
        return false;
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
                if (arreglo[i] == arreglo[j])
                {
                     opuestos = true;
                }
                if (opuestos == true && i != j)
                {
                    return true;
                }   else    {
                    opuestos = false;
                }
            }
        }
        return opuestos;
    }
}
