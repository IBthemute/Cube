public class Face {
    private FacePosition position;
    // the stickers will be in clockwise, starting from the top left sticker
    // e.g. the UBL corner sticker will be [0][0][0], the UB edge sticker will be [0][1]...
    // ...the UFL corner sticker will be [0][0][7]
    private Sticker[] stickers = new Sticker[9];

    enum FacePosition {
        U, L, F, R, B, D
    }

    public Face(FacePosition position) {
        this.position = position;
        Sticker.StickerColor color;
        // green front, white up
        switch (position) {
            case U:
                color = Sticker.StickerColor.WHITE;
                break;
            case L:
                color = Sticker.StickerColor.ORANGE;
                break;
            case F:
                color = Sticker.StickerColor.GREEN;
                break;
            case R:
                color = Sticker.StickerColor.RED;
                break;
            case B:
                color = Sticker.StickerColor.BLUE;
                break;
            case D:
                color = Sticker.StickerColor.YELLOW;
                break;
            default:
                throw new IllegalStateException("Unexpected face position: " + position);
        }
        for (int i = 0; i < 9; i++) {
            stickers[i] = new Sticker(color);
        }
    }

    public Sticker getSticker(int index) {
        return stickers[index];
    }
}
