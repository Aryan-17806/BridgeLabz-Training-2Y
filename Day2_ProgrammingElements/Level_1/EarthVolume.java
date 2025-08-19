// Program 7: Volume of Earth
public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = 3.14159;
        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);
        double milesPerKm = 1.6;
        double radiusMiles = radiusKm / milesPerKm;
        double volumeMiles3 = (4.0 / 3) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +" and in cubic miles is " + volumeMiles3);
    }
}
