class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        // write your code here
            this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        // write your code here
            this.lastName = lastName;
    }

    public String getFullName() {
        // write your code here

        if(firstName == null && lastName == null){
            return "Unknown";
        }
        else if(firstName==null){
            return lastName;
        }
        else if(lastName == null){
            return firstName;
        }
        else{
            return firstName + " " + lastName;
        }
    }
}