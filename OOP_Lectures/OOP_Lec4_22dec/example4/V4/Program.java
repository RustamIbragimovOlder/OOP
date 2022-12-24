package OOP_Lectures.OOP_Lec4_22dec.example4.V4;

public class Program {
    public static void main(String[] args) {
        Repository<AudioContent> mGlinka = new Repository<>("mGlinka");
        mGlinka.add(new AudioContent("ПРОИЗВЕДЕНИЕ mGlinka 1"));
        mGlinka.add(new AudioContent("ПРОИЗВЕДЕНИЕ mGlinka 2"));
        
        
        for (int index = 0; index < mGlinka.count(); index++) {
            System.out.println(mGlinka.get(index));
        }
        
        Repository<AudioContent> pTchaikovsky = new Repository<>("pTchaikovsky");
        pTchaikovsky.add(new AudioContent("ПРОИЗВЕДЕНИЕ pTchaikovsky 1"));
        pTchaikovsky.add(new AudioContent("ПРОИЗВЕДЕНИЕ pTchaikovsky 2"));
        
        
        for (int index = 0; index < pTchaikovsky.count(); index++) {
            System.out.println(pTchaikovsky.get(index));
        }

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(pTchaikovsky.count());
        for (int index = 0; index < pTchaikovsky.count(); index++) {
            System.out.println(pTchaikovsky.get(index));
        }

        // Repository<VideoContent> videoContent = new Repository<>("videoContent");
        // videoContent.add(new VideoContent("ВИДЕО 1"));
        // videoContent.add(new VideoContent("ВИДЕО 2"));
        
        // pTchaikovsky.merge(videoContent);

        // for (int index = 0; index < pTchaikovsky.count(); index++) {
        //     System.out.println(pTchaikovsky.get(index));
        // }



    }
}
