public class Employee {

        private String firstName;
        private String lastName;
        private int age;
        private double salary;
        private Department department;


    public Employee(){}
    public Employee(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public Employee(String firstName, String lastName, int age, double salary, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
             this.age = age;
        }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getSalary() {
               return salary;
        }

        public void setSalary(double salary) {
               this.salary = salary;
        }
        public int getAgeAfter20yearsOnCurrentAge(){
        int currentAge=getAge();
        return currentAge+20;
        }
}


