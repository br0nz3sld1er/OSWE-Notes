import java.util.Random;
  
public class OpenCRXToken {
  
  public static void main(String args[]) {
    int length = 40;
    long start = Long.parseLong("<start_time>");
    long stop = Long.parseLong("<end_time>");
    String token = "";
  
    for (long l = start; l < stop; l++) {
      token = getRandomBase62(length, l);
      System.out.println(token);
    }
  }
  
  public static String getRandomBase62(int length, long seed) {
    String alphabet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    Random random = new Random(seed);
    String s = "";
    for (int i = 0; i < length; i++){
      s = s + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(62)); 
    }
    return s;
  }
}