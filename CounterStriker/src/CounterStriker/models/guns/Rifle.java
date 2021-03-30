package CounterStriker.models.guns;

public class Rifle extends GunImpl{
    private static final int FIRED_BULLETS = 10;
    public Rifle(String name, int bulletsCount) {
        super(name, bulletsCount);
    }

    @Override
    public int fire() {
        if(getBulletsCount() - FIRED_BULLETS < 0){
            return 0;
        }
        decreaseBulletsCount(FIRED_BULLETS);
        return FIRED_BULLETS;
    }
}
