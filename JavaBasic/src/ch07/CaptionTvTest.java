package ch07;

public class CaptionTvTest {

  public static void main(String[] args) {

    CaptionTv ctv = new CaptionTv();
    ctv.channel = 10;
    ctv.channelUp();
    System.out.println(ctv.channel);

    ctv.displayCaption("hello, world");
    ctv.caption = true;
    ctv.displayCaption("hello, world");
  }
  //  11
  //  hello, world

}

class Tv {
  boolean power;
  int channel;

  void power() { power = !power; }
  void channelUp() { ++channel; }
  void channelDown() { --channel; }
}

class CaptionTv extends Tv {
  boolean caption;
  void displayCaption(String text) {
    if (caption) { // 캡션 상태가 on(true)일 때만 text를 보여준다 
      System.out.println(text);
    }
  }
}
