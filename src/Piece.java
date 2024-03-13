public class Piece {
    private Sticker[] stickers;
    private PieceType type;

    enum PieceType {
        CORNER, EDGE, CENTER
    }

    public Piece(Sticker[] stickers, PieceType type) {
        // 3 stickers for corner, 2 for edge, 1 for center
        this.stickers = stickers;
        this.type = type;
    }
}