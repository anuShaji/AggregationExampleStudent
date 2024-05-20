package amountWithdrawATM;

public class Pins {
    private int pin;
    private int[] validPins = {1001, 1234, 1212};

   
    public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	public int[] getValidPins() {
		return validPins;
	}


	public void setValidPins(int[] validPins) {
		this.validPins = validPins;
	}


	public boolean validatePin(int pin) {
        for (int i = 0; i < validPins.length; i++) {
            if (pin == validPins[i]) {
                return true;
            }
        }
        return false;
    }
}
