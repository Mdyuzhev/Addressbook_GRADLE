package addressbook.aft.gradle.tests;

import addressbook.aft.gradle.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {
    @Test
    public void testContactCreation() {
        app.goTo().initContactModification();
        ContactData contact = new ContactData().withLastname("test")
                .withFirstname("update").withEmail("upmail@mail.ru").withHomePhone("777777").withMobilePhone("777777").withWorkPhone("777777");
        app.contact().fillContactForm(contact, false);
        app.contact().submitContactModification();
        app.goTo().gotoHomePage();
    }
}
