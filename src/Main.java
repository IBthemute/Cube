public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Cube test = new Cube();
        System.out.println(test.getFace(Face.FacePosition.L).getSticker(0).getColor());
    }
}
