package Logic;



public class Logic {
    // TODO: define the 'expectedMinutesInOven()' method
    int expectedMinutesInOven() {
        return 40;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    int remainingMinutesInOven(int actualMin) {
        return expectedMinutesInOven() - actualMin;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    int preparationTimeInMinutes(int layers) {
        return layers*2;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int actualMin) {
        return remainingMinutesInOven(actualMin)+preparationTimeInMinutes(layers);
    }

    public static void main(String args[]) {
        Logic lasagna = new Logic();
        System.out.println(lasagna.totalTimeInMinutes(3,20));
        System.out.println(lasagna.totalTimeInMinutes(4,8));
    }
}
