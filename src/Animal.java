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
            case WINTER: season = Season.SPRING;break;
            case SPRING: season = Season.SUMMER;break;
            case SUMMER: season = Season.FALL;break;
            case FALL: season = Season.WINTER;break;
        }
    }

    @Override
    public String toString() {
        return "My weight is: " + weight +
                " and my color is: " + color;
    }
}
