import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Country country1 = new Country();
        country1.setName("Kyrgyzstan");
        country1.setLocation("Center Asia");

        Country country2 = new Country();
        country2.setName("Germany");
        country2.setLocation("European");

        Country country3 = new Country();
        country3.setName("Turkey");
        country3.setLocation("European");

        Country[] countries = {country1, country2, country3};

        for (Country co : countries) {
            System.out.println(co.getName() + ":" + co.getLocation());

        }


        Address address1 = new Address();
        address1.setStreet("Kainazar");
        address1.setNumber(105);

        Address address2 = new Address();
        address2.setStreet("Sharshen Balban");
        address2.setNumber(30);

        Address address3 = new Address();
        address3.setStreet("Manas");
        address3.setNumber(102);

        Address[] addresses = {address1, address2, address3};

        for (Address a : addresses) {
            System.out.println(a.getStreet() + " " + a.getNumber());
        }
        City city1 = new City();
        city1.setName("Talas");

        city1.setPopulation(30000);

        City city2 = new City();
        city2.setName("Ankara");
        city2.setPopulation(50000);

        City city3 = new City();
        city3.setName("Hamburg");
        city3.setPopulation(100000);

        City[] cities = {city1, city2, city3};
        for (City c : cities) {

                System.out.println(c.getName() + "  " + " " + c.getPopulation());
            }

        Person person1= new Person();
        person1.setName("Sagyndyk");
        person1.setDateOfBirth(LocalDate.of(2002,1,1));
        person1.setProfession("Manager");
        person1.setCountry("UAE");

        Person person2= new Person();
        person2.setName("Abylai");
        person2.setDateOfBirth(LocalDate.of(2002,1,1));
        person2.setProfession("Electric");
        person2.setCountry("USA");


         Person person3 = new Person();
         person3.setName("Tashtanbek");
         person3.setDateOfBirth(LocalDate.of(2003,8,31));
         person3.setProfession("Engineer");
         person3.setCountry("Germany");
        Person[] people = {person1,person2,person3};
        for (Person person:people) {
            System.out.println(person.getName()+" "+person.getDateOfBirth()+" "+person.getProfession()+" "+person.getCountry());
        }

        }

    }

//    Country, City, Address жана Person деген класс түзүп,
//
//    Алардын поляларын ойлоп табыңыз
//
//    Геттер сеттерлерди маани берүү жана алуу үчүн колдонуу керек
//
//    Ар бир класска 3-4 төн объект түзүп жана аларга маанилерин бериңиз
//
//    Ар бир класстын объектилерин өз-өзүнчө массивке салып, аларды консольго чыгарыңыз

