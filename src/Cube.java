public class Cube {
    Face[] faces = new Face[6];

    public Cube() {
        faces[0] = new Face(Face.FacePosition.U);
        faces[1] = new Face(Face.FacePosition.L);
        faces[2] = new Face(Face.FacePosition.F);
        faces[3] = new Face(Face.FacePosition.R);
        faces[4] = new Face(Face.FacePosition.B);
        faces[5] = new Face(Face.FacePosition.D);
    }

    public Face getFace(Face.FacePosition position) {
        switch (position) {
            case U:
                return this.faces[0];
            case L:
                return this.faces[1];
            case F:
                return this.faces[2];
            case R:
                return this.faces[3];
            case B:
                return this.faces[4];
            case D:
                return this.faces[5];
            default:
                throw new IllegalStateException("Unexpected face position: " + position);
        }
    }

    public void baseMove() {
        // R move
        // moves FUBD faces

        Sticker[] originalFStickers = this.faces[2].getStickers();
        Sticker[] originalUStickers = this.faces[0].getStickers();

        // TODO because it is very hard
        this.faces[0].setStickerColor(2, this.faces[2].getSticker(2).getColor());
        this.faces[0].setStickerColor(5, this.faces[2].getSticker(5).getColor());
        this.faces[0].setStickerColor(8, this.faces[2].getSticker(8).getColor());

        this.faces[0].setStickerColor(2, originalUStickers[2].getColor());
        this.faces[0].setStickerColor(5, originalUStickers[5].getColor());
        this.faces[0].setStickerColor(8, originalUStickers[8].getColor());
    }

    public void move(String type) {
        boolean prime = false;

        if ((type.length() == 2) && (type.charAt(1) == '\'')) {
            prime = true;
        }

        if ('U' == type.charAt(0)) {
        } else if ('L' == type.charAt(0)) {
        } else if ('F' == type.charAt(0)) {
        } else if ('R' == type.charAt(0)) {
        } else if ('B' == type.charAt(0)) {
        } else if ('D' == type.charAt(0)) {
        } else {
            throw new IllegalStateException("Unexpected move: " + type);
        }
    }

    public void display() {
        for (int i = 0; i < faces.length; i++) {
            faces[i].display();
        }
    }
}
