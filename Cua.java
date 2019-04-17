/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cua;

import java.util.ArrayList;

/**
 *
 * @author marge
 */
public class Cua<Object> extends ArrayList<Object>  {
    
    public void push(Object o) {
        super.add(o);
    }
    
    public void dropFirst() {
        super.remove(0);
    }
    
    public Object first() {
        return super.get(0);
    }
    
    public Object top() {
        return super.get(super.size() - 1);
    }
    
    public boolean isEmpty(){
        return super.isEmpty();
    }
}
