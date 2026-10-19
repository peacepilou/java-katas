package fundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloYouTest {

    @Test
    void saysHelloToTheGivenName() {
        assertEquals("Hello Barbara", HelloYou.sayHello("Barbara"));
        assertEquals("Hello Ted", HelloYou.sayHello("Ted"));
    }

    @Test
    void saysHelloWorldWhenNameIsEmpty() {
        assertEquals("Hello World", HelloYou.sayHello(""));
    }

    @Test
    void saysHelloWorldWhenNameIsNull() {
        assertEquals("Hello World", HelloYou.sayHello(null));
    }
}
