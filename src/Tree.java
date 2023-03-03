/**
 * The Tree class is an abstract class that implements the Comparable and Seasonable interfaces.
 * It represents a generic tree with a height, a season, and the possibility of having leaves and giving fruit.
 */
public abstract class Tree implements Comparable, Seasonable {
    /**
     * An integer value indicating the height of the tree.
     */
    protected int height;
    /**
     * A Season enum value indicating the current season of the tree.
     */
    protected Season season;
    /**
     * A Color enum value indicating the color of the tree's leaves.
     */
    protected Color leavesColor;
    /**
     * A boolean value indicating whether the Tree gives fruit in the current season.
     */
    protected boolean givesFruit;
    /**
     *
     * @param height
     * @return - Returns the weight rounded to the nearest integer.
     */
    public int RoundHeight(float height){
        return Math.round(height);
    }

    /**
     * Creates a Tree object with the given height, season, and leavesColor. givesFruit is set to false.
     * @param height
     * @param season
     * @param leavesColor
     */
    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
        givesFruit = false;
    }

    /**
     * Changes the current season of the tree to the next season in the cycle.
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
     * @return the current season of the tree.
     */
    @Override
    public Season getCurrentSeason() {
        return season;
    }

    /**
     * Compares the height of this tree with the height of another tree.
     * @param o the object to be compared.
     * @return  a negative value if this tree is shorter, a positive value if it is taller,
     *          and zero if they have the same height.
     */
    @Override
    public int compareTo(Object o) {
        return this.height - ((Tree)o).height;
    }

    /**
     *
     * @return Returns a string representation of the tree object.
     *         Includes the height, the color of the leaves (if not null), and whether the tree gives fruit (if true).
     */
    @Override
    public String toString() {
        return (givesFruit ? "I give fruit. " : "") + "My height is: " + height +
                (leavesColor!=null? " and my color is: " + leavesColor:"");
    }
}
