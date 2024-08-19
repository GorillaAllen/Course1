import javax.swing.JSlider;

public class Jslider_value {
  public static void main(String[] argv) throws Exception {
    JSlider slider = new JSlider();

    // Get the current value
    int value = slider.getValue();

    // Get the minimum value
    int min = slider.getMinimum();

    // Get the maximum value
    int max = slider.getMaximum();

    System.out.println("max:" + min);
    System.out.println("max:" + max);
    System.out.println("max:" + value);
  }
}