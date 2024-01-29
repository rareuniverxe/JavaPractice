//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PyramidStarPatter pStarPatter = new PyramidStarPatter();
        pStarPatter.pyramidStarPattern();

        DiamondPattern dPattern = new DiamondPattern();
        dPattern.diamondPattern();

        DownwardTriangleStarPattern dtStarTraiangle = new DownwardTriangleStarPattern();
        dtStarTraiangle.downwardTriangleStarPattern();

        MirroredRightTriangleStarPattern mRightStarTraiangle = new MirroredRightTriangleStarPattern();
        mRightStarTraiangle.mirroredRightTriangleStarPattern();

        ReversePyramidStarPattern rPyramidStarPattern = new ReversePyramidStarPattern();
        rPyramidStarPattern.reversePyramidStarPattern();

        RightPascalsTriangle rPascalTraingle = new RightPascalsTriangle();
        rPascalTraingle.rightPascalsTriangle();
    }
}