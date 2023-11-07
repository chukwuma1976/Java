package ComparatorAndComparator;

public class Hero implements Comparable<Hero>{
    private String codeName;
    private String realName;

    public Hero(String codeName, String realName){
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
    public int compareTo(Hero that) {
        return this.getCodeName().compareTo(that.getCodeName());
    }

    @Override
    public String toString() {
        return "{codeName: " + codeName + ", realName: " + realName + "}";
    }
}
