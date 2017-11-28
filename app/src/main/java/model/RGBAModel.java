package model;

import android.graphics.Color;

import java.util.Observable;

public class RGBAModel extends Observable {

    // CLASS VARIABLES
    public static final Integer MAX_HUE = 359;
    public static final Integer MAX_SAT = 100;
    public static final Integer MAX_VAL = 100;
    public static final Integer MIN_HUE = 0;
    public static final Integer MIN_SAT = 0;
    public static final Integer MIN_VAL = 0;

    // INSTANCE VARIABLES
    private Integer hue;
    private Integer saturation;
    private Integer value;
    private float[] hsv = new float[3];

    /**
     * No argument constructor.
     * <p>
     * Instantiate a new instance of this class, and
     * initialize hue, saturation, and value to max values.
     */
    public RGBAModel() {
        this(MAX_HUE, MAX_SAT, MAX_VAL);
    }

    /**
     * Convenience constructor.
     *
     * @param hue        - starting hue value
     * @param saturation - starting saturation value
     * @param value      - starting value value
     */
    public RGBAModel(Integer hue, Integer saturation, Integer value) {
        super();

        this.hue = hue;
        this.saturation = saturation;
        this.value = value;
    }

    public void asBlack() {
        this.setHSV(0, 0, 0);
    }

    public void asRed() {
        this.setHSV(0, 100, 100);
    }

    public void asLime() {
        this.setHSV(120, 100, 100);
    }

    public void asBlue() {
        this.setHSV(240, 100, 100);
    }

    public void asYellow() {
        this.setHSV(60, 100, 100);
    }

    public void asCyan() {
        this.setHSV(180, 100, 100);
    }

    public void asMagenta() {
        this.setHSV(300, 100, 100);
    }

    public void asSilver() {
        this.setHSV(0, 0, 75);
    }

    public void asGray() {
        this.setHSV(0, 0, 50);
    }

    public void asMaroon() {
        this.setHSV(0, 100, 50);
    }

    public void asOlive() {
        this.setHSV(60, 100, 50);
    }

    public void asGreen() {
        this.setHSV(120, 100, 50);
    }

    public void asPurple() {
        this.setHSV(300, 100, 50);
    }

    public void asTeal() {
        this.setHSV(180, 100, 50);
    }

    public void asNavy() {
        this.setHSV(240, 100, 50);
    }

    // GETTERS
    public Integer getHue() {
        return hue;
    }

    public Integer getSaturation() {
        return saturation;
    }

    public Integer getValue() {
        return value;
    }

    public int getColor() {
        return Color.HSVToColor(hsv);
    }

    // SETTERS

    public void setHue(Integer hue) {
        this.hue = hue;

        this.updateObservers();
    }

    public void setSaturation(Integer saturation) {
        this.saturation = saturation;

        this.updateObservers();
    }

    public void setValue(Integer value) {
        this.value = value;

        this.updateObservers();
    }

    // Convenient setter: set R, G, B
    public void setHSV(Integer hue, Integer saturation, Integer value) {
        this.hue = hue;
        this.saturation = saturation;
        this.value = value;

        this.updateObservers();
    }

    @Override
    public String toString() {
        return "HSV [h=" + hue + " s=" + saturation + " v=" + value + " ]";
    }

    // Proof that my model is independent of any view.
    public static void main(String[] args) {
        RGBAModel model = new RGBAModel(127, 1, 1);

        System.out.println(model);
    }


    // the model has changed!
    // broadcast the update method to all registered observers
    private void updateObservers() {
        this.setChanged();
        this.notifyObservers();
    }
}