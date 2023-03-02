public class Bear extends Animal {

    boolean isSleeping;

    Bear(int weight, Season season) {
        super(weight,season,Color.BROWN);
        isSleeping = season == Season.WINTER;
    }
    @Override
    public String toString() {
        return "Bear. " + (isSleeping ? "I am sleeping. " : "") +
                super.toString();
    }
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
