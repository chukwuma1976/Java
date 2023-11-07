package ComparatorAndComparator;

public class Superhero {
    private String codeName;
    private String realName;

    public Superhero(String codeName, String realName){
        this.codeName = codeName;
        this.realName = realName;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "{codeName: " + codeName + ", realName: " + realName + "}";
    }

}
