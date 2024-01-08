package cond.ex;

public class MovieRateEx {
    public static void main(String[] args) {
        double rate = 8.1;

        if(rate <= 9){
            System.out.println("출력: '어바웃타임'을 추천합니다.");
        }

        if(rate <= 8){
            System.out.println("출력: '토이 스토리'를 추천합니다.");
        }

        if(rate <= 7){
            System.out.println("출력: '고질라'를 추천합니다.");
        }
    }
}
