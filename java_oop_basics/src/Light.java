public class Light {
    public boolean isOn;
    public boolean turnOFF(boolean isOn) {
        isOn=false;
        return isOn;
    }
    public boolean turnON(boolean isOn) {
        isOn=true;
        return isOn;
    }
    public void print(){
        System.out.println("is light on? "+isOn);
    }
}
