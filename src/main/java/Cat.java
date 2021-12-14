public class Cat implements Participant {
    private String name;
    private int maxLength;
    private int maxHeight;
    private boolean success = true;

    public Cat(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }
    public String runStr() {
        return name + " can run " + maxLength + " miles";
    }
    public String jumpStr() {
        return name + " can jump  " + maxHeight + " m";
    }

    public String getName() {
        return name;
    }
    public int getMaxLength() {
        return maxLength;
    }
    public int getMaxHeight() {
        return maxHeight;
    }
    public boolean getSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
}

