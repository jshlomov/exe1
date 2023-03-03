/**
 * Represents a caribou, which is an animal that extends the Animal class and has additional
 * properties such as isMigrating and direction.
 */
public class Caribou extends Animal {

    /**
     * A boolean value indicating whether the caribou is currently migrating.
     */
    boolean isMigrating;
    /**
     * A Direction value indicating the direction in which the caribou is migrating.
     */
    Direction direction;

    /**
     * Constructs a new Caribou with the specified weight and season.
     *
     * @param weight the weight of the Caribou
     * @param season the season in which the Caribou is created
     */
    Caribou(int weight, Season season) {
        super(weight, season, Color.BROWN);
        updateBySeason();
    }
    /**
     * Overrides the Animal class's toString() method and returns a string representation of the
     * Caribou, including its current migration status and direction.
     *
     * @return a string representation of the Caribou
     */
    @Override
    public String toString() {
        return "Caribou: " + (isMigrating ? ("I am migrating " + direction + ". ") : "") +
                super.toString();
    }
    /**
     * Updates the properties of the Caribou based on the new season.
     */
    @Override
    public void changeSeason() {
        super.changeSeason();
        updateBySeason();
    }
    /**
     * Updates the properties of the Caribou based on the current season.
     */
    public void updateBySeason() {
        switch (getCurrentSeason()) {
            case WINTER:
                color = Color.WHITE;
                isMigrating = true;
                direction = Direction.south;
                break;
            case SPRING:
                color = Color.BROWN;
                isMigrating = false;
                break;
            case SUMMER:
                isMigrating = true;
                direction = Direction.north;
                break;
            case FALL:
                isMigrating = false;
                break;
        }
    }
}
