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

    public Face(FacePosition position, Sticker[] stickers) {
        this.position = position;
        Sticker.StickerColor color;
        // green front, white up
        this.stickers = stickers;
    }

    public Sticker getSticker(int index) {
        return stickers[index];
    }
    public Sticker[] getStickers() {return stickers;}
    public void setStickerColor(int index, Sticker.StickerColor color) {stickers[index].setColor(color);}

    public void display() {
        for (int i = 0; i < stickers.length; i++) {
            System.out.print(stickers[i].getColor() + ", ");
        }
        System.out.println();
    }
}
