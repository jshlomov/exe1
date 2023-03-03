/**
 * Animal is an abstract class that represents an animal. It implements two interfaces - Seasonable and Comparable.
 */
public abstract class Animal implements Seasonable, Comparable {
    /**
     * The weight of the animal.
     */
    protected int weight;
    /**
     * The current season of the animal.
     */
    private Season season;
    /**
     * The color of the animal.
     */
    protected Color color;

    /**
     * Constructs a new Animal object with the specified weight, season, and color.
     * @param weight
     * @param season
     * @param color
     */
    Animal(int weight, Season season, Color color) {
        this.weight = weight;
        this.season = season;
        this.color = color;
    }

    /**
     *
     * @param weight
     * @return - Returns the weight rounded to the nearest integer.
     */
    public int roundWeight(float weight) {
        return (int)Math.round(weight);
    }

    /**
     *
     * @return Returns the current season of the animal.
     */
    @Override
    public Season getCurrentSeason() {
        return season;
    }

    /**
     * Compares the weight of the animal with another object.
     * @param o the object to be compared.
     * @return a negative value if this tree is shorter, a positive value if it is taller,
     *         and zero if they have the same height.
     */
    @Override
    public int compareTo(Object o) {
        return this.weight - ((Animal) o).weight;
    }

    /**
     * Changes the season of the animal.
     */
    @Override
    public void changeSeason() {
        switch (season) {
            case WINTER: season = Season.SPRING;break;
            case SPRING: season = Season.SUMMER;break;
            case SUMMER: season = Season.FALL;break;
            case FALL: season = Season.WINTER;break;
        }
    }

    /**
     *
     * @return Returns a string representation of the animal.
     */
    @Override
    public String toString() {
        return "My weight is: " + weight +
                " and my color is: " + color;
    }
}
