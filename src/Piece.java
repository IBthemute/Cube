public class Piece {
    private Sticker[] stickers;

    public Piece(Sticker[] stickers) {
        // 3 stickers for corner, 2 for edge, 1 for center
        this.stickers = stickers;
    }
}