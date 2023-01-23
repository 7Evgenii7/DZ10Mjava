package ru.netology;

public class Radio {
    private int currentVolume = 0;
    private int currentStation = 0;

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }

        if (currentStation > 9) {
            return;
        }

        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume){
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
    }

    public void decreaseStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }

    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;

        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;

        }
    }

}
