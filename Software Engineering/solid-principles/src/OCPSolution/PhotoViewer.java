package OCPSolution;

public class PhotoViewer {
    void openPhoto(Photo photo){
        photo.open();
    }

    public static void main(String[] args) {
        OCPSolution.PhotoViewer pv = new PhotoViewer();

        pv.openPhoto(new PhotoJpeg());
        pv.openPhoto(new PhotoPng());
        pv.openPhoto(new PhotoGif());
    }
}
