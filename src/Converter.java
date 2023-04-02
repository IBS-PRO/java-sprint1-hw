class Converter {

    int STEPS_TO_KM_BASIS = 100000;
    int CALORIES_BASIS = 1000;

    int stepLengthCm = 75;
    int caloriesInOneStep = 50;

    int convertToKm(int steps) {
        return (steps * stepLengthCm) / STEPS_TO_KM_BASIS;
    }

    int convertStepsToKilocalories(int steps) {
        return (steps * caloriesInOneStep) / CALORIES_BASIS;
    }
}