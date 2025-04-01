public class GeographicalPoint {
    private double latitude;
    private double longitude;

    public GeographicalPoint(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    /*
    // Haversine formula to calculate the distance between two points
    public double distanceTo(GeographicalPoint other) {
        final int R = 6371; // Radius of the Earth in kilometers
        double latDistance = Math.toRadians(other.latitude - this.latitude);
        double lonDistance = Math.toRadians(other.longitude - this.longitude);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(this.latitude)) * Math.cos(Math.toRadians(other.latitude))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c; // Distance in kilometers
    }
    */

    // Distanz unter Berücksichtigung der Erdkrümmung
    public double distance(GeographicalPoint one, GeographicalPoint two) {
        final int R = 6371; // Radius of the Earth in kilometers
        double latDistance = Math.toRadians(one.latitude - two.latitude);
        double lonDistance = Math.toRadians(one.longitude - two.longitude);
        double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
                + Math.cos(Math.toRadians(two.latitude)) * Math.cos(Math.toRadians(one.latitude))
                * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c; // Distance in kilometers
    }




}
