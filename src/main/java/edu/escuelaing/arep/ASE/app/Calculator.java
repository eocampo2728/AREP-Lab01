package edu.escuelaing.arep.ASE.app;

public class Calculator {

    public static double mean(LinkedList elements){
        double ans = 0;
        for (int i = 0; i < elements.size(); i++){
            ans += new Double(elements.get(i).toString());
        }
        ans = ans/elements.size();
        ans = Math.round(ans * 100.0) / 100.0;
        return ans;
    }
    
    public static double standardDeviation(LinkedList elements){
        double mean = mean(elements);
        double ans = 0;
        for (int i = 0; i < elements.size(); i++){
            ans += (new Double(elements.get(i).toString()) - mean) * (new Double(elements.get(i).toString()) - mean);
        }
        ans = ans / (elements.size() - 1);        
        ans = Math.round(ans * 100.0) / 100.0;
        System.out.println(ans);
        return ans;
    }
}
