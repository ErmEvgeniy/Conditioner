import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @org.junit.jupiter.api.Test
    void increaseCurrentTemperature() {
        ru.neology.domain.Conditioner conditioner = new ru.neology.domain.Conditioner();
        conditioner.setMaxTemperature(40);
        conditioner.setCurrentTemperature(22);
        conditioner.increaseCurrentTemperature();
        assertEquals(23, conditioner.getCurrentTemperature());

        conditioner.setCurrentTemperature(39);
        conditioner.increaseCurrentTemperature();
        assertEquals(40, conditioner.getCurrentTemperature());

        conditioner.setCurrentTemperature(40);
        conditioner.increaseCurrentTemperature();
        assertEquals(40, conditioner.getCurrentTemperature());
    }

    @org.junit.jupiter.api.Test
    void decreaseCurrentTemperature() {
        ru.neology.domain.Conditioner conditioner = new ru.neology.domain.Conditioner();
        conditioner.setMinTemperature(0);
        conditioner.setCurrentTemperature(22);
        conditioner.decreaseCurrentTemperature();

        assertEquals(0, conditioner.getCurrentTemperature());
        conditioner.setCurrentTemperature(1);
        conditioner.decreaseCurrentTemperature();
        assertEquals(0, conditioner.getCurrentTemperature());

        conditioner.setCurrentTemperature(0);
        conditioner.decreaseCurrentTemperature();
        assertEquals(0, conditioner.getCurrentTemperature());

    }
}