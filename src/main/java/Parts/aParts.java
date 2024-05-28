package Parts;

public class aParts implements iVehiclePart {


    int partID;

    final String partName;

    public aParts(String str) {
        super();
        this.partName = str;

        // ++partID;
    }

    public void TestPart() {

    }

    public String getPartName() {
        return partName;
    }

    public int getPartID() {
        return partID;
    }
}
