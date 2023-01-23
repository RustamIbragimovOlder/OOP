package OOP_PracticalTasks.OOP_PT6_23jan.task1;

public class FaceID implements UnlockMethod {
    
    private String faceID;   

    public FaceID(String faceID) {
        this.faceID = faceID;
    }

    public String getFaceID() {
        return faceID;
    }

    @Override
    public void unlock() {
        System.out.println("faceID...faceID...faceID...");
        System.out.println("Телефон разблокирован по лицу");
    }

}