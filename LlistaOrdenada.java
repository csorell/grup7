/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llistaordenada;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author marge
 * @param <Integer>
 */
public class LlistaOrdenada<Object> extends ArrayList<Object> {
    
    public static ArrayList<Integer> fusionaArrays(int[] a, int[] b){
        ArrayList<Integer> arrayFusionada = new ArrayList<Integer>();
        
        for (int i = 0; i < a.length; i++) {
            arrayFusionada.add(a[i]);
        }
        for (int i = 0; i < b.length; i++) {
            arrayFusionada.add(b[i]);
        }
        return arrayFusionada;
    }

    public static ArrayList<Integer> ordenarArray(ArrayList<Integer> arrayFusionada) {
        Collections.sort(arrayFusionada);
        System.out.println(arrayFusionada);
        
        return arrayFusionada;
    }
}
