package OCP;


public class PhotoViewer {
    void openPhoto(String type) {
        // System.out.println("Really! should I open the photo now?");

        if (type == "JPEG") {
            System.out.println("Open JPEG photo!");
        } else if (type == "PNG") {
            System.out.println("Open PNG photo!");
        } else {
            System.out.println("Photo type is not supported!");
        }
    }
    void openJpegPhoto(){
            System.out.println("Open JPEG photo!");
        }
    void openPngPhoto(){
            System.out.println("Open PNG photo!");
        }

    public static void main(String[] args) {
        OCP.PhotoViewer photoViewer = new PhotoViewer();
        photoViewer.openPhoto("GIF");
        photoViewer.openJpegPhoto();
        photoViewer.openPngPhoto();
    }
}
