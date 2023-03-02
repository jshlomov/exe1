public abstract class Tree implements Comparable, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;
    protected boolean givesFruit;
    // TODO: Add auxiliary fields and functions.

    public int RoundHeight(float height){
        return Math.round(height);
    }
    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
        givesFruit = false;
    }

    @Override
    public void changeSeason() {
        switch (season) {
            case WINTER -> season = Season.SPRING;
            case SPRING -> season = Season.SUMMER;
            case SUMMER -> season = Season.FALL;
            case FALL -> season = Season.WINTER;
        }
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Object o) {
        return this.height - ((Tree)o).height;
    }

    @Override
    public String toString() {
        return (givesFruit ? "I give fruit. " : "") + "My height is: " + height +
                (leavesColor!=null? " and my color is: " + leavesColor:"");
    }
}
