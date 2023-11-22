package com.light.classes;

public class Color {

    private short red;
    private short green;
    private short blue;


    public Color() {
        this.red = 0;
        this.blue = 0;
        this.green = 0;
    }

    public Color(short red,  short green, short blue) {
        this.setRed(red);
        this.setBlue(blue);
        this.setGreen(green);
    }

    public Color(String color){
        switch (color.toUpperCase()){
            case "RED" :
                this.red = 255;
                this.blue = 0;
                this.green = 0;
                break;
            case "BLUE" :
                this.red = 0;
                this.blue = 255;
                this.green = 0;
                break;
            case "GREEN" :
                this.red = 0;
                this.blue = 0;
                this.green =255;
                break;
            default:
                this.red = 0;
                this.blue = 0;
                this.green = 0;
        }
    }

    public short getRed() {
        return red;
    }

    public void setRed(short red) {
        if (0<=red && red>=255){
            this.red = red;
        } else {
            this.red = 0;
        }

    }

    public short getBlue() {
        return blue;
    }

    public void setBlue(short blue) {
        if (0<=blue && blue>=255){
            this.blue = blue;
        } else {
            this.blue = 0;
        }
    }

    public short getGreen() {
        return green;
    }

    public void setGreen(short green) {
        if (0<=green && green>=255){
            this.green = green;
        } else {
            this.green = 0;
        }
    }

    @Override
    public String toString() {
        return "Color(Red - " + this.red + ", Green - " + this.green + ", Blue - " + this.blue + ")";
    }
}
