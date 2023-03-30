public class Converter {

    Converter() {
    }
    int convertToKm(int steps) {
        int lenghtOfStep = 71;
        int distance = (lenghtOfStep * steps) / 100000;
        return distance;
    }

    int convertStepsToKilocalories(int steps) {
        int oneStep = 50;
        int сalories = (oneStep * steps) / 1000;
        return сalories;
    }
}