package Builder;

public class Person {
    private String firstName;
    private String lastName;
    private String address;
    private String nationalCode;
    private String city;
    private String age;

    private Person(Person.builder builder) {
        this.firstName= builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.city=builder.city;
        this.nationalCode = builder.nationalCode;
    }

    public static class builder{
        private String firstName;
        private String lastName;
        private String address;
        private String nationalCode;
        private String city;
        private String age;

        public builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public builder nationalCode(String nationalCode){
            this.nationalCode = nationalCode;
            return this;
        }
        public builder city(String city){
            this.city =city;
            return this;
        }
        public builder age(String age){
            this.age=age;
            return this;
        }
        public builder address(String address){
            this.address = address;
            return this;
        }
        public Person build(){
            return new Person(this);
        }

    }
}
