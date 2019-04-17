/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piladeobjetos;

import java.util.ArrayList;

/**
 *
 * @author marge
 */
public class Pila<Object> extends ArrayList<Object> {
    
    public void push(Object o) {
        super.add(o);
    }
    
    public void pop() {
        super.remove(super.size() - 1);
    }
    
    public Object top() {
        return super.get(super.size() - 1);
    }
    
    public boolean isEmpty(){
        return super.isEmpty();
    }
}