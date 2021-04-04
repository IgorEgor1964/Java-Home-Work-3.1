package ru.netology.domain;

public class Radio {
    int currentRadioStation;
    int fistRadioStation = 0;
    int lastRadioStation = 9;
    int currentVolume;
    int minVolume = 0;
    int maxVolume = 10;

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < fistRadioStation) {
            return;
        }
        if (currentRadioStation > lastRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getFistRadioStation() {
        return fistRadioStation;
    }

    public void setFistRadioStation(int fistRadioStation) {
        this.fistRadioStation = fistRadioStation;
    }

    public int getLastRadioStation() {
        return lastRadioStation;
    }

    public void setLastRadioStation(int lastRadioStation) {
        this.lastRadioStation = lastRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation <= lastRadioStation) {
            this.currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation > lastRadioStation) {
            this.currentRadioStation = fistRadioStation;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation >= fistRadioStation) {
            this.currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation < fistRadioStation) {
            this.currentRadioStation = lastRadioStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getMinVolume() {

        return minVolume;
    }

    public void setMinVolume(int minVolume) {

        this.minVolume = minVolume;
    }

    public int getMaxVolume() {

        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {

        this.maxVolume = maxVolume;
    }

    public void volumeDown() {
        if (currentVolume <= maxVolume) {
            this.currentVolume = currentVolume - 1;
        }
        if (currentVolume <= minVolume) {
            this.currentVolume = minVolume;
        }
    }

    public void volumeUp() {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        }
        if (currentVolume >= maxVolume) {
            this.currentVolume = maxVolume;
        }
    }
}