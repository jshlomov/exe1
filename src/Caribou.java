public class Caribou extends Animal {

    boolean isMigrating;
    Direction direction;

    Caribou(int weight, Season season) {
        super(weight, season, Color.BROWN);
        updateBySeason();
    }

    @Override
    public String toString() {
        return "Caribou: " + (isMigrating ? ("I am migrating " + direction + ". ") : "") +
                super.toString();
    }

    @Override
    public void changeSeason() {
        super.changeSeason();
        updateBySeason();
    }

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
