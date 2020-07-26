public class PiDigit {
  public static double myPi(int num) {
     return Math.round(Math.PI*Math.pow(10,num)) / Math.pow(10,num); //Generates
     }
 
 public static void main(String[] args) {
        System.out.println(myPi(3)); //Pick any int value
}
