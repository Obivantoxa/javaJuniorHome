public class Bus extends Vehicle {
    /*
    Bus(int people, int max_people, double petrol, double max_petrol);
int getPeopleCount(); - получить текущее количество пассажиров (водитель в это число не входит);
int getMaxPeople(); - получить количество пассажирских мест;
     */

    public int people_count;
    public int max_people;

    public Bus() {

    }

    public Bus(int people, int max_people, double petrol, double max_petrol) {
        super(max_petrol, petrol);
        this.people_count = people;
        this.max_people = max_people;

    }

    public int getPeople_count() {
        return people_count;
    }

    public int getMax_people() {
        return max_people;
    }

    @Override
    public void arrive() {
        super.arrive();
        Base.people_on_base = Base.people_on_base + people_count;
    }

    @Override
    public boolean leave() {
        if (Base.people_on_base < 1) {
            return false;
        }
        if (Base.vehicles_on_base < 1) {
            return false;
        }
        double needs_petrol = getTank_volume() - getPetrol_amount();
        if (needs_petrol > Base.petrol_on_base) {
            return false;
        }
        Base.people_on_base--;
        Base.vehicles_on_base--;
        Base.petrol_on_base = Base.petrol_on_base - needs_petrol;

        int needs_people = max_people;
        if (Base.people_on_base >= needs_people) {
            Base.people_on_base = Base.people_on_base - needs_people;
        } else {
            Base.people_on_base = 0;
        }
        return true;
    }
}
