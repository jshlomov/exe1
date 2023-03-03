/**
 * Represents an OliveTree, which is a tree that extends the Tree class.
 */
public class OliveTree extends Tree {

    /**
     * Constructs a new OliveTree with the specified height and season, and initializes the
     * givesFruit property based on the season.
     *
     * @param height the height of the OliveTree
     * @param season the season in which the OliveTree is created
     */
    OliveTree(int height, Season season) {
        super(height,season,Color.GREEN);
        givesFruit = season == Season.FALL;
    }
    /**
     * Overrides the Tree class's toString() method and returns a string representation of the
     * OliveTree.
     *
     * @return a string representation of the OliveTree
     */
    @Override
    public String toString() {
        return "Olive tree. " + super.toString();
    }
    /**
     * Overrides the Tree class's changeSeason() method and updates the properties of the OliveTree
     * based on the new season.
     */
    @Override
    public void changeSeason() {
        super.changeSeason();
        updateBySeason();
    }
    /**
     * Updates the properties of the OliveTree based on the current season.
     */
    private void updateBySeason() {
        switch (getCurrentSeason()){
            case WINTER: height = RoundHeight(height + 5);
                givesFruit=false;
                break;
            case SPRING:
            case SUMMER: height = RoundHeight(height + 10);break;
            case FALL:
                height = RoundHeight(height + 5);
                givesFruit=true;
                break;
        }
    }
}
