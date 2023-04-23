import org.junit.jupiter.api.Assertions;

public class ContactTest {
    @org.junit.jupiter.api.Test
    public void testContactName() {
        // given:
        Contact contact = new Contact("Vasya", "+79051234567", "vasya@mail.ru");
        // when:

        // then:
        Assertions.assertEquals(contact.getName(), "Vasya");
    }

    @org.junit.jupiter.api.Test
    public void testContactSetName() {
        // given:
        Contact contact = new Contact("Vasya", "+79051234567", "vasya@mail.ru");
        // when:
        contact.setName("Olya Ivanova");
        // then:
        Assertions.assertEquals(contact.getName(), "Vasya");
    }

    @org.junit.jupiter.api.Test
    public void testContactSetEmail() {
        // given:
        Contact contact = new Contact("Vasya", "+79051234567", "vasya@mail.ru");
        // when:
        contact.setEmail("thisIsNotEmil.address");
        // then:
        Assertions.assertEquals(contact.getEmail(), "vasya@mail.ru");
    }

    @org.junit.jupiter.api.Test
    public void testContactSetNumber() {
        // given:
        Contact contact = new Contact("Vasya", "+79051234567", "vasya@mail.ru");
        // when:
        contact.setNumber("8905123456789");
        // then:
        Assertions.assertEquals(contact.getNumber(), "+79051234567");
    }
}
