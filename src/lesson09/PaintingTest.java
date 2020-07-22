package lesson09;

public class PaintingTest {
    public static void main(String[] args) {

        double sphereDiameter = 58.0;
        double cubeSide = 40.0;
        double pyramidSideBase = 20.0;
        double pyramidSideEdge = 30.0;
        double rectangularCuboidHeight = 80.0;
        double rectangularCuboidLength = 30.0;
        double rectangularCuboidWidth = 20.0;
        double surfaceArea = 0.0;
        double surfaceAreaOfSphere = Math.PI * sphereDiameter * sphereDiameter;
        surfaceArea += surfaceAreaOfSphere;
        System.out.println(surfaceArea);
        double surfaceAreaOfCube = 6 * cubeSide * cubeSide;
        System.out.println(surfaceAreaOfCube);
        surfaceArea += surfaceAreaOfCube;
        System.out.println(surfaceArea/100);
        double halfOfPerimeter = (pyramidSideBase + pyramidSideEdge + pyramidSideEdge) / 2;
        double surfaceOfSides = Math.sqrt(halfOfPerimeter * (halfOfPerimeter - pyramidSideBase)
                * (Math.pow(halfOfPerimeter - pyramidSideEdge, 2)));
        double surfaceAreaOfPyramid = pyramidSideBase * pyramidSideBase + surfaceOfSides * 4;
        surfaceArea += surfaceAreaOfPyramid;
        System.out.println(surfaceArea/100);

        double surfaceAreaOfRectangleCuboid = 2 * (rectangularCuboidHeight * rectangularCuboidLength
                + rectangularCuboidLength * rectangularCuboidWidth + rectangularCuboidHeight * rectangularCuboidWidth);
        System.out.println(surfaceAreaOfRectangleCuboid);
        surfaceArea += surfaceAreaOfRectangleCuboid;


        System.out.println(surfaceArea/100);

    }
}
