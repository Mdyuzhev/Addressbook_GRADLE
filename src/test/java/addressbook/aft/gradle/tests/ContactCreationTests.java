package addressbook.aft.gradle.tests;

import addressbook.aft.gradle.model.ContactData;
import org.testng.annotations.Test;

import java.io.File;

public class ContactCreationTests extends TestBase {
    @Test
    public void testContactCreation() {
        app.goTo().initContactCreation();
        File photo = new File("src/test/resources/face.png");
        app.contact().fillContactForm(new ContactData().withLastname("test")
                .withFirstname("test").withEmail("mail@mail.ru").withPhoto(photo)
                .withMobilePhone("456").withHomePhone("546465").withWorkPhone("456456"), true);
        app.contact().submitContactModification();

    }
}
