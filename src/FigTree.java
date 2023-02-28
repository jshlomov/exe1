public class FigTree extends Tree {

    boolean haveLeaves = true;
    FigTree(int height, Season season) {
        super(height,season,null);
        updateBySeason();
    }

    @Override
    public String toString() {
        return "Fig tree. " +
                super.toString() +
                (haveLeaves ? "" : " and I have no leaves");
    }
    @Override
    public void changeSeason() {
        super.changeSeason();
        updateBySeason();
    }
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
                break;
        }
    }
}
