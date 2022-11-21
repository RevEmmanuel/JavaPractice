package Chapter9;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void speakTest() {
        Dog dog = new Dog(3);
        dog.speak();
        dog.fathersSpeak();
    }

}
