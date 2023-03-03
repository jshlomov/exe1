/**
 * A class representing a bear. Extends the Animal class and adds
 * functionality specific to bears.
 */
public class Bear extends Animal {

    /**
     * A boolean indicating whether the bear is sleeping or awake.
     */
    boolean isSleeping;
    /**
     * Constructs a new Bear object with the specified weight and season.
     * @param weight The weight of the bear.
     * @param season The current season.
     */
    Bear(int weight, Season season) {
        super(weight,season,Color.BROWN);
        isSleeping = season == Season.WINTER;
    }
    /**
     * Returns a string representation of the bear, including whether
     * it is currently sleeping and the fields from the father.
     * @return A string representation of the bear.
     */
    @Override
    public String toString() {
        return "Bear. " + (isSleeping ? "I am sleeping. " : "") +
                super.toString();
    }
    /**
     * Changes the season and updates the bear's weight and sleeping status
     * based on the new season.
     */
    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (getCurrentSeason()) {
            case WINTER:
                weight = roundWeight(weight * 0.8f);
                isSleeping = true;
                break;
            case SPRING:
                weight = roundWeight(weight * 0.75f);
                isSleeping = false;
                break;
            case SUMMER: weight = roundWeight(weight + (weight/3f)); break;
            case FALL: weight = roundWeight(weight * 1.25f); break;
        }
    }
}
