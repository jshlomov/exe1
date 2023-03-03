/**
 * Represents a FigTree, which is a tree that extends the Tree class.
 */
public class FigTree extends Tree {
    /**
     * A boolean value indicating whether the FigTree has leaves in the current season.
     */
    boolean haveLeaves = true;
    /**
     * Constructs a new FigTree with the specified height and season, and initializes the
     * haveLeaves and leavesColor properties based on the season.
     *
     * @param height the height of the FigTree
     * @param season the season in which the FigTree is created
     */
    FigTree(int height, Season season) {
        super(height,season,Color.GREEN);
        haveLeaves = season != Season.WINTER;
        leavesColor = season == Season.FALL? Color.YELLOW: season == Season.WINTER? null: Color.GREEN;
    }
    /**
     * Overrides the toString method to include whether the FigTree has leaves.
     *
     * @return a string representation of the FigTree
     */
    @Override
    public String toString() {
        return "Fig tree. " +
                super.toString() +
                (haveLeaves ? "" : " and I have no leaves");
    }
    /**
     * Overrides the changeSeason method to update the FigTree's properties based on the
     * current season.
     */
    @Override
    public void changeSeason() {
        super.changeSeason();
        updateBySeason();
    }
    /**
     * Updates the FigTree's properties based on the current season.
     */
    private void updateBySeason() {
        switch (getCurrentSeason()){
            case WINTER:
                height = RoundHeight(height + 20);
                haveLeaves=false;
                leavesColor=null;
                break;
            case SPRING:
                height = RoundHeight(height + 30);
                haveLeaves=true;
                leavesColor=Color.GREEN;
                break;
            case SUMMER:
                height = RoundHeight(height + 30);
                leavesColor=Color.GREEN;
                givesFruit=true;
                break;
            case FALL:
                height = RoundHeight(height + 20);
                leavesColor=Color.YELLOW;
                givesFruit=false;
                break;
        }
    }
}
