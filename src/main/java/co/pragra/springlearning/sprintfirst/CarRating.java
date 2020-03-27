package co.pragra.springlearning.sprintfirst;

import java.util.Map;

public class CarRating {
    private Map<String, String> capRatingMap;

    public CarRating(Map<String, String> capRatingMap) {
        this.capRatingMap = capRatingMap;
    }

    @Override
    public String toString() {
        return "CarRating{" +
                "capRatingMap=" + capRatingMap +
                '}';
    }
}
