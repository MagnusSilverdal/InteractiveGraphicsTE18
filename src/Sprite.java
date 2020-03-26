/**
 * This is a class
 * Created 2020-03-26
 *
 * @author Magnus Silverdal
 */
public class Sprite {
    private int width;
    private int height;
    private int[] pixels;

    public Sprite(int w, int h) {
        this.width = w;
        this.height = h;
        pixels = new int[w*h];
        for (int i = 0 ; i < pixels.length ; i++) {
            pixels[i] = 0xFFFFFF;
        }
    }

    public int[] getPixels() {
        return pixels;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
