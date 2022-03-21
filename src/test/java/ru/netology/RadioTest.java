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
    public void shouldSetDemandRadioStation1() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);

        int actual = rad.getCurrentRadioStation();
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetDemandRadioStation0() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetDemandRadioStationLessThan0() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);

    }
    @Test
    public void shouldSet0ThenDemandRadioStationMoreThan19() {
        Radio rad = new Radio(20);
        rad.setCurrentRadioStation(20);

        int actual = rad.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);

    }
    @Test
    public void shouldSetDemandRadioStation9() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);

        int actual = rad.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);

    }
    @Test
    public void shouldSetDemandRadioStation19() {
        Radio rad = new Radio(20);
        rad.setCurrentRadioStation(19);

        int actual = rad.getCurrentRadioStation();
        int expected = 19;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldSetDemandRadioStation18() {
        Radio rad = new Radio(20);
        rad.setCurrentRadioStation(18);

        int actual = rad.getCurrentRadioStation();
        int expected = 18;

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
    public void shouldSetMaxWhenPrevStationLessThanMin2() {
        Radio rad = new Radio(20);
        rad.setCurrentRadioStation(0);
        rad.prevStation();

        int actual = rad.getCurrentRadioStation();
        int expected = 19;

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
    public void shouldSetDemandVolume101() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);

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
    public void shouldStayMaxWhenIncreaseMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        rad.increaseVolume();

        int actual = rad.getCurrentVolume();
        int expected = 100;
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
