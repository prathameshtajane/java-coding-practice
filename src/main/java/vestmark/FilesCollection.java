package vestmark;


public class FilesCollection {
    public static String solution(String s) {
        String[] inputList = s.split("\\r?\\n");
        //System.out.println(inputList.length);
        String extension = "";
        int music = 0;
        int image = 0;
        int movie = 0;
        int other = 0;
        for (String str : inputList) {
            String[] line = str.split(" ");
            String fileName = line[0];
            String size = line[1];
            size = size.substring(0, size.length() - 1);

            int extIndex = fileName.lastIndexOf(".");

            extension = fileName.substring(extIndex, fileName.length());
            switch (extension) {
                case ".mp3":
                case ".aac":
                case ".flac":
                    music = music + Integer.parseInt(size);
                    break;
                case ".jpg":
                case ".bmp":
                case ".gif":
                    image = image + Integer.parseInt(size);
                    break;
                case ".mp4":
                case ".avi":
                case ".mkv":
                    movie = movie + Integer.parseInt(size);
                    break;
                default:
                    other = other + Integer.parseInt(size);
            }
        }

        return "music " + music + "b\n" + "images " + image + "b\n" + "movies " + movie + "b\n" + "other " + other + "b";

    }

    public static void main(String args[]) {
        String[] test = {"test1.txt 11b\n" +
                "my.song.mp3 11b\n" +
                "greatSong.flac 1000b\n" +
                "video.mp4 200b \n" +
                "game.exe 100b",

                "test1.txt 11b\n" +
                        "my.song.mp3 20b\n" +
                        "greatSong.flac 4000b\n" +
                        "video.mp4 600b \n" +
                        "game.exe 00b",

                "test1.txt 11b\n" +
                        "my.song.mp3 11b\n" +
                        "greatSong.flac 1000b\n" +
                        "video.mp4 200b \n" +
                        "game.exe 100b",

                "test1.txt 11b\n" +
                        "my.song.mp3 11b\n" +
                        "greatSong.flac 1000b\n" +
                        "video.mp4 200b \n" +
                        "game.exe 100b\n" +
                        "test.mkv 300000b",

                "test1.txt 0b\n" +
                        "my.song.mp3 0b\n" +
                        "greatSong.flac 000b\n" +
                        "video.mp4 00b \n" +
                        "game.exe 00b\n" +
                        "test.mkv 00000b",

                "test1.txt 10b\n" +
                        "my.song.mp3 110b\n" +
                        "greatSong.flac 1000b\n" +
                        "video.mp4 200000b \n" +
                        "game.exe 1000000b\n" +
                        "test.mkv 1000000b",

                "test1.txt 10b\n" +
                        "my.song.mp3 110b\n" +
                        "greatSong.flac 1000b\n" +
                        "video.mp4 200000b \n" +
                        "game.exe 1000000b\n" +
                        "game.exe 9000000b\n"+
                        "test.mkv 1000000b",

                "%!@#!@.txt 1000000b\n" +
                        "test1.txt 9000000b\n"+
                        "my.song.mp3 110b\n" +
                        "greasda1234atSong.flac 999999b\n" +
                        "gre21342;;atSong.flac 999999b\n" +
                        "video.mp4 200000b \n" +
                        "gam;;;^e.exe 1000000b\n" +
                        "gam^^^@e.exe 9000000b\n"+
                        "test.mkv 1000000b",

                "%!@#!@.txt 1000000b\n" +
                        "test1.txt 9000000b\n"+
                        "my.song.mp3 110b\n" +
                        "greasda1234atSong.flac 999999b\n" +
                        "gre21342;;atSong.flac 999999b\n" +
                        "video.mp4 200000b \n" +
                        "gam;;;^e.gif 1000000b\n" +
                        "gam^^^@e.exe 9000000b\n"+
                        "test.mkv 1000000b"};

        for (String each : test) {
            System.out.println(FilesCollection.solution(each));
            System.out.println();
        }
    }
}
