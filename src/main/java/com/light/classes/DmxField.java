package com.light.classes;

public abstract class DmxField {
    private static Channel[] dmx = new Channel[512];

    private static void setAddressForChannel(Channel channel) {
        DmxField.dmx[channel.getChannelAddressForArray()] = channel;
    }

    public static Channel[] getDmx() {
        return dmx;
    }

    public static void setUniverse(){
        for (int i=0; i<=DmxField.getDmx().length-1;++i){
            Channel channel = new Channel((short) i);
            DmxField.setAddressForChannel(channel);
        }
    }

    public static void showUniverse(){
        Channel[] channels = DmxField.getDmx();
        for (int i=0; i<=DmxField.getDmx().length-1;++i){
            System.out.print(channels[i].toStringLessInfo());
            if (i==0){
                continue;
            }
            if (i%20==0){
                System.out.println();
            }
        }
    }

}
