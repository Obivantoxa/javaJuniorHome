package lesson8Home;

public class FIg {
    private String name;
    private String material;

    public FIg() {
    }

    public FIg(String name, String material) {
        this.name = name;
        this.material = material;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FIg fig = (FIg) o;

        if (!name.equals(fig.name)) return false;
        return material.equals(fig.material);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + material.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "fig{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}
