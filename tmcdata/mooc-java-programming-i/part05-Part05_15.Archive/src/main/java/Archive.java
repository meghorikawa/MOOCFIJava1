public class Archive {
    
    private String name;
    private String indentifier;

    public Archive(String initialIndentifier, String initialName) {
        this.indentifier = initialIndentifier;
        this.name = initialName;
    }

    public String getIdentifier(){
        return this.indentifier;
    }

    public String getName(){
        return this.name;
    }
    
    //make sure that "equals" (plural form) is in the method name it properly override
    public boolean equals(Object compare) {
        if (this == compare) {
            return true;
        }
        if (!(compare instanceof Archive)) {
            return false;
        }

        Archive comparedItem = (Archive)compare;

        return this.indentifier.equals(comparedItem.indentifier);
    }

    public String toString() {
        return this.indentifier + ": " + this.name;
    }
}

