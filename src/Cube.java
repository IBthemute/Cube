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
