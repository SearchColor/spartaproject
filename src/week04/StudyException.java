package week04;

public class StudyException {
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();


        try {
            //일단 실행
            ourClass.thisMethodIsDangerous();
        }catch (OurbadException e) {

            System.out.println(e.getMessage());

        } finally {
            //무조건 수행되는 곳
            System.out.println("여기는 무조건 거침");

        }

    }
}
