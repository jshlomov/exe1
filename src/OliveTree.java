public class OliveTree extends Tree {


    OliveTree(int height, Season season) {
        super(height,season,Color.GREEN);
        updateBySeason();
    }

    @Override
    public String toString() {
        return "Olive tree. " + super.toString();
    }
    @Override
    public void changeSeason() {
        super.changeSeason();
        updateBySeason();
    }
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
