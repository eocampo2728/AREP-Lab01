package edu.escuelaing.arep.ASE.app;

public class Calculator {

    public static float mean(LinkedList elements){
        float ans = 0;
        for (int i = 0; i < elements.size(); i++){
            ans += (Float)elements.get(i);
        }
        ans = ans/elements.size();
        
        return ans;
    }
    
    public static float standardDeviation(LinkedList elements){
        float mean = mean(elements);
        float ans = 0;
        for (int i = 0; i < elements.size(); i++){
            ans += ((Float)elements.get(i) - mean) * ((Float)elements.get(i) - mean);
        }
        ans = ans / (elements.size() - 1);
        return ans;
    }
}
