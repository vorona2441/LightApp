package com.light.classes;

import com.light.interfaces.Info;

public class Channel implements Info {
    //private short channelAddress;
    private static String[] description = {
            "dimmer",   //0
            "shutter",  //1
            "red",      //2
            "green",    //3
            "blue",     //4
            "pan16",    //5
            "pan8",     //6
            "tilt16",   //7
            "tilt8",    //8
            "zoom",     //9
            "iris",     //10
            "gobo"      //11
    };
    // variables
    private byte channelType;
    private String channelDescription;
    private short channelAddress;
    private ChannelValue defaultValue;
    private ChannelValue locateValue;
    private ChannelValue highLightValue;
    private ChannelValue currentValue;
    //constructor

    public Channel() {
        this.setChannelType((byte) 0);
        this.setChannelAddress((short) 0);
        this.setCurrentValue(ChannelValue.LOWVALUE);
    }

    public Channel(short channelAddress) {
        this.setChannelType((byte) 0);
        this.setChannelAddress(channelAddress);
        this.setCurrentValue(ChannelValue.LOWVALUE);
    }

    public Channel(short channelAddress, byte channelType) {
        this.setChannelType(channelType);
        this.setChannelAddress(channelAddress);
        this.setCurrentValue(ChannelValue.LOWVALUE);
    }

    public Channel(short channelAddress, byte channelType, ChannelValue defaultValue) {
        this.setChannelType(channelType);
        this.setChannelAddress(channelAddress);
        this.defaultValue = defaultValue;
        this.setCurrentValue(ChannelValue.LOWVALUE);

    }

    public Channel(short channelAddress, byte channelType, ChannelValue defaultValue, ChannelValue locateValue) {
        this.setChannelType(channelType);
        this.setChannelAddress(channelAddress);
        this.defaultValue = defaultValue;
        this.locateValue = locateValue;
        this.setCurrentValue(ChannelValue.LOWVALUE);
    }

    public Channel(short channelAddress, byte channelType, ChannelValue defaultValue, ChannelValue locateValue, ChannelValue highLightValue) {
        this.setChannelType(channelType);
        this.setChannelAddress(channelAddress);
        this.defaultValue = defaultValue;
        this.locateValue = locateValue;
        this.highLightValue = highLightValue;
    }

    public Channel(short channelAddress,
                   byte channelType,
                   ChannelValue defaultValue,
                   ChannelValue locateValue,
                   ChannelValue highLightValue,
                   ChannelValue currentValue) {
        this.setChannelType(channelType);
        this.setChannelAddress(channelAddress);
        this.setDefaultValue(defaultValue);
        this.setLocateValue(locateValue);
        this.setHighLightValue(highLightValue);
        this.setCurrentValue(currentValue);
    }

    //set
    public void setChannelAddress(short channelAddress) {
        if (0 <= channelAddress || channelAddress >= 511) {
            this.channelAddress = (short) (channelAddress+1);
        } else {
            this.channelAddress = 511;
        }
    }
    public void setChannelType(byte channelType) {
        if (0>channelType && channelType>description.length){
            this.channelType = (byte) 0;
            this.channelDescription = description[0];
        } else {
            this.channelType = channelType;
            this.channelDescription = description[channelType];
        }
    }
    public void setCurrentValue(ChannelValue currentValue) {
        this.currentValue = currentValue;
    }
    public void setDefaultValue(ChannelValue defaultValue) {
        this.defaultValue = defaultValue;
    }
    public void setLocateValue(ChannelValue locateValue) {
        this.locateValue = locateValue;
    }
    public void setHighLightValue(ChannelValue highLightValue) {
        this.highLightValue = highLightValue;
    }


    //get
    public short getChannelAddressForArray(){
        return (short)(channelAddress-1);
    }
    public short getChannelAddress() {
        return channelAddress;
    }
    public byte getChannelType() {
        return channelType;
    }
    public ChannelValue getCurrentValue() {
        return currentValue;
    }
    public ChannelValue getDefaultValue() {
        return defaultValue;
    }
    public ChannelValue getLocateValue() {
        return locateValue;
    }
    public ChannelValue getHighLightValue() {
        return highLightValue;
    }
    public String getChannelDescription() {
        return channelDescription;
    }
    public static String[] getDescription() {
        return description;
    }

    //Info
    @Override
    public String toStringLessInfo() {
        return "[" + this.getChannelAddress() + ":" + this.getCurrentValue().getValue() + "]";
    }
    @Override
    public String toStringMoreInfo() {
        return "[" + this.getChannelAddress() + ":" + this.getCurrentValue().getValue() + "]" + " ("
                + this.channelDescription + ")";
    }
}
