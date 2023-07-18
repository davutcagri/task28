public class User {
    private long identityNumber;
    private String name, email, phoneNumber;
    private int age;

    public User(Builder builder) {
        this.identityNumber = builder.identityNumber;
        this.name = builder.name;
        this.email = builder.email;
        this.age = builder.age;
        this.phoneNumber = builder.phoneNumber;
    }

    public long getIdentityNumber() {
        return identityNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public static class Builder {
        private long identityNumber;
        private String name, email, phoneNumber;
        private int age;

        public Builder(long identityNumber, String name){
            this.identityNumber=identityNumber;
            this.name=name;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
