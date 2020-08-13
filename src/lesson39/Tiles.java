package lesson39;

public class Tiles {
    public static void main(String[] args) {
        customerInquiry();
    }

    private static void customerInquiry() {
        double tileLength = 30.0;
        double tileWidth = 20.0;
        double workingHour = 27.0;
        double tilePrice = 1.0;
        double floorLength = 7.5;
        double floorWidth = 5.5;
        double meterPerHour = 1.0;
///////////////////////////////////////////////////////////////////////////////////////////////////////
        int quantity = tileQuantity(tileLength, tileWidth, floorLength, floorWidth);
        System.out.println("you need " + quantity + " full tiles");
        int partsOfTiles = partsOfTiles(tileLength, tileWidth, floorLength, floorWidth);
        System.out.println("you need " + partsOfTiles + " part tiles");
        System.out.println("you need " + totalTiles(quantity, partsOfTiles) + " in total");
        double priceWork = priceWork(workingHour, floorLength, floorWidth, meterPerHour);
        double priceMaterial = priceMaterial(tilePrice, quantity);
        System.out.println("price for material is " + priceMaterial + " €");
        System.out.println("price for work is " + priceWork + " €");
        System.out.println("total price is " + totalPrice(priceWork, priceMaterial) + " €");
    }


    private static int tileQuantity(double tileLength, double tileWidth, double floorLength, double floorWidth) {
        int quantity;
        floorLength = floorLength * 100;
        floorWidth = floorWidth * 100;
        int quantityLength = (int) (floorLength / tileLength);
        int quantityWidth = (int) (floorWidth / tileWidth);
        quantity = quantityLength * quantityWidth;
        return quantity;
    }

    private static int partsOfTiles(double tileLength, double tileWidth, double floorLength, double floorWidth) {
        floorLength = floorLength * 100;
        floorWidth = floorWidth * 100;
        int quantityPartsLength = (int) (floorLength % tileLength);
        int quantityPartsWidth = (int) (floorWidth % tileWidth);
        if (quantityPartsLength > quantityPartsWidth) return quantityPartsLength;
        return quantityPartsWidth;
    }

    private static int totalTiles(int quantity, int partsOfTiles) {
        return quantity + partsOfTiles;
    }


    private static double priceWork(double workingHour, double floorLength, double floorWidth, double meterPerHour) {
        return meterPerHour * workingHour * floorLength * floorWidth;
    }

    private static double priceMaterial(double tilePrice, double quantity) {
        return quantity * tilePrice;
    }

    private static double totalPrice(double priceWork, double priceMaterial) {
        return priceWork + priceMaterial;
    }


}
