public class Sticker {
    private StickerColor color;

    enum StickerColor {
        WHITE, GREEN, RED, BLUE, ORANGE, YELLOW
    }

    public Sticker(StickerColor color) {
        this.color = color;
    }

    public StickerColor getColor() {return this.color;}
}
