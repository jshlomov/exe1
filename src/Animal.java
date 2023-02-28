public abstract class Animal implements Seasonable, Comparable {
    protected int weight;
    private Season season;
    protected Color color;

    Animal(int weight, Season season, Color color) {
        this.weight = weight;
        this.season = season;
        this.color = color;
    }

    public int roundWeight(float weight) {
        return (int)Math.round(weight);
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Object o) {
        return this.weight - ((Animal) o).weight;
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
    public String toString() {
        return "My weight is: " + weight +
                " and my color is: " + color;
    }
}
