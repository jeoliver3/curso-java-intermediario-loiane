package com.loiane.cursojava.aula05.threads;


public class TesteSincronizar {
    public static void main(String[]args)
    {
        int[] array = {1,2,3,4,5};
        MinhaThreadSincronizar t1 = new  MinhaThreadSincronizar("num 1", array);
        MinhaThreadSincronizar t2 = new  MinhaThreadSincronizar("num 2", array); 
        
}
}