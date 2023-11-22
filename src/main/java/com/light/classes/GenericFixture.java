package com.light.classes;

public class GenericFixture {
    private static int numberOfFixtures;
    private int fixtureId;
    private String fixtureName;
    private short totalChannels;
    private short address;

    public GenericFixture() {
        this.fixtureId = numberOfFixtures++;
        this.setAddress((short) 0);
        this.setTotalChannels((short)0);
        this.fixtureName = "GenericFixture";
    }

    public GenericFixture(short totalChannels, short address, String fixtureName) {
        this.fixtureId = numberOfFixtures++;
        this.setTotalChannels(totalChannels);
        this.setAddress(address);
        this.fixtureName = fixtureName;
    }

    public void setAddress(short address) {
        if (0<address && address<512){
            this.address = address;
        } else {
            this.address = 0;
        }
    }

    public void setTotalChannels(short totalChannels) {
        if (0<totalChannels && totalChannels<512){
            this.totalChannels = totalChannels;
        } else {
            this.totalChannels = 0;
        }
    }

    @Override
    public String toString() {
        return "GenericFixture{" +
                "Id=" + fixtureId +
                ", Name='" + fixtureName + '\'' +
                ", totalChannels=" + totalChannels +
                ", Address=" + address +
                '}';
    }
}