public abstract class Tree implements Comparable, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;
    // TODO: Add auxiliary fields and functions.

    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
    }

    @Override
    public String toString() {
        return "My height is: " + height +
                "and my color is: " + leavesColor;
    }

    @Override
    public Season getCurrentSeason() {
        return season;
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
    public int compareTo(Object o) {
        return this.height - ((Tree)o).height;
    }
}
