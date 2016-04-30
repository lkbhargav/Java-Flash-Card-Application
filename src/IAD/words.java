/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IAD;
import java.io.Serializable;
import java.util.Random;
/**
 *
 * @author Bhargav
 */
public class words implements Serializable {
    String[] word = new String[1000];
    
    String[] defination = new String[1000];
    String[] difficult = new String[1000];
    String[] dd = new String[1000];
    String[] ed = new String[1000];
    String[] ad = new String[1000];
    String[] average = new String[1000];
    String[] easy = new String[1000];
    int[] index = new int[1000];
    int i=0;
    public int d=0;
    public int e=0;
    public int a=0;
    
    public void addWord(String word, String defination)
    {
        this.word[i] = word;
        this.defination[i] = defination;
        i++;
    }
  
    public void setIndex(int n, int k)
    {
        index[k] = n;
    }
    
    public int getIndex(int n)
    {
        return index[n];
    }
    
    public int getCount()
    {
        return i;
    }
    
    public String wordd(int n)
    {
        System.out.println(this.word[n]);
        return word[n];
    }
    
    public String showDefination(int n)
    {
        return defination[n];
    }
    
    public void setDifficult(int n)
    {
        difficult[d]=word[n];
        dd[d] = defination[n];
        d++;
    }
    
    public void setEasy(int n)
    {
        easy[e] = word[n];
        ed[d] = defination[n];
        e++;
    }
    
    public void setAverage(int n)
    {
        average[a] = word[n];
        ad[d] = defination[n];
        a++;
    }
    
    public String getDifficult(int n)
    {
        return difficult[n];
    }
    
    public String getEasy(int n)
    {
        return easy[n];
    }
    
    public String getAverage(int n)
    {
        return average[n];
    }
    
    public int getDifficultCount()
    {
        return d;
    }
    
    public int getEasyCount()
    {
        return e;
    }
    
    public int getAverageCount()
    {
        return a;
    }
    
    public String showDifficultDefination(int n)
    {
        return dd[n];
    }
    
    public String showEasyDefination(int n)
    {
        return ed[n];
    }
    
    public String showAverageDefination(int n)
    {
        return ad[n];
    }

    String wordd(Random r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
