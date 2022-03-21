package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int quantityRadioStations = 10;

    public Radio() {

    }

    public Radio(int quantityRadioStations) {
        this.quantityRadioStations = quantityRadioStations;
    }

    //RadioStation
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setToMax() {
        currentRadioStation = quantityRadioStations - 1;
    }

    public void setToMin() {
        currentRadioStation = 0;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {

        if (newCurrentRadioStation > quantityRadioStations - 1) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextStation() {
        if (currentRadioStation < quantityRadioStations - 1) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            setToMin();
        }

    }

    public void prevStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            setToMax();
        }
    }

    //Volume
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setCurrentVolume(int newCurrentVolume) {

        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            setToMaxVolume();
        }
    }

    public void discreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else setToMinVolume();
    }


}

