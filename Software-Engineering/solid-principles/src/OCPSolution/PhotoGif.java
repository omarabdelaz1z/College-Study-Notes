package OCPSolution;

public class PhotoGif implements Photo {
    @Override
    public void open() {
        System.out.println("Open GIF photo!");
    }
}
