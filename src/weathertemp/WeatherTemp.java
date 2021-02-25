// This code was edited
package weathertemp;

public class WeatherTemp {

    public static void main(String[] args) {

        double[] temps = {8, -4, 13, 0, 62, 1, -6, -80, -12, 1, 9, -5, 22, 10};
        System.out.println("The average temp is :" + calcAvg(temps));    
    }
    
    public static double calcAvg(double[] temps) {
        double sum = 0, average;
        
        for (int i = 0; i < 14; i++) {
            
            if (temps[i] > -50 && temps[i] < 50) {
                
                sum += temps[i];
            }        
        }
        
        average = sum / 14;
        return average;
    }
}
