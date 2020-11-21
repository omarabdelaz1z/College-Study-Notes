package OCPSolution;

public class PhotoJpeg implements Photo {

    @Override
    public void open() {
        System.out.println("Open JPEG photo!");
    }
}
