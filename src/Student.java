public class Student {
    private String name;
    private String lastname;
    private String kto;
    public Student() {
    }

    public Student(String name, String lastname, String kto) {
        this.name = name;
        this.lastname = lastname;
        this.kto = kto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getKto() {
        return kto;
    }

    public void setKto(String kto) {
        this.kto = kto;

    }


}
