public class User {
    private Car car;
    private Phone phone;
    private House house;

    public User() {
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public User(Car car, Phone phone, House house) {
        this.car = car;
        this.phone = phone;
        this.house = house;


    }
}
