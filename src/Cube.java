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

        Sticker[] FFaceStickers = new Sticker[9];
        Sticker[] UFaceStickers = new Sticker[9];
        Sticker[] BFaceStickers = new Sticker[9];
        Sticker[] DFaceStickers = new Sticker[9];

        // copy initial face states
        System.arraycopy(this.faces[2].getStickers(), 0, FFaceStickers, 0, 9);
        System.arraycopy(this.faces[0].getStickers(), 0, UFaceStickers, 0, 9);
        System.arraycopy(this.faces[4].getStickers(), 0, BFaceStickers, 0, 9);
        System.arraycopy(this.faces[5].getStickers(), 0, DFaceStickers, 0, 9);

        // create temporary faces with the original states
        Face FFace = new Face(Face.FacePosition.F, FFaceStickers);
        Face UFace = new Face(Face.FacePosition.U, UFaceStickers);
        Face BFace = new Face(Face.FacePosition.B, BFaceStickers);
        Face DFace = new Face(Face.FacePosition.D, DFaceStickers);

        FFace.display();
        UFace.display();
        BFace.display();
        DFace.display();
        System.out.println();

        // todo: improve code readability if possible

        // F
        this.faces[2].setStickerColor(2, DFace.getSticker(2).getColor());
        this.faces[2].setStickerColor(5, DFace.getSticker(5).getColor());
        this.faces[2].setStickerColor(8, DFace.getSticker(8).getColor());
        // U
        this.faces[0].setStickerColor(2, FFace.getSticker(2).getColor());
        this.faces[0].setStickerColor(5, FFace.getSticker(5).getColor());
        this.faces[0].setStickerColor(8, FFace.getSticker(8).getColor());
        // B
        this.faces[4].setStickerColor(2, UFace.getSticker(2).getColor());
        this.faces[4].setStickerColor(5, UFace.getSticker(5).getColor());
        this.faces[4].setStickerColor(8, UFace.getSticker(8).getColor());
        // D
        this.faces[5].setStickerColor(2, BFace.getSticker(2).getColor());
        this.faces[5].setStickerColor(5, BFace.getSticker(5).getColor());
        this.faces[5].setStickerColor(8, BFace.getSticker(8).getColor());
    }

    public void move(String type) {
        if ("U".equals(type)) {
        } else if ("L".equals(type)) {
        } else if ("F".equals(type)) {
        } else if ("R".equals(type)) {
        } else if ("B".equals(type)) {
        } else if ("D".equals(type)) {
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
