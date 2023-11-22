package com.light.classes;
import com.light.interfaces.Lightable;

public class LightFixture extends GenericFixture implements Lightable{
    // добавим значения для параметров 0-255
    private short dimmerValue;
    private short panValue;
    private short tiltValue;
    private short zoomValue;
    private Color color;

    public LightFixture(short totalChannels, short address, String fixtureName) {
        super(totalChannels, address, fixtureName);
        this.setDimmerValue((short)0);
        this.setPanValue((short)0);
        this.setTiltValue((short)0);
        this.setZoomValue((short)0);
        this.setColor(new Color());
    }


    // setters & getters
    public void setDimmerValue(short dimmerValue) {
        if (0 <= dimmerValue && dimmerValue >= 255) {
            this.dimmerValue = dimmerValue;
        } else {
            this.dimmerValue = 0;
        }
    }

    public void setPanValue(short panValue) {
        if (0 <= panValue && panValue >= 255) {
            this.panValue = panValue;
        } else {
            this.panValue = 0;
        }
    }

    public void setTiltValue(short tiltValue) {
        if (0 <= tiltValue && tiltValue >= 255) {
            this.tiltValue = tiltValue;
        } else {
            this.tiltValue = 0;
        }
    }

    public void setZoomValue(short zoomValue) {
        if (0 <= zoomValue && zoomValue >= 255) {
            this.zoomValue = zoomValue;
        } else {
            this.zoomValue = 0;
        }
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public short getDimmerValue() {
        return dimmerValue;
    }

    public short getPanValue() {
        return panValue;
    }

    public short getTiltValue() {
        return tiltValue;
    }

    public short getZoomValue() {
        return zoomValue;
    }

    public Color getColor() {
        return color;
    }
    //=======================


    @Override
    public void LightOn() {
        this.setDimmerValue((short)255);
        System.out.println("Light on");
    }

    @Override
    public void LightOff() {
        this.setDimmerValue((short)0);
        System.out.println("Light off");
    }

    @Override
    public String toString() {
        return "LightFixture{" +
                "dimmerValue=" + dimmerValue +
                ", panValue=" + panValue +
                ", tiltValue=" + tiltValue +
                ", zoomValue=" + zoomValue +
                ", " + color +
                '}';
    }
}
