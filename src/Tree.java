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
            case WINTER: season = Season.SPRING;break;
            case SPRING: season = Season.SUMMER;break;
            case SUMMER: season = Season.FALL;break;
            case FALL: season = Season.WINTER;break;
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
