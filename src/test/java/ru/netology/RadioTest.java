package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    //RadioStation's tests
    @Test
    public void shouldSetDemandRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(5);

        int actual = rad.getCurrentRadioStation();
        int expected = 5;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSet0ThenMoreThan9() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetNextStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);

        rad.nextStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 2;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinWhenNextStationIsMoreThanMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);

        rad.nextStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(2);

        rad.prevStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMaxWhenPrevStationLessThanMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);

        rad.prevStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetPrevStationWhenCurrent1() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);

        rad.prevStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);

    }

//RadioVolume's tests

    @Test
    public void shouldSetDemandVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(5);

        int actual = rad.getCurrentVolume();
        int expected = 5;

        assertEquals(expected, actual);

    }


    @Test
    public void shouldSetDemandVolume0() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetDemandVolume2() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetDemandVolume10() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        int actual = rad.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetDemandVolume11() {
        Radio rad = new Radio();
        rad.setCurrentVolume(11);

        int actual = rad.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeWhenMax() {
        Radio rad = new Radio();
        rad.setCurrentVolume(10);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDiscreaseVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        rad.discreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldDiscreaseVolumeWhenMin() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        rad.discreaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 0;
        assertEquals(expected, actual);
    }
}
