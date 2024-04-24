package entity;

public enum Gender {
	Male(0),
	Female(1);
	
	private final int value;
	
	Gender(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
