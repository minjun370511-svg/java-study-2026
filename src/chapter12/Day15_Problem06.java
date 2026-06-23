package chapter12;

// String 클래스
// 파일 경로에서 파일명만 추출하기
class FileInfo06 {
    String path;

    FileInfo06(String path) {
        this.path = path;
    }

    public String getFileName() {
        int idx = path.lastIndexOf("\\");
        return path.substring(idx + 1);
    }
}

public class Day15_Problem06 {
    public static void main(String[] args) {
        FileInfo06 file1 = new FileInfo06("C:\\images\\cat.jpg");
        FileInfo06 file2 = new FileInfo06("D:\\documents\\report.pdf");
        FileInfo06 file3 = new FileInfo06("E:\\music\\song.mp3");
        System.out.println(file1.getFileName());
        System.out.println(file2.getFileName());
        System.out.println(file3.getFileName());
    }
}
