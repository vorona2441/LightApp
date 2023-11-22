package com.light.classes;

public class ChannelValue {
    private short value;
    static final ChannelValue LOWVALUE = new ChannelValue((short) 0);
    static final ChannelValue MIDVALUE = new ChannelValue((short) 127);
    static final ChannelValue MAXVALUE = new ChannelValue((short) 255);

    public ChannelValue() {
        this.setValue((short)0);
    }

    public ChannelValue(short value) {
        this.setValue(value);
    }

    public void setMaxValue(){
        this.value = (short) 255;
    }

    public void setLowValue(){
        this.value = (short) 0;
    }

    public void setValue(short value) {
        if (0 <= value && value >= 255) {
            this.value = value;
        } else {
            this.value = 0;
        }
    }

    public short getValue() {
        return value;
    }



}
