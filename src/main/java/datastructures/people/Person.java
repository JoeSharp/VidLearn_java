package datastructures.people;

class Person {
    private final String name;
    private final Integer age;
    private final String favouriteColour;

    Person(String name, Integer age, String favouriteColour) {
        this.name = name;
        this.age = age;
        this.favouriteColour = favouriteColour;
    }

    static Person fromCsv(final String csv) throws IllegalArgumentException {
        final String[] parts = csv.split(",");
        if (parts.length != 3) {
            final String msg = String.format("Invalid number of parts in CSV %s", csv);
            throw new IllegalArgumentException(msg);
        }

        final String name = parts[0];
        final Integer age = Integer.parseInt(parts[1]);
        final String favouriteColour = parts[2];
        return new Person(name, age, favouriteColour);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getFavouriteColour() {
        return favouriteColour;
    }
}
