package lesson09;

public class PaintingFigures {
    public static void main(String[] args) {
        double totalSurfaceArea;
        System.out.println(findTotalSpace(58, 40, 20, 30,
                80, 30, 20));
        System.out.println(findPaintVolume(3.08));
        System.out.println(findPaintingCosts(492.8));
    }

    public static double findTotalSpace(double sphereDiameter, double cubeSide, double pyramidSideBase,
                                        double pyramidSideEdge, double rectangularCuboidHeight,
                                        double rectangularCuboidLength, double rectangularCuboidWidth) {
        sphereDiameter = 58.0;
        cubeSide = 40.0;
        pyramidSideBase = 20.0;
        pyramidSideEdge = 30.0;
        rectangularCuboidHeight = 80.0;
        rectangularCuboidLength = 30.0;
        rectangularCuboidWidth = 20.0;
        double totalSurfaceArea = 0.0;
        double surfaceAreaOfSphere = Math.PI * sphereDiameter * sphereDiameter;
        totalSurfaceArea += surfaceAreaOfSphere;
        double surfaceAreaOfCube = 6 * cubeSide * cubeSide;
        totalSurfaceArea += surfaceAreaOfCube;
        double halfOfPerimeter = (pyramidSideBase + pyramidSideEdge + pyramidSideEdge) / 2;
        double surfaceOfSides = Math.sqrt(halfOfPerimeter * (halfOfPerimeter - pyramidSideBase)
                * (Math.pow(halfOfPerimeter - pyramidSideEdge, 2)));
        double surfaceAreaOfPyramid = pyramidSideBase * pyramidSideBase + surfaceOfSides * 4;
        totalSurfaceArea += surfaceAreaOfPyramid;
        double surfaceAreaOfRectangleCuboid = 2 * (rectangularCuboidHeight * rectangularCuboidLength
                + rectangularCuboidLength * rectangularCuboidWidth + rectangularCuboidHeight * rectangularCuboidWidth);
        totalSurfaceArea += surfaceAreaOfRectangleCuboid;
        totalSurfaceArea = totalSurfaceArea / 10000;
        return totalSurfaceArea;
    }

    public static double findPaintVolume(double totalSurfaceArea) {
        double minimalPaintVolume = 160.0;
        double totalPaintVolume = minimalPaintVolume * totalSurfaceArea;
        return totalPaintVolume;
    }

    public static double findPaintingCosts(double totalPaintVolume) {
        double paintingPrice = 7;
        double VolumeForPaintingPrice = 400;
        double minimalPaintingCost = paintingPrice / VolumeForPaintingPrice;
        return minimalPaintingCost * totalPaintVolume;
    }
}

 /*1. find total space in cm²
        1.1 find surface area of the sphere
        1.2 find surface area of the cube
        1.3 find surface area of the pyramid
        1.4 find surface area of the rectangular cuboid
        * 2. find total space in m²
        * 3. find needed paintVolume in ml
        * 4. Find paintingCost in €*/