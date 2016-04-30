/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IAD;

import java.util.ArrayList;

/**
 *
 * @author Bhargav
 */
public class numberCounter {
    int i;
    ArrayList<Integer> numbers = new ArrayList<>();
    
    public boolean addNumber(int n, int count)
    {
        
        if(numbers.size() >= count)
            numbers.clear();
        
        if(numbers.contains(n))
            return true;
        else
        {
            numbers.add(n);
            return false;
        }   
    }
}
