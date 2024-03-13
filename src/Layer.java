public class Layer {
    private Piece[] pieces;
    private int layerNum;

    public Layer(Piece[] pieces, int layerNum) {
        // 9 pieces each, except the middle layer (num 1)
        this.pieces = pieces;
        this.layerNum = layerNum;
    }
}