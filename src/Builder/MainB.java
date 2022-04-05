package Builder;

public class MainB {
    public static void main(String[] args) {


    Person person =new  Person.builder("ahamd","majid")
            .address("taleghani")
            .city("iranshahr")
            .build();
        System.out.println(person);
}}
