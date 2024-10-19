package alex.inversion.console;

import alex.inversion.core.Person;
import alex.inversion.service.PersonService;
import com.fasterxml.jackson.core.JsonProcessingException;

public class App {

    private static  PersonService personService = new PersonService();

    public static void main(String[] args) throws JsonProcessingException{
        Person person = new Person();
        person.setFirstName("Alex");
        person.setLastName("Kozlov");
        System.out.println(person);

        String json = personService.toJson(person);
        System.out.println(json);

        Person fromJson = personService.parse(json);
        System.out.println(fromJson);

    }
}
